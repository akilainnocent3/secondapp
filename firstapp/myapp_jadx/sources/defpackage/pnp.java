package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class pnp implements yxd0 {
    public static final pnp a = new pnp();
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.yxd0
    public int a(Object obj, ptu ptuVar) {
        inp inpVar = (inp) obj;
        String key = inpVar.getKey();
        int iE = !key.isEmpty() ? cyd0.e(hnp.a, key, ptuVar) : 0;
        ek1 ek1Var = hnp.b;
        ruh0<?> value = inpVar.getValue();
        int iB = ptuVar.b();
        int iC = dl0.c(value, ptuVar);
        int iA = s08.a(iC) + ek1Var.d() + iC;
        ptuVar.b[iB] = iC;
        return iA + iE;
    }

    @Override // defpackage.yxd0
    public void b(me80 me80Var, Object obj, ptu ptuVar) {
        inp inpVar = (inp) obj;
        String key = inpVar.getKey();
        if (key.isEmpty()) {
            ek1 ek1Var = hnp.a;
        } else {
            me80Var.P(hnp.a, key, ptuVar);
        }
        me80Var.m(hnp.b, inpVar.getValue(), dl0.a, ptuVar);
    }
}
