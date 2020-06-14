package com.github.enesusta.istihza.balancer;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lb")
public class BalancerController {

    private final static Logger log = Logger.getLogger(BalancerController.class);

    @GetMapping
    public String balancerString() {
        log.info("An request has been come");
        return System.getenv("SERVICE_NAME");
    }
}
