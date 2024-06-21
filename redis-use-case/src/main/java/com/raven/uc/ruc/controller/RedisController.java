package com.raven.uc.ruc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author raven
 * @date 2024/6/21 10:16
 * @description
 */

@Slf4j
@RestController
@RequestMapping("/redis")
public class RedisController {

    @GetMapping("/shoppingCart")
    public String shoppingCart() {
        log.info("shoppingCart");
        return "shoppingCart";
    }


}
