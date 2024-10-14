package com.example.frontServer.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@Table(name = "notifications")
@EntityListeners(AuditingEntityListener::class)
class Notification(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "publisher_img")
    var publisherImg: String? = null,

    var receiver: Long,

    var message: String,

    @CreatedDate
    var createAt: LocalDateTime? = null,

    var isSent: Boolean = false
)