package com.bytedance.sdk.component.adexpress.hu;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class bs extends View {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34283hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private ValueAnimator f34284hv;
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private RectF f34285sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Paint f34286tq;
    private boolean vgm;
    private float vy;

    public bs(Context context) {
        super(context);
        this.f34283hu = 1500;
        this.hww = context;
        Paint paint = new Paint();
        this.f34286tq = paint;
        paint.setAntiAlias(true);
        this.f34286tq.setStyle(Paint.Style.STROKE);
        this.f34286tq.setStrokeWidth(10.0f);
        this.f34286tq.setColor(Color.parseColor("#80FFFFFF"));
        this.f34285sd = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.vgm) {
            return;
        }
        canvas.drawArc(this.f34285sd, 270.0f, this.vy, false, this.f34286tq);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f34285sd.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void sd() {
        this.vgm = true;
        invalidate();
    }

    public void setDuration(int i10) {
        this.f34283hu = i10;
    }

    public void tq() {
        ValueAnimator valueAnimator = this.f34284hv;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void hww() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f34284hv = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f34283hu);
        this.f34284hv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hu.bs.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bs.this.vy = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bs.this.requestLayout();
            }
        });
        this.f34284hv.start();
    }
}
