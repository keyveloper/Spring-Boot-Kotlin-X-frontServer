package com.example.frontServer.service

import com.example.frontServer.dto.user.UserSummaryDto
import com.example.frontServer.entity.Follow
import com.example.frontServer.exception.InvalidIdException
import com.example.frontServer.repository.FollowRepository
import com.example.frontServer.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class FollowService(
    private val followRepository: FollowRepository,
    private val userRepository: UserRepository
) {
    @Transactional
    fun save(followingName: String, followerId: Long) {
        val userId = userRepository.findIdByUsername(followingName)
        if (userId != null) {
            followRepository.save(
                Follow(
                    followingId = userId,
                    followerId = followerId
                )
            )
        } else {
            throw InvalidIdException("can't find the user")
        }
    }

    @Transactional
    fun findFollowers(
        username: String
    ): List<UserSummaryDto>? {
        return followRepository.findFollowersByUsername(username)
            .map { UserSummaryDto.of(it) }

        // exception? unknown username?
    }

    @Transactional
    fun findFollowings(
        username: String,
    ): List<UserSummaryDto> {
        return followRepository.findFollowingsByUserId(username)
            .map { UserSummaryDto.of(it) }
    }
}