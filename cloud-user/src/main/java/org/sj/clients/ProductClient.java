package org.sj.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: chufuhao
 * @Date: 2023/02/14/10:41
 * @Description:
 */
@FeignClient("cloudproduct")
public interface ProductClient {
    @GetMapping("/product")
    public String getProduct();
}
