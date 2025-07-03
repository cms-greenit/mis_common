package cc.greenit.mis.common.dto.room;

import lombok.Data;

@Data
public class GetRoomSaleListResponseDTO {
    private String companyId;
    private String bookingId;
    private String checkInSequence;
    private String sequenceNumber;
    private String dateId;
    private String shopId;
    private String shopName;
    private String itemCount;
    private String roomNumber;
    private String supplyAmount;
    private String totalAmount;
}
