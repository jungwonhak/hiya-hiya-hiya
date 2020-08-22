package com.utsman.hiyahiyahiya.model

import com.google.gson.annotations.SerializedName

data class TypingBody(
    @SerializedName("room_id")
    var roomId: String = "",
    @SerializedName("owner_id")
    var ownerId: String = ""
)