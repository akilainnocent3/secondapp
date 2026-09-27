package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f46827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f46829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f46834h;

    public a(int i10, int i11, long j10, long j11, o oVar, h hVar, k kVar, Object obj) {
        hVar.getClass();
        this.f46834h = hVar;
        this.f46827a = kVar;
        this.f46828b = i10;
        this.f46829c = oVar;
        this.f46830d = i11;
        this.f46831e = obj;
        this.f46832f = j10;
        this.f46833g = j11;
    }

    public abstract long c();
}
