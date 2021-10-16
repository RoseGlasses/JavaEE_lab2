package cn.edu.xmu.lab2.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("OrderItem")
public class OrderItem {

    private Long orderId;
    private Long skuId;
    private Integer quantity;
    private Long price;
    private Long discount;
    private String name;
    private Long couponActId;
    private Long beShareId;
}
