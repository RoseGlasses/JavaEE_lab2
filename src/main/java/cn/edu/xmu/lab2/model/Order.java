package cn.edu.xmu.lab2.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

@Alias("Order")
public class Order {

    private Long id;
    private Long customId;
    private String orderSn;
    private Long pid;
    private String consignee;
    private Long regionId;
    private String address;
    private String mobile;
    private String message;
    private Integer orderType;
    private Long freightPrice;
    private Long couponId;
    private Long discountPrice;
    private Long originPrice;
    private Long presaleId;
    private Long grouponId;
    private Integer rebateNum;
    private Date confirmTime;
    private String shipmentSn;
    private Integer state;
    private Integer substate;
    private Integer beDeleted;
    private Date gmtCreate;
    private Date gmtModified;

    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Long getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(Long freightPrice) {
        this.freightPrice = freightPrice;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Long discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Long originPrice) {
        this.originPrice = originPrice;
    }

    public Long getPresaleId() {
        return presaleId;
    }

    public void setPresaleId(Long presaleId) {
        this.presaleId = presaleId;
    }

    public Long getGrouponId() {
        return grouponId;
    }

    public void setGrouponId(Long grouponId) {
        this.grouponId = grouponId;
    }

    public Integer getRebateNum() {
        return rebateNum;
    }

    public void setRebateNum(Integer rebateNum) {
        this.rebateNum = rebateNum;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getShipmentSn() {
        return shipmentSn;
    }

    public void setShipmentSn(String shipmentSn) {
        this.shipmentSn = shipmentSn;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSubstate() {
        return substate;
    }

    public void setSubstate(Integer substate) {
        this.substate = substate;
    }

    public Integer getBeDeleted() {
        return beDeleted;
    }

    public void setBeDeleted(Integer beDeleted) {
        this.beDeleted = beDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
