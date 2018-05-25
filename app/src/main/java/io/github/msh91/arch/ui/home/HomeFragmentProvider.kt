package io.github.msh91.arch.ui.home

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.msh91.arch.ui.home.list.HomeListFragment

@Module
abstract class HomeFragmentProvider {

    @ContributesAndroidInjector
    abstract fun provideHomeListFragment(): HomeListFragment
}