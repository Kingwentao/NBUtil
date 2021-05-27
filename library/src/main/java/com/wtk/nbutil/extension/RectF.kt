package com.cvte.dss.extension

import android.graphics.RectF

/**
 * author: WentaoKing
 * created on: 1/25/21
 * description: 矩形相关的扩展方法
 */

/**
 * 判断两个矩形是否存在覆盖区域
 */
fun RectF.isOverlap(rect2: RectF): Boolean {
    if (this.right > rect2.left &&
            rect2.right > this.left &&
            this.bottom > rect2.top &&
            rect2.bottom > this.top) {
        return true
    }
    return false
}