package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class qxd0<T> {
    public final Function0<T> a;
    public final Function1<T, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public qxd0(Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        this.a = function0;
        this.b = function1;
    }

    public final void a(T t) {
        this.b.invoke(t);
    }
}
