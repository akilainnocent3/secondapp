package com.bytedance.sdk.component.hv.vy.sd.hww.tq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.hv.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements bs {
    private final bs hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bytedance.sdk.component.hv.vy.sd.hww.hww f34798tq;

    public sd(bs bsVar) {
        this(bsVar, null);
    }

    public sd(bs bsVar, com.bytedance.sdk.component.hv.vy.sd.hww.hww hwwVar) {
        this.hww = bsVar;
        this.f34798tq = hwwVar;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean tq(String str) {
        return this.hww.tq(str);
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, Bitmap bitmap) {
        return this.hww.hww(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public Bitmap hww(String str) {
        return this.hww.hww(str);
    }
}
