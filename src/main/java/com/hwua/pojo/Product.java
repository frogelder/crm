package com.hwua.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Product {
    private String id;
    private String productNum;
    private String productName;
    private String cityName;
    private Date departureTime;
    private Double productPrice;
    private String productDesc;
    private Integer productStatus;
}
