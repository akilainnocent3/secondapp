package com.bytedance.adsdk.tq.sd;

import com.bytedance.adsdk.tq.khx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hv {
    private static final hv hww = new hv();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final khx<String, com.bytedance.adsdk.tq.vgm> f32160tq = new khx<>(20);

    public static hv hww() {
        return hww;
    }

    public com.bytedance.adsdk.tq.vgm hww(String str) {
        if (str == null) {
            return null;
        }
        return this.f32160tq.hww(str);
    }

    public void hww(String str, com.bytedance.adsdk.tq.vgm vgmVar) {
        if (str == null) {
            return;
        }
        this.f32160tq.hww(str, vgmVar);
    }
}
