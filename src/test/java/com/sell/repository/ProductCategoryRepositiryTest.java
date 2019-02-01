package com.sell.repository;

import com.sell.PO.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/******
 *author:hyb
 *date:2019/1/21  18:21
 *description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositiryTest {

    @Autowired
    private ProductCategoryRepositiry repositiry;

    @Test
    public void findOneTest() {
        ProductCategory one = repositiry.findOne(1);
        System.out.println(one.toString());
    }
    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生专用");
        productCategory.setCategoryType(3);
        ProductCategory save = repositiry.save(productCategory);
        System.out.println(save);
    }
    @Test
    public void saveTest2() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("狗狗专用");
        productCategory.setCategoryType(3);
        ProductCategory save = repositiry.save(productCategory);
        System.out.println(save);
    }
    @Test
    public void saveTest3() {
        ProductCategory one = repositiry.findOne(2);
        one.setCategoryName("男生专用");
        ProductCategory save = repositiry.save(one);
        System.out.println(save);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(1, 2);
        List<ProductCategory> result = repositiry.findByCategoryTypeIn(list);
        Assert.assertNotNull(result);
    }

}