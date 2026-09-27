package com.bytedance.sdk.component.adexpress.hu;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class jpb extends View {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long f34312hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Paint f34313hv;
    private float hww;
    private int nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f34314ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private Animator.AnimatorListener f34315rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ValueAnimator f34316sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34317tq;
    private float vgm;
    private ValueAnimator vy;

    public jpb(Context context, int i10) {
        super(context);
        this.f34312hu = 300L;
        this.vgm = 0.0f;
        this.nod = i10;
        hww();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.hww, this.f34317tq, this.vgm, this.f34313hv);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.hww = i10 / 2.0f;
        this.f34317tq = i11 / 2.0f;
        this.f34314ok = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void sd() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f34314ok, 0.0f);
        this.vy = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f34312hu);
        this.vy.setInterpolator(new LinearInterpolator());
        this.vy.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hu.jpb.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jpb.this.vgm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpb.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f34315rs;
        if (animatorListener != null) {
            this.vy.addListener(animatorListener);
        }
        this.vy.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f34315rs = animatorListener;
    }

    public void tq() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f34314ok);
        this.f34316sd = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f34312hu);
        this.f34316sd.setInterpolator(new LinearInterpolator());
        this.f34316sd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hu.jpb.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jpb.this.vgm = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpb.this.invalidate();
            }
        });
        this.f34316sd.start();
    }

    public void hww() {
        Paint paint = new Paint(1);
        this.f34313hv = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f34313hv.setColor(this.nod);
    }
}
