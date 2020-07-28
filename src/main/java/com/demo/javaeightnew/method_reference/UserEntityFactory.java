package com.demo.javaeightnew.method_reference;

/**
 * 用户实体工厂类
 *
 * @author Liuzw
 * @since 2020/7/25
 */
@FunctionalInterface
public interface UserEntityFactory<T extends UserEntity> {

  T produce(Long id, String name, Integer age);
}