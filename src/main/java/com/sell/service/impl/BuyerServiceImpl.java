package com.sell.service.impl;

import com.sell.DTO.OrderDTO;
import com.sell.enums.ResultEnum;
import com.sell.exception.SellException;
import com.sell.service.BuyerService;
import com.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/******
 *author:hyb
 *date:2019/2/13  12:01
 *description:
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderid) {
        return checkOrderOwner(openid,orderid);
    }

    @Override
    public OrderDTO cancel(String openid, String orderid) {
        OrderDTO orderDTO = checkOrderOwner(openid, orderid);
        if(orderDTO == null){
            log.error("【取消订单】查不到改订单，orderId={}",orderid);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderid){
        OrderDTO orderDTO = orderService.findOne(orderid);
        if(!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)){
            log.error("【查询订单】订单的openid不一致，openid={},orderDTO={}",openid,orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR) ;
        }
        return orderDTO;
    }
}
