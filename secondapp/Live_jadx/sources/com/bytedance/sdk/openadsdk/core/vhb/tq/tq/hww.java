package com.bytedance.sdk.openadsdk.core.vhb.tq.tq;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends com.bytedance.adsdk.ugeno.rs.tq.hww {
    private final com.bytedance.adsdk.ugeno.rs.tq.hww hww;

    public hww(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.rs.tq.hww hwwVar = new com.bytedance.adsdk.ugeno.rs.tq.hww(context);
        this.hww = hwwVar;
        addView(hwwVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.rs.tq.hww getPlayableView() {
        return this.hww;
    }
}
