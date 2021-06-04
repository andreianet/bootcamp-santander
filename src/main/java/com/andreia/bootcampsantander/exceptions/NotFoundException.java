package com.andreia.bootcampsantander.exceptions;

import com.andreia.bootcampsantander.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
