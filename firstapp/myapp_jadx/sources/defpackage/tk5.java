package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk5 implements uih {
    public final byte[] a;
    public final u2z b;

    public static final class a implements uih.a<byte[]> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            return new tk5((byte[]) obj, u2zVar);
        }
    }

    public tk5(byte[] bArr, u2z u2zVar) {
        this.a = bArr;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        lb5 lb5Var = new lb5();
        lb5Var.m103write(this.a);
        return new aqa0(obn.b(lb5Var, this.b.f), null, bqc.b);
    }
}
