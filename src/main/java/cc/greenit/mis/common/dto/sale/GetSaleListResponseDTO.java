package cc.greenit.mis.common.dto.sale;

import lombok.Data;

@Data
public class GetSaleListResponseDTO {
    private String dateId;
    private String weekdayType;
    private String bookingOpenStartDate;
    private String bookingOpenStartTime;
    private String bookingOpenEndDate;
    private String bookingOpenEndTime;
    private String homepageOpenStartDate;
    private String homepageOpenStartTime;
    private String homepageOpenEndDate;
    private String homepageOpenEndTime;
    private String bookingCancelStartDate;
    private String bookingCancelStartTime;
    private String bookingCancelEndDate;
    private String bookingCancelEndTime;
    private String homepageCancelStartDate;
    private String homepageCancelStartTime;
    private String homepageCancelEndDate;
    private String homepageCancelEndTime;
}
