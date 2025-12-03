package cc.greenit.mis.common.dto.visit;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GetSimpleCheckInListResponseDTO {
    private String dateId;
    private String timeId;
    private String courseId;
    private String erpRsvNo;
    private String erpCheckInId;
}
