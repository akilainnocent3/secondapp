package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vna<T> implements avh0<T> {
    public final Function1<xma, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public vna(Function1<? super xma, ? extends T> function1) {
        this.a = function1;
    }

    @Override // defpackage.avh0
    public final T a(ne00 ne00Var) {
        return this.a.invoke(ne00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vna) && Intrinsics.g(this.a, ((vna) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
