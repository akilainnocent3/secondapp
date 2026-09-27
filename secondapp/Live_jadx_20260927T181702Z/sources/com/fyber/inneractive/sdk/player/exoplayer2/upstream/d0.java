package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f47010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f47011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f47012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f47013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f47014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f47015f;

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.f47011b = hVar;
        this.f47010a = new k(uri, 0L, 0L, -1L, null, 1);
        this.f47012c = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f47014e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f47014e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        j jVar = new j(this.f47011b, this.f47010a);
        try {
            jVar.f47026a.a(jVar.f47027b);
            jVar.f47029d = true;
            this.f47013d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.f47012c).a(this.f47011b.a(), jVar);
        } finally {
            this.f47015f = jVar.f47031f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }
}
