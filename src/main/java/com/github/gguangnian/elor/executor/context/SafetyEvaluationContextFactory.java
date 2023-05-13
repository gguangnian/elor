package com.github.gguangnian.elor.executor.context;

import com.github.gguangnian.elor.support.DataBindingRestrictedMethodResolver;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

public class SafetyEvaluationContextFactory implements EvaluationContextFactory {
    @Override
    public EvaluationContext getEvaluationContext() {
        return SimpleEvaluationContext.forReadOnlyDataBinding().withMethodResolvers(new DataBindingRestrictedMethodResolver()).build();
    }
}
