package cn.edu.xmu.lab2.mapper;

import cn.edu.xmu.lab2.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order findOrderById(Long id);
    Long createOrder(Order orderInfo);
}
