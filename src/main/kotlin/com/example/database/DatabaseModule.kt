package com.example.database

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Table

fun module() {
    initDB()
}

fun initDB(){
    val config = HikariConfig("/hikari.properties")
    val ds = HikariDataSource(config)
    Database.connect(ds)

}

object Users: Table() {
    val id = uuid("id").entityId()
    val firstname = text("firstname")
    val lastname = text("lastname")
    val age = integer("age")
}