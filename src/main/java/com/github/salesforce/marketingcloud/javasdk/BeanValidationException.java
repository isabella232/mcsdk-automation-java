package com.github.salesforce.marketingcloud.javasdk;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;

public class BeanValidationException extends ValidationException {
    /**
     * 
     */
    private static final long serialVersionUID = -5294733947409491364L;
    Set<ConstraintViolation<Object>> violations;

    public BeanValidationException(Set<ConstraintViolation<Object>> violations) {
        super(getValidationsMessage(violations));
        this.violations = violations;
    }

    private static String getValidationsMessage(Set<ConstraintViolation<Object>> violations) {
        StringBuilder sb = new StringBuilder();
        for (ConstraintViolation<Object> constraintViolation : violations)
        {
            sb.append(constraintViolation.getPropertyPath() + " " + constraintViolation.getMessage() + "\n");
        }
        return sb.toString();
    }

    public Set<ConstraintViolation<Object>> getViolations() {
        return violations;
    }

    public void setViolations(Set<ConstraintViolation<Object>> violations) {
        this.violations = violations;
    }

}
