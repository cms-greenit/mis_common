package cc.greenit.mis.common.dto.master.member;

import cc.greenit.mis.common.adapter.Company;
import cc.greenit.mis.common.adapter.Date;
import cc.greenit.mis.common.adapter.GOE;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class GetMemberRequestDTO implements Company {
    @NotEmpty
    private String companyId;
}
