package com.demo.javaeightnew.export_function.impl;

import com.demo.javaeightnew.export_function.ExampleInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 接口的非抽象类实现
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class ExampleInterfaceImpl implements ExampleInterface {
  private static final Logger logger = LoggerFactory.getLogger(ExampleInterfaceImpl.class);
  @Override
  public void print(String msg) {
    logger.info(msg);
  }

  /**
   * Java8中的扩展方法 --- 类似于Scala的trait
   *
   * @param args
   */
  public static void main(String[] args) {
    ExampleInterface example = new ExampleInterfaceImpl();
    logger.info("---------正常实现接口--------");
    example.print("这是正常的接口");
    logger.info("---------default字段实现的接口---------");
    example.print();
    logger.info("---------使用匿名类实现接口和调用非抽象类实现----------");

    ExampleInterface anInterface= msg -> logger.info("匿名类实现的接口:"+msg);
    anInterface.print("匿名类？");
    anInterface.print();
  }
}