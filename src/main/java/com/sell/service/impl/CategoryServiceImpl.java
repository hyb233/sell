package com.sell.service.impl;

import com.sell.PO.ProductCategory;
import com.sell.repository.ProductCategoryRepositiry;
import com.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/******
 *author:hyb
 *date:2019/1/23  13:00
 *description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepositiry repositiry;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repositiry.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repositiry.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repositiry.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repositiry.save(productCategory);
    }
}
