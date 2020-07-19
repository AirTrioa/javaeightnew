package com.demo.javaeightnew.lambda.functional_interface.impl;

import com.demo.javaeightnew.lambda.functional_interface.FuncInterface;

/**
 * 函数式接口实现
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class FuncInterfaceImpl {

  /**
   * 使用λ表达式进行 接口的暂时实现
   *
   * @param args
   */
  public static void main(String[] args) {
    FuncInterface<Integer, String> funcInterface = (from) -> "转成String类型:" + from.toString();
    String convert = funcInterface.convertToStr(10086);
    System.out.println(convert);

    FuncInterface<Integer, Integer> funcInterface2 = (from) -> from * 2 + 10086;
    Integer integer = funcInterface2.convertToStr(10086);
    System.out.println("乘2再加10086:"+integer);
  }
}