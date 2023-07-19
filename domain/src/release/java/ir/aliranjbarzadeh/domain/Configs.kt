package ir.aliranjbarzadeh.domain

object Configs {
    const val baseUrl = "API_URL"
    const val authorization = "Authorization"
    const val tokenPrefix = "Bearer "
    const val appName = "Data Domain Presenter"
    const val database = "DB_NAME_RELEASE"
    const val environment = "development"
    const val userAgent = "USER_AGENT_RELEASE"
    const val appVersion = "1"
    const val isDebug = false

    object defaults {
        const val token = "DEFAULT_TOKEN"
        const val language = "fa"
        const val theme = "light"
    }

    object sessions {
        const val user = "user"
        const val login = "user.login"
        const val token = "user.token"
        const val pushToken = "user.pushtoken"
        const val language = "user.language"
        const val theme = "user.theme"
    }
}