package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w[] f46846a;

    public h(w[] wVarArr) {
        this.f46846a = wVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean zB;
        boolean z10 = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z10;
            }
            zB = false;
            for (w wVar : this.f46846a) {
                if (wVar.f() == jF) {
                    zB |= wVar.b(j10);
                }
            }
            z10 |= zB;
        } while (zB);
        return z10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long jMin = Long.MAX_VALUE;
        for (w wVar : this.f46846a) {
            long jF = wVar.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
