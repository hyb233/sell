package com.sell.repository;

import com.sell.PO.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/******
 *author:hyb
 *date:2019/1/21  18:05
 *description:
 */
public interface ProductCategoryRepositiry extends JpaRepository<ProductCategory,Integer>{

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
