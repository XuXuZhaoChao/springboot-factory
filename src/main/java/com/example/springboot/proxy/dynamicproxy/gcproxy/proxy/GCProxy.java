package com.example.springboot.proxy.dynamicproxy.gcproxy.proxy;

import sun.reflect.CallerSensitive;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月03日 12:37:00
 */
public class GCProxy implements java.io.Serializable {

    private static final String ln = "\r\n";
    private static final long serialVersionUID = -2222568056686623797L;

    @CallerSensitive
    public static Object newProxyInstance(GCClassLoader classLoader, Class<?>[] interfaces, GCInvocationHandler h) throws IllegalArgumentException, IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //动态生成java代码.java文件(内存中)
        String src = generateSrcFile(interfaces);
        System.out.println("************");
        System.out.println(src);
        System.out.println("************");
        //java文件输出到磁盘,保存成$Proxy0.java文件
        String filePath = GCProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();
        //把.java文件编译成$Proxy0.class字节码文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manage.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
        task.call();
        manage.close();
        //把生成的.class文件加载到jvm中
        Class proxyClass = classLoader.findClass("$Proxy0");
        Constructor c = proxyClass.getConstructor(GCInvocationHandler.class);
        f.delete();
        //通过字节码重组返回新的代理对象
        return c.newInstance(h);
    }

    private static String generateSrcFile(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.springboot.proxy.dynamicproxy.gcproxy.proxy;" + ln);
        sb.append("import com.example.springboot.proxy.dynamicproxy.gcproxy.client.IPerson;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
            sb.append("public GCInvocationHandler h;" + ln);
            sb.append("public $Proxy0(GCInvocationHandler h) {" + ln);
                sb.append("this.h = h;" + ln);
            sb.append("}" + ln);
            //方法遍历
            StringBuffer paramNames = null;
            StringBuffer paramValues = null;
            StringBuffer paramClasses = null;
            AtomicInteger atomicInteger = null;
            for (Method method : interfaces[0].getMethods()) {
                 atomicInteger = new AtomicInteger();
                 paramNames = new StringBuffer();
                 paramValues = new StringBuffer();
                 paramClasses = new StringBuffer();
                //遍历参数列表
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++) {
                    String paramType = parameterTypes[i].getSimpleName();
                    String paramName = toLowerFirstCase(atomicInteger, parameterTypes[i].getSimpleName());
                    paramNames.append(paramType + " " + paramName);
                    paramValues.append(paramName);
                    paramClasses.append(parameterTypes[i].getName() + ".class");
                    if (i < parameterTypes.length - 1) {
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }
                sb.append("public " + method.getReturnType().getName() + " " + method.getName() + " (" + paramNames.toString() + ") {" + ln);
                    sb.append("try {" + ln);
                        sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + method.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);
                        sb.append("this.h.invoke(this,m,new Object[]{" + paramValues + "});" + ln);
                    sb.append("} catch (RuntimeException | Error var2){ " + ln);
                        sb.append("throw var2;" + ln);
                    sb.append("} catch (Throwable var6) {" + ln);
                        sb.append("throw new UndeclaredThrowableException(var6); " + ln);
                    sb.append("}" + ln);
                sb.append("}" + ln);
            }
        sb.append("}" + ln);
        return sb.toString();
    }

    private static String toLowerFirstCase(AtomicInteger atomicInteger, String src) {
        return (src + atomicInteger.getAndIncrement()).toLowerCase();
    }
}