package com.bytedance.sdk.openadsdk.core.vhb.tq.sd;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.vy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends View {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f36942ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f36943hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f36944hv;
    private Paint hww;
    private float khx;
    private String nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private ValueAnimator f36945ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f36946ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f36947rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private RectF f36948sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Paint f36949tq;
    private float vgm;
    private vy vhb;
    private int vy;

    public hww(Context context) {
        super(context);
        this.vy = com.bytedance.adsdk.ugeno.vgm.hww.hww("#FFD813");
        this.f36944hv = com.bytedance.adsdk.ugeno.vgm.hww.hww("rgba(0, 0, 0, 0.5)");
        this.f36943hu = 3.0f;
        this.vgm = 0.0f;
        this.f36946ok = 0;
        this.f36947rs = 100;
        this.nod = "line";
        this.f36942ed = 1000;
        setBackgroundColor(0);
        hww();
    }

    private void tq(Canvas canvas) {
        Paint paint = this.hww;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f10 = this.f36943hu;
        float f11 = this.vgm;
        canvas.drawRoundRect(0.0f, 0.0f, width, f10, f11, f11, this.hww);
        float width2 = (getWidth() * this.khx) / this.f36947rs;
        this.f36949tq.setStyle(style);
        if (!TextUtils.equals(this.nod, "line_reverse")) {
            float f12 = this.f36943hu;
            float f13 = this.vgm;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f12, f13, f13, this.f36949tq);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f14 = this.f36943hu;
            float f15 = this.vgm;
            canvas.drawRoundRect(width3, 0.0f, width4, f14, f15, f15, this.f36949tq);
        }
    }

    public int getMaxProgress() {
        return this.f36947rs;
    }

    public int getProgress() {
        return this.f36946ok;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f36945ny;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.nod, "ring") || TextUtils.equals(this.nod, "ring_reverse")) {
            hww(canvas);
        } else {
            tq(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        vy vyVar = this.vhb;
        if (vyVar != null) {
            int[] iArrHww = vyVar.hww(i10, i11);
            super.onMeasure(iArrHww[0], iArrHww[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        if (TextUtils.equals(this.nod, "ring") || TextUtils.equals(this.nod, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.f36943hu);
        }
        vy vyVar2 = this.vhb;
        if (vyVar2 != null) {
            vyVar2.hv();
        }
    }

    public void setAnimationDuration(int i10) {
        this.f36942ed = i10;
        this.f36945ny.setDuration(i10);
    }

    public void setMaxProgress(int i10) {
        this.f36947rs = i10;
        invalidate();
    }

    public void setProgress(int i10) {
        int iMin = Math.min(i10, this.f36947rs);
        this.f36946ok = iMin;
        if (iMin < 0) {
            this.f36946ok = 0;
        }
        ValueAnimator valueAnimator = this.f36945ny;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36945ny.setFloatValues(this.khx, this.f36946ok);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.khx + " progress=" + i10);
            this.f36945ny.start();
        }
    }

    private void hww() {
        Paint paint = new Paint(1);
        this.hww = paint;
        paint.setColor(this.f36944hv);
        Paint paint2 = this.hww;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f36949tq = paint3;
        paint3.setColor(this.vy);
        this.f36949tq.setStyle(style);
        this.f36948sd = new RectF();
        this.khx = this.f36946ok;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.f36945ny = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f36942ed);
        this.f36945ny.setInterpolator(new LinearInterpolator());
        this.f36945ny.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.vhb.tq.sd.hww.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                hww.this.khx = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hww.this.invalidate();
            }
        });
    }

    public hww tq(int i10) {
        this.hww.setColor(i10);
        return this;
    }

    public hww tq(float f10) {
        this.vgm = f10;
        return this;
    }

    private void hww(Canvas canvas) {
        float f10;
        int i10;
        float f11 = this.f36943hu / 2.0f;
        this.f36948sd.set(f11, f11, getWidth() - f11, getHeight() - f11);
        Paint paint = this.hww;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.hww.setStrokeWidth(this.f36943hu);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.hww);
        if (TextUtils.equals(this.nod, "ring_reverse")) {
            f10 = this.khx * (-360.0f);
            i10 = this.f36947rs;
        } else {
            f10 = this.khx * 360.0f;
            i10 = this.f36947rs;
        }
        float f12 = f10 / i10;
        this.f36949tq.setStyle(style);
        this.f36949tq.setStrokeWidth(this.f36943hu);
        if (this.vgm <= 0.0f) {
            this.f36949tq.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.f36949tq.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.f36948sd, -90.0f, f12, false, this.f36949tq);
    }

    public hww hww(int i10) {
        this.f36949tq.setColor(i10);
        return this;
    }

    public hww hww(float f10) {
        this.f36943hu = f10;
        invalidate();
        return this;
    }

    public hww hww(String str) {
        this.nod = str;
        return this;
    }

    public void hww(vy vyVar) {
        this.vhb = vyVar;
    }
}
