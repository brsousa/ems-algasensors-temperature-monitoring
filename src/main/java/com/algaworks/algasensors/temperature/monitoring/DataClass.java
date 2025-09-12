package com.algaworks.algasensors.temperature.monitoring;

import lombok.Data;

@Data
public class DataClass {
    private String data;

    public static void main(String[] args) {
        new DataClass().getData();
    }
}
