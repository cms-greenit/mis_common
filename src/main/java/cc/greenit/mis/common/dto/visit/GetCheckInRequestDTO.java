package cc.greenit.mis.common.dto.visit;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.visit.dto
 * fileName       : GetCheckInRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 체크인 조회 Request
 */
@Data
public class GetCheckInRequestDTO {
    @NotEmpty
    private String companyId;
    @Size(min = 8, max = 8)
    private String dateId;
    private String courseId;
    @Size(min = 4, max = 4)
    private String timeId;
    private String timeSeq;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @Size(min = 6, max = 8)
    private String dateIdLike;
    @Size(min = 14, max = 14)
    private String datetimeGoe;
    private String qrcode;
    private String checkinId;
    private List<String> checkInIdList = new ArrayList<>();

    public GetCheckInRequestDTO(String companyId, String checkinId) {
        this.companyId = companyId;
        this.checkinId = checkinId;
    }
}
