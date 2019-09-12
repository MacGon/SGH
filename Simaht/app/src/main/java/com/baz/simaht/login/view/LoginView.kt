package com.baz.simaht.login.view

interface LoginView {

    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateToHome()
}

