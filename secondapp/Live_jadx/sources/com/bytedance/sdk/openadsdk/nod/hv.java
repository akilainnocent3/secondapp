package com.bytedance.sdk.openadsdk.nod;

import com.bytedance.sdk.component.hv.mrs;
import com.bytedance.sdk.component.hv.rs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements mrs {
    private static int hww;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final String f37510hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f37511sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f37512tq = 0;
    private boolean vy;

    public hv() {
        hww++;
        this.f37510hv = "image_request_" + hww;
    }

    @Override // com.bytedance.sdk.component.hv.mrs
    public void hww(String str, rs rsVar) {
        if (!this.vy) {
            rsVar.hww();
            rsVar.tq();
            rsVar.sd();
            this.vy = true;
        }
        this.f37512tq = System.currentTimeMillis();
        sd(str, rsVar);
    }

    @Override // com.bytedance.sdk.component.hv.mrs
    public void tq(String str, rs rsVar) {
        this.f37511sd += System.currentTimeMillis() - this.f37512tq;
        sd(str, rsVar);
    }

    private String sd(String str, rs rsVar) {
        return str;
    }
}
