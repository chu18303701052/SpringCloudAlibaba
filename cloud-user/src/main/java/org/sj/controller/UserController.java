package org.sj.controller;

import org.sj.clients.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: chufuhao
 * @Date: 2023/02/14/10:45
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("user")
    public String getProductInfo(){
        String product = productClient.getProduct();
        return "user调用服务"+product;
    }
}
