package cc.greenit.mis.common.dto.room;

import lombok.Data;

@Data
public class GetRoomSaleListResponseDTO {
    private String companyId;
    private String bookingId;
    private String bookingSequence;
    private String bookerName;
    private String roomCode;
    private String roomName;
    private String roomCount;
    private String visitorCount;
    private String guestName;
    private String guestMembershipNumber;
    private Integer stayNight;
    private String roomChargeCode;
    private String roomChargeAmount;
    private String checkInDate;
    private String checkOutDate;
    private String reservedAt;
}
