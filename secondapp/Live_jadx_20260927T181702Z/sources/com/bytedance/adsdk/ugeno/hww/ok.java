package com.bytedance.adsdk.ugeno.hww;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok implements vgm {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f32540hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f32541hv;
    private View hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f32542sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f32543tq;
    private float vy;

    public ok(View view) {
        this.hww = view;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getRipple() {
        return this.f32542sd;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getRubIn() {
        return this.f32540hu;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getShine() {
        return this.vy;
    }

    @Override // com.bytedance.adsdk.ugeno.hww.vgm
    public float getStretch() {
        return this.f32541hv;
    }

    public void hv(float f10) {
        this.f32540hu = f10;
        this.hww.postInvalidate();
    }

    public void hww(float f10) {
        View view = this.hww;
        if (view == null) {
            return;
        }
        this.f32543tq = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public void sd(float f10) {
        View view = this.hww;
        if (view == null) {
            return;
        }
        this.vy = f10;
        view.postInvalidate();
    }

    public void tq(float f10) {
        View view = this.hww;
        if (view == null) {
            return;
        }
        this.f32542sd = f10;
        view.postInvalidate();
    }

    public void vy(float f10) {
        this.f32541hv = f10;
        this.hww.postInvalidate();
    }

    public float hww() {
        return this.f32543tq;
    }

    public void hww(int i10) {
        View view = this.hww;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
