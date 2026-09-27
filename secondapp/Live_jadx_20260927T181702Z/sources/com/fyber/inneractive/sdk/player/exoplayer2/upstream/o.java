package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f47055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f47056c;

    public o(Context context, m mVar, q qVar) {
        this.f47054a = context.getApplicationContext();
        this.f47055b = mVar;
        this.f47056c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f47054a, this.f47055b, this.f47056c.a());
    }
}
