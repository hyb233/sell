package com.sell.repository;

import com.sell.PO.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/******
 *author:hyb
 *date:2019/1/23  15:11
 *description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,Integer> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    ProductInfo findByProductId(String productId);
}
