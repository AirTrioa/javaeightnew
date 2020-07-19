package com.demo.javaeightnew.export_function.impl;

import com.demo.javaeightnew.export_function.ExampleInterface;

/**
 * 接口的非抽象类实现
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class ExampleInterfaceImpl implements ExampleInterface {
  @Override
  public void print(String msg) {
    System.out.println(msg);
  }

  /**
   * Java8中的扩展方法 --- 类似于Scala的trait
   *
   * @param args
   */
  public static void main(String[] args) {
    ExampleInterface example = new ExampleInterfaceImpl();
    System.out.println("---------正常实现接口--------");
    example.print("这是正常的接口");
    System.out.println("---------default字段实现的接口---------");
    example.print();
    System.out.println("---------使用匿名类实现接口和调用非抽象类实现----------");

    ExampleInterface anInterface= msg -> System.out.println("匿名类实现的接口:"+msg);
    anInterface.print("匿名类？");
    anInterface.print();
  }
}