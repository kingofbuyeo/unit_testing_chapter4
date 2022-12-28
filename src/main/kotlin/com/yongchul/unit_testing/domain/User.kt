package com.yongchul.unit_testing.domain

import javax.persistence.*


/**
 * <pre>
 * com.yongchul.unit_testing.domain
 *   User
 * </pre>
 * @date : 2022/12/28 11:32 오전
 * @author : kim yong chul
 * @describe
 **/
@Entity
@Table(name = "users")
class User(
    var name: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L
}