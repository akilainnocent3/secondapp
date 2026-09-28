package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wbp {
    public static final a d = new a(new fcp(false, true, "    ", "type", true, wp7.b), ve80.a);
    public final fcp a;
    public final y3l b;
    public final sae c = new sae();

    public static final class a extends wbp {
    }

    public wbp(fcp fcpVar, y3l y3lVar) {
        this.a = fcpVar;
        this.b = y3lVar;
    }

    public final <T> T a(tae<? extends T> taeVar, String str) {
        taeVar.getClass();
        str.getClass();
        v9e0 v9e0Var = new v9e0(str);
        T t = (T) new t8e0(this, u7k0.OBJ, v9e0Var, taeVar.getDescriptor(), null).z(taeVar);
        if (v9e0Var.e() == 10) {
            return t;
        }
        v9e0.l(v9e0Var, "Expected EOF after parsing, but had " + v9e0Var.e.charAt(v9e0Var.a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final <T> String b(he80<? super T> he80Var, T t) {
        char[] cArr;
        he80Var.getClass();
        rep repVar = new rep();
        u77 u77Var = u77.c;
        synchronized (u77Var) {
            gx0 gx0Var = u77Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (gx0Var.isEmpty() ? null : gx0Var.removeLast());
            if (cArr2 != null) {
                u77Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        repVar.a = cArr;
        try {
            new u8e0(new qla(repVar), this, u7k0.OBJ, new edp[u7k0.v.b()]).x(he80Var, t);
            return repVar.toString();
        } finally {
            repVar.b();
        }
    }
}
