package com.github.gguangnian.elor.executor.context;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class StandardEvaluationContextFactory implements EvaluationContextFactory{
    @Override
    public EvaluationContext getEvaluationContext() {
        return new StandardEvaluationContext();
    }

}
