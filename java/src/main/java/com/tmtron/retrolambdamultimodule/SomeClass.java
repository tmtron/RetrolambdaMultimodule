package com.tmtron.retrolambdamultimodule;

import java.util.HashSet;
import java.util.Set;

public class SomeClass {

    private final String val;

    public SomeClass(String val) {
        Set<String> strings = new HashSet<>();
        strings.add(val);
        // just to use some java8 feature
        this.val = strings.stream().findFirst().get();
    }

    public String getVal() {
        return val;
    }
}
