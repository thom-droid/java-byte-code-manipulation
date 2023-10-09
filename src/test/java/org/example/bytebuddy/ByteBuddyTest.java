package org.example.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ByteBuddyTest {

    @Test
    public void manipulateToString() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> dynamicType = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.named("toString"))
                .intercept(FixedValue.value("createdByByteBuddy"))
                .make()
                .load(getClass().getClassLoader())
                .getLoaded();

        assertEquals("createdByByteBuddy", dynamicType.getDeclaredConstructor().newInstance().toString());
    }

}
