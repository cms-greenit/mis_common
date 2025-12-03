package cc.greenit.mis.common.dto.master.rental;

import lombok.Data;

@Data
public class GetSimpleRentalListResponseDTO {
    private String dateId;
    private String erpCheckInId;
    private String shopId;
    private String itemCode;
}
