package com.github.gguangnian.elor.demo;

import com.github.gguangnian.elor.support.EvaluationVariable;

public class SimpleEvaluationMethodVariable implements EvaluationVariable {


    @Override
    public String variableName() {
        return "abc";
    }

    @Override
    public String apply(String value) {
        System.out.println("run abc");
        return "def";
    }
}
