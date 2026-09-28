package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ncl implements w420 {
    public final ht a;
    public final ply b;
    public long c = 0;

    public ncl(ht htVar, ply plyVar) {
        this.a = htVar;
        this.b = plyVar;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return iwo.d(iwo.d(owoVar.c(), jwo.a(jA)), this.a.a(j2, 0L, asrVar));
    }
}
