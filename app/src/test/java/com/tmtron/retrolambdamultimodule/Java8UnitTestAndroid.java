package com.tmtron.retrolambdamultimodule;

import junit.framework.Assert;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Java8UnitTestAndroid {
    @Test
    public void testStream()  {
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");

        // test works in Android Studio and in the command line Gradle build
        Assert.assertTrue(strings.stream().anyMatch(item -> item.equals("a")));
    }
}