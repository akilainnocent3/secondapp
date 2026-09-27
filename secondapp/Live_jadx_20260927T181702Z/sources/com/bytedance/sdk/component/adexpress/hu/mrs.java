package com.bytedance.sdk.component.adexpress.hu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mrs extends LinearLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private TextView f34330hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private TextView f34331hv;
    private TextView hww;
    private int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private JSONObject f34332ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private LinearLayout f34333ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f34334rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ImageView f34335sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private TextView f34336tq;
    private hww vgm;
    private int vhb;
    private com.bytedance.sdk.component.utils.grv vy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.hu.mrs$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (mrs.this.f34335sd != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new tq(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.hu.mrs.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        mrs.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.mrs.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                mrs.this.f34335sd.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                mrs.this.f34335sd.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq implements Interpolator {
        private tq() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 <= 0.25f) {
                return (f10 * (-2.0f)) + 0.5f;
            }
            if (f10 <= 0.5f) {
                return (f10 * 4.0f) - 1.0f;
            }
            return f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ tq(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public mrs(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.f34334rs = i10;
        this.nod = i11;
        this.vhb = i12;
        this.f34332ny = jSONObject;
        hww(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.f34333ok;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.vy == null) {
                this.vy = new com.bytedance.sdk.component.utils.grv(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.hu.mrs.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnShakeViewListener(hww hwwVar) {
        this.vgm = hwwVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f34331hv.setText(str);
        } else {
            this.f34331hv.setVisibility(8);
            this.f34330hu.setVisibility(8);
        }
    }

    public void hww(Context context, View view) {
        addView(view);
        this.f34333ok = (LinearLayout) findViewById(2097610727);
        this.f34335sd = (ImageView) findViewById(2097610725);
        this.hww = (TextView) findViewById(2097610724);
        this.f34336tq = (TextView) findViewById(2097610726);
        this.f34331hv = (TextView) findViewById(2097610723);
        this.f34330hu = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f34333ok.setBackground(gradientDrawable);
    }

    public void hww() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }
}
