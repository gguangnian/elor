package com.github.gguangnian.elor.executor;

import com.github.gguangnian.elor.Configuration;
import com.github.gguangnian.elor.exceptions.ElorException;
import com.github.gguangnian.elor.executor.context.EvaluationContextFactory;
import org.springframework.expression.*;

public abstract class BaseRecordExecutor implements RecordExecutor {

    private Configuration configuration;

    private EvaluationContext evaluationContext;

    public BaseRecordExecutor(Configuration configuration, EvaluationContextFactory evaluationContextFactory) {
        this.configuration = configuration;
        this.evaluationContext = evaluationContextFactory.getEvaluationContext();
    }

    @Override
    public void setVariable(String name, Object variable) {
        evaluationContext.setVariable(name, variable);
    }

    @Override
    public String parseExpression(String expressionString) {
        final ExpressionParser expressionParser = configuration.getExpressionParser();
        //区分el和普通文本
        ParserContext parserContext = configuration.getParserContext();
        //获取Expression
        final Expression expression = expressionParser.parseExpression(expressionString, parserContext);
        //解析
        String value = this.parseExpression(expression);
        return value;
    }

    private String parseExpression(Expression expression) {
        try {
            return (String) expression.getValue(evaluationContext);
        } catch (ExpressionException x) {
            throw new ElorException(x);
        } catch (RuntimeException x) {
            throw x;
        } catch (Error x) {
            throw x;
        } catch (Throwable x) {
            throw new Error(x);
        }
    }
}
