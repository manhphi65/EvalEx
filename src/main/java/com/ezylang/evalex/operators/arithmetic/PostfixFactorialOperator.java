package com.ezylang.evalex.operators.arithmetic;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.operators.AbstractOperator;
import com.ezylang.evalex.operators.PostfixOperator;
import com.ezylang.evalex.parser.Token;
import java.math.BigDecimal;

/** Unary postfix factorial. */
@PostfixOperator(leftAssociative = true)
public class PostfixFactorialOperator extends AbstractOperator {
  @Override
  public EvaluationValue evaluate(
      Expression expression, Token operatorToken, EvaluationValue... operands)
      throws EvaluationException {
    EvaluationValue operand = operands[0];

    if (operand.isNumberValue()) {
      BigDecimal value = operand.getNumberValue();
      boolean isValidNumber =
          value.signum() == 1
              && value.stripTrailingZeros().scale() <= 0
              && value.compareTo(new BigDecimal("170")) < 0;
      if (!isValidNumber) {
        throw new EvaluationException(operatorToken, "Out of range");
      }
      BigDecimal result = BigDecimal.ONE;
      for (int i = 1; i < value.intValue(); i++)
        result =
            result.multiply(BigDecimal.valueOf(i), expression.getConfiguration().getMathContext());
      return expression.convertValue(result);
    } else {
      throw EvaluationException.ofUnsupportedDataTypeInOperation(operatorToken);
    }
  }
}
