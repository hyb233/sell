package com.sell.DTO;

import lombok.Data;

/******
 *author:hyb
 *date:2019/1/26  15:29
 *description:
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }
}
