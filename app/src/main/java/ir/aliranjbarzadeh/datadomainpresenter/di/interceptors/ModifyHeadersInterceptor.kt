package ir.aliranjbarzadeh.datadomainpresenter.di.interceptors

import android.os.Build
import ir.aliranjbarzadeh.domain.Configs
import ir.aliranjbarzadeh.domain.extensions.LogExt
import ir.aliranjbarzadeh.domain.extensions.loadFromSp
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ModifyHeadersInterceptor @Inject constructor() : Interceptor {
	override fun intercept(chain: Interceptor.Chain): Response {
		val request = chain.request()
		val builder = request.newBuilder()

		try {
			val authorization = loadFromSp(Configs.sessions.token, Configs.defaults.token)
			val pushToken = loadFromSp(Configs.sessions.pushToken, "")
			val language = loadFromSp(Configs.sessions.language, Configs.defaults.language)

			builder.header("User-Agent", Configs.userAgent)
			builder.header("AppVersion", Configs.appVersion)
			builder.header("Language", language)
			builder.header("DeviceVersion", Build.VERSION.RELEASE)
			builder.header("DeviceModel", Build.MODEL)
			builder.header("DeviceManufacture", Build.MANUFACTURER)
			builder.header("PushToken", pushToken)
			builder.header(Configs.authorization, "${Configs.tokenPrefix}$authorization")
		} catch (ex: Exception) {
			LogExt.error(ex.stackTraceToString())
		}

		return chain.proceed(builder.build())
	}
}