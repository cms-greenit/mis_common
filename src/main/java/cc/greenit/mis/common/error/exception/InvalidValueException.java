package cc.greenit.mis.common.error.exception;

import cc.greenit.cms.common.error.ErrorCode;

/**
 * packageName    : cc.greenit.cms.globlas.error.exception
 * fileName       : InvalidValueException
 * author         : zaid
 * date           : 2023/06/30
 * description    :
 */
public class InvalidValueException extends BusinessException {
    public InvalidValueException(String value) {
        super(value, ErrorCode.INVALID_INPUT_VALUE);
    }

    public InvalidValueException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}
