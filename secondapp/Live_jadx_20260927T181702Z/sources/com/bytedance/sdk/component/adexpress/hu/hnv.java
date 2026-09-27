package com.bytedance.sdk.component.adexpress.hu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hnv extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private AnimatorSet f34297hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private TextView f34298hv;
    private Context hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private AnimatorSet f34299ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private AnimatorSet f34300rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ImageView f34301sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34302tq;
    private AnimatorSet vgm;
    private ImageView vy;

    public hnv(@NonNull Context context) {
        super(context);
        this.f34297hu = new AnimatorSet();
        this.vgm = new AnimatorSet();
        this.f34299ok = new AnimatorSet();
        this.f34300rs = new AnimatorSet();
        this.hww = context;
        sd();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.f34298hv.setText(str);
    }

    private void sd() {
        ImageView imageView = new ImageView(this.hww);
        this.vy = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.kub.vy(this.hww, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 30.0f);
        addView(this.vy, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.hww);
        this.f34301sd = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.kub.vy(this.hww, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 50.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 30.0f);
        addView(this.f34301sd, layoutParams2);
        ImageView imageView3 = new ImageView(this.hww);
        this.f34302tq = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.kub.vy(this.hww, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 80.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 30.0f);
        addView(this.f34302tq, layoutParams3);
        TextView textView = new TextView(this.hww);
        this.f34298hv = textView;
        textView.setTextColor(-1);
        this.f34298hv.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f34298hv, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.hnv.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) hnv.this.f34302tq.getLayoutParams();
                layoutParams5.topMargin = (int) ((hnv.this.f34301sd.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(hnv.this.getContext(), 7.0f));
                int iHww = (-hnv.this.f34301sd.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(hnv.this.hww, 30.0f));
                layoutParams5.leftMargin = iHww;
                layoutParams5.setMarginStart(iHww);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                hnv.this.f34302tq.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) hnv.this.vy.getLayoutParams();
                layoutParams6.topMargin = (int) ((hnv.this.f34301sd.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.vy.vgm.hww(hnv.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((hnv.this.f34301sd.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(hnv.this.hww, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                hnv.this.vy.setLayoutParams(layoutParams6);
            }
        });
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34302tq, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f34301sd, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f34301sd, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.vy, "alpha", 0.0f, 1.0f);
        this.f34299ok.setDuration(300L);
        this.f34299ok.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f34302tq, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hu.hnv.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hnv.this.vy.getLayoutParams();
                layoutParams.width = num.intValue();
                hnv.this.vy.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f34301sd, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f34300rs.setDuration(1500L);
        this.f34300rs.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f34302tq, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.vy, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f34301sd, "alpha", 1.0f, 0.0f);
        this.vgm.setDuration(50L);
        this.vgm.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.f34297hu.playSequentially(this.f34299ok, this.f34300rs, this.vgm);
    }

    public void hww() {
        vy();
        this.f34297hu.start();
        this.f34297hu.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.hu.hnv.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                hnv.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.hnv.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hnv.this.f34297hu.start();
                    }
                }, 200L);
            }
        });
    }

    public void tq() {
        try {
            AnimatorSet animatorSet = this.f34297hu;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f34299ok;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f34300rs;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.vgm;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }
}
