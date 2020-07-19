package com.demo.javaeightnew.lambda.functional_interface;

/**
 * 函数式接口(使用FunctionalInterface注解)
 *
 * @author Liuzw
 * @since 2020/7/16
 */
@FunctionalInterface
public interface FuncInterface<FROM, TO> {
  /**
   * 把From转换成To
   *
   * @param from from
   * @return TO
   */
  TO convertToStr(FROM from);
}