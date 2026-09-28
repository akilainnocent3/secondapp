package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class xof0 {
    public static final ThreadLocal<tpg> a = new ThreadLocal<>();

    public static tpg a() {
        ThreadLocal<tpg> threadLocal = a;
        tpg tpgVar = threadLocal.get();
        if (tpgVar != null) {
            return tpgVar;
        }
        yf4 yf4Var = new yf4(Thread.currentThread());
        threadLocal.set(yf4Var);
        return yf4Var;
    }
}
