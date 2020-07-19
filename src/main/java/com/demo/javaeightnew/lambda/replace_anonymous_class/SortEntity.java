package com.demo.javaeightnew.lambda.replace_anonymous_class;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 排序实体
 *
 * @author Liuzw
 * @since 2020/7/19
 */
@Getter
@Setter
@ToString
public class SortEntity {
  private Integer id;
  private String name;

  public SortEntity() {
  }

  public SortEntity(Integer id, String name) {
    this.id = id;
    this.name = name;
  }


}