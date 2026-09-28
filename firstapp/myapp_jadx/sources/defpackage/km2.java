package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class km2 {
    public static final /* synthetic */ int a = 0;

    public static final nk0 a(ijf0 ijf0Var) {
        nk0 nk0Var = ijf0Var.a;
        long j = ijf0Var.b;
        nk0Var.getClass();
        return nk0Var.subSequence(ulf0.f(j), ulf0.e(j));
    }

    public static final nk0 b(ijf0 ijf0Var, int i) {
        nk0 nk0Var = ijf0Var.a;
        long j = ijf0Var.b;
        return nk0Var.subSequence(ulf0.e(j), Math.min(ulf0.e(j) + i, ijf0Var.a.b.length()));
    }

    public static final nk0 c(ijf0 ijf0Var, int i) {
        nk0 nk0Var = ijf0Var.a;
        long j = ijf0Var.b;
        return nk0Var.subSequence(Math.max(0, ulf0.f(j) - i), ulf0.f(j));
    }
}
