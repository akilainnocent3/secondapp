package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f46933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f46934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t[] f46936d;

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.f46933a = zVar;
        this.f46934b = hVar;
        this.f46935c = fVar;
        this.f46936d = tVarArr;
    }

    public final boolean a(j jVar, int i10) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f46934b.f46931b[i10], jVar.f46934b.f46931b[i10]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f46936d[i10], jVar.f46936d[i10]);
    }
}
