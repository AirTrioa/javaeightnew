package com.demo.javaeightnew.method_reference;

/**
 * 用户实体的函数式接口
 *
 * @author Liuzw
 * @since 2020/7/21
 */
@FunctionalInterface
public interface UserEntityFactory<NAME,AGE,ENTITY> {
  ENTITY create(NAME name,AGE age);
}
