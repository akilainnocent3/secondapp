package com.bytedance.adsdk.tq.hu;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hww extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> hww = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f31959tq = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f31958sd = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f31959tq.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f31958sd.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.hww.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void hv() {
        Iterator<Animator.AnimatorPauseListener> it = this.f31958sd.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void hww(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f31959tq) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f31959tq.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.hww.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f31959tq.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f31958sd.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.hww.remove(animatorUpdateListener);
    }

    public void sd() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.hww.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void tq(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f31959tq) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void vy() {
        Iterator<Animator.AnimatorPauseListener> it = this.f31958sd.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void hww() {
        Iterator<Animator.AnimatorListener> it = this.f31959tq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    public void tq() {
        Iterator<Animator.AnimatorListener> it = this.f31959tq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }
}
