package com.code.vo;

import com.code.enums.RtnCode;
import lombok.Data;

@Data
public class Error {
    private RtnCode code = RtnCode.E001;
    private String errMsg;

    public String getErrMsg() {
        return this.code.getMsg();
    }
}
