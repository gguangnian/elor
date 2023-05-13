package com.github.gguangnian.elor.executor.context;

import org.springframework.expression.EvaluationContext;

public interface EvaluationContextFactory {

    EvaluationContext getEvaluationContext();
}
