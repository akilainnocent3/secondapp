package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.syb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vy implements syb {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public View f34009sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.vy.hww f34010tq;
    private Set<ScheduledFuture<?>> vy = new HashSet();
    public List<ObjectAnimator> hww = hww();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww implements Runnable {
        ObjectAnimator hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        ScheduledFuture<?> f34014tq;

        public hww(ObjectAnimator objectAnimator) {
            this.hww = objectAnimator;
        }

        public void hww(ScheduledFuture<?> scheduledFuture) {
            this.f34014tq = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd() != null) {
                com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd().sd().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy.hww.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hww.this.hww.resume();
                    }
                });
                if (this.f34014tq != null) {
                    vy.this.vy.remove(this.f34014tq);
                }
            }
        }
    }

    public vy(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        this.f34009sd = view;
        this.f34010tq = hwwVar;
    }

    public abstract List<ObjectAnimator> hww();

    public void sd() {
        List<ObjectAnimator> list = this.hww;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f34010tq.bs() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        hww hwwVar = vy.this.new hww(objectAnimator);
                        ScheduledFuture<?> scheduledFutureHww = com.bytedance.sdk.component.adexpress.vy.vy.hww(hwwVar, (long) (vy.this.f34010tq.bs() * 1000.0d), TimeUnit.MILLISECONDS);
                        hwwVar.hww(scheduledFutureHww);
                        vy.this.vy.add(scheduledFutureHww);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.syb
    public void tq() {
        List<ObjectAnimator> list = this.hww;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.vy.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public ObjectAnimator hww(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f34010tq.khx() * 1000.0d));
        if (this.f34010tq.weu() > 0) {
            objectAnimator.setRepeatCount(this.f34010tq.weu() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f34010tq.wgt())) {
            if (p.f130188p.equals(this.f34010tq.wgt()) || "alternate-reverse".equals(this.f34010tq.wgt())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f34010tq.ed())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f34010tq.wgt())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f34010tq.wgt())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    vy.this.f34009sd.setVisibility(0);
                    if (vy.this.f34009sd.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hu) {
                        ((View) vy.this.f34009sd.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
