package org.hse.controllers

import models.Wish
import org.hse.services.WishService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/wishes")
class WishController(private val wishService: WishService) {

    @GetMapping
    fun getAllWishes(): List<Wish> = wishService.findAll()

    @PostMapping
    fun addWish(@RequestBody wish: Wish): Wish = wishService.addWish(wish)
}