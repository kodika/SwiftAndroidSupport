package org.pureswift.swiftandroidsupport.widget

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class SwipeRefreshLayoutOnRefreshListener(private val __swiftObject: Long): androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {

    override fun onRefresh() {
        __onRefresh(__swiftObject)
    }

    fun finalize() {
        __finalize(__swiftObject)
    }

    private external fun __finalize(__swiftObject: Long)

    private external fun __onRefresh(__swiftObject: Long)
}