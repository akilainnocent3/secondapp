package com.bytedance.sdk.component.adexpress.hu;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class wgt extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private TextView f34386hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34387hv;
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private kub f34388sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34389tq;
    private AnimatorSet vy;

    public wgt(@NonNull Context context) {
        super(context);
        this.f34387hv = true;
        this.hww = context;
        this.vy = new AnimatorSet();
        sd();
        vy();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.wgt.1
            @Override // java.lang.Runnable
            public void run() {
                int iHww = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.hww, 50.0f);
                int iHww2 = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.hww, 50.0f);
                if (wgt.this.f34388sd.getMeasuredHeight() > 0) {
                    iHww = wgt.this.f34388sd.getMeasuredHeight();
                }
                if (wgt.this.f34388sd.getMeasuredWidth() > 0) {
                    iHww2 = wgt.this.f34388sd.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wgt.this.f34389tq.getLayoutParams();
                layoutParams.topMargin = ((int) ((iHww / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.hww, 40.0f));
                layoutParams.leftMargin = ((int) ((iHww2 / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.hww, 20.0f));
                layoutParams.bottomMargin = (int) (((-iHww) / 2.0f) + com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iHww2) / 2.0f) + com.bytedance.sdk.component.adexpress.vy.vgm.hww(wgt.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                wgt.this.f34389tq.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f34386hu.setVisibility(0);
        this.f34386hu.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f34386hu.setTextColor(i10);
    }

    private void sd() {
        this.f34388sd = new kub(this.hww);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 50.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 40.0f);
        int iHww = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 20.0f);
        layoutParams.leftMargin = iHww;
        layoutParams.setMarginStart(iHww);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f34388sd, layoutParams);
        this.f34389tq = new ImageView(this.hww);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 78.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 78.0f));
        this.f34389tq.setImageResource(com.bytedance.sdk.component.utils.kub.vy(this.hww, "tt_splash_hand"));
        addView(this.f34389tq, layoutParams2);
        TextView textView = new TextView(this.hww);
        this.f34386hu = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 10.0f);
        addView(this.f34386hu, layoutParams3);
        this.f34386hu.setVisibility(8);
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34389tq, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hu.wgt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (wgt.this.f34387hv) {
                    wgt.this.f34388sd.hww();
                }
                wgt wgtVar = wgt.this;
                wgtVar.f34387hv = !wgtVar.f34387hv;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(wgt.this.f34389tq, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                wgt.this.f34389tq.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f34389tq, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.vy.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void tq() {
        AnimatorSet animatorSet = this.vy;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        kub kubVar = this.f34388sd;
        if (kubVar != null) {
            kubVar.tq();
        }
        ImageView imageView = this.f34389tq;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void hww() {
        this.vy.start();
    }
}
