package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Cj extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f54458b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f54459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
        this.f54459a = 1.0d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (((double) size2) * this.f54459a), size2);
            return;
        }
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (((double) size) / this.f54459a));
            return;
        }
        double d10 = this.f54459a;
        int i12 = (int) (((double) size) / d10);
        if (i12 <= size2) {
            setMeasuredDimension(size, i12);
        } else {
            setMeasuredDimension((int) (((double) size2) * d10), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@oy.m Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        this.f54459a = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
        requestLayout();
    }
}
