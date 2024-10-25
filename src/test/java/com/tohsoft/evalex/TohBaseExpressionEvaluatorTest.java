/*
  Copyright 2012-2022 Udo Klimaschewski

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
package com.tohsoft.evalex;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.tohsoft.evalex.config.TohTestConfigurationProvider;

public abstract class TohBaseExpressionEvaluatorTest {

  final ExpressionConfiguration configuration =
      TohTestConfigurationProvider.StandardConfigurationWithAdditionalTestOperators;

  String evaluate(String expressionString) throws ParseException, EvaluationException {
    Expression expression = createExpression(expressionString);
    return expression.evaluate().getStringValue();
  }

  Expression createExpression(String expressionString) {
    return new Expression(expressionString, configuration);
  }
}
