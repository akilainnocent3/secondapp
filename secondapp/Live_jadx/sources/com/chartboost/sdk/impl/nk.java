package com.chartboost.sdk.impl;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nk {
    public static final void a(SurfaceView surfaceView, int i10, int i11, int i12, int i13) {
        if (surfaceView != null) {
            float f10 = i12;
            float f11 = i10;
            float f12 = f10 / f11;
            float f13 = i13;
            float f14 = i11;
            float f15 = f13 / f14;
            float f16 = f11 / f14;
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = null;
            FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams3 != null) {
                if (f12 > f15) {
                    layoutParams3.width = (int) (f13 * f16);
                    layoutParams3.height = i13;
                } else {
                    layoutParams3.width = i12;
                    layoutParams3.height = (int) (f10 / f16);
                }
                layoutParams3.gravity = 17;
                layoutParams2 = layoutParams3;
            }
            surfaceView.setLayoutParams(layoutParams2);
        }
    }
}
