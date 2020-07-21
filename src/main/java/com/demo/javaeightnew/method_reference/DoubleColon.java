package com.demo.javaeightnew.method_reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiFunction;

/**
 * 方法引用- 双冒号
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class DoubleColon {
  private static final Logger logger = LoggerFactory.getLogger(DoubleColon.class);

  /**
   * 双冒号调用静态方法，创建函数接口
   */
  private static void testStaticFunc() {
    BiFunction<String, Object, Boolean> function = String::equals;
    Boolean xyz = function.apply("xyz", "123");
    logger.info("[{}]", xyz);
    Boolean apply = function.apply("xyz", "xyz");
    logger.info("[{}]", apply);
  }

  private static void testMemberFunc() {

  }


  public static void main(String[] args) {
    testStaticFunc();


  }
}