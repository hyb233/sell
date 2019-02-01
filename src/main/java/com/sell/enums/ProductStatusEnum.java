package com.sell.enums;

import lombok.Getter;

/******
 *author:hyb
 *date:2019/1/23  17:27
 *description:商品状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
