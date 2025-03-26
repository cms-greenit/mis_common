package cc.greenit.mis.common.error.exception;

import cc.greenit.cms.common.error.ErrorCode;

/**
 * packageName    : cc.greenit.cms.globlas.error.exception
 * fileName       : BusinessException
 * author         : zaid
 * date           : 2023/06/30
 * description    :
 */
public class BusinessException extends RuntimeException {
    private ErrorCode errorCode;

    public BusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
