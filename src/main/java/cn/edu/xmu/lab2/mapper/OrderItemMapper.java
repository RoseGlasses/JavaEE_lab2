package cn.edu.xmu.lab2.mapper;

import cn.edu.xmu.lab2.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper {
    int createOrderItem(OrderItem orderItem);
}
