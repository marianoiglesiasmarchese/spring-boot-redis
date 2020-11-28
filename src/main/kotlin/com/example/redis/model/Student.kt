package com.example.redis.model

import org.springframework.data.redis.core.RedisHash
import java.io.Serializable

@RedisHash("Student")
data class Student(
    val id: String,
    var name: String,
    var gender: Gender,
    val grade: Long
) : Serializable

enum class Gender {
    MALE,
    FEMALE
}

