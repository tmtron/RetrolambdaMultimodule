package com.tmtron.retrolambdamultimodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private String java8Test() {
        Set<String> strings = new HashSet<>();
        strings.add("j8");
        // just to use some java8 feature
        return strings.stream().findFirst().get();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvHello = (TextView) findViewById(R.id.tvHello);

        /* both calls will crash on a real device with Android 6:
            java.lang.NoSuchMethodError: No interface method stream()Ljava/util/stream/Stream;
            in class Ljava/util/Set; or its super classes (declaration of 'java.util.Set'
            appears in /system/framework/core-libart.jar)
         */
        SomeClass test = new SomeClass("test");
        String dummy = java8Test();

        Log.i(TAG, "test val: " + test.getVal());
        tvHello.setText(test.getVal()+dummy);
    }
}
