package com.unsplash.helper;

import com.google.common.collect.ImmutableMap;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Map;

public class CommonData {

    public static final String BASE_URL = "https://unsplash.com/";
    public static final String COLLECTION_PAGE_URL = "https://unsplash.com/@hoangthach252/collections";
    public static final int DEFAULT_TIMEOUT = 15;
    public static Map<String, String[]> accountInfo = ImmutableMap.<String, String[]>builder()
            .put("Thach Hoang", new String[]{"hoangthach2502@gmail.com", "NashTech2019"})
            .build();

    public static String getRandomNumber() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(16, random).toString(1).toLowerCase();
    }

}
