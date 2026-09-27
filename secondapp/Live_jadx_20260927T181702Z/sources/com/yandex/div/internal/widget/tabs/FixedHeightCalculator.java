package com.yandex.div.internal.widget.tabs;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import k.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class FixedHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {

    @q
    private final int mTabHeight;

    public FixedHeightCalculator(@q int i10) {
        this.mTabHeight = i10;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i10, int i11) {
        return this.mTabHeight;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        return false;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void restoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void saveInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i10, float f10) {
    }
}
