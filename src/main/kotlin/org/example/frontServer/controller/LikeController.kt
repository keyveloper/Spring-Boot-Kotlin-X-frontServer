package com.example.frontServer.controller

import com.example.frontServer.dto.ResponseToClientDto
import com.example.frontServer.enum.ResponseCode
import com.example.frontServer.security.AuthUserDetails
import com.example.frontServer.service.LikeService
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LikeController(
    private val likeService: LikeService
) {

    @PostMapping("/like")
    fun save(
        @RequestParam boardId: Long,
        @AuthenticationPrincipal user: AuthUserDetails
    ): ResponseEntity<ResponseToClientDto> {
        val isSaved: Boolean = likeService.save(boardId, user.getUserId()) // not null
        if (isSaved) {
            return ResponseEntity.ok().body(
                ResponseToClientDto(
                    errorCode = ResponseCode.SUCCESS,
                    data = null
                )
            )
        } else {
            return ResponseEntity.ok().body(
                ResponseToClientDto(
                    errorCode = ResponseCode.SAVE_FAILURE,
                    data = null
                )
            )
        }
    }

    @GetMapping("/like/users")
    fun findUsersByBoardId(
        @RequestParam boardId: Long
    ): ResponseEntity<ResponseToClientDto> {
        return ResponseEntity.ok().body(
            ResponseToClientDto(
                errorCode = ResponseCode.SUCCESS,
                data = likeService.findUserLikeThisBoard(boardId)
            )
        )
    }
}