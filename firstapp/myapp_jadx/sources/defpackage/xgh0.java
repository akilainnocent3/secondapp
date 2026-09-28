package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class xgh0<T> implements ttr<T>, Serializable {
    public Function0<? extends T> a;
    public Object b;

    @Override // defpackage.ttr
    public final T getValue() {
        T t = (T) this.b;
        if (t != tbh0.a) {
            return t;
        }
        Function0<? extends T> function0 = this.a;
        function0.getClass();
        T tInvoke = function0.invoke();
        this.b = tInvoke;
        this.a = null;
        return tInvoke;
    }

    public final String toString() {
        return this.b != tbh0.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
