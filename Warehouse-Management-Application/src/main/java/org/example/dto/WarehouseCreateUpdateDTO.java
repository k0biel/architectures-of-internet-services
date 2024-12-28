package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WarehouseCreateUpdateDTO {
    private String name;
    private String location;
}