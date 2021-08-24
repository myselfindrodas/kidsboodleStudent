package com.mkc.school.data.pojomodel.api.response.exam

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName
import com.mkc.school.data.pojomodel.api.response.attendance.AttendanceListResponse

@JsonIgnoreProperties(ignoreUnknown = true)
data class GradeDetails(
    @field:JsonProperty("min_marks")
    @field:SerializedName("min_marks")
    val min_marks: Int? = null,

    @field:JsonProperty("max_marks")
    @field:SerializedName("max_marks")
    val max_marks: Int? = null,

    @field:JsonProperty("grade")
    @field:SerializedName("grade")
    val grade: String? = null,

)
