package com.example.frontServer.repository

import com.example.frontServer.dto.timeline.TimelineSearchPolicy
import com.example.frontServer.entity.Timeline

interface TimelineQueryDslRepository {
    fun findAllByPolicy(policy: TimelineSearchPolicy): List<Timeline>
}