package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.R;
import com.yandex.div.internal.Log;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@j0
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {
    private static final String KEY_FONT_SCALE = "FONT_SCALE";
    private static final String TAG = "[Y:BaseCardHeightCalculator]";

    @NonNull
    private final ViewGroup mChannelGroup;

    @NonNull
    private final HeightCalculatorFactory.GetTabCountFn mGetTabCountFn;

    @NonNull
    private final HeightCalculatorFactory.MeasureTabHeightFn mMeasureTabHeightFn;

    @Nullable
    private Bundle mPendingState;

    @NonNull
    protected final SparseArray<TabMeasurement> mTabsHeightCache = new SparseArray<>();
    private int mPosition = 0;
    private float mPositionOffset = 0.0f;

    public BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        this.mChannelGroup = viewGroup;
        this.mMeasureTabHeightFn = measureTabHeightFn;
        this.mGetTabCountFn = getTabCountFn;
    }

    private float getFontScale() {
        return this.mChannelGroup.getContext().getResources().getConfiguration().fontScale;
    }

    private static int logAndReturnHeight(int i10, int i11, float f10) {
        Log.d(TAG, "New optimal height for tab " + i11 + " with position offset " + f10 + " is " + i10);
        return i10;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
        Log.d(TAG, "reseting layout...");
        this.mPendingState = null;
        this.mTabsHeightCache.clear();
    }

    public abstract int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i10, float f10);

    public boolean isTabsHeightsIsUnknown() {
        return this.mTabsHeightCache.size() == 0;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i10, final int i11) {
        TabMeasurement tabMeasurement = this.mTabsHeightCache.get(i10);
        if (tabMeasurement == null) {
            int iApply = this.mGetTabCountFn.apply();
            if (iApply == 0) {
                return 0;
            }
            final int size = View.MeasureSpec.getSize(i10);
            TabMeasurement tabMeasurement2 = new TabMeasurement(iApply, new TabMeasurement.TabMeasurementFunction() { // from class: com.yandex.div.internal.widget.tabs.a
                @Override // com.yandex.div.internal.widget.tabs.TabMeasurement.TabMeasurementFunction
                public final int getTabHeight(int i12) {
                    BaseCardHeightCalculator baseCardHeightCalculator = this.f76697a;
                    return baseCardHeightCalculator.mMeasureTabHeightFn.apply(baseCardHeightCalculator.mChannelGroup, size, i11, i12);
                }
            });
            Bundle bundle = this.mPendingState;
            if (bundle != null) {
                tabMeasurement2.restoreState(bundle, i10);
                tabMeasurement2.removeState(this.mPendingState, i10);
                if (this.mPendingState.isEmpty()) {
                    this.mPendingState = null;
                }
            }
            this.mTabsHeightCache.put(i10, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return logAndReturnHeight(getOptimalHeight(tabMeasurement, this.mPosition, this.mPositionOffset), this.mPosition, this.mPositionOffset);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    @k.i
    public void restoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.mTabsHeightCache.clear();
        Bundle bundle = (Bundle) sparseArray.get(R.id.tab_height_cache);
        this.mPendingState = bundle;
        Float fValueOf = bundle == null ? null : Float.valueOf(bundle.getFloat(KEY_FONT_SCALE));
        if (fValueOf == null || fValueOf.floatValue() == getFontScale()) {
            return;
        }
        this.mPendingState = null;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    @k.i
    public void saveInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        Bundle bundle = new Bundle();
        int size = this.mTabsHeightCache.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTabsHeightCache.valueAt(i10).saveState(bundle, this.mTabsHeightCache.keyAt(i10));
        }
        bundle.putFloat(KEY_FONT_SCALE, getFontScale());
        sparseArray.put(R.id.tab_height_cache, bundle);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i10, float f10) {
        Log.d(TAG, "request layout for tab " + i10 + " with position offset " + f10);
        this.mPosition = i10;
        this.mPositionOffset = f10;
    }
}
