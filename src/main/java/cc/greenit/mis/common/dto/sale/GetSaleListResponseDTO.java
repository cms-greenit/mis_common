package cc.greenit.mis.common.dto.sale;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GetSaleListResponseDTO {
    private String businessType;
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpCheckInId;
    private Integer shopId;
    private String shopName;
    private Integer saleId;
    private Integer saleSeq;
    private String itemCode;
    private String itemCategory;
    private String itemName;
    private Integer itemCount;
    private Integer itemPrice;
    private Integer saleSupplyAmount;
    private Integer saleVatAmount;
    private Integer saleTotalAmount;
}
