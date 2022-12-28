package com.yongchul.unit_testing.domain.repository

import com.yongchul.unit_testing.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


/**
 * <pre>
 * com.yongchul.unit_testing.domain.repository
 *   UserRepository
 * </pre>
 * @date : 2022/12/28 11:37 오전
 * @author : kim yong chul
 * @describe
 **/
@Repository
interface UserRepository: JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.id = ?1")
    fun findUser(id: Long): User?
}