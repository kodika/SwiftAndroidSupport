package org.pureswift.swiftandroidsupport.widget

import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager

class TabLayoutViewPagerOnTabSelectedListener(private val __swiftObject: Long, viewPager: androidx.viewpager.widget.ViewPager): TabLayout.ViewPagerOnTabSelectedListener(viewPager) {

    override fun onTabReselected(tab: TabLayout.Tab?) {
        super.onTabReselected(tab)
        __onTabReselected(__swiftObject, tab)
    }

    override fun onTabSelected(tab: TabLayout.Tab?) {
        super.onTabSelected(tab)
        __onTabSelected(__swiftObject, tab)
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {
        super.onTabUnselected(tab)
        __onTabUnselected(__swiftObject, tab)
    }

    fun finalize() {
        __finalize(__swiftObject)
    }

    private external fun __finalize(__swiftObject: Long)

    private external fun __onTabReselected(__swiftObject: Long, tab: TabLayout.Tab?)
    private external fun __onTabSelected(__swiftObject: Long, tab: TabLayout.Tab?)
    private external fun __onTabUnselected(__swiftObject: Long, tab: TabLayout.Tab?)
}