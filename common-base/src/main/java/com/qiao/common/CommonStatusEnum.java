package com.qiao.common;

/**
 * @Description:
 * @Created by ql on 2019/4/20/020 19:09
 * @Version: v1.0
 */
public enum CommonStatusEnum {
    ENABLED("生效"),
    DISABLED("失效"),
    DELETED("删除");

    private String desc;

    private CommonStatusEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
