package com.example.netroll.di

import com.example.netroll.MainActivity
import com.example.netroll.ui.HomeFragment
import dagger.Subcomponent

@Subcomponent(modules = [])
interface MainComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
}