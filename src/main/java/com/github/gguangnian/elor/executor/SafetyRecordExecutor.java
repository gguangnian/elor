package com.github.gguangnian.elor.executor;

import com.github.gguangnian.elor.Configuration;
import com.github.gguangnian.elor.executor.context.SafetyEvaluationContextFactory;

public class SafetyRecordExecutor extends BaseRecordExecutor {
    public SafetyRecordExecutor(Configuration configuration) {
        super(configuration, new SafetyEvaluationContextFactory());
    }
}
