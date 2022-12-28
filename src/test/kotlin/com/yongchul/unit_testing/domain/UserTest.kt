package com.yongchul.unit_testing.domain

import org.junit.jupiter.api.Assertions.assertEquals
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.test.Test

internal class UserTest(
){
    @Test
    fun 극단적사례_간단한테스트(){
        val user = User("kingofbuyeo")

        assertEquals("kingofbuyeo", user.name)
    }

    @Test
    fun 극단적사례_깨지기_쉬운_테스트(){
        val target = Paths.get("/Users/kim-yongchul/Documents/studyWorkspace/unit_testing_chapter4/src/main/kotlin/com/yongchul/unit_testing/domain/repository/UserRepository.kt")
        val source = Files.readString(target, Charsets.UTF_8)

        assertEquals(true, source.contains("@Query(\"SELECT u FROM User u WHERE u.id = ?1\")"))
    }
}