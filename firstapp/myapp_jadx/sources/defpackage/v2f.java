package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class v2f {
    public static final c850 a(vb00 vb00Var) {
        vb00Var.getClass();
        xmt value = vb00Var.a.getValue();
        if (value == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value2 = vb00Var.b.getValue();
        if (value2 == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value3 = vb00Var.c.getValue();
        if (value3 == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value4 = vb00Var.d.getValue();
        if (value4 == null) {
            ib5.a("Required value was null.");
            return null;
        }
        xmt value5 = vb00Var.e.getValue();
        if (value5 != null) {
            return new c850(value, value2, value3, value4, value5);
        }
        ib5.a("Required value was null.");
        return null;
    }
}
