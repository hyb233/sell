package com.sell.PO;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/******
 *author:hyb
 *date:2019/1/21  17:53
 *description:
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /*类目ID*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /*类目名字*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;

}
