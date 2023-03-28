package com.cliente.ws.wsrasmooplus.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public class UserTypeDto {

    private Long id;

    @NotBlank(message = "Não pode ser vazio")
    private String name;

    private String description;

    public UserTypeDto(long id, @NotBlank(message = "Não pode ser vazio") String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
