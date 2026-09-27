package com.bytedance.sdk.component.adexpress.hu;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class weu extends FrameLayout {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34383hv;
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private kub f34384sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34385tq;
    private AnimatorSet vy;

    public weu(@NonNull Context context) {
        super(context);
        this.f34383hv = true;
        this.hww = context;
        this.vy = new AnimatorSet();
        sd();
        vy();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.weu.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) weu.this.f34385tq.getLayoutParams();
                layoutParams.topMargin = (int) ((weu.this.f34384sd.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(weu.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((weu.this.f34384sd.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(weu.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-weu.this.f34384sd.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.vy.vgm.hww(weu.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-weu.this.f34384sd.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.vy.vgm.hww(weu.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                weu.this.f34385tq.setLayoutParams(layoutParams);
            }
        });
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34385tq, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hu.weu.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (weu.this.f34383hv) {
                    weu.this.f34384sd.hww();
                }
                weu weuVar = weu.this;
                weuVar.f34383hv = !weuVar.f34383hv;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(weu.this.f34385tq, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                weu.this.f34385tq.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f34385tq, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.vy.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void sd() {
        this.f34384sd = new kub(this.hww);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 40.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.f34384sd, layoutParams);
        this.f34385tq = new ImageView(this.hww);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 62.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 62.0f));
        layoutParams2.gravity = 16;
        this.f34385tq.setImageResource(com.bytedance.sdk.component.utils.kub.vy(this.hww, "tt_splash_hand"));
        addView(this.f34385tq, layoutParams2);
    }

    public void tq() {
        AnimatorSet animatorSet = this.vy;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        kub kubVar = this.f34384sd;
        if (kubVar != null) {
            kubVar.tq();
        }
        ImageView imageView = this.f34385tq;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void hww() {
        this.vy.start();
    }
}
