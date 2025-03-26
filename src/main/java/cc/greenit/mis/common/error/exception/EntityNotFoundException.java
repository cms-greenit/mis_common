package cc.greenit.mis.common.error.exception;

import cc.greenit.cms.common.error.ErrorCode;

/**
 * packageName    : cc.greenit.cms.globlas.error.exception
 * fileName       : EntityNotFoundException
 * author         : zaid
 * date           : 2023/06/30
 * description    :
 */
public class EntityNotFoundException extends BusinessException{
    public EntityNotFoundException(String message) {
        super(message, ErrorCode.ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}
