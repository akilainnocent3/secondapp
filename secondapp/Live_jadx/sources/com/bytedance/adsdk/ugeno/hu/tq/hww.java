package com.bytedance.adsdk.ugeno.hu.tq;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements com.bytedance.adsdk.ugeno.ok.sd.hv {
    @Override // com.bytedance.adsdk.ugeno.ok.sd.hv
    public void hww(View view, float f10) {
        float width = f10 < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f10 * 90.0f);
    }
}
