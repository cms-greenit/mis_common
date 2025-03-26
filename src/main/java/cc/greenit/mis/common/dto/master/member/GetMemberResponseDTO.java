package cc.greenit.mis.common.dto.master.member;

import lombok.Data;

@Data
public class GetMemberResponseDTO {
    private String companyId;
    private String memberName;
    private String memberAddress;
    private String memberAddressDetail;
    private String memberGender;
    private String memberBirth;
    private String ermMemberId;
}
