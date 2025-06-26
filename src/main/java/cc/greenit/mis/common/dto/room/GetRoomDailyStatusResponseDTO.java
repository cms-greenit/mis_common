package cc.greenit.mis.common.dto.room;

import lombok.Data;

@Data
public class GetRoomDailyStatusResponseDTO {
    private String companyId;
    private String dateId;
    private String roomCode;
    private String roomName;
    private Integer totalCount;
    private Integer blockCount;
    private Integer faultCount;
    private Integer usedCount;
    private Integer bookingCount;
    private Integer vacantCount;
    private Integer occupiedCount;
    private Integer checkInCount;
    private Integer checkOutCount;
    private String isPackageYn;
}
