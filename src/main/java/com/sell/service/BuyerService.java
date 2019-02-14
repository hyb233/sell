package com.sell.service;

import com.sell.DTO.OrderDTO;

/******
 *author:hyb
 *date:2019/2/13  11:57
 *description:
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid,String orderid);

    OrderDTO cancel(String openid,String orderid);

}
