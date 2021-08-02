
package com.huawei.hms.finaapplication;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class GetKeyUtil {
    public static String getApiKey() {
        String apiKey = null;
        try {
            String API_KEY = "CgB6e3x9/vd6oXEAfKb2tlYL4Jml/hDVYpFa+2fMv0Yq7/hgCPWwf4H+aZXa4gydagDXjWKGw6xtu4fKIZ+/XH4z";
            apiKey = URLEncoder.encode(API_KEY, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return apiKey;
    }
}
