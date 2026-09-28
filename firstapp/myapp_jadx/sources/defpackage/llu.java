package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class llu implements w420 {
    public final w0b a;
    public jxo b;
    public asr c;
    public jxo d;
    public iwo e;

    public llu(w0b w0bVar) {
        this.a = w0bVar;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        iwo iwoVar = this.e;
        if (iwoVar != null) {
            jxo jxoVar = this.b;
            if ((jxoVar == null ? false : jxo.b(jxoVar.a, j)) && this.c == asrVar) {
                jxo jxoVar2 = this.d;
                if (jxoVar2 != null ? jxo.b(jxoVar2.a, j2) : false) {
                    return iwoVar.a;
                }
            }
        }
        long jA = this.a.a(owoVar, j, asrVar, j2);
        this.b = new jxo(j);
        this.c = asrVar;
        this.d = new jxo(j2);
        this.e = new iwo(jA);
        return jA;
    }
}
