package cc.greenit.mis.common.error;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : cc.greenit.cms.common
 * fileName       : ErrorCode
 * author         : soonhyeong
 * date           : 2023/04/12
 * description    : cms error code
 */
public enum ErrorCode {
    INVALID_INPUT_VALUE(400, "C001", "유효하지 않은 파라미터"),
    INVALID_TYPE_VALUE(400, "C002", "유효하지 않은 파라미터 타입"),
    HANDLE_ACCESS_DENIED(403, "C003", "API 인증 실패"),
    NOT_SUPPORTED_API(403, "C004", "제공하지 않는 API 입니다."),
    METHOD_NOT_ALLOWED(405, "C005", "허용되지 않은 메소드 입니다."),
    API_SERVER_ERROR(406, "C006", "골프장 API 통신 오류"),
    ENTITY_NOT_FOUND(400, "C007", "데이터 조회 실패"),
    WRONG_APPROACH(401, "C008", "잘못된 접근"),
    LOGGING_FAIL(400, "C009", "로그 기록 실패"),
    API_DB_ERROR(406, "C010", "골프장 DB 연결 오류"),
    INVALID_TOKEN(403,"C011", "유효하지 않은 토큰입니다."),
    EXPIRED_TOKEN(403, "C012", "만료된 토큰 입니다."),
    NO_REFRESH_TOKEN(403,"C013", "토큰이 존재하지않습니다"),
    PERMISSION_DENIED(403, "C014", "접근 권한이 없습니다."),
    INTERNAL_SERVER_ERROR(500, "C100", "Server Error"),

    TIME_NOT_FOUND(400, "B001", "예약 타임이 존재하지 않습니다."),
    BOOKING_NOT_POSSIBLE(400, "B002", "예약할 수 없는 타임입니다."),
    TIME_NOT_OPEN(400, "B003", "오픈되지 않은 예약입니다."),
    OVER_PERSONNEL(400, "B004", "예약인원을 확인하세요."),
    ALREADY_BOOKING(400, "B005", "이미 예약된 타임입니다."),
    BOOKING_NOT_FOUND(400, "B006", "예약이 존재하지 않습니다."),
    CANCEL_NOT_POSSIBLE(400, "B007", "취소할 수 없는 예약입니다."),
    BOOKING_MEMBER_NOT_FOUND(400, "B008", "예약자(동반자)가 존재하지 않습니다."),
    OTHER_AGENCY_RESERVATION(400, "B009", "다른 에이전시의 예약입니다."),
    RESERVATION_PERSONNEL_EXCEEDED(400, "B010", "라운드 인원이 초과되었습니다."),
    COURSE_NOT_FOUND(400, "B011", "코스 정보가 존재하지 않습니다."),
    COMPANY_NOT_FOUND(400, "B012", "골프장 정보가 존재하지 않습니다."),
    LOCK_TIME(400, "B013", "락 걸린 타임입니다."),
    PLACEBO_PERIOD_RESERVATION(400, "B014", "위약기간에 포함되어 취소가 불가능합니다."),
    COMPANY_BLOCK_TIME(400, "B015", "해당 골프장에서 블록한 타임입니다."),
    DUPLICATION_MEMBER(400, "B016", "이미 등록된 동반자 입니다."),
    MEMBER_SETTING_ERROR(400, "B017", "동반자 설정 오류"),
    PRICE_NOT_FOUND(400, "B018", "요금정보가 존재하지 않습니다."),
    MEMBER_NOT_FOUND(400, "B019", "회원정보를 찾을 수 없습니다"),
    RESERVATION_SETTING_ERROR(400, "B020", "예약 설정 오류"),
    AGENCY_NOT_OPEN(400, "B021", "오픈되지 않은 타임입니다."),
    PLACEBO_PERIOD_MEMBER(400, "B022", "위약기간에 포함되어있는 회원입니다."),
    DUPLICATION_BOOKING_SAME_DAY(400, "B023", "같은날 예약이 존재합니다."),
    WEEKEND_RESERVATION_EXCEEDED(400, "B024", "주말 예약횟수를 초과하였습니다."),
    WEEKDAY_RESERVATION_EXCEEDED(400, "B025", "주중 예약횟수를 초과하였습니다."),
    VISIT_PROHIBITED_MEMBER(400, "B026", "내장 금지 회원입니다."),
    BOOKING_PROHIBITED_MEMBER(400, "B027", "예약 금지 회원입니다."),
    AGENCY_NOT_FOUND(400, "B028", "존재하지 않는 에이전시입니다."),
    RESERVATION_CANCEL_ERROR(400, "B029", "예약 취소 오류"),
    ALREADY_CHECKIN_BOOKING(400, "B030", "이미 체크인 된 예약입니다."),
    BOOKING_OWNER_NOT_DELETE(400, "B031", "예약자는 삭제할 수 없습니다."),
    BOOKING_OWNER_NOT_CHANGE(400, "B032", "예약자는 수정할 수 없습니다."),
    MONTH_RESERVATION_EXCEEDED(400, "B034", "해당 월 예약횟수를 모두 사용하였습니다."),
    DAY_RESERVATION_EXCEEDED(400, "B035", "해당 일 예약횟수를 모두 사용하였습니다."),
    RESERVATION_EXCEEDED(400, "B036", "예약횟수를 모두 사용하였습니다."),
    ALREADY_COMP_TIME(400, "B037", "이미 등록 된 컴프 타임 입니다."),
    COMP_TIME_NOT_FOUND(400,  "B038", "컴프 타임을 찾을 수 없습니다."),
    POLICY_NOT_FOUND(400, "B039", "정책을 찾을 수 없습니다."),

    CHECKIN_SETTING_ERROR(400, "V001", "체크인 설정 오류"),
    LOCKER_SETTING_ERROR(400, "V002", "락커 설정 오류"),
    QRCODE_SETTING_ERROR(400, "V003", "QRCode 설정 오류"),
    CHECKIN_NOT_FOUND(400, "V004", "체크인 정보가 없습니다."),
    ALREADY_CHECKIN(400, "V005", "이미 체크인 된 고객입니다."),
    CHECKIN_ONLY_TODAY(400, "V006", "체크인은 당일만 가능합니다."),
    QRCODE_NOT_FOUND(400, "V007", "없는 qrcode 입니다."),
    GET_CHECKIN_ONLY_TODAY(400, "V008", "체크인 조회는 당일만 가능합니다."),
    CHECKIN_PERSONNEL_EXCEEDED(400, "V009", "체크인 인원이 초과되었습니다."),
    PROMOTION_SETTING_ERROR(400, "V010", "프로모션 적용에 실패했습니다."),
    DELETED_CHECKIN(400, "V011", "삭제된 체크인 정보 입니다."),
    ALREADY_CHECKOUT(400, "V012", "체크아웃된 체크인 정보 입니다."),
    CHECKIN_IMPOSSIBLE_AGENCY(400, "V013", "체크인 불가능한 예약매체 입니다."),
    MISMATCH_TIME(400, "V014", "타임이 일치하지 않습니다."),
    ALREADY_ISSUED_LOCKER(400, "V015", "락커가 이미 존재합니다."),
    CHECKIN_IMPOSSIBLE_POLICY(400, "V016", "셀프체크인 정책에 부합하지 않는 티타임 입니다."),
    ADMIN_USER_ALREADY_EXISTS(409, "AU01", "존재하는 관리자입니다."),
    ADMIN_USER_NOT_FOUND(404, "AU02", "존재하지 않는 관리자입니다."),
    ADMIN_USER_INCORRECT_PW(409, "AU03", "비밀번호가 일치하지 않습니다."),
    ADMIN_USER_FORBIDDEN(403, "AU04", "Expired access token. Please login again."),
    ADMIN_USER_UNAUTHORIZED(401, "AU05", "Unauthorized."),
    ADMIN_USER_FORBIDDEN_JWT_EXP(403, "AU06", "JWT verify error - or expired."),
    ADMIN_USER_FORBIDDEN_NO_AT(403, "AU07", "No access token. Please login again."),
    ADMIN_USER_FORBIDDEN_NO_RT(403, "AU08", "No refresh token. Please login again."),
    ADMIN_USER_PW_NOT_SWITCHED(401, "AU09", "비밀번호를 변경하셔야합니다."),
    ADMIN_USER_DELETED(403, "AU10", "삭제된 관리자입니다."),
    ADMIN_USER_BLOCKED(403, "AU11", "차단된 관리자입니다."),
    ADMIN_USER_PW_UNACCEPTABLE(409, "AU12", "기존에 등록한 비밀번호와 일치합니다. 다른 비밀번호로 변경해주세요."),
    ADMIN_USER_CANNOT_DELETE_OWN(409, "AU13", "본인 계정은 삭제할 수 없습니다."),
    AGENCY_KEY_TWO_LIMIT(409, "A021", "대행사 키 2개 이상 등록 못합니다. 하나 삭제하고 등록해주세요."),
    AGENCY_NOT_ACTIVE(409, "A022", "대행사 비활성화/삭제 상태입니다."),
    AGENCY_KEY_NOT_FOUND(404, "A023", "존재하지 않는 대행사 키입니다."),
    ADMIN_CM_ALREADY_EXISTS(409, "ACM01", "에이전시 - 골프장 이미 매핑되어 있습니다."),
    ADMIN_CM_NOT_FOUND(404, "ACM02", "No code mapper detected."),

    ;

    private int status;
    private String code;
    private String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private static final Map<String, String> codeMap = Collections
            .unmodifiableMap(
                    Stream.of(values()).collect(Collectors.toMap(ErrorCode::getCode, ErrorCode::name))
            );

    public static ErrorCode of(final String code) {
        return ErrorCode.valueOf(codeMap.get(code));
    }
}
