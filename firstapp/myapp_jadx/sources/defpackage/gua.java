package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gua<T> {
    public final wwd0 a;
    public final fua b;

    public gua(int i) {
        wwd0 wwd0VarA = xwd0.a(new Pair(Integer.MIN_VALUE, null));
        this.a = wwd0VarA;
        this.b = new fua(wwd0VarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(T t) {
        t.getClass();
        wwd0 wwd0Var = this.a;
        Pair pair = new Pair(Integer.valueOf(((Number) ((Pair) wwd0Var.getValue()).a).intValue() + 1), t);
        wwd0Var.getClass();
        wwd0Var.k(null, pair);
    }
}
