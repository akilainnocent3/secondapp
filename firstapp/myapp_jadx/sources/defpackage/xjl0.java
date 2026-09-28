package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xjl0 {
    public final vjl0 a;

    public xjl0(yml0 yml0Var, yml0 yml0Var2) {
        this.a = new vjl0(yml0Var, yml0Var2);
    }

    public static void a(qfl0 qfl0Var, vjl0 vjl0Var, Object obj, Object obj2) throws sfl0 {
        ngl0.d(qfl0Var, vjl0Var.a, 1, obj);
        ngl0.d(qfl0Var, vjl0Var.b, 2, obj2);
    }

    public static int b(vjl0 vjl0Var, Object obj, Object obj2) {
        yml0 yml0Var = vjl0Var.a;
        yml0 yml0Var2 = vjl0Var.b;
        return ngl0.e(yml0Var2, 2, obj2) + ngl0.e(yml0Var, 1, obj);
    }
}
