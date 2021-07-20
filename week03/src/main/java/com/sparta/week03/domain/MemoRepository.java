package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    // Timestamped의 ModifiedAt 을 가져온다.
    // find All By Order By ModifiedAt at Desc
}