package cc.greenit.mis.common.dto.room;

import lombok.Data;

@Data
public class GetRoomVisitListResponseDTO {
    private String companyId;
    private String bookingId;
    private String mainBookingId;
    private String bookingSequence;
    private String checkInSequence;
    private String guestName;
    private String guestMembershipNumber;
    private String roomCode;
    private String roomName;
    private String roomNumber;
    private String checkInDate;
    private String checkOutDate;
    private String roomChargeCode;
    private String roomChargeAmount;
    private Integer visitorCount;
    private Integer visitorOverCount;
    private String checkOutYn;
    private String remark;
    private String mainYn;
}
