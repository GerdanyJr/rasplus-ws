package com.cliente.ws.wsrasmooplus.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public class SubscriptionTypeDto {
    private Long id;

    @NotBlank(message = "O nome não pode ser vazio")
    @Size(min = 5,max = 30,message = "Name deve conter entre 5 e 30 caracteres")
    private String name;

    @Max(value = 12,message = "Mês inválido!!")
    private long acessMonth;

    @Positive
    private BigDecimal price;

    @Size(min = 5,max = 15,message = "ProductKey deve conter entre 5 e 15 caracteres")
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
