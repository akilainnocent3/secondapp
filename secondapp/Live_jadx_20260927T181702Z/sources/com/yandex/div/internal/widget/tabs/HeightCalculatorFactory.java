package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface HeightCalculatorFactory {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface GetTabCountFn {
        int apply();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface MeasureTabHeightFn {
        int apply(@NonNull ViewGroup viewGroup, int i10, int i11, int i12);
    }

    ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull MeasureTabHeightFn measureTabHeightFn, @NonNull GetTabCountFn getTabCountFn);
}
