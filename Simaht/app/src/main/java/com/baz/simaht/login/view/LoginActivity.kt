package com.baz.simaht.login.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.baz.simaht.R
import com.baz.simaht.base.BaseActivity
import com.baz.simaht.model.LogInInteractor
import com.baz.simaht.login.presenter.LoginPresenterImpl
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), LoginView {

    private val presenter = LoginPresenterImpl(this, LogInInteractor())

    override fun setLayout(): Int {
        return  R.layout.activity_login
    }

    //onCreate
    override fun init(savedInstanceState: Bundle?) {
        button.setOnClickListener { validateCredentials() }
    }

    private fun validateCredentials() {
        presenter.validateCredentials(username.text.toString(), password.text.toString())
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progress.visibility = View.GONE
    }

    override fun setUsernameError() {
        username.error = getString(R.string.username_error)
    }

    override fun setPasswordError() {
        password.error = getString(R.string.password_error)
    }

    override fun navigateToHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }

}
