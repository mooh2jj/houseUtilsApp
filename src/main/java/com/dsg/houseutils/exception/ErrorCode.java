package com.dsg.houseutils.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    INVALID_REQUEST("잘못된 요청입니다."),
    INTERNAL_ERROR("알 수 없는 에러가 발생했습니다"),
    USER_NOT_FOUND("존재하지 않는 계정"),
    VALIDATION_FAIL("값이 유효하지 않음"),
    BAD_REQUEST("잘못된 접근"),
    EVENT_CREATE_OVERLAPPED_PERIOD("이벤트 기간 중복"),
    ENTITY_NOT_FOUND("해당 엔티티를 찾을 수 없습니다.");

    private final String message;

/*    public String getMessage() {
        return this.message;
    }*/
}
