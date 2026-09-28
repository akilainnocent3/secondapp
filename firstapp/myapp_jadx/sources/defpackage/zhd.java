package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zhd implements qx80 {
    public final long a;

    public zhd(long j) {
        this.a = j;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        j90 j90VarA = m90.a();
        long j2 = this.a;
        float fC1 = mmdVar.C1(k7f.c(j2));
        float fC2 = mmdVar.C1(k7f.b(j2));
        j90VarA.a(0.0f, 0.0f);
        j90VarA.c(fC1 / 2.0f, 0.0f);
        j90VarA.c(0.0f, fC2);
        j90VarA.c((-fC1) / 2.0f, 0.0f);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
