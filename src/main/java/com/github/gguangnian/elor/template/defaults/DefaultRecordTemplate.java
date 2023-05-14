package com.github.gguangnian.elor.template.defaults;

import com.github.gguangnian.elor.executor.RecordExecutor;
import com.github.gguangnian.elor.template.RecordTemplate;

public class DefaultRecordTemplate implements RecordTemplate {

    private RecordExecutor recordExecutor;

    public DefaultRecordTemplate(RecordExecutor recordExecutor) {
        this.recordExecutor = recordExecutor;
    }

    @Override
    public void setVariable(String name, Object variable) {
        recordExecutor.setVariable(name, variable);
    }

    @Override
    public String parseTemplate(String expressionString) {
        return recordExecutor.parseExpression(expressionString);
    }
}
