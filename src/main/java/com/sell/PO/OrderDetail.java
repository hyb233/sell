package com.sell.PO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/******
 *author:hyb
 *date:2019/1/25  10:25
 *description:
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;
    private String orderId;
    private String productId;
    /*商品名称*/
    private String productName;
    /*当前价格,单位分*/
    private BigDecimal productPrice;
    /*数量*/
    private Integer productQuantity;
    /*小图*/
    private String productIcon;



}
