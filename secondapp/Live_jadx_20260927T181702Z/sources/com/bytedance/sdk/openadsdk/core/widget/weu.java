package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class weu extends com.bytedance.sdk.openadsdk.core.hu.ok {
    private Paint hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f37142sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private RectF f37143tq;

    public weu(Context context) {
        this(context, null);
    }

    private void hww() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.hww = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.hww.setColor(Color.parseColor("#99333333"));
        this.hww.setAntiAlias(true);
        this.hww.setStrokeWidth(0.0f);
        this.f37143tq = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f37143tq;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.hww);
        canvas.translate((this.f37143tq.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hu.ok, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f37143tq.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.f37142sd = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i12 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i12, measuredHeight);
        this.f37143tq.set(0.0f, 0.0f, i12, measuredHeight);
    }

    public weu(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public weu(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37142sd = 0;
        hww();
    }
}
