package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hb50 extends m52<hb50> {
    public static hb50 L;
    public static hb50 M;

    public static hb50 E() {
        hb50 hb50Var = M;
        if (hb50Var != null) {
            return hb50Var;
        }
        hb50 hb50Var2 = (hb50) new hb50().z(x6f.b, new wn7());
        hb50Var2.b();
        M = hb50Var2;
        return hb50Var2;
    }

    @Override // defpackage.m52
    public final boolean equals(Object obj) {
        return (obj instanceof hb50) && super.equals(obj);
    }
}
