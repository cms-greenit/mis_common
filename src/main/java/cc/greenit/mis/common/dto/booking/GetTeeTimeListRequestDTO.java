package cc.greenit.mis.common.dto.booking;

import cc.greenit.mis.common.adapter.Agency;
import cc.greenit.mis.common.adapter.Company;
import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class GetTeeTimeListRequestDTO implements Company, Agency, Date, GOE {
    @NotEmpty
    private String companyId;
    private String agencyCode;
    @Size(min = 8, max = 8)
    private String dateId;
    @Size(min = 4, max = 8)
    private String dateIdLike;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @Size(min = 14, max = 14)
    private String datetimeGoe;
}
