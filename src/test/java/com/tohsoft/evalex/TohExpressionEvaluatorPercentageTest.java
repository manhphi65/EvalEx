package com.tohsoft.evalex;

import static org.assertj.core.api.Assertions.assertThat;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.parser.ParseException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TohExpressionEvaluatorPercentageTest extends TohBaseExpressionEvaluatorTest {

  @ParameterizedTest
  @CsvSource(
      delimiter = ':',
      value = {
        "10% : 0.1",
        "100 + 10% : 110",
        "100 - 10% : 90",
        "3 * 50% : 1.5",
      })
  void testCustomPercentageTest(String expression, String expectedResult)
      throws ParseException, EvaluationException {
    assertThat(evaluate(expression)).isEqualTo(expectedResult);
  }
}
