package com.mkc.school.ui.announcement

import android.app.Application
import androidx.lifecycle.MutableLiveData

import com.mkc.school.ui.base.BaseViewModel
import com.mkc.school.data.pojomodel.api.response.CommonApiResponse

class AnnouncementViewModel(application: Application)  : BaseViewModel<AnnouncementNavigator>(application) {

    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var dataResponse: MutableLiveData<CommonApiResponse> = MutableLiveData()
    var errorInResponse: MutableLiveData<Throwable> = MutableLiveData()

    init {
        isLoading.value = false
    }
}