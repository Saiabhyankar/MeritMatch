package com.example.meritmatch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RetrieveValue(){
    val backendData:getRequest= viewModel()
    val name by backendData.backendResponse
    getDetails(userAuth = UserAuth(name.name,name.passwd))

}
fun getDetails(userAuth: UserAuth){
    userNameFromBackend.value=userAuth.username
    passWordFromBackend.value=userAuth.password
}