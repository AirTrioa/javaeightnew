package com.demo.javaeightnew.method_reference;

import com.demo.javaeightnew.lambda.functional_interface.FuncInterface;
import com.demo.javaeightnew.lambda.replace_anonymous_class.SimpleSortFunction;
import com.demo.javaeightnew.lambda.replace_anonymous_class.SortEntity;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
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

    // 使用StringUtils的判断空方法，实现自定义的接口
    FuncInterface<CharSequence, Boolean> isNotBlank = StringUtils::isNotBlank;
    logger.info(isNotBlank.convertToStr("123").toString());
    logger.info(isNotBlank.convertToStr("").toString());

    // 调用静态方法引用,打印部分参数
    List<SortEntity> sortEntities = SimpleSortFunction.SORT_ENTITIES;
    sortEntities.forEach(System.out::print);
  }

  /**
   * 双冒号调用成员方法
   */
  private static void testMemberFunc() {
    BiFunction<String, Object, Boolean> function = String::equals;
    Boolean xyz = function.apply("xyz", "123");
    logger.info("[{}]", xyz);
    Boolean apply = function.apply("xyz", "xyz");
    logger.info("[{}]", apply);
  }


  public static void main(String[] args) {
    testStaticFunc();


  }
}