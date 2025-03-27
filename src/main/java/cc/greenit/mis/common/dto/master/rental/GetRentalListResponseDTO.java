package cc.greenit.mis.common.dto.master.rental;

import cc.greenit.mis.common.adapter.TeeTime;
import lombok.Data;

@Data
public class GetRentalListResponseDTO implements TeeTime {
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpCheckInId;
    private String shopId;
    private String itemCode;
    private Integer itemPrice;
    private String itemCount;
    private String itemTotalAmount;
    private String itemTotalSupplyAmount;
    private String itemTotalVatAmount;
}
