package com.demo.javaeightnew.method_reference;

import com.demo.javaeightnew.lambda.replace_anonymous_class.SimpleSortFunction;
import com.demo.javaeightnew.lambda.replace_anonymous_class.SortEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

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

    // 使用StringUtils的判断空方法
    Function<CharSequence, Boolean> isNotBlank = StringUtils::isNotBlank;
    logger.info(isNotBlank.apply("123").toString());
    logger.info(isNotBlank.apply("").toString());

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

    // 调用工厂类的生产方法
    UserEntityFactory<UserEntity> factory = UserEntity::new;
    factory.produce(System.currentTimeMillis(),"郑培",24);
  }

  /**
   * 双冒号调用构造方法
   */
  private static void testCreatorFunc(){
    BiFunction<String, Integer, UserEntity> creator = UserEntity::new;
    UserEntity entity = creator.apply("郑培", 23);
    logger.info("{}",entity);
  }


  public static void main(String[] args) {
//    testStaticFunc();
//    testMemberFunc();
    testCreatorFunc();
  }
}