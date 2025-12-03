package cc.greenit.mis.common.dto.booking;

import lombok.Data;

@Data
public class GetSimpleTeeTimeListResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpReservationNum;
}
