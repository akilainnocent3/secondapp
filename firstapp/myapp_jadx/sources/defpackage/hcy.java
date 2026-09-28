package defpackage;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class hcy<T> {
    public final cx0<T> a;
    public final Supplier<T> b;

    public hcy(Supplier<T> supplier) {
        cx0<T> cx0Var = new cx0<>();
        cx0Var.a = (T[]) new Object[10];
        cx0Var.b = 0;
        this.a = cx0Var;
        this.b = supplier;
    }
}
