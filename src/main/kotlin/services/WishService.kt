package org.hse.services

import models.Wish
import models.Wishes
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Service

@Service
class WishService {
    fun findAll(): List<Wish> = transaction {
        Wishes.selectAll().map { toWish(it) }
    }

    fun addWish(wish: Wish): Wish = transaction {
        val insertedId = Wishes.insert {
            it[name] = wish.name
            it[imageUrl] = wish.imageUrl
            it[cost] = wish.cost
        } get Wishes.id  // Retrieve the generated id

        // Return the inserted wish with the generated ID (optional, depends on your needs)
        Wish(name = wish.name, imageUrl = wish.imageUrl, cost = wish.cost)
    }

//    fun addWishes(wishes: List<Wish>): List<Wish> = transaction {
//        wishes.map { wish ->
//            Wishes.insert {
//                it[name] = wish.name
//                it[imageUrl] = wish.imageUrl
//                it[cost] = wish.cost
//            }
//            wish // Return each inserted wish
//        }
//    }

    private fun toWish(row: ResultRow) = Wish(
        name = row[Wishes.name],
        imageUrl = row[Wishes.imageUrl],
        cost = row[Wishes.cost],
    )
}