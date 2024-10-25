package com.tohsoft.evalex.operators.arithmetic;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.operators.AbstractOperator;
import com.ezylang.evalex.operators.PostfixOperator;
import com.ezylang.evalex.parser.Token;
import java.math.BigDecimal;

/** Unary postfix percentage. */
@PostfixOperator(leftAssociative = true)
public class TohPostfixPercentageOperator extends AbstractOperator {
  @Override
  public EvaluationValue evaluate(
      Expression expression, Token operatorToken, EvaluationValue... operands)
      throws EvaluationException {
    EvaluationValue operand = operands[0];

    if (operand.isNumberValue()) {
      return EvaluationValue.percentValue(
          operand
              .getNumberValue()
              .divide(new BigDecimal("100"), expression.getConfiguration().getMathContext()));
    } else {
      throw EvaluationException.ofUnsupportedDataTypeInOperation(operatorToken);
    }
  }
}
