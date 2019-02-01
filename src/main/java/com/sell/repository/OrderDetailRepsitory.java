package com.sell.repository;

import com.sell.PO.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/******
 *author:hyb
 *date:2019/1/25  11:05
 *description:
 */
@Repository
public interface OrderDetailRepsitory extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);

}
