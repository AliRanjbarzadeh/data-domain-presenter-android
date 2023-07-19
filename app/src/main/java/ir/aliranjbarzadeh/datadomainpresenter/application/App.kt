package ir.aliranjbarzadeh.datadomainpresenter.application

import androidx.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk
import ir.aliranjbarzadeh.domain.Configs
import ir.aliranjbarzadeh.domain.extensions.loadFromSp
import ir.aliranjbarzadeh.domain.extensions.setLanguage

class App : MultiDexApplication() {
	override fun onCreate() {
		super.onCreate()
		initStetho()
		initHawk()
		initLanguage()
	}

	private fun initStetho() {
		Stetho.initializeWithDefaults(this)
	}

	private fun initHawk() {
		Hawk.init(this).build()
	}

	private fun initLanguage() {
		loadFromSp(Configs.sessions.language, Configs.defaults.language).also {
			setLanguage(it)
		}
	}
}