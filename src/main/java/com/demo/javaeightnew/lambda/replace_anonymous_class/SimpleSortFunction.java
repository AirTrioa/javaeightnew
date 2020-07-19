package com.demo.javaeightnew.lambda.replace_anonymous_class;

import java.util.*;

/**
 * 简单排序方法->使用λ表达式代替匿名类
 *
 * @author Liuzw
 * @since 2020/7/19
 */
public class SimpleSortFunction {
  private static final List<SortEntity> someEntityList = new ArrayList<>();

  // 初始化部分数据
  static {
    SortEntity zhengpei = new SortEntity(1, "郑培");
    SortEntity huangjx = new SortEntity(3, "黄靖娴");
    SortEntity jipeng = new SortEntity(2, "吉鹏");
    someEntityList.addAll(Arrays.asList(zhengpei, huangjx, jipeng));
  }

  /**
   * 匿名类实现一个比较器
   */
  public static void anonymousClassTest() {
    System.out.println(someEntityList);
    Collections.sort(someEntityList, new Comparator<SortEntity>() {
      @Override
      public int compare(SortEntity o1, SortEntity o2) {
        return o1.getId() - o2.getId();
      }
    });
    System.out.println("-----排序后-----");
    System.out.println(someEntityList);
  }

  /**
   * 第一次简化
   */
  public static void lambdaTest1() {
    System.out.println(someEntityList);
    someEntityList.sort((o1, o2) -> o1.getId() - o2.getId());
    System.out.println("-----排序后-----");
    System.out.println(someEntityList);
  }

  /**
   * 第二次简化
   */
  public static void lambdaTest2() {
    System.out.println(someEntityList);
    Collections.sort(someEntityList, (SortEntity o1, SortEntity o2) -> {
      return o1.getId() - o2.getId();
    });
    System.out.println("-----排序后-----");
    System.out.println(someEntityList);
  }

  /**
   * 第三次简化
   */
  public static void lambdaTest3() {
    System.out.println(someEntityList);
    Collections.sort(someEntityList, (o1, o2) -> o1.getId() - o2.getId());
    System.out.println("-----排序后-----");
    System.out.println(someEntityList);
  }

  /**
   * 第四次简化 -- > 使用比较的工具方法
   */
  public static void lambdaTest4() {
    System.out.println(someEntityList);
    Collections.sort(someEntityList, Comparator.comparingInt(SortEntity::getId));
    System.out.println("-----排序后-----");
    System.out.println(someEntityList);
  }

  public static void main(String[] args) {
//    anonymousClassTest();
//    lambdaTest1();
//    lambdaTest2();
//    lambdaTest3();
    lambdaTest4();
  }


}