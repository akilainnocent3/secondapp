package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PagerController {

    @l
    private final ScrollableViewPager scrollableViewPager;

    public PagerController(@l ScrollableViewPager scrollableViewPager) {
        this.scrollableViewPager = scrollableViewPager;
    }

    public final int getCurrentItemIndex() {
        return this.scrollableViewPager.getCurrentItem();
    }

    public final void smoothScrollTo(int i10) {
        this.scrollableViewPager.setCurrentItem(i10, true);
    }
}
