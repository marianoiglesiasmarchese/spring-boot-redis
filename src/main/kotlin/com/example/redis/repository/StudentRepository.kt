package com.example.redis.repository

import com.example.redis.model.Student

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, String>
