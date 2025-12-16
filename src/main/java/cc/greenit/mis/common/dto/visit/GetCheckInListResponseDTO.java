package cc.greenit.mis.common.dto.visit;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GetCheckInListResponseDTO {
    private String businessType;
    private String dateId;
    private String courseId;
    private String timeId;
    private String erpRsvNo;
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
    private Integer totalNetAmount;
    private Integer greenNetAmount;
    private Integer cartNetAmount;
    private Integer rentNetAmount;
    private Integer caddyNetAmount;
    private Integer totalNetCost;
    private Integer greenNetCost;
    private Integer cartNetCost;
    private Integer rentNetCost;
    private Integer caddyNetCost;
    private Integer totalCost;
    private Integer greenCost;
    private Integer cartCost;
    private Integer rentCost;
    private Integer caddyCost;
    private Integer specialTax;
    private Integer educationTax;
    private Integer sportsTax;
    private Integer agriculturalTax;
    private Integer otherTax;
    private LocalDateTime checkInDateTime;
}
