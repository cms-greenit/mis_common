package cc.greenit.mis.common.dto.master.calendar;

import lombok.Data;

@Data
public class GetCalendarResponseDTO {
    private String dateId;
    private String dayOfWeek;
    private String weekdayType;
    private String monthWeek;
    private String yearWeek;
    private String totalWeek;
}
