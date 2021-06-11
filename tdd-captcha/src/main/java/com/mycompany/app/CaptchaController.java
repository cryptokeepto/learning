package com.mycompany.app;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/captcha")
public class CaptchaController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    String captcha() {
        Random random = new Random();
        Captcha captcha =new Captcha(
            1+random.nextInt(2), 
            1+random.nextInt(10),
            1+random.nextInt(4),
            1+random.nextInt(10));
        return captcha.toString();
    }
}
