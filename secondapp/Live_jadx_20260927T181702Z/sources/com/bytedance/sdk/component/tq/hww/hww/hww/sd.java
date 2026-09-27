package com.bytedance.sdk.component.tq.hww.hww.hww;

import com.bytedance.sdk.component.tq.hww.khx;
import com.bytedance.sdk.component.tq.hww.ny;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements com.bytedance.sdk.component.tq.hww.ok.hww {
    List<com.bytedance.sdk.component.tq.hww.ok> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    int f35032sd = 0;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    ny f35033tq;

    public sd(List<com.bytedance.sdk.component.tq.hww.ok> list, ny nyVar) {
        this.hww = list;
        this.f35033tq = nyVar;
    }

    @Override // com.bytedance.sdk.component.tq.hww.ok.hww
    public ny hww() {
        return this.f35033tq;
    }

    @Override // com.bytedance.sdk.component.tq.hww.ok.hww
    public khx hww(ny nyVar) throws IOException {
        this.f35033tq = nyVar;
        int i10 = this.f35032sd + 1;
        this.f35032sd = i10;
        if (i10 >= this.hww.size()) {
            return null;
        }
        return this.hww.get(this.f35032sd).hww(this);
    }
}
