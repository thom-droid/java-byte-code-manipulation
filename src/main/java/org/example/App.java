package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println("platform = " + parent);
        ClassLoader grandParent = parent.getParent(); // native 코드로 작성
        System.out.println("bootstrap = " + grandParent); // 

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
        ClassLoader platformClassLoader = ClassLoader.getPlatformClassLoader();
        System.out.println("platformClassLoader = " + platformClassLoader);
    }
}
