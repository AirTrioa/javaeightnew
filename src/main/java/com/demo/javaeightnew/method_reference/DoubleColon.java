package com.demo.javaeightnew.method_reference;

import com.demo.javaeightnew.lambda.functional_interface.FuncInterface;

import java.util.function.BiFunction;

/**
 * 方法引用- 双冒号
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class DoubleColon {
  /**
   * 双冒号调用静态方法，创建函数接口
   */
  private static void testStaticFunc(){
    BiFunction<String, Object, Boolean> function = String::equals;
    Boolean xyz = function.apply("xyz", "123");
    System.out.println(xyz);
    Boolean apply = function.apply("xyz", "xyz");
    System.out.println(apply);
  }

  private static void testMemberFunc(){

  }


  public static void main(String[] args) {
    testStaticFunc();


  }
}