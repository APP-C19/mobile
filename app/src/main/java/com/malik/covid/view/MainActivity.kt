package com.malik.covid.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.malik.covid.R
import com.malik.covid.extensions.replaceFragmentSafely
import com.malik.covid.view.splash.SplashFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.main_activity)
        launchSplashFragment()
    }

    private fun launchSplashFragment() {
        replaceFragmentSafely(fragment = SplashFragment())
    }
}
