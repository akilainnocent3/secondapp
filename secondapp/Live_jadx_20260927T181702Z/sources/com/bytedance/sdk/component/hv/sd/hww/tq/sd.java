package com.bytedance.sdk.component.hv.sd.hww.tq;

import com.bytedance.sdk.component.hv.jpb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements jpb {
    private int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.hv.sd.hww.sd<String, byte[]> f34714sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34715tq;

    public sd(int i10, int i11) {
        this.f34715tq = i10;
        this.hww = i11;
        this.f34714sd = new com.bytedance.sdk.component.hv.sd.hww.sd<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.hv.sd.hww.tq.sd.1
            @Override // com.bytedance.sdk.component.hv.sd.hww.sd
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public int tq(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean tq(String str) {
        return this.f34714sd.hww(str) != null;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f34714sd.hww(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public byte[] hww(String str) {
        return this.f34714sd.hww(str);
    }
}
