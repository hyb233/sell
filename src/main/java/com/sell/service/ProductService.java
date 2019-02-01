package com.sell.service;

import com.sell.DTO.CartDTO;
import com.sell.PO.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/******
 *author:hyb
 *date:2019/1/23  15:47
 *description:
 */
public interface ProductService {

    ProductInfo findByProductId(String productId);

    /*查询所有在架的商品列表*/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /*加库存*/
    void increaseStock(List<CartDTO> cartDTOList);

    /*减库存*/
    void decreaseStock(List<CartDTO> cartDTOList);
}
