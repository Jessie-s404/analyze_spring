package com.jessie.edu.pojo;

/**
 * ClassName: Result
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-15 下午4:28   @Version 1.0        描述
 */
public class Result {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
