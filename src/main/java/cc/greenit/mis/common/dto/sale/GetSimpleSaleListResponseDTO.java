package cc.greenit.mis.common.dto.sale;

import lombok.Data;

@Data
public class GetSimpleSaleListResponseDTO {
    private String dateId;
    private String saleId;
    private Integer saleSeq;
    private String shopId;
    private String erpRsvNo;
}
