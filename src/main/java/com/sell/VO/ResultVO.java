package com.sell.VO;

import lombok.Data;

/******
 *author:hyb
 *date:2019/1/24  10:42
 *description:
 */
@Data
public class ResultVO<T> {

    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private T data;
}
