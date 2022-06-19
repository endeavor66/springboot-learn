package org.example;

import org.example.service.PhoneService;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        ServiceLoader<PhoneService> loader = ServiceLoader.load(PhoneService.class);
        for (PhoneService provider : loader) {
            System.out.println(provider.getName());
        }
    }
}
