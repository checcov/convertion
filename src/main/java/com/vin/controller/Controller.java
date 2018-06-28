package com.vin.controller;

import com.vin.service.ConvertService;
import com.vin.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ConvertService binary;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value= "/convert", method = RequestMethod.GET)
    public String con_deci_binary(String input, String origin, String goal) {

        // dec -> bin
        if (ConstantUtils.DEC.equals(origin) && ConstantUtils.BIN.equals(goal)) {
            return binary.convertDecToBin(input);
        }
        // hex -> bin
        else if (ConstantUtils.HEX.equals(origin) && ConstantUtils.BIN.equals(goal)) {
            return binary.convertHexToBin(input);
        }




        else {
            return "Error 0501";
        }

    }
}
