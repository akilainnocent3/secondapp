package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f46991a = new TreeSet(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46992b;

    public final void a(l lVar, long j10) {
        while (this.f46992b + j10 > 10485760) {
            try {
                g gVar = (g) this.f46991a.first();
                synchronized (lVar) {
                    try {
                        lVar.a(gVar, true);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (a unused) {
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        long j10 = gVar.f46979f;
        long j11 = gVar2.f46979f;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!gVar.f46974a.equals(gVar2.f46974a)) {
            return gVar.f46974a.compareTo(gVar2.f46974a);
        }
        long j12 = gVar.f46975b - gVar2.f46975b;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }
}
