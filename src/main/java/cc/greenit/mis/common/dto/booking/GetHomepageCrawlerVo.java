package cc.greenit.mis.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : GetHomepageCrawlerVo
 * author         : zaid
 * date           : 2025. 7. 14.
 * description    :
 */
@Data
public class GetHomepageCrawlerVo {
    private String companyId;
    private String dateId;
    private String courseId;
    private String timeId;
    private Integer greenFee;
    private Integer hole;
}
