package com.example.pestcontrolapp

import java.io.Serializable

data class UsersData (
    val name: String,
    val emailAdd: String,
    val gender: String,
    val houseNo: Int,
    val phoneNo: Int,
    val pestsCon: String
):Serializable
