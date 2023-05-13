package com.github.gguangnian.elor.support;

import com.github.gguangnian.elor.exceptions.ElorException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.expression.AccessException;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.MethodExecutor;
import org.springframework.expression.MethodResolver;

import java.util.List;

public class DataBindingRestrictedMethodResolver implements MethodResolver {

    private MethodResolver methodResolver;

    public DataBindingRestrictedMethodResolver() {
        this.methodResolver = org.springframework.expression.spel.support.DataBindingMethodResolver.forInstanceMethodInvocation();
    }

    @Override
    public MethodExecutor resolve(EvaluationContext context, Object targetObject, String name, List<TypeDescriptor> argumentTypes) throws AccessException {
        if (EvaluationVariable.class.isInstance(targetObject) && "apply".equals(name)) {
            return methodResolver.resolve(context, targetObject, name, argumentTypes);
        }
        throw new ElorException("apply");
    }
}
