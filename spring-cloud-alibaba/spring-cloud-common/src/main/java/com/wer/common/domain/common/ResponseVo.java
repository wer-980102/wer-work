package com.wer.common.domain.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wer.common.domain.enums.ResponseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回内容
 *
 * @author herman.zzp
 * @version 1.0
 * @date 2020/1/8 9:02
 */
@Data
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResponseVo<T> {

    private Integer status;

    private String msg;

    private T data;

    private ResponseVo(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ResponseVo(Integer status, T data) {
        this.status = status;
        this.data = data;
    }


    public static ResponseVo success() {
        return new ResponseVo(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc());
    }

    public static ResponseVo success(Object resultMessage) {
        return new ResponseVo(ResponseEnum.SUCCESS.getCode(), resultMessage);
    }

    public static ResponseVo success(Integer resultCode, Object resultMessage) {
        return new ResponseVo(resultCode, resultMessage);
    }

    public static ResponseVo error(ResponseEnum responseEnum) {
        return new ResponseVo(responseEnum.getCode(), responseEnum.getDesc());
    }

    public static ResponseVo errorMsg(Object resultMessage) {
        return new ResponseVo(ResponseEnum.ERROR.getCode(), resultMessage);
    }

    public static ResponseVo error(Integer resultCode, Object resultMessage) {
        return new ResponseVo(resultCode, resultMessage);
    }
}
