package cc.greenit.mis.common.dto.room;

import lombok.Data;

@Data
public class GetRoomInfoResponseDTO {
    private String companyId;
    private String roomCode;
    private String roomName;
    private String availableRoomCount;
    private String blockRoomCount;
    private String faultRoomCount;
    private String totalRoomCount;
}
