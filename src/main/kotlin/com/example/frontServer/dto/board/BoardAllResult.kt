package com.example.frontServer.dto.board

import java.time.LocalDateTime

data class BoardAllResult(
    val id: Long,

    val writerName: String,

    val textContent: String,

    val fileApiUrl: String?,

    val createdAt: LocalDateTime,

    val lastModifiedAt: LocalDateTime,

    val readingCount: Long,

    val commentCount:Long,

    val likeCount: Int
) {
    companion object{
        fun of(
            boardWithCommentCount: BoardWithCommentCount,
            writerName: String,
            likeCount: Int,
        ): BoardAllResult {
            val board = boardWithCommentCount.board
            return BoardAllResult(
                id = board.id!!,
                writerName = writerName,
                textContent = board.textContent,
                fileApiUrl = board.fileApiUrl,
                createdAt = board.createdAt!!,
                lastModifiedAt = board.lastModifiedAt!!,
                readingCount = board.readingCount,
                commentCount = boardWithCommentCount.commentCount,
                likeCount = likeCount
            )
        }
    }
}