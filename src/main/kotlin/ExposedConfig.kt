package org.hse

import javax.annotation.PostConstruct
import org.springframework.context.annotation.Configuration
import org.jetbrains.exposed.sql.Database
import javax.sql.DataSource


@Configuration
class ExposedConfig(private val dataSource: DataSource) {
    @PostConstruct
    fun init() {
        Database.connect(dataSource)
    }
}