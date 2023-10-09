package org.example.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.ConstantValue;
import org.example.proxy.Hat;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class ByteBuddyApp {

    public static void main(String[] args) {

        try {
            new ByteBuddy().redefine(Magician.class)
                    .method(named("pullOut"))
                    .intercept(FixedValue.value("createdByByteBuddy"))
                    .make()
                    .saveIn(new File("C:\\Users\\thom\\IdeaProjects\\classloader-sample\\target\\classes"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new Magician().pullOut());

    }
}
