package com.bytedance.sdk.component.adexpress.hu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.blh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private AnimatorSet f34361hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private bs f34362hv;
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ImageView f34363sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34364tq;
    private TextView vy;

    public sd(@NonNull Context context) {
        super(context);
        this.f34361hu = new AnimatorSet();
        this.hww = context;
        hv();
        hu();
    }

    private void hu() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34363sd, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f34363sd, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f34361hu.setDuration(800L);
        this.f34361hu.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void hv() {
        FrameLayout frameLayout = new FrameLayout(this.hww);
        this.f34362hv = new bs(this.hww);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 95.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f34362hv, layoutParams);
        this.f34364tq = new ImageView(this.hww);
        int iHww = blh.hww(this.hww, 60.0f);
        this.f34364tq.setImageDrawable(com.bytedance.sdk.component.adexpress.vy.ok.hww(1, null, null, new int[]{iHww, iHww}, Integer.valueOf(blh.hww(this.hww, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 75.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f34364tq, layoutParams2);
        this.f34363sd = new ImageView(this.hww);
        int iHww2 = blh.hww(this.hww, 50.0f);
        this.f34363sd.setImageDrawable(com.bytedance.sdk.component.adexpress.vy.ok.hww(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iHww2, iHww2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 63.0f), (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(this.hww, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f34363sd, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.hww);
        this.vy = textView;
        textView.setTextColor(-1);
        this.vy.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.vy, layoutParams4);
    }

    public void hww() {
        this.f34361hu.start();
    }

    public void sd() {
        this.f34362hv.hww();
    }

    public void setGuideText(String str) {
        this.vy.setText(str);
    }

    public void tq() {
        this.f34361hu.cancel();
    }

    public void vy() {
        this.f34362hv.tq();
        this.f34362hv.sd();
    }
}
