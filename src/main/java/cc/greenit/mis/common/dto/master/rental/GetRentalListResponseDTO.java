package cc.greenit.mis.common.dto.master.rental;

import cc.greenit.mis.common.adapter.TeeTime;
import lombok.Data;

@Data
public class GetRentalListResponseDTO implements TeeTime {
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpCheckInId;
    private String erpRsvNo;
    private String shopId;
    private String shopName;
    private String itemCode;
    private String itemName;
    private Integer itemPrice;
    private String itemCount;
    private String itemTotalAmount;
    private String itemTotalNetAmount;
    private String itemTotalSupplyAmount;
    private String itemTotalNetSupplyAmount;
    private String itemTotalVatAmount;
}
