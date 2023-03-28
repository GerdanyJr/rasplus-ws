package com.cliente.ws.wsrasmooplus.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public class UserDto {
    private Long id;

    @NotBlank(message = "Valor não pode ser nulo ou vazio!")
    @Size(min = 6,message = "Valor não pode ser menor que 6")
    private String name;

    @Email(message = "Inválido")
    private String email;

    @Size(min = 11,message = "Valor mínimo deve possuir 11 dígitos")
    private String phone;

    @CPF(message = "Inválido")
    private String cpf;

    private LocalDate dtSubscription;

    private LocalDate dtExpiration;

    @NotNull
    private Long userTypeId;

    private Long subscriptionTypeId;

    public UserDto(Long id, String name, String email, String phone, String cpf, LocalDate dtSubscription,
            LocalDate dtExpiration, Long userType, Long subscriptionType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;
        this.dtSubscription = LocalDate.now();
        this.dtExpiration = LocalDate.now();
        this.userTypeId = userType;
        this.subscriptionTypeId = subscriptionType;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public LocalDate getDtExpiration() {
        return dtExpiration;
    }

    public void setDtExpiration(LocalDate dtExpiration) {
        this.dtExpiration = dtExpiration;
    }

    public Long getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Long getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(Long subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }



    
}
