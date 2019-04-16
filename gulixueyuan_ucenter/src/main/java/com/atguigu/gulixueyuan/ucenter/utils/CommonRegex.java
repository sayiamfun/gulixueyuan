package com.atguigu.gulixueyuan.ucenter.utils;

public class CommonRegex {

    /** 邮箱正则表达式 */
    public static String emailRegex = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    /** 电话号码正则表达式 */
    public static String telRegex = "^1[0-9]{10}$";

}
