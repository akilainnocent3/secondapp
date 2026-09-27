package com.inmobi.media;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2 f54830a;

    public I6(String b64feature) {
        kotlin.jvm.internal.m0.p(b64feature, "b64feature");
        D2 d10 = new D2();
        this.f54830a = d10;
        d10.a(b64feature);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f54830a.f54475a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}
