package io.github.msh91.arch.domain.model.movie

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
        @PrimaryKey val id: String,
        val name: String,
        val avatar: String
)