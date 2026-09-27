package com.bytedance.sdk.component.adexpress.hu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class kv extends RelativeLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private AnimatorSet f34324hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private TextView f34325hv;
    private ImageView hww;
    private String nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private AnimatorSet f34326ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private AnimatorSet f34327rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ImageView f34328sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34329tq;
    private AnimatorSet vgm;
    private int vhb;
    private TextView vy;

    public kv(Context context) {
        super(context);
        this.f34324hu = new AnimatorSet();
        this.vgm = new AnimatorSet();
        this.f34326ok = new AnimatorSet();
        this.f34327rs = new AnimatorSet();
        this.vhb = 100;
        hww(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f34324hu;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tq();
    }

    public void sd() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.hww, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.hww, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.hww, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), -this.vhb));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), this.vhb));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.hu.kv.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (kv.this.f34328sd != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) kv.this.f34328sd.getLayoutParams();
                    layoutParams.height = num.intValue();
                    kv.this.f34328sd.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f34328sd, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f34328sd, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f34329tq, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f34329tq, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f34329tq, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f34329tq, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f34329tq, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), -this.vhb));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.vgm.setDuration(50L);
        this.f34327rs.setDuration(1500L);
        this.f34326ok.setDuration(50L);
        this.vgm.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.f34326ok.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.f34327rs.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.f34324hu.playSequentially(this.f34326ok, this.f34327rs, this.vgm);
    }

    public void setGuideText(String str) {
        TextView textView = this.vy;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.f34325hv != null) {
            if (TextUtils.isEmpty(str)) {
                this.f34325hv.setText("");
            } else {
                this.f34325hv.setText(str);
            }
        }
    }

    public void hww(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.vy.hww();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.nod)) {
            addView(com.bytedance.sdk.component.adexpress.sd.hww.hu(context));
            this.vhb = (int) (((double) this.vhb) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.sd.hww.hv(context));
        }
        this.hww = (ImageView) findViewById(2097610734);
        this.f34329tq = (ImageView) findViewById(2097610735);
        this.vy = (TextView) findViewById(2097610730);
        this.f34328sd = (ImageView) findViewById(2097610733);
        this.f34325hv = (TextView) findViewById(2097610731);
    }

    public void tq() {
        try {
            AnimatorSet animatorSet = this.f34324hu;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f34326ok;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.vgm;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.f34327rs;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public kv(Context context, String str) {
        super(context);
        this.f34324hu = new AnimatorSet();
        this.vgm = new AnimatorSet();
        this.f34326ok = new AnimatorSet();
        this.f34327rs = new AnimatorSet();
        this.vhb = 100;
        setClipChildren(false);
        this.nod = str;
        hww(context);
    }

    public void hww() {
        sd();
        this.f34324hu.start();
        this.f34324hu.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.hu.kv.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                kv.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hu.kv.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        kv.this.f34324hu.start();
                    }
                }, 200L);
            }
        });
    }
}
