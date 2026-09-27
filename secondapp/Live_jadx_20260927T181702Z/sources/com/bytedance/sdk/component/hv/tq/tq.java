package com.bytedance.sdk.component.hv.tq;

import com.bytedance.sdk.component.hv.hv;
import com.bytedance.sdk.component.hv.khx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements hv {
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f34762sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private boolean f34763tq;
    private khx vy;

    public tq(String str, boolean z10, boolean z11, khx khxVar) {
        this.hww = str;
        this.f34763tq = z10;
        this.f34762sd = z11;
        this.vy = khxVar;
    }

    @Override // com.bytedance.sdk.component.hv.hv
    public String hww() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.hv.hv
    public boolean sd() {
        return this.f34762sd;
    }

    @Override // com.bytedance.sdk.component.hv.hv
    public boolean tq() {
        return this.f34763tq;
    }
}
