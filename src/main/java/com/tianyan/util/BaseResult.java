package com.tianyan.util;

/**
 * @author: chenyj255
 * @date: 2021-03-31
 * 返回类
 */
public class BaseResult {

    private String result;

    @Override
    public String toString() {
        return "{" +
                "\"result\":\"" + result + "\"" +
                ", \"msg\":\"" + msg + "\"" +
                ", \"obj\":\"" + obj + "\"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            //地址相等
            return true;
        }

        if (obj == null) {
            //非空性：对于任意非空引用x，x.equals(null)应该返回false。
            return false;
        }

        if (obj instanceof BaseResult) {
            BaseResult baseResult = (BaseResult) obj;
            return this.msg.equals(baseResult.msg) &&
                    this.obj.equals(baseResult.obj) &&
                    this.result.equals(baseResult.result);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hashResult = 17;
        hashResult = 31 * hashResult + (msg == null ? 0 : msg.hashCode());
        hashResult = 31 * hashResult + (obj == null ? 0 : obj.hashCode());
        hashResult = 31 * hashResult + (result == null ? 0 : result.hashCode());
        return hashResult;
    }

    private String msg;
    private Object obj;

    public static final BaseResult SUCCESS = successWithData(null);

    public static final BaseResult FAILED = failedWithData(null);


    public BaseResult() {
        this.result = "0000";
        this.msg = "SUCCESS";
    }

    public BaseResult(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public BaseResult(String result, String msg, Object obj) {
        this.result = result;
        this.msg = msg;
        this.obj = obj;
    }

    public static BaseResult successWithData(Object obj) {
        return new BaseResult("0000", "请求成功", obj);
    }

    public static BaseResult failedWithData(Object obj) {
        return new BaseResult("A0410", "请求失败", obj);
    }

    public static BaseResult successWithMsg(String msg) {
        return new BaseResult("0000", msg);
    }

    public static BaseResult failedWithMsg(String errMsg) {
        return new BaseResult("A0410", errMsg);
    }

    public static BaseResult failedWithMsgAndData(String errMsg, Object obj) {
        return new BaseResult("A0410", errMsg, obj);
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static BaseResult getSuccess() {
        return SUCCESS;
    }

    public static BaseResult getFailed() {
        return FAILED;
    }


}
