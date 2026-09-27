package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f46978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46979f;

    public g(String str, long j10, long j11, long j12, File file) {
        this.f46974a = str;
        this.f46975b = j10;
        this.f46976c = j11;
        this.f46977d = file != null;
        this.f46978e = file;
        this.f46979f = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.f46974a.equals(gVar.f46974a)) {
            return this.f46974a.compareTo(gVar.f46974a);
        }
        long j10 = this.f46975b - gVar.f46975b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }
}
