package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class vr60<T> implements ttr<T>, Serializable {
    public static final a c = new a(null);
    public static final AtomicReferenceFieldUpdater<vr60<?>, Object> d = AtomicReferenceFieldUpdater.newUpdater(vr60.class, Object.class, "b");
    public static final /* synthetic */ long e = s0o.a.objectFieldOffset(vr60.class.getDeclaredField("b"));
    public volatile Function0<? extends T> a;
    public volatile Object b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public vr60() {
        throw null;
    }

    @Override // defpackage.ttr
    public final T getValue() {
        vr60<T> vr60Var;
        T t = (T) this.b;
        tbh0 tbh0Var = tbh0.a;
        if (t != tbh0Var) {
            return t;
        }
        Function0<? extends T> function0 = this.a;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            AtomicReferenceFieldUpdater<vr60<?>, Object> atomicReferenceFieldUpdater = d;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                vr60Var = this;
                if (s0o.a.compareAndSwapObject(vr60Var, e, tbh0Var, tInvoke)) {
                    vr60Var.a = null;
                    return tInvoke;
                }
                if (s0o.a.getObjectVolatile(vr60Var, e) == tbh0Var) {
                    this = vr60Var;
                }
            }
        } else {
            vr60Var = this;
        }
        return (T) vr60Var.b;
    }

    public final String toString() {
        return this.b != tbh0.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
