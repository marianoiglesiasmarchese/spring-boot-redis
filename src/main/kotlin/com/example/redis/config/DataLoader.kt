package com.example.redis.config

import com.example.redis.model.Gender
import com.example.redis.model.Student
import com.example.redis.repository.StudentRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
class DataLoader {

    @Bean
    fun addDummyData(
        studentRepository: StudentRepository
    ) = CommandLineRunner {
        val id = UUID.randomUUID().toString()
        val student = Student(
            id = id,
            name = "Maria",
            gender = Gender.FEMALE,
            grade = 1
        )
        // saving
        studentRepository.save(student)

        // retrieving
        val response = studentRepository.findById(id)

        if (response.isPresent){
            val retrievedStudent = response.get()
            println(retrievedStudent)

            // updating
            retrievedStudent.name = "Mario"
            retrievedStudent.gender = Gender.MALE
            println(studentRepository.save(retrievedStudent))

        }

    }

}