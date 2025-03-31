package cc.greenit.mis.common.dto.visit;

import cc.greenit.mis.common.adapter.Company;
import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
public class GetCheckInListRequestDTO implements Company, Date, GOE {
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
    private String checkInId;
    private List<String> checkInIdList = new ArrayList<>();

    public GetCheckInListRequestDTO(String companyId, String checkInId) {
        this.companyId = companyId;
        this.checkInId = checkInId;
    }
}
