package cc.greenit.mis.common.dto.room;

import cc.greenit.mis.common.adapter.Company;
import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class GetRoomSaleListRequestDTO implements Company, Date, GOE {
    private String companyId;
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
