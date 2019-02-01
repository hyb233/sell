package com.sell.repository;

import com.sell.PO.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/******
 *author:hyb
 *date:2019/1/25  13:37
 *description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepsitoryTest {

    @Autowired
    private OrderDetailRepsitory repsitory;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234568585");
        orderDetail.setOrderId("11111119");
        orderDetail.setProductIcon("http:/xxxxxx.jpg");
        orderDetail.setProductId("1111");
        orderDetail.setProductName("皮蛋粥大");
        orderDetail.setProductPrice(new BigDecimal("6.5"));
        orderDetail.setProductQuantity(3);

        repsitory.save(orderDetail);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> byOrderId = repsitory.findByOrderId("1111111");
        Assert.assertNotEquals(0,byOrderId.size());
    }
}