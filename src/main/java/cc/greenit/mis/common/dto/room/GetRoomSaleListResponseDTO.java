package cc.greenit.mis.common.dto.room;

import lombok.Data;

@Data
public class GetRoomSaleListResponseDTO {
    private String companyId;
    private String bookingId;
    private Integer bookingSequence;
    private Integer checkInSequence;
    private String dateId;
    private String shopId;
    private String shopName;
    private Integer itemCount;
    private String roomNumber;
    private Integer supplyAmount;
    private Integer totalAmount;
}
