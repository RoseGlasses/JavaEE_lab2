package cn.edu.xmu.lab2.controller;

import cn.edu.xmu.lab2.model.Order;
import cn.edu.xmu.lab2.model.OrderItem;
import cn.edu.xmu.lab2.service.OrderItemService;
import cn.edu.xmu.lab2.service.OrderService;
import cn.edu.xmu.lab2.util.ReturnObject;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Api(value = "订单API", tags = "订单API")
@RestController /*Restful的Controller对象*/
@RequestMapping(value = "/orders", produces = "application/json;charset=UTF-8")
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    OrderItemService orderItemService;

    @GetMapping("/{id}")
    public Object getOrderInfo(@PathVariable("id") Long id)
    {
        return orderService.findById(id);
    }

    @PostMapping("")
    public Object createOrder(@RequestBody Order orderInfo)
    {
        Long orderId = orderService.createOrder(orderInfo);
        List<OrderItem> orderItems = orderInfo.getOrderItems();
        for(OrderItem orderItem:orderItems) {
            orderItem.setOrderId(orderId);
            orderItemService.createOrderItem(orderItem);
        }
        return new ReturnObject<String>("新建成功");
    }
}