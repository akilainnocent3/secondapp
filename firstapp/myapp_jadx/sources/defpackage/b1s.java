package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class b1s<T> implements avh0<T> {
    public final mpe0 a;

    public b1s(Function0<? extends T> function0) {
        this.a = hwr.b(function0);
    }

    @Override // defpackage.avh0
    public final T a(ne00 ne00Var) {
        return (T) this.a.getValue();
    }
}
