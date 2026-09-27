package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.vy.vgm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends ImageView implements IAnimation {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private vgm f34022hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f34023hv;
    sd hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f34024sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34025tq;
    private float vy;

    public tq(Context context) {
        super(context);
        this.hww = new sd();
    }

    public vgm getBrickNativeValue() {
        return this.f34022hu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f34025tq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f34024sd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f34023hv;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        vgm vgmVar;
        super.onDraw(canvas);
        this.hww.hww(canvas, this, this);
        if (getRippleValue() == 0.0f || (vgmVar = this.f34022hu) == null || vgmVar.tq() <= 0) {
            return;
        }
        ((ViewGroup) getParent()).setClipChildren(false);
        ((ViewGroup) getParent().getParent()).setClipChildren(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.hww.hww(this, i10, i11);
    }

    public void setBrickNativeValue(vgm vgmVar) {
        this.f34022hu = vgmVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.vy = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.f34025tq = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f34024sd = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.f34023hv = f10;
        this.hww.hww(this, f10);
    }
}
