package com.example.listycity

import com.google.firebase.firestore.DocumentId

data class City(
    @DocumentId
    val id: String = "", // automatically managed by firestore
    val name: String = "",
    val province: String = ""
)