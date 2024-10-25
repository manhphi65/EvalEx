package com.tohsoft.evalex.config;

import com.ezylang.evalex.config.*;
import com.ezylang.evalex.functions.basic.AbsFunction;
import com.ezylang.evalex.functions.basic.AverageFunction;
import com.ezylang.evalex.functions.basic.CeilingFunction;
import com.ezylang.evalex.functions.basic.CoalesceFunction;
import com.ezylang.evalex.functions.basic.FactFunction;
import com.ezylang.evalex.functions.basic.FloorFunction;
import com.ezylang.evalex.functions.basic.IfFunction;
import com.ezylang.evalex.functions.basic.Log10Function;
import com.ezylang.evalex.functions.basic.LogFunction;
import com.ezylang.evalex.functions.basic.MaxFunction;
import com.ezylang.evalex.functions.basic.MinFunction;
import com.ezylang.evalex.functions.basic.NotFunction;
import com.ezylang.evalex.functions.basic.RandomFunction;
import com.ezylang.evalex.functions.basic.RoundFunction;
import com.ezylang.evalex.functions.basic.SqrtFunction;
import com.ezylang.evalex.functions.basic.SumFunction;
import com.ezylang.evalex.functions.basic.SwitchFunction;
import com.ezylang.evalex.functions.datetime.DateTimeFormatFunction;
import com.ezylang.evalex.functions.datetime.DateTimeNewFunction;
import com.ezylang.evalex.functions.datetime.DateTimeNowFunction;
import com.ezylang.evalex.functions.datetime.DateTimeParseFunction;
import com.ezylang.evalex.functions.datetime.DateTimeToEpochFunction;
import com.ezylang.evalex.functions.datetime.DateTimeTodayFunction;
import com.ezylang.evalex.functions.datetime.DurationFromMillisFunction;
import com.ezylang.evalex.functions.datetime.DurationNewFunction;
import com.ezylang.evalex.functions.datetime.DurationParseFunction;
import com.ezylang.evalex.functions.datetime.DurationToMillisFunction;
import com.ezylang.evalex.functions.string.StringContains;
import com.ezylang.evalex.functions.string.StringEndsWithFunction;
import com.ezylang.evalex.functions.string.StringFormatFunction;
import com.ezylang.evalex.functions.string.StringLeftFunction;
import com.ezylang.evalex.functions.string.StringLengthFunction;
import com.ezylang.evalex.functions.string.StringLowerFunction;
import com.ezylang.evalex.functions.string.StringMatchesFunction;
import com.ezylang.evalex.functions.string.StringRightFunction;
import com.ezylang.evalex.functions.string.StringStartsWithFunction;
import com.ezylang.evalex.functions.string.StringSubstringFunction;
import com.ezylang.evalex.functions.string.StringTrimFunction;
import com.ezylang.evalex.functions.string.StringUpperFunction;
import com.ezylang.evalex.functions.trigonometric.AcosFunction;
import com.ezylang.evalex.functions.trigonometric.AcosHFunction;
import com.ezylang.evalex.functions.trigonometric.AcosRFunction;
import com.ezylang.evalex.functions.trigonometric.AcotFunction;
import com.ezylang.evalex.functions.trigonometric.AcotHFunction;
import com.ezylang.evalex.functions.trigonometric.AcotRFunction;
import com.ezylang.evalex.functions.trigonometric.AsinFunction;
import com.ezylang.evalex.functions.trigonometric.AsinHFunction;
import com.ezylang.evalex.functions.trigonometric.AsinRFunction;
import com.ezylang.evalex.functions.trigonometric.Atan2Function;
import com.ezylang.evalex.functions.trigonometric.Atan2RFunction;
import com.ezylang.evalex.functions.trigonometric.AtanFunction;
import com.ezylang.evalex.functions.trigonometric.AtanHFunction;
import com.ezylang.evalex.functions.trigonometric.AtanRFunction;
import com.ezylang.evalex.functions.trigonometric.CosFunction;
import com.ezylang.evalex.functions.trigonometric.CosHFunction;
import com.ezylang.evalex.functions.trigonometric.CosRFunction;
import com.ezylang.evalex.functions.trigonometric.CotFunction;
import com.ezylang.evalex.functions.trigonometric.CotHFunction;
import com.ezylang.evalex.functions.trigonometric.CotRFunction;
import com.ezylang.evalex.functions.trigonometric.CscFunction;
import com.ezylang.evalex.functions.trigonometric.CscHFunction;
import com.ezylang.evalex.functions.trigonometric.CscRFunction;
import com.ezylang.evalex.functions.trigonometric.DegFunction;
import com.ezylang.evalex.functions.trigonometric.RadFunction;
import com.ezylang.evalex.functions.trigonometric.SecFunction;
import com.ezylang.evalex.functions.trigonometric.SecHFunction;
import com.ezylang.evalex.functions.trigonometric.SecRFunction;
import com.ezylang.evalex.functions.trigonometric.SinFunction;
import com.ezylang.evalex.functions.trigonometric.SinHFunction;
import com.ezylang.evalex.functions.trigonometric.SinRFunction;
import com.ezylang.evalex.functions.trigonometric.TanFunction;
import com.ezylang.evalex.functions.trigonometric.TanHFunction;
import com.ezylang.evalex.functions.trigonometric.TanRFunction;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.operators.arithmetic.InfixDivisionOperator;
import com.ezylang.evalex.operators.arithmetic.InfixMultiplicationOperator;
import com.ezylang.evalex.operators.arithmetic.InfixPowerOfOperator;
import com.ezylang.evalex.operators.arithmetic.PrefixMinusOperator;
import com.ezylang.evalex.operators.arithmetic.PrefixPlusOperator;
import com.ezylang.evalex.operators.booleans.InfixAndOperator;
import com.ezylang.evalex.operators.booleans.InfixEqualsOperator;
import com.ezylang.evalex.operators.booleans.InfixGreaterEqualsOperator;
import com.ezylang.evalex.operators.booleans.InfixGreaterOperator;
import com.ezylang.evalex.operators.booleans.InfixLessEqualsOperator;
import com.ezylang.evalex.operators.booleans.InfixLessOperator;
import com.ezylang.evalex.operators.booleans.InfixNotEqualsOperator;
import com.ezylang.evalex.operators.booleans.InfixOrOperator;
import com.tohsoft.evalex.operators.arithmetic.TohInfixMinusOperator;
import com.tohsoft.evalex.operators.arithmetic.TohInfixPlusOperator;
import com.tohsoft.evalex.operators.arithmetic.TohPostfixFactorialOperator;
import com.tohsoft.evalex.operators.arithmetic.TohPostfixPercentageOperator;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Map;

public class TohExpressionConfiguration {

  @SuppressWarnings("unchecked")
  private static final OperatorDictionaryIfc operatorDictionary =
      MapBasedOperatorDictionary.ofOperators(
          // arithmetic
          Map.entry("+", new PrefixPlusOperator()),
          Map.entry("-", new PrefixMinusOperator()),
          Map.entry("+", new TohInfixPlusOperator()),
          Map.entry("-", new TohInfixMinusOperator()),
          Map.entry("*", new InfixMultiplicationOperator()),
          Map.entry("/", new InfixDivisionOperator()),
          Map.entry("^", new InfixPowerOfOperator()),
          Map.entry("%", new TohPostfixPercentageOperator()),
          Map.entry("!", new TohPostfixFactorialOperator()),
          // booleans
          Map.entry("==", new InfixEqualsOperator()),
          Map.entry("!=", new InfixNotEqualsOperator()),
          Map.entry("<>", new InfixNotEqualsOperator()),
          Map.entry(">", new InfixGreaterOperator()),
          Map.entry(">=", new InfixGreaterEqualsOperator()),
          Map.entry("<", new InfixLessOperator()),
          Map.entry("<=", new InfixLessEqualsOperator()),
          Map.entry("&&", new InfixAndOperator()),
          Map.entry("||", new InfixOrOperator()));

  /** The function dictionary holds all functions that will be allowed in an expression. */
  @SuppressWarnings("unchecked")
  private static final FunctionDictionaryIfc functionDictionary =
      MapBasedFunctionDictionary.ofFunctions(
          // basic functions
          Map.entry("ABS", new AbsFunction()),
          Map.entry("AVERAGE", new AverageFunction()),
          Map.entry("CEILING", new CeilingFunction()),
          Map.entry("COALESCE", new CoalesceFunction()),
          Map.entry("FACT", new FactFunction()),
          Map.entry("FLOOR", new FloorFunction()),
          Map.entry("IF", new IfFunction()),
          Map.entry("LOG", new LogFunction()),
          Map.entry("LOG10", new Log10Function()),
          Map.entry("MAX", new MaxFunction()),
          Map.entry("MIN", new MinFunction()),
          Map.entry("NOT", new NotFunction()),
          Map.entry("RANDOM", new RandomFunction()),
          Map.entry("ROUND", new RoundFunction()),
          Map.entry("SQRT", new SqrtFunction()),
          Map.entry("SUM", new SumFunction()),
          Map.entry("SWITCH", new SwitchFunction()),
          // trigonometric
          Map.entry("ACOS", new AcosFunction()),
          Map.entry("ACOSH", new AcosHFunction()),
          Map.entry("ACOSR", new AcosRFunction()),
          Map.entry("ACOT", new AcotFunction()),
          Map.entry("ACOTH", new AcotHFunction()),
          Map.entry("ACOTR", new AcotRFunction()),
          Map.entry("ASIN", new AsinFunction()),
          Map.entry("ASINH", new AsinHFunction()),
          Map.entry("ASINR", new AsinRFunction()),
          Map.entry("ATAN", new AtanFunction()),
          Map.entry("ATAN2", new Atan2Function()),
          Map.entry("ATAN2R", new Atan2RFunction()),
          Map.entry("ATANH", new AtanHFunction()),
          Map.entry("ATANR", new AtanRFunction()),
          Map.entry("COS", new CosFunction()),
          Map.entry("COSH", new CosHFunction()),
          Map.entry("COSR", new CosRFunction()),
          Map.entry("COT", new CotFunction()),
          Map.entry("COTH", new CotHFunction()),
          Map.entry("COTR", new CotRFunction()),
          Map.entry("CSC", new CscFunction()),
          Map.entry("CSCH", new CscHFunction()),
          Map.entry("CSCR", new CscRFunction()),
          Map.entry("DEG", new DegFunction()),
          Map.entry("RAD", new RadFunction()),
          Map.entry("SIN", new SinFunction()),
          Map.entry("SINH", new SinHFunction()),
          Map.entry("SINR", new SinRFunction()),
          Map.entry("SEC", new SecFunction()),
          Map.entry("SECH", new SecHFunction()),
          Map.entry("SECR", new SecRFunction()),
          Map.entry("TAN", new TanFunction()),
          Map.entry("TANH", new TanHFunction()),
          Map.entry("TANR", new TanRFunction()),
          // string functions
          Map.entry("STR_CONTAINS", new StringContains()),
          Map.entry("STR_ENDS_WITH", new StringEndsWithFunction()),
          Map.entry("STR_FORMAT", new StringFormatFunction()),
          Map.entry("STR_LEFT", new StringLeftFunction()),
          Map.entry("STR_LENGTH", new StringLengthFunction()),
          Map.entry("STR_LOWER", new StringLowerFunction()),
          Map.entry("STR_MATCHES", new StringMatchesFunction()),
          Map.entry("STR_RIGHT", new StringRightFunction()),
          Map.entry("STR_STARTS_WITH", new StringStartsWithFunction()),
          Map.entry("STR_SUBSTRING", new StringSubstringFunction()),
          Map.entry("STR_TRIM", new StringTrimFunction()),
          Map.entry("STR_UPPER", new StringUpperFunction()),
          // date time functions
          Map.entry("DT_DATE_NEW", new DateTimeNewFunction()),
          Map.entry("DT_DATE_PARSE", new DateTimeParseFunction()),
          Map.entry("DT_DATE_FORMAT", new DateTimeFormatFunction()),
          Map.entry("DT_DATE_TO_EPOCH", new DateTimeToEpochFunction()),
          Map.entry("DT_DURATION_NEW", new DurationNewFunction()),
          Map.entry("DT_DURATION_FROM_MILLIS", new DurationFromMillisFunction()),
          Map.entry("DT_DURATION_TO_MILLIS", new DurationToMillisFunction()),
          Map.entry("DT_DURATION_PARSE", new DurationParseFunction()),
          Map.entry("DT_NOW", new DateTimeNowFunction()),
          Map.entry("DT_TODAY", new DateTimeTodayFunction()));

  /**
   * Convenience method to create a default configuration.
   *
   * @return A configuration with default settings.
   */
  public static ExpressionConfiguration defaultConfiguration() {
    return ExpressionConfiguration.builder()
        .operatorDictionary(operatorDictionary)
        .functionDictionary(functionDictionary)
        .zoneId(ZoneId.of("Asia/Ho_Chi_Minh"))
        .locale(new Locale("vi", "VN"))
        .powerOfPrecedence(OperatorIfc.OPERATOR_PRECEDENCE_POWER_HIGHER)
        .build();
  }
}
