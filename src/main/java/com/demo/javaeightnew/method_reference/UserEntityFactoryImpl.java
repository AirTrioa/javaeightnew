package com.demo.javaeightnew.method_reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户实体工厂类
 *
 * @author Liuzw
 * @since 2020/7/21
 */
public class UserEntityFactoryImpl implements UserEntityFactory<String, Integer, UserEntity> {

  private static final Logger logger = LoggerFactory.getLogger(UserEntityFactoryImpl.class);

  public UserEntityFactoryImpl() {
    logger.info("用户实体工厂类初始化");
  }

  @Override
  public UserEntity create(String s, Integer integer) {
    UserEntity userEntity = new UserEntity(s, integer);
    userEntity.setId(System.currentTimeMillis());
    return userEntity;
  }
}