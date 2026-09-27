package com.inmobi.media;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3709h5 extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f56569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3709h5(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
        this.f56569a = 1.0f;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size != 0 && size2 != 0) {
            float f10 = this.f56569a;
            if (f10 > 0.0f) {
                int i12 = (int) (size / f10);
                if (i12 <= size2) {
                    setMeasuredDimension(size, i12);
                    return;
                } else {
                    setMeasuredDimension((int) (size2 * f10), size2);
                    return;
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void setAspectRatio(float f10) {
        if (this.f56569a <= 0.0f) {
            return;
        }
        this.f56569a = f10;
        requestLayout();
    }
}
