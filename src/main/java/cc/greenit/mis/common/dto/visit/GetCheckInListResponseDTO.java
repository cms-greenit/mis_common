package cc.greenit.mis.common.dto.visit;

import lombok.Data;

@Data
public class GetCheckInListResponseDTO {
    private String companyId;
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpCheckinId;
    private String erpCheckinName;
    private String erpCheckinGender;
    private String erpCheckinQrcode;
    private String erpCheckinPhone;
    private String status;
    private String locker;
    private String bagName;
    private String cartNo;
    private String caddyNo;
    private String caddyName;
    private Integer totalAmount;
    private Integer greenAmount;
    private Integer cartAmount;
    private Integer rentAmount;
    private Integer caddyAmount;
    private Integer specialTax;
    private Integer educationTax;
    private Integer sportsTax;
    private Integer agriculturalTax;
    private Integer otherTax;
    private Integer hole;
    private String memberUkNo;
    private String memberNo;
    private String caddyYn;
}
