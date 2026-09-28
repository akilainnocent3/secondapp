package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class j830 {
    public static final j27 a(k27 k27Var) {
        int i = k27Var.a;
        if (i != 1) {
            if (i != 8) {
                return j27.c.a;
            }
            String str = k27Var.e;
            return new j27.a(str != null ? str : "");
        }
        String str2 = k27Var.b;
        Long l = k27Var.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str3 = k27Var.d;
        return new j27.b(jLongValue, str2, str3 != null ? str3 : "");
    }
}
