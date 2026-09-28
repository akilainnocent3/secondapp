package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class skd<T> implements l730 {
    public l730<T> a;

    public static <T> void a(l730<T> l730Var, l730<T> l730Var2) {
        skd skdVar = (skd) l730Var;
        if (skdVar.a == null) {
            skdVar.a = l730Var2;
        } else {
            fm20.a();
        }
    }

    @Override // defpackage.m730
    public final T get() {
        l730<T> l730Var = this.a;
        if (l730Var != null) {
            return l730Var.get();
        }
        fm20.a();
        return null;
    }
}
