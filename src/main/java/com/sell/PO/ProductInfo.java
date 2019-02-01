package com.sell.PO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/******
 *author:hyb
 *date:2019/1/23  14:50
 *description:
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;
    /*商品名称*/
    private String ProductName;
    /*单价*/
    private BigDecimal productPrice;
    /*库存*/
    private Integer productStock;
    /*描述*/
    private String productDescription;
    /*小图*/
    private String productIcon;
    /*商品状态,0正常1下架*/
    private Integer productStatus;
    /*类目编号*/
    private Integer categoryType;
}
