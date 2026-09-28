package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jh8 {
    public static final /* synthetic */ int a = 0;

    public static final lg50 a(ukf0 ukf0Var, int i) {
        tkf0 tkf0Var = ukf0Var.a;
        zjw zjwVar = ukf0Var.b;
        if (tkf0Var.a.b.length() != 0) {
            int iD = zjwVar.d(i);
            if ((i != 0 && iD == zjwVar.d(i - 1)) || (i != tkf0Var.a.b.length() && iD == zjwVar.d(i + 1))) {
                return ukf0Var.a(i);
            }
        }
        return ukf0Var.j(i);
    }
}
