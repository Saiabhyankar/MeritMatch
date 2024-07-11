package com.example.meritmatch

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class getRequest:ViewModel(){
    private val _backendResponse=mutableStateOf(apiGetResponse1())
    val backendResponse:State<apiGetResponse1> = _backendResponse
    init{
        getUserDetails()
    }
    private fun getUserDetails(){
        viewModelScope.launch {
            try{
                val response= client.getExistingUser()
                _backendResponse.value=_backendResponse.value.copy(
                    name = response.username,
                    passwd = response.password
                )
            }catch (e:Exception){
                Log.d("o", e.message.toString())
            }
        }

    }
    data class apiGetResponse1(
            var name:String="",
            var passwd:String=""
            )
}