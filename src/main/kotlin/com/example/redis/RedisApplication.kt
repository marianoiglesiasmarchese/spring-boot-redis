package com.example.redis

import com.example.redis.model.Gender
import com.example.redis.model.Student
import com.example.redis.repository.StudentRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class RedisApplication

fun main(args: Array<String>) {
	runApplication<RedisApplication>(*args)
}

