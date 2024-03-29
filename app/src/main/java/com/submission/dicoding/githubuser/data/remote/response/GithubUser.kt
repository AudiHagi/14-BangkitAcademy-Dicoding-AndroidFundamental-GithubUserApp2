package com.submission.dicoding.githubuser.data.remote.response

import com.google.gson.annotations.SerializedName

data class GithubUser(
    @field:SerializedName("following_url")
    val following: String,

    @field:SerializedName("login")
    val login: String,

    @field:SerializedName("followers_url")
    val followers: String,

    @field:SerializedName("avatar_url")
    val avatarUrl: String,

    @field:SerializedName("type")
    val type: String,

    @field:SerializedName("name")
    val nama: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("followers")
    val followersCount: Int,

    @field:SerializedName("following")
    val followingCount: Int,

    @field:SerializedName("html_url")
    val githubPage: String,

    @field:SerializedName("public_repos")
    val repository: String
)