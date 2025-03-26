package cc.greenit.mis.common.dto.booking;

import cc.greenit.mis.common.adapter.Agency;
import cc.greenit.mis.common.adapter.Company;
import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import lombok.Data;

@Data
public class GetTeeTimeListRequestDTO implements Company, Agency, Date, GOE {
    String companyId;
    String agencyCode;
    String dateId;
    String dateIdLike;
    String dateIdBetweenFrom;
    String dateIdBetweenTo;
    String dateTimeGoe;
}
