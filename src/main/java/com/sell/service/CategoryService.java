package com.sell.service;

import com.sell.PO.ProductCategory;

import java.util.List;

/******
 *author:hyb
 *date:2019/1/23  12:48
 *description:
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
