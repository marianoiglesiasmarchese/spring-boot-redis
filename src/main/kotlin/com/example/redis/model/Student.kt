package com.example.redis.model

import org.springframework.data.redis.core.RedisHash
import java.io.Serializable

@RedisHash("Student")
data class Student(
    val id: String,
    var name: String,
    var gender: Gender,
    val grade: Long,
//    val set: Set<>, // TODO keep improving the example
//    val list: List<>,
//    val hash: Object
) : Serializable

enum class Gender {
    MALE,
    FEMALE
}

