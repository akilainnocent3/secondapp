package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.j {

    @l
    private final String mBlockId;

    @l
    private final DivViewState mDivViewState;

    public UpdateStateChangePageCallback(@l String str, @l DivViewState divViewState) {
        this.mBlockId = str;
        this.mDivViewState = divViewState;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageSelected(int i10) {
        if (i10 != -1) {
            this.mDivViewState.putBlockState(this.mBlockId, new PagerState(i10));
        }
    }
}
