package com.mkc.school.data.pojomodel.api.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommonApiResponse (
        @field:JsonProperty("request_status")
        @field:SerializedName("request_status")
        val request_status: Int? = null,

        @field:JsonProperty("msg")
        @field:SerializedName("msg")
        val msg: String? = null
        )