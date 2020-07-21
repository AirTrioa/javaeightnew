package com.demo.javaeightnew.export_function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 接口的非抽象类实现---扩展方法 --- 类似与Scala 的 trait
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public interface ExampleInterface {
   Logger logger = LoggerFactory.getLogger(ExampleInterface.class);
  /**
   * 正常的接口声明
   *
   * @param msg 打印消息
   */
  void print(String msg);

  /**
   * 在接口中使用default字段，可以替代掉抽象类的部分功能，
   * 比如就无需再用抽象类实现部分方法再让子类继承
   */
  default void print(){
    logger.info("这是接口的非抽象类实现");
  }


  default void print(String msg, String extend) {
    logger.info("这是接口的非抽象类实现->msg:[{}],extend:[{}]", msg, extend);
  }
}