package com.bytedance.sdk.component.adexpress.hu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm extends kv {
    private TextView hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private AnimatorSet f34371sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private View f34372tq;

    public vgm(Context context) {
        super(context);
        this.f34371sd = new AnimatorSet();
        tq(context);
    }

    private void tq(Context context) {
        View viewHww = com.bytedance.sdk.component.adexpress.sd.hww.hww(context);
        this.f34372tq = viewHww;
        addView(viewHww);
        setClipChildren(false);
        this.hww = (TextView) findViewById(2097610748);
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f34372tq, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f34372tq, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f34371sd.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f34371sd.setDuration(1000L);
        this.f34371sd.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.hu.kv
    public void hww(Context context) {
    }

    public void setButtonText(String str) {
        if (this.hww == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.hww.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.hu.kv
    public void hww() {
        vy();
    }

    @Override // com.bytedance.sdk.component.adexpress.hu.kv
    public void tq() {
        this.f34371sd.cancel();
    }
}
