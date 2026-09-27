package com.yandex.div.core.state;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PagerState implements DivViewState.BlockState {
    private final int currentPageIndex;

    public PagerState(int i10) {
        this.currentPageIndex = i10;
    }

    public static /* synthetic */ PagerState copy$default(PagerState pagerState, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = pagerState.currentPageIndex;
        }
        return pagerState.copy(i10);
    }

    public final int component1() {
        return this.currentPageIndex;
    }

    @l
    public final PagerState copy(int i10) {
        return new PagerState(i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagerState) && this.currentPageIndex == ((PagerState) obj).currentPageIndex;
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public int hashCode() {
        return this.currentPageIndex;
    }

    @l
    public String toString() {
        return "PagerState(currentPageIndex=" + this.currentPageIndex + ')';
    }
}
