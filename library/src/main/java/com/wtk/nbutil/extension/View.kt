package com.cvte.dss.extension

import android.content.res.Resources
import android.graphics.PointF
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * author: WentaoKing
 * created on: 1/25/21
 * description: View相关的扩展方法
 */

/**
 * 获取view在窗口的位置
 */
fun View.getLocationInWindow(): PointF {
    val location = IntArray(2)
    this.getLocationOnScreen(location)
    val x = location[0].toFloat()
    val y = location[1].toFloat()
    return PointF(x, y)
}

/**
 * 刷新View树中所有的文本
 */
fun View.refreshText() {
    if (this is ViewGroup) {
        for (i in 0 until childCount) {
            val childAt = getChildAt(i)
            if (childAt is ViewGroup) {
                childAt.refreshText()
            } else {
                refreshTextView(childAt)

            }
        }
    } else {
        refreshTextView(this)
    }
}

fun refreshTextView(view: View) {
    if (view is TextView) {
        val declaredField = TextView::class.java.getDeclaredField("mTextId")
        declaredField.isAccessible = true
        val resID = declaredField.getInt(view)
        if (resID != Resources.ID_NULL) {
            view.setText(resID)
        }
    }
}

