package me.rakshakhegde.dagger_android_injector.dependencies

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.rakshakhegde.dagger_android_injector.screens.main_screen.MainActivity
import me.rakshakhegde.dagger_android_injector.screens.main_screen.MainModule

/**
 * Created by rakshakhegde on 26/04/17.
 */
@Module
abstract class InjectorsModule {

	@ContributesAndroidInjector(modules = arrayOf(MainModule::class))
	abstract fun mainActivity(): MainActivity

	// Add more ContributesAndroidInjector here...
}
