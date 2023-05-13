package com.github.gguangnian.elor;

import com.github.gguangnian.elor.executor.RecordExecutor;
import com.github.gguangnian.elor.executor.StandardRecordExecutor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParserContext;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Configuration {

    private ExpressionParser expressionParser;

    private ParserContext parserContext;

    public ParserContext getParserContext() {
        if (parserContext == null) {
            parserContext = new TemplateParserContext();
        }
        return parserContext;
    }

    public void setParserContext(ParserContext parserContext) {
        if (parserContext != null) {
            this.parserContext = parserContext;
        }
    }

    public void setExpressionParser(ExpressionParser expressionParser) {
        if (expressionParser != null) {
            this.expressionParser = expressionParser;
        }
    }

    public ExpressionParser getExpressionParser() {
        if (expressionParser == null) {
            expressionParser = new SpelExpressionParser();
        }
        return expressionParser;
    }

    public RecordExecutor newRecordExecutor() {
        return new StandardRecordExecutor(this);
    }
}
