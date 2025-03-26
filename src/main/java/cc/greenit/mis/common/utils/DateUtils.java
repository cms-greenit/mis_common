package cc.greenit.mis.common.utils;

import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import cc.greenit.mis.common.error.exception.InvalidValueException;
import org.springframework.stereotype.Component;

@Component
public class DateUtils {
    public static <T extends Date & GOE> void validateParams (T params) {
        if(params.getDateId() == null && params.getDateIdLike() == null && params.getDateIdBetweenFrom() == null
                && params.getDateIdBetweenTo() == null && params.getDateTimeGoe() == null){
            throw new InvalidValueException(params.toString());
        }
    }
}
