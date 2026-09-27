package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends vy {
    public hv(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    private void sd(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), this.f34010tq.omn())).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hww.hv.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                hv.this.f34009sd.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(hww(duration));
    }

    private void tq(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), this.f34010tq.omn())).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hww.hv.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                hv.this.f34009sd.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(hww(duration));
    }

    private void vy(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), this.f34010tq.omn())).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(hww(duration));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    public List<ObjectAnimator> hww() {
        ArrayList arrayList = new ArrayList();
        String strHnv = this.f34010tq.hnv();
        switch (strHnv.hashCode()) {
            case 3029889:
                if (strHnv.equals("both")) {
                    hww(arrayList);
                    return arrayList;
                }
                break;
            case 3387192:
                strHnv.equals("none");
                break;
            case 483313230:
                if (strHnv.equals("forwards")) {
                    vy(arrayList);
                    return arrayList;
                }
                break;
            case 1356771568:
                if (strHnv.equals("backwards")) {
                    tq(arrayList);
                    return arrayList;
                }
                break;
        }
        sd(arrayList);
        return arrayList;
    }

    private void hww(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.vy.vgm.hww(com.bytedance.sdk.component.adexpress.vy.hww(), this.f34010tq.omn())).setDuration(((int) (this.f34010tq.nod() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar = this.f34010tq;
        hwwVar.hu(hwwVar.weu() * 2);
        list.add(hww(duration));
    }
}
