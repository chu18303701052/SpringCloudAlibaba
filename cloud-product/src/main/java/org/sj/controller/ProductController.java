package org.sj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: chufuhao
 * @Date: 2023/02/14/10:35
 * @Description:
 */
@RestController
public class ProductController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/product")
    public String getProduct() {
        return "商品端口号:"+port;
    }
}
