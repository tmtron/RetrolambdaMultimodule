package com.tmtron.retrolambdamultimodule;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class Java8UnitTest {

    @org.junit.Test
    public void testStream()  {
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");

        /* Android Studio tests are okay
           Gradle tests on command line fail:
            java.lang.NoSuchMethodError: java.util.Set.stream()Ljava/util/stream/Stream;
	        at com.tmtron.retrolambdamultimodule.Java8UnitTest.testStream(Java8UnitTest.java:16)
         */
        Assert.assertTrue(strings.stream().anyMatch(item -> item.equals("a")));
    }
}
