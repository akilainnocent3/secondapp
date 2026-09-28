package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lm5 extends fm5 {
    public static lm5 h(String str) {
        lm5 lm5Var = new lm5(str.toCharArray());
        lm5Var.b = 0L;
        lm5Var.f(str.length() - 1);
        return lm5Var;
    }

    @Override // defpackage.fm5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lm5) && b().equals(((lm5) obj).b())) {
            return true;
        }
        return super.equals(obj);
    }
}
