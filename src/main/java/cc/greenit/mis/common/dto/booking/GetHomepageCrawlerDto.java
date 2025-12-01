package cc.greenit.mis.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : GetHomepageCrawlerDto
 * author         : zaid
 * date           : 2025. 7. 14.
 * description    :
 */
@Data
public class GetHomepageCrawlerDto {
    private String companyId;
    private String dateId;
    private String dateIdBetweenFrom;
    private String dateIdBetweenTo;
    private String dateIdLike;
}
