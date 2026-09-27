package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends com.fyber.inneractive.sdk.player.exoplayer2.x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f46903g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46908f;

    public x(long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f46904b = j10;
        this.f46905c = j11;
        this.f46906d = j12;
        this.f46907e = j13;
        this.f46908f = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int b() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.w a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.w wVar, long j10) {
        if (i10 < 0 || i10 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = this.f46907e;
        boolean z10 = this.f46908f;
        if (z10) {
            j11 += j10;
            if (j11 > this.f46905c) {
                j11 = -9223372036854775807L;
            }
        }
        long j12 = this.f46905c;
        long j13 = this.f46906d;
        wVar.f47240a = null;
        wVar.f47241b = z10;
        wVar.f47244e = j11;
        wVar.f47245f = j12;
        wVar.f47242c = 0;
        wVar.f47243d = 0;
        wVar.f47246g = j13;
        return wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.v a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.v vVar, boolean z10) {
        if (i10 >= 0 && i10 < 1) {
            Object obj = z10 ? f46903g : null;
            long j10 = this.f46904b;
            long j11 = -this.f46906d;
            vVar.f47166a = obj;
            vVar.f47167b = obj;
            vVar.f47168c = 0;
            vVar.f47169d = j10;
            vVar.f47170e = j11;
            return vVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a(Object obj) {
        return f46903g.equals(obj) ? 0 : -1;
    }
}
