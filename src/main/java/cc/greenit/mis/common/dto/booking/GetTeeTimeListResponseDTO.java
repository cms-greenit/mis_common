package cc.greenit.mis.common.dto.booking;

import lombok.Data;

@Data
public class GetTeeTimeListResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private String timeSequence;
    private Integer part;
    private Integer hole;
    private Integer minimumHeadcount;
    // CADDY("캐디동반"), SELF("셀프라운드"), DRIVING("드라이빙캐디"), MARSHALL("마샬캐디"), INTERN("인턴캐디"), SMILE("미소지기캐디"), SPROUT("새싹캐디");
    private String caddyType;
    private String greenFee;
    private String cartFee;
    private String erpReservationName;
    private String erpReservationNum;
    private String erpReservationPhone;
    private String erpReservationAgencyCode;
    private String erpReservationHeadcount;
    private String erpReservationGreenFee;
    private String isErpBlockYn;
    private String isErpEmptyYn;
    private String isErpRainOutYn;
    private String isSelfCartYn;
    private String isAffiliatedGroupYn;
    // HOMEPAGE, TEL, GOLAGA, OTHER
    private String erpAgencyType;
    private String erpAgencyName;
    private String erpAssigneeName = null;
    private String erpAssigneePhone = null;
    private String teamName;
}
