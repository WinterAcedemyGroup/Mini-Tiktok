package com.fingerdance.minitiktok.response;

import lombok.Data;

@Data
public class ResponseData<T> {

    /**
     * 结果状态 ,具体状态码参见ResponseCode
     */
    private long statusCode;



    /**
     * 响应消息
     **/
    private String statusMsg;

    /**
     * 响应数据
     **/
    private T data;

    /**
     * 成功
     *
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> success() {
        ResponseData<T> resultData = new ResponseData<>();
        resultData.setStatusCode(ResponseCode.RC200.getCode());
        resultData.setStatusMsg(ResponseCode.RC200.getMessage());
        return resultData;
    }

    /**
     * 成功
     *
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> success(String message) {
        ResponseData<T> resultData = new ResponseData<>();
        resultData.setStatusCode(ResponseCode.RC200.getCode());
        resultData.setStatusMsg(message);
        return resultData;
    }

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> success(T data) {
        ResponseData<T> resultData = new ResponseData<>();
        resultData.setStatusCode(ResponseCode.RC200.getCode());
        resultData.setStatusMsg(ResponseCode.RC200.getMessage());
        resultData.setData(data);
        return resultData;
    }

    /**
     * 失败
     *
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> fail(String message) {
        ResponseData<T> resultData = new ResponseData<>();
        resultData.setStatusCode(ResponseCode.RC999.getCode());
        resultData.setStatusMsg(message);
        return resultData;
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> fail(int code, String message) {
        ResponseData<T> resultData = new ResponseData<>();
        resultData.setStatusCode(code);
        resultData.setStatusMsg(message);
        return resultData;
    }

    /**
     * 失败
     *
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> fail() {
        ResponseData<T> resultData = new ResponseData<>();
        resultData.setStatusCode(ResponseCode.RC999.getCode());
        resultData.setStatusMsg(ResponseCode.RC999.getMessage());
        return resultData;
    }

}