package com.demo.javaeightnew.lambda.replace_anonymous_class;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * 简单排序方法->使用λ表达式代替匿名类
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class SimpleSortFunction {
  private static final Logger logger = LoggerFactory.getLogger(SimpleSortFunction.class);
  public static final List<SortEntity> SORT_ENTITIES = new ArrayList<>();

  // 初始化部分数据
  static {
    SortEntity zhengpei = new SortEntity(1, "郑培");
    SortEntity huangjx = new SortEntity(3, "黄靖娴");
    SortEntity jipeng = new SortEntity(2, "吉鹏");
    SORT_ENTITIES.addAll(Arrays.asList(zhengpei, huangjx, jipeng));
  }

  /**
   * 匿名类实现一个比较器
   */
  public static void anonymousClassTest() {
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
    Collections.sort(SORT_ENTITIES, new Comparator<SortEntity>() {
      @Override
      public int compare(SortEntity o1, SortEntity o2) {
        return o1.getId() - o2.getId();
      }
    });
    logger.info("-----排序后-----");
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
  }

  /**
   * 第一次简化
   */
  public static void lambdaTest1() {
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
    SORT_ENTITIES.sort((o1, o2) -> o1.getId() - o2.getId());
    logger.info("-----排序后-----");
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
  }

  /**
   * 第二次简化
   */
  public static void lambdaTest2() {
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
    Collections.sort(SORT_ENTITIES, (SortEntity o1, SortEntity o2) -> {
      return o1.getId() - o2.getId();
    });
    logger.info("-----排序后-----");
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
  }

  /**
   * 第三次简化
   */
  public static void lambdaTest3() {
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
    Collections.sort(SORT_ENTITIES, (o1, o2) -> o1.getId() - o2.getId());
    logger.info("-----排序后-----");
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
  }

  /**
   * 第四次简化 -- > 使用比较的工具方法
   */
  public static void lambdaTest4() {
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
    Collections.sort(SORT_ENTITIES, Comparator.comparingInt(SortEntity::getId));
    logger.info("-----排序后-----");
    logger.info(Arrays.toString(SORT_ENTITIES.toArray()));
  }

  public static void main(String[] args) {
//    anonymousClassTest();
//    lambdaTest1();
//    lambdaTest2();
//    lambdaTest3();
    lambdaTest4();
  }


}