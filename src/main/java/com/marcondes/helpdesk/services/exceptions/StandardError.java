package com.marcondes.helpdesk.services.exceptions;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
        super();
    }

    public StandardError(long timestamp, Integer status, String error, String message, String path) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

}
