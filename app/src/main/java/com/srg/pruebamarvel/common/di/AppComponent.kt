package com.srg.pruebamarvel.common.di

import com.srg.pruebamarvel.common.MarvelApplication
import com.srg.pruebamarvel.common.di.annotations.AppScope
import com.srg.pruebamarvel.common.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by sebrodgar on 26/02/2021.
 */
@AppScope
@Component(
    modules = [
        AppModule::class,
        DataProvidersModule::class,
        DataSourceModule::class,
        RemoteModule::class,
        AndroidSupportInjectionModule::class,
        PresentationModule::class,
        RepositoriesModule::class
    ]
)
interface AppComponent : AndroidInjector<MarvelApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MarvelApplication): Builder

        fun build(): AppComponent
    }
}
