package com.src.reacttest.model.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResponseData {
    private boolean isSucceed;
    private String message;
    private Object data;
}
