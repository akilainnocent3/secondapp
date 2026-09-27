package com.inmobi.media;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Kn implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f55012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3543aj f55013b;

    public Kn(Jn visibilityConfig, C3543aj simpleViewHolder) {
        kotlin.jvm.internal.m0.p(visibilityConfig, "visibilityConfig");
        kotlin.jvm.internal.m0.p(simpleViewHolder, "simpleViewHolder");
        this.f55012a = visibilityConfig;
        this.f55013b = simpleViewHolder;
    }

    @Override // com.inmobi.media.Nn
    public final Mn a() {
        C3709h5 c3709h5 = this.f55013b.f55994a;
        Rect rect = new Rect();
        if (!c3709h5.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Jn jn2 = this.f55012a;
        return (Un.a(c3709h5, rect, jn2.f54951a, jn2.f54952b) && Un.a(c3709h5, rect, this.f55012a.f54951a, this.f55013b.f55995b)) ? Mn.VISIBLE : Mn.HIDDEN;
    }
}
