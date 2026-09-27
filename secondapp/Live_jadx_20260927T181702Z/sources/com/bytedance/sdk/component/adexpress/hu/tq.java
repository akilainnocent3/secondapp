package com.bytedance.sdk.component.adexpress.hu;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import w0.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private View f34365hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private View f34366hv;
    private AnimatorSet hww;
    private Context nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34367ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f34368rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f34369sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ObjectAnimator f34370tq;
    private ImageView vgm;
    private View vy;

    public tq(Context context, int i10, int i11) {
        super(context);
        this.f34369sd = false;
        this.hww = new AnimatorSet();
        this.f34367ok = i10;
        this.f34368rs = i11;
        this.nod = context;
        sd();
        vy();
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.vy, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.vy, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f34366hv, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f34366hv, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f34365hu, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f34365hu, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.vgm, f.f141740i, 0.0f, -20.0f, 0.0f);
        this.f34370tq = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.hww.setDuration(1500L);
        this.hww.setInterpolator(new AccelerateDecelerateInterpolator());
        this.hww.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.hww.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.hu.tq.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                tq.this.f34369sd = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (tq.this.f34369sd) {
                    return;
                }
                tq.this.f34370tq.start();
                tq.this.hww.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void sd() {
        View view = new View(this.nod);
        this.vy = view;
        view.setBackground(hww("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.f34367ok) * 0.45d), (int) (((double) this.f34368rs) * 0.45d));
        layoutParams.gravity = 17;
        this.vy.setLayoutParams(layoutParams);
        addView(this.vy);
        View view2 = new View(this.nod);
        this.f34366hv = view2;
        view2.setBackground(hww("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.f34367ok) * 0.25d), (int) (((double) this.f34368rs) * 0.25d));
        layoutParams2.gravity = 17;
        this.f34366hv.setLayoutParams(layoutParams2);
        addView(this.f34366hv);
        View view3 = new View(this.nod);
        this.f34365hu = view3;
        view3.setBackground(hww("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.f34367ok;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i10) * 0.25d), (int) (((double) i10) * 0.25d));
        layoutParams3.gravity = 17;
        this.f34365hu.setLayoutParams(layoutParams3);
        addView(this.f34365hu);
        ImageView imageView = new ImageView(this.nod);
        this.vgm = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.kub.vy(getContext(), "tt_blue_hand"));
        this.vgm.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.f34367ok) * 0.62d), (int) (((double) this.f34368rs) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.vgm.setLayoutParams(layoutParams4);
        addView(this.vgm);
    }

    public void tq() {
        this.f34369sd = true;
        ObjectAnimator objectAnimator = this.f34370tq;
        if (objectAnimator == null || this.hww == null) {
            return;
        }
        objectAnimator.cancel();
        this.hww.cancel();
    }

    private GradientDrawable hww(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void hww() {
        this.f34369sd = false;
        ObjectAnimator objectAnimator = this.f34370tq;
        if (objectAnimator == null || this.hww == null) {
            return;
        }
        objectAnimator.start();
        this.hww.start();
    }
}
