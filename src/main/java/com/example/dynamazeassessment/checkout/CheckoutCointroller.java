package com.example.dynamazeassessment.checkout;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CheckoutCointroller {
    @PostMapping(path = "/price", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public long price(@RequestBody CheckoutDto request) {
        Checkout co = new Checkout(request.rules);

        String[] goods = request.goods.split("(?<=\\G.{1})");
        for(String item: goods) {
            co.scan(item);
        }

        return co.getTotal();
    }
}
