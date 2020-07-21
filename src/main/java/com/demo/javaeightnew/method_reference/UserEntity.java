package com.demo.javaeightnew.method_reference;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Liuzw
 * @since 2020/7/19
 */
@Getter
@Setter
@ToString
public class UserEntity {
  private Long id;
  private String name;
  private Integer age;

  public UserEntity() {
  }

  public UserEntity(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public UserEntity(Long id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}