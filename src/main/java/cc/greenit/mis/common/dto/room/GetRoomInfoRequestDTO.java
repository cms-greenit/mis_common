package cc.greenit.mis.common.dto.room;

import cc.greenit.mis.common.adapter.Company;
import lombok.Data;

@Data
public class GetRoomInfoRequestDTO implements Company {
    private String companyId;
}
