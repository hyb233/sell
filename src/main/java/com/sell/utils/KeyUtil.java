package com.sell.utils;

import java.util.Random;

/******
 *author:hyb
 *date:2019/1/26  12:36
 *description:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * @return
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer i = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(i);
    }

}
