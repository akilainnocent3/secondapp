package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class kzs<T> {
    public final lyh<xxs<T>> a;
    public final int b;
    public final Function2<T, v1b<? super Unit>, Object> c;
    public final Function1<v1b<? super Unit>, Object> d;

    /* JADX WARN: Multi-variable type inference failed */
    public kzs(lyh<xxs<T>> lyhVar, int i, Function2<? super T, ? super v1b<? super Unit>, ? extends Object> function2, Function1<? super v1b<? super Unit>, ? extends Object> function1) {
        this.a = lyhVar;
        this.b = i;
        this.c = function2;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzs)) {
            return false;
        }
        kzs kzsVar = (kzs) obj;
        return this.a.equals(kzsVar.a) && this.b == kzsVar.b && this.c.equals(kzsVar.c) && this.d.equals(kzsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "LoadingTask(flow=" + this.a + ", size=" + this.b + ", onSuccess=" + this.c + ", onLoadingError=" + this.d + ')';
    }
}
