package com.bytedance.sdk.component.adexpress.hu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok extends kv {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private AnimatorSet f34352hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34353hv;
    private TextView hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ImageView f34354sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ImageView f34355tq;
    private ImageView vy;

    public ok(Context context) {
        super(context);
        this.f34352hu = new AnimatorSet();
        tq(context);
    }

    private void tq(Context context) {
        addView(com.bytedance.sdk.component.adexpress.sd.hww.tq(context));
        this.f34355tq = (ImageView) findViewById(2097610751);
        this.f34354sd = (ImageView) findViewById(2097610750);
        this.vy = (ImageView) findViewById(2097610749);
        this.hww = (TextView) findViewById(2097610748);
    }

    private void vy() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    public float getAlphaColor() {
        return this.f34353hv;
    }

    @Override // com.bytedance.sdk.component.adexpress.hu.kv
    public void hww(Context context) {
    }

    public void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        ImageView imageView = this.vy;
        int iRgb = Color.rgb(i11, i11, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i12 = ((i10 + 20) % 60) + 195;
        this.f34354sd.setColorFilter(Color.rgb(i12, i12, i12), mode);
        int i13 = ((i10 + 40) % 60) + 195;
        this.f34355tq.setColorFilter(Color.rgb(i13, i13, i13), mode);
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
        this.f34352hu.cancel();
    }
}
