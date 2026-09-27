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
public class khx extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private TextView f34318hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34319hv;
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private vy f34320sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34321tq;
    private AnimatorSet vy;

    public khx(@NonNull Context context) {
        super(context);
        this.f34319hv = true;
        this.hww = context;
        this.vy = new AnimatorSet();
        sd();
        vy();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.khx.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) khx.this.f34321tq.getLayoutParams();
                layoutParams.topMargin = ((int) ((khx.this.f34320sd.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(khx.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(khx.this.hww, 20.0f));
                layoutParams.leftMargin = ((int) ((khx.this.f34320sd.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(khx.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(khx.this.hww, 20.0f));
                layoutParams.bottomMargin = (int) (((-khx.this.f34320sd.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.vy.vgm.hww(khx.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-khx.this.f34320sd.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.vy.vgm.hww(khx.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                khx.this.f34321tq.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f34318hu.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f34318hu.setTextColor(i10);
    }

    private void sd() {
        this.f34320sd = new vy(this.hww);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 80.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 20.0f);
        int iHww = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 20.0f);
        layoutParams.leftMargin = iHww;
        layoutParams.setMarginStart(iHww);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f34320sd, layoutParams);
        this.f34320sd.hww();
        this.f34321tq = new ImageView(this.hww);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 80.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 80.0f));
        this.f34321tq.setImageResource(com.bytedance.sdk.component.utils.kub.vy(this.hww, "tt_splash_hand"));
        addView(this.f34321tq, layoutParams2);
        TextView textView = new TextView(this.hww);
        this.f34318hu = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 10.0f);
        addView(this.f34318hu, layoutParams3);
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34321tq, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hu.khx.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (khx.this.f34319hv) {
                    khx.this.f34320sd.hww();
                    khx.this.f34320sd.setAlpha(1.0f);
                } else {
                    khx.this.f34320sd.tq();
                    khx.this.f34320sd.setAlpha(0.0f);
                }
                khx khxVar = khx.this;
                khxVar.f34319hv = !khxVar.f34319hv;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(khx.this.f34321tq, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                khx.this.f34321tq.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f34321tq, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.vy.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void tq() {
        AnimatorSet animatorSet = this.vy;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        vy vyVar = this.f34320sd;
        if (vyVar != null) {
            vyVar.tq();
        }
    }

    public void hww() {
        this.vy.start();
    }
}
