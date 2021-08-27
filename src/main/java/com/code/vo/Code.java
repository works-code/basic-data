package com.code.vo;

import lombok.Data;

@Data
public class Code {

    @Data
    public static class request {
        private String code;
    }

    @Data
    public static class response {
        private String code;
        private String name;
    }

}
