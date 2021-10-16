package cn.edu.xmu.lab2.service;

import cn.edu.xmu.lab2.model.OrderItem;
import cn.edu.xmu.lab2.mapper.OrderItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    @Autowired
    OrderItemMapper orderItemMapper;

    public int createOrderItem(OrderItem orderItem)
    {
        return orderItemMapper.createOrderItem(orderItem);
    }
}
