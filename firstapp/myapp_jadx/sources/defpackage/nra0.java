package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nra0 implements yxd0 {
    public static final nra0 a = new nra0();
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.yxd0
    public int a(Object obj, ptu ptuVar) {
        yzd0 yzd0Var = (yzd0) obj;
        dk1 dk1VarD = mra0.d(yzd0Var);
        return qtu.c(vzd0.b, dk1VarD) + cyd0.e(vzd0.a, yzd0Var.a(), ptuVar);
    }

    @Override // defpackage.yxd0
    public void b(me80 me80Var, Object obj, ptu ptuVar) {
        yzd0 yzd0Var = (yzd0) obj;
        dk1 dk1VarD = mra0.d(yzd0Var);
        me80Var.P(vzd0.a, yzd0Var.a(), ptuVar);
        me80Var.d(vzd0.b, dk1VarD);
    }
}
