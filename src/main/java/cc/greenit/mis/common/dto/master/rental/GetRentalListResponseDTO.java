package cc.greenit.mis.common.dto.master.rental;

import cc.greenit.mis.common.adapter.TeeTime;
import lombok.Data;

@Data
public class GetRentalListResponseDTO implements TeeTime {
    private String dateId;
    private String courseId;
    private String timeId;
    private String enCheckInId;
    private String shopId;
    private String ItemCode;
    private String ItemCount;
    private String ItemPrice;
    private String ItemCost;
    private String ItemVat;
}
