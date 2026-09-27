package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod extends vy {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f34005hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f34006hv;
    private hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private View f34008tq;

        public hww(View view) {
            this.f34008tq = view;
        }

        public void hww(int i10) {
            if (!"top".equals(nod.this.f34010tq.hww())) {
                ViewGroup.LayoutParams layoutParams = this.f34008tq.getLayoutParams();
                layoutParams.height = i10;
                this.f34008tq.setLayoutParams(layoutParams);
                this.f34008tq.requestLayout();
                return;
            }
            if (nod.this.f34009sd instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) nod.this.f34009sd).getChildCount(); i11++) {
                    ((ViewGroup) nod.this.f34009sd).getChildAt(i11).setTranslationY(i10 - nod.this.f34006hv);
                }
            }
            nod nodVar = nod.this;
            nodVar.f34009sd.setTranslationY(nodVar.f34006hv - i10);
        }
    }

    public nod(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        super(view, hwwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.hww.vy
    public List<ObjectAnimator> hww() {
        int i10;
        String str;
        View view = this.f34009sd;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv)) {
            this.f34009sd = (View) this.f34009sd.getParent();
        }
        this.f34009sd.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f34009sd, "alpha", 0.0f, 1.0f).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        this.vy = new hww(this.f34009sd);
        final int i11 = this.f34009sd.getLayoutParams().height;
        this.f34006hv = i11;
        this.f34005hu = this.f34009sd.getLayoutParams().width;
        if ("left".equals(this.f34010tq.hww()) || "right".equals(this.f34010tq.hww())) {
            i10 = (int) this.f34005hu;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.vy, str, 0, i10).setDuration((int) (this.f34010tq.nod() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(hww(duration));
        arrayList.add(hww(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hww.nod.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                nod.this.vy.hww(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}
