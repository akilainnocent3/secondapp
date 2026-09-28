package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fae
public abstract class z9g<T> extends v390 {
    public abstract void d(bge0 bge0Var, T t);

    public final void e(T t) {
        bge0 bge0VarA = a();
        try {
            d(bge0VarA, t);
            bge0VarA.t0();
        } finally {
            c(bge0VarA);
        }
    }
}
