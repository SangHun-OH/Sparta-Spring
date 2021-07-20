package com.sparta.week03.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // Entity가 자동으로 컬럼으로 인식.
// Timestamped class를 상속한 것이 자동으로 생성시간, 수정시간을 컬럼으로 잡도록 도와줌
@EntityListeners(AuditingEntityListener.class) // 생성/변경 시간을 자동으로 업데이트합.
public abstract class Timestamped {

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}