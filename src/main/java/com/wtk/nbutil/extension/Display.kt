package com.cvte.dss.extension

import android.content.res.Resources
import kotlin.math.roundToInt

/**
 * author: WentaoKing
 * created on: 1/20/21
 * description: 显示相关的扩展方法
 */

/**
 * dp(Float) to px (Float)
 */
fun Float.dp2px(): Float {
    val density = Resources.getSystem().displayMetrics.density
    return this * density
}

/**
 * dp(Int) to px(Float)
 */
fun Int.dp2px(): Float {
    return this.toFloat().dp2px()
}

/**
 * dp(Float) to px (Int)
 */
fun Float.dp2pxInt(): Int {
    val density = Resources.getSystem().displayMetrics.density
    return (this * density).roundToInt()
}

/**
 * dp(Int) to px (Int)
 */
fun Int.dp2pxInt(): Int {
    return this.toFloat().dp2pxInt()
}

/**
 * px(Float) to dp(Float)
 */
fun Float.px2dp(): Float {
    val density = Resources.getSystem().displayMetrics.density
    return this / density
}

/**
 * px(Int) to dp(Float)
 */
fun Int.px2dp(): Float {
    return this.toFloat().px2dp()
}

/**
 * px(Float) to dp(Float)
 */
fun Float.px2dpInt(): Int {
    val density = Resources.getSystem().displayMetrics.density
    return (this / density).roundToInt()
}

/**
 * px(Int) to dp(Int)
 */
fun Int.px2dpInt(): Int {
    return this.toFloat().px2dpInt()
}

