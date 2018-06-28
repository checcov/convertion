package com.vin.service;


import com.vin.utils.NumberUtils;
import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    public static final String UnknownError = "error3306";


    public String convertDecToBin(String value) {
        if (NumberUtils.isValidNum(value)) {
            return Integer.toBinaryString(NumberUtils.transStringToInt(value));
        }
        else {
            return UnknownError;
        }
    }

    public String convertHexToBin(String value) {
        String hex = "";
        if (NumberUtils.isValidNum(value)) {
            char[] chars = value.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                //high 4 bit
                String.valueOf(hex.charAt((chars[i] & 0XF0) >> 4));
                // low 4 bit
                hex += String.valueOf(hex.charAt(chars[i] & 0x0F));
            }
            hex += " ";
        }
        return hex;
    }
}
