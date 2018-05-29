package org.mifos.mobile.cn.ui.base

import android.view.View

/**
 * A click listener for items.
 */
interface OnItemClickListener {

    /**
     * Called when an item is clicked.
     *
     * @param childView View of the item that was clicked.
     * @param position  Position of the item that was clicked.
     */
    fun onItemClick(childView: View, position: Int)

    /**
     * Called when an item is long pressed.
     *
     * @param childView View of the item that was long pressed.
     * @param position  Position of the item that was long pressed.
     */
    fun onItemLongPress(childView: View, position: Int)

}
