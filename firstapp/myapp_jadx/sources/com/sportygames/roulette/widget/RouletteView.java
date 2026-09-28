package com.sportygames.roulette.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class RouletteView extends FrameLayout {
    public int A;
    public ImageView a;
    public ImageView b;
    public ImageView c;
    public final float[] d;
    public final DecelerateInterpolator e;
    public final DecelerateInterpolator f;
    public final DecelerateInterpolator i;
    public int v;
    public ObjectAnimator w;
    public long y;
    public Runnable z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float interpolation;
            float interpolation2;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            RouletteView rouletteView = RouletteView.this;
            long j = jElapsedRealtime - rouletteView.y;
            int i = rouletteView.v;
            if (j > 4000) {
                interpolation = i * 0.37f;
            } else {
                interpolation = (rouletteView.e.getInterpolation((4000 - j) / 4000.0f) * i * 0.45f) + (rouletteView.v * 0.37f);
            }
            float[] fArr = rouletteView.d;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - rouletteView.y;
            if (jElapsedRealtime2 > 4000) {
                interpolation2 = fArr[rouletteView.A];
            } else {
                interpolation2 = fArr[rouletteView.A] + (rouletteView.f.getInterpolation(jElapsedRealtime2 / 4000.0f) * 1800.0f);
            }
            rouletteView.c.setTranslationX(((float) Math.sin(((double) (((((Float) valueAnimator.getAnimatedValue()).floatValue() + interpolation2) / 360.0f) * 2.0f)) * 3.141592653589793d)) * interpolation);
            rouletteView.c.setTranslationY((-interpolation) * ((float) Math.cos(((double) (((((Float) valueAnimator.getAnimatedValue()).floatValue() + interpolation2) / 360.0f) * 2.0f)) * 3.141592653589793d)));
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            RouletteView rouletteView = RouletteView.this;
            Runnable runnable = rouletteView.z;
            if (runnable != null) {
                runnable.run();
                rouletteView.z = null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public RouletteView(Context context) {
        super(context);
        this.d = new float[]{166.15385f, 110.76923f, 221.53847f, 304.6154f, 83.07693f, 249.23077f, 332.3077f, 138.46155f, 0.0f, 27.692308f, 55.384617f, 276.9231f, 193.84616f};
        this.e = new DecelerateInterpolator(3.0f);
        this.f = new DecelerateInterpolator();
        this.i = new DecelerateInterpolator();
    }

    public ImageView getRouletteBackground() {
        return this.a;
    }

    public ImageView getRouletteRing() {
        return this.b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.bg);
        this.b = (ImageView) findViewById(R.id.ring);
        this.c = (ImageView) findViewById(R.id.rouletteView_ball);
        int i = 0;
        while (true) {
            float[] fArr = this.d;
            if (i >= fArr.length) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.b, "rotation", -360.0f);
                this.w = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(5000L);
                this.w.setInterpolator(this.i);
                this.w.addUpdateListener(new a());
                this.w.addListener(new b());
                return;
            }
            fArr[i] = fArr[i] - 7.0f;
            i++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.v = getMeasuredWidth() / 2;
    }

    public RouletteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new float[]{166.15385f, 110.76923f, 221.53847f, 304.6154f, 83.07693f, 249.23077f, 332.3077f, 138.46155f, 0.0f, 27.692308f, 55.384617f, 276.9231f, 193.84616f};
        this.e = new DecelerateInterpolator(3.0f);
        this.f = new DecelerateInterpolator();
        this.i = new DecelerateInterpolator();
    }
}
