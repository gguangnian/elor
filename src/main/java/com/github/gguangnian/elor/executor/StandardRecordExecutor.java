package com.github.gguangnian.elor.executor;

import com.github.gguangnian.elor.Configuration;
import com.github.gguangnian.elor.executor.context.StandardEvaluationContextFactory;

public class StandardRecordExecutor extends BaseRecordExecutor {
    public StandardRecordExecutor(Configuration configuration) {
        super(configuration, new StandardEvaluationContextFactory());
    }
}
