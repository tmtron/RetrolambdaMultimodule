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

        Assert.assertTrue(strings.stream().anyMatch(item -> item.equals("a")));
    }
}
