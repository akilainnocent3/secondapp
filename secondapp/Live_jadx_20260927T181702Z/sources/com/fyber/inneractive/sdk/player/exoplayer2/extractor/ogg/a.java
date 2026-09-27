package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f46307a;

    public a(b bVar) {
        this.f46307a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f46307a;
        return (bVar.f46313f * 1000000) / ((long) bVar.f46311d.f46354i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (j10 == 0) {
            return this.f46307a.f46309b;
        }
        b bVar = this.f46307a;
        long j11 = (((long) bVar.f46311d.f46354i) * j10) / 1000000;
        long j12 = bVar.f46309b;
        long j13 = bVar.f46310c;
        long j14 = ((((j13 - j12) * j11) / bVar.f46313f) - 30000) + j12;
        if (j14 >= j12) {
            j12 = j14;
        }
        return j12 >= j13 ? j13 - 1 : j12;
    }
}
