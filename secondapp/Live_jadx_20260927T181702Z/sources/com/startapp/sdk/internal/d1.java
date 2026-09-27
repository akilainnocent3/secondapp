package com.startapp.sdk.internal;

import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends ShapeDrawable {
    public d1(RoundRectShape roundRectShape) {
        super(roundRectShape);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void onDraw(Shape shape, Canvas canvas, Paint paint) {
        paint.setColor(-11363070);
        paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
        super.onDraw(shape, canvas, paint);
    }
}
