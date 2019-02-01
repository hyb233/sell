package com.sell.converter;

import com.sell.DTO.OrderDTO;
import com.sell.PO.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/******
 *author:hyb
 *date:2019/1/28  17:34
 *description:
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO converter(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> converter(List<OrderMaster> list){
        return list.stream().map(e->converter(e)).collect(Collectors.toList());
    }

}
