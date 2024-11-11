package models

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp

const val MAX_VARCHAR_LENGTH = 255

data class Wish(val name: String, val imageUrl: String, val cost: Int?)

object Wishes : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", MAX_VARCHAR_LENGTH)
    val imageUrl = text("image_url")
    val cost = integer("cost").nullable()
    val createdAt = timestamp("created_at")
    val updatedAt = timestamp("updated_at")

    override val primaryKey = PrimaryKey(id)
}