package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class khx extends com.bytedance.sdk.openadsdk.core.hu.vy {
    private Paint hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private RectF f37095tq;

    public khx(Context context) {
        super(context);
        hww();
    }

    private void hww() {
        Paint paint = new Paint();
        this.hww = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.hww.setColor(Color.parseColor("#99333333"));
        this.hww.setAntiAlias(true);
        this.hww.setStrokeWidth(0.0f);
        this.f37095tq = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f37095tq;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.hww);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hu.vy, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f37095tq.right == getMeasuredWidth() && this.f37095tq.bottom == getMeasuredHeight()) {
            return;
        }
        this.f37095tq.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
