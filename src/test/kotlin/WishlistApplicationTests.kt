package org.hse.wishlist

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = ["spring.profiles.active=test"])
class WishlistApplicationTests {
    @Test
    fun contextLoads() {
        println("LALALAL")
    }
}
