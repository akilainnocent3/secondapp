package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f46982c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46983d;

    public h(int i10, String str, long j10) {
        this.f46980a = i10;
        this.f46981b = str;
        this.f46983d = j10;
    }

    public final m a(long j10) {
        m mVar = new m(this.f46981b, j10, -1L, -9223372036854775807L, null);
        m mVar2 = (m) this.f46982c.floor(mVar);
        if (mVar2 != null && mVar2.f46975b + mVar2.f46976c > j10) {
            return mVar2;
        }
        m mVar3 = (m) this.f46982c.ceiling(mVar);
        return mVar3 == null ? new m(this.f46981b, j10, -1L, -9223372036854775807L, null) : new m(this.f46981b, j10, mVar3.f46975b - j10, -9223372036854775807L, null);
    }
}
