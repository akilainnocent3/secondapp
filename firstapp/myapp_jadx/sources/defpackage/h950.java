package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h950<T> implements k6b<T> {
    public final Function1<j6b, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public h950(Function1<? super j6b, ? extends T> function1) {
        this.a = function1;
    }

    @Override // defpackage.k6b
    public final Object c(j6b j6bVar) {
        return this.a.invoke(j6bVar);
    }
}
