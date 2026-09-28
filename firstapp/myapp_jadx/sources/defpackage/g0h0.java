package defpackage;

import defpackage.mj0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g0h0<T, V extends mj0> implements f0h0<T, V> {
    public final Function1<T, V> a;
    public final Function1<V, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0h0(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function2) {
        this.a = function1;
        this.b = function2;
    }

    @Override // defpackage.f0h0
    public final Function1<T, V> a() {
        return this.a;
    }

    @Override // defpackage.f0h0
    public final Function1<V, T> b() {
        return this.b;
    }
}
