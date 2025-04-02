package cc.greenit.mis.common.dto.visit;

import lombok.Data;

@Data
public class GetCheckInListResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpCheckInId;
    private String erpCheckInName;
    private String erpCheckInGender;
    private String memberUkNo;
    private String memberNo;
    private String checkInStatus;
    private Integer hole;
    private String caddyYn;
    private Integer totalAmount;
    private Integer greenAmount;
    private Integer cartAmount;
    private Integer rentAmount;
    private Integer caddyAmount;
    private Integer greenCost;
    private Integer cartCost;
    private Integer rentCost;
    private Integer specialTax;
    private Integer educationTax;
    private Integer sportsTax;
    private Integer agriculturalTax;
    private Integer otherTax;
}
