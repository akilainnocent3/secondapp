package com.bytedance.sdk.component.hv.vy.sd.hww.tq;

import com.bytedance.sdk.component.hv.jpb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements jpb {
    private long hww = 1048576;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34799sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34800tq;
    private com.bytedance.sdk.component.hv.vy.sd.hww.sd<String, byte[]> vy;

    public tq(int i10, int i11) {
        this.f34799sd = i10;
        this.f34800tq = i11;
        this.vy = new com.bytedance.sdk.component.hv.vy.sd.hww.sd<>(i11);
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean tq(String str) {
        try {
            return this.vy.hww(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.hww) {
                    return false;
                }
                this.vy.hww(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public byte[] hww(String str) {
        try {
            return this.vy.hww(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
