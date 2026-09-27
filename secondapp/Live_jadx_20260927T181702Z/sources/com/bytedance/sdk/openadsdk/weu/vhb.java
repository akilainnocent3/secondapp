package com.bytedance.sdk.openadsdk.weu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb extends View {
    private final Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f38061sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f38062tq;

    public vhb(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.hww = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f38061sd;
        if (f10 > 0.0f) {
            float f11 = this.f38062tq;
            canvas.drawLine(0.0f, f11, f10, f11, this.hww);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.f38062tq = (1.0f * f10) / 2.0f;
        this.hww.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.f38061sd = getWidth() * f10;
        invalidate();
    }
}
