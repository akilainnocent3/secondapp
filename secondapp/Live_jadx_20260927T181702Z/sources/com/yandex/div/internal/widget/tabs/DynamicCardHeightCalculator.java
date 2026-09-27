package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@j0
public class DynamicCardHeightCalculator extends BaseCardHeightCalculator {
    public DynamicCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    public int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i10, float f10) {
        if (f10 < 0.01f) {
            return tabMeasurement.getTabHeight(i10);
        }
        int tabHeight = tabMeasurement.getTabHeight(i10);
        return Math.round(tabHeight + ((tabMeasurement.getTabHeight(i10 + 1) - tabHeight) * f10));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator, com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i10, int i11) {
        dropMeasureCache();
        return super.measureHeight(i10, i11);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i10, float f10) {
        return true;
    }
}
