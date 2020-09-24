package dev.daco.sqp

import android.app.Activity
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context

/**
 * Created by 5ym on 2020/09/23.
 * Kiosk関係のユーティリティ
 */

class KioskUtils(private val context: Context) {
    private val deviceAdmin = ComponentName(context, AdminReceiver::class.java)
    private val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

    // 自分自身に対してユーザ確認無しのPinningを許可する
    fun setLockTaskPackage() =
        dpm.setLockTaskPackages(deviceAdmin, arrayOf(context.packageName))

    fun start(activity: Activity) {
        activity.startLockTask()
    }

    fun stop(activity: Activity) {
        activity.stopLockTask()
    }
}