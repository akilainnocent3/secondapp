package com.bytedance.sdk.openadsdk.jpb;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.khx;
import com.bytedance.sdk.openadsdk.core.rs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class hv implements vy {
    private vy hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f37418sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f37419tq;
    private int vy;

    public hv(vy vyVar, int i10, int i11, int i12) {
        this.hww = vyVar;
        this.f37419tq = i10;
        this.f37418sd = i11;
        this.vy = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.jpb.vy
    public com.bytedance.sdk.openadsdk.jpb.tq.hww hww() {
        com.bytedance.sdk.openadsdk.jpb.tq.hww hwwVarHww = this.hww.hww();
        hwwVarHww.hww(BuildConfig.VERSION_NAME);
        hwwVarHww.hww(this.f37419tq);
        hwwVarHww.tq(this.f37418sd);
        hwwVarHww.sd(this.vy);
        hwwVarHww.hu(rs.tq().vgm());
        hwwVarHww.vy(khx.vy());
        return hwwVarHww;
    }
}
