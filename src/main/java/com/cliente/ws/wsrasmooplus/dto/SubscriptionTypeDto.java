package com.cliente.ws.wsrasmooplus.dto;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public class SubscriptionTypeDto {
    private Long id;
    private String name;
    private long acessMonth;
    private BigDecimal price;
    private String productKey;

    public SubscriptionTypeDto(){}

    public SubscriptionTypeDto(Long id, String name, long acessMonth, BigDecimal price, String productKey) {
        this.id = id;
        this.name = name;
        this.acessMonth = acessMonth;
        this.price = price;
        this.productKey = productKey;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAcessMonth() {
        return acessMonth;
    }
    public void setAcessMonth(long acessMonth) {
        this.acessMonth = acessMonth;
    }
    public String getProductKey() {
        return productKey;
    }
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }    
}
