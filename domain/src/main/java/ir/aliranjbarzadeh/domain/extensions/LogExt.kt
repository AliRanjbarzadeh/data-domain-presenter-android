package ir.aliranjbarzadeh.domain.extensions

import android.util.Log
import ir.aliranjbarzadeh.domain.Configs

class LogExt {

	companion object {
		fun error(msg: Any?, tag: String = "") {
			if (Configs.isDebug) {
				Log.e(tag, msg.toString())
			}
		}

		fun debug(msg: Any?, tag: String = "") {
			if (Configs.isDebug) {
				Log.d(tag, msg.toString())
			}
		}

		fun info(msg: Any?, tag: String = "") {
			if (Configs.isDebug) {
				Log.i(tag, msg.toString())
			}
		}
	}
}