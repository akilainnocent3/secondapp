package com.bytedance.sdk.component.adexpress.dynamic.sd;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ed implements vgm {
    private com.bytedance.sdk.component.adexpress.hu.weu hww;

    public ed(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hv hvVar, com.bytedance.sdk.component.adexpress.dynamic.vy.vgm vgmVar) {
        this.hww = new com.bytedance.sdk.component.adexpress.hu.weu(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hvVar.getDynamicHeight(), hvVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.hww.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sd.vgm
    public void hww() {
        this.hww.hww();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sd.vgm
    public void tq() {
        this.hww.tq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sd.vgm
    /* JADX INFO: renamed from: vy, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.hu.weu sd() {
        return this.hww;
    }
}
