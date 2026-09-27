package com.bytedance.sdk.openadsdk.core.vhb.tq.hww;

import android.content.Context;
import com.bytedance.adsdk.tq.hu;
import com.bytedance.adsdk.ugeno.vy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends hu {
    private vy hww;

    public tq(Context context) {
        super(context);
    }

    public void hww(vy vyVar) {
        this.hww = vyVar;
    }

    @Override // com.bytedance.adsdk.tq.hu, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.vgm();
        }
    }

    @Override // com.bytedance.adsdk.tq.hu, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.hww;
        if (vyVar != null) {
            vyVar.ok();
        }
    }
}
