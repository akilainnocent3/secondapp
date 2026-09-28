package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wp40<T> extends jlv<Object> {
    public final pg1 m;
    public final vp40 n;
    public ssw o;

    public wp40(pg1 pg1Var) {
        vp40 vp40Var = new vp40();
        this.m = pg1Var;
        this.n = vp40Var;
    }

    public static final void o(wp40 wp40Var, ssw sswVar) {
        final dpu dpuVar = new dpu(wp40Var);
        super.n(sswVar, new lfy() { // from class: epu
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                dpuVar.invoke(obj);
            }
        });
    }

    @Override // defpackage.njs
    public final Object d() {
        ssw sswVar = this.o;
        if (sswVar == null) {
            return this.m;
        }
        T tD = sswVar.d();
        this.n.getClass();
        return tD;
    }

    @Override // defpackage.jlv
    public final <S> void n(njs<S> njsVar, lfy<? super S> lfyVar) {
        njsVar.getClass();
        throw new UnsupportedOperationException();
    }
}
