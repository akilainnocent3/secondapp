package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class w0b implements w420 {
    public final Function0<iwo> a;

    public w0b(Function0 function0) {
        this.a = function0;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        long j3 = this.a.invoke().a;
        int iB = x0b.b(owoVar.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), asrVar == asr.a);
        return (((long) x0b.b(owoVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iB) << 32);
    }
}
