package cc.greenit.mis.common.dto.master.member;

import lombok.Data;

@Data
public class GetMemberResponseDTO {
    private String erpMemberUkNo;
    private String memberName;
    private String memberAddress;
    private String memberAddressDetail;
    private String memberGender;
    private String memberAge;
}
