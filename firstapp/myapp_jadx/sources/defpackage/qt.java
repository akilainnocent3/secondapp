package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qt implements w420 {
    public final ht a;
    public final long b;

    public qt(ht htVar, long j) {
        this.a = htVar;
        this.b = j;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        long jA = this.a.a(0L, (((long) owoVar.d()) << 32) | (((long) owoVar.b()) & 4294967295L), asrVar);
        long jA2 = this.a.a(0L, j2, asrVar);
        long j3 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j4 = this.b;
        return iwo.d(iwo.d(iwo.d(owoVar.c(), jA), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (asrVar == asr.a ? 1 : -1))) << 32));
    }
}
