package cc.greenit.mis.common.dto.master.mapper;

import cc.greenit.mis.common.adapter.Company;
import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import lombok.Data;

@Data
public class GetGolfRoomMapperRequestDTO implements Company, Date, GOE {
    private String companyId;
    private String dateId;
    private String dateIdLike;
    private String dateIdBetweenFrom;
    private String dateIdBetweenTo;
    private String datetimeGoe;
}
