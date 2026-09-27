package com.bytedance.adsdk.ugeno.hu.tq;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements com.bytedance.adsdk.ugeno.ok.sd.hv {
    @Override // com.bytedance.adsdk.ugeno.ok.sd.hv
    public void hww(View view, float f10) {
        int width = view.getWidth();
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f10 < 0.0f) {
            view.setTranslationX((-width) * f10);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f10);
        }
        view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f10)));
    }
}
