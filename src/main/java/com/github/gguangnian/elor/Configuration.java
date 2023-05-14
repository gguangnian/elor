package com.github.gguangnian.elor;

import com.github.gguangnian.elor.executor.RecordExecutor;
import com.github.gguangnian.elor.executor.SafetyRecordExecutor;
import com.github.gguangnian.elor.executor.StandardRecordExecutor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParserContext;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Objects;

/**
 * 配置策略
 */
public class Configuration {

    /**
     * 可重用的和线程安全
     */
    private static final ExpressionParser DEFAULT_EXPRESSION_PARSER = new SpelExpressionParser();

    private static final ParserContext DEFAULT_PARSER_CONTEXT = new TemplateParserContext();

    public Configuration() {
        this(null, null);
    }

    public Configuration(ExpressionParser expressionParser, ParserContext parserContext) {
        this.expressionParser = Objects.isNull(expressionParser) ? DEFAULT_EXPRESSION_PARSER : expressionParser;
        this.parserContext = Objects.isNull(parserContext) ? DEFAULT_PARSER_CONTEXT : parserContext;
    }

    private ExpressionParser expressionParser;

    private ParserContext parserContext;

    private boolean standard = false;


    public ExpressionParser getExpressionParser() {
        return expressionParser;
    }

    public void setExpressionParser(ExpressionParser expressionParser) {
        Objects.requireNonNull(expressionParser);
        this.expressionParser = expressionParser;
    }

    public ParserContext getParserContext() {
        return parserContext;
    }

    public void setParserContext(ParserContext parserContext) {
        Objects.requireNonNull(parserContext);
        this.parserContext = parserContext;
    }

    public boolean isStandard() {
        return standard;
    }

    public void setStandard(boolean standard) {
        this.standard = standard;
    }

    public RecordExecutor newRecordExecutor() {
        return standard ? new StandardRecordExecutor(this) : new SafetyRecordExecutor(this);
    }
}
