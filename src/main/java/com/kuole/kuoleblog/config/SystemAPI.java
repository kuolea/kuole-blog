package com.kuole.kuoleblog.config;

/**
 * @author jifang
 * @date 2020-09-14 15:53
 * description:
 */
public class SystemAPI {
    public static String getReslPath() {
        String osName = System.getProperty("os.name");
        String realPath;
        if (osName.toLowerCase().startsWith("win")) {
            realPath = "D:/upload/";
        } else {
            realPath = "/home/upload/";
        }
        return realPath;
    }
}
