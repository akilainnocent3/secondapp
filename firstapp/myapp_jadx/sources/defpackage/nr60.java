package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class nr60<T> implements v1b<T>, z5b {
    private static final a b = new a(null);
    public static final AtomicReferenceFieldUpdater<nr60<?>, Object> c = AtomicReferenceFieldUpdater.newUpdater(nr60.class, Object.class, AnalyticsParam.EVENT_PARAM_RESULT);
    public static final /* synthetic */ long d = s0o.a.objectFieldOffset(nr60.class.getDeclaredField(AnalyticsParam.EVENT_PARAM_RESULT));
    public final v1b<T> a;
    private volatile Object result;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nr60(v1b<? super T> v1bVar, Object obj) {
        v1bVar.getClass();
        this.a = v1bVar;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        y5b y5bVar = y5b.b;
        if (obj == y5bVar) {
            AtomicReferenceFieldUpdater<nr60<?>, Object> atomicReferenceFieldUpdater = c;
            y5b y5bVar2 = y5b.a;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                nr60<T> nr60Var = this;
                if (s0o.a.compareAndSwapObject(nr60Var, d, y5bVar, y5bVar2)) {
                    return y5b.a;
                }
                if (s0o.a.getObjectVolatile(nr60Var, d) != y5bVar) {
                    obj = nr60Var.result;
                    break;
                }
                this = nr60Var;
            }
        }
        if (obj == y5b.c) {
            return y5b.a;
        }
        if (obj instanceof zi50.b) {
            throw ((zi50.b) obj).a;
        }
        return obj;
    }

    @Override // defpackage.z5b
    public final z5b getCallerFrame() {
        v1b<T> v1bVar = this.a;
        if (v1bVar instanceof z5b) {
            return (z5b) v1bVar;
        }
        return null;
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        nr60<T> nr60Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            y5b y5bVar = y5b.b;
            if (obj3 == y5bVar) {
                AtomicReferenceFieldUpdater<nr60<?>, Object> atomicReferenceFieldUpdater = c;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = s0o.a;
                    long j2 = d;
                    nr60Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(nr60Var, j2, y5bVar, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(nr60Var, j2) != y5bVar) {
                        break;
                    }
                    this = nr60Var;
                    obj = obj2;
                }
            } else {
                nr60Var = this;
                obj2 = obj;
                y5b y5bVar2 = y5b.a;
                if (obj3 != y5bVar2) {
                    ib5.a("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater<nr60<?>, Object> atomicReferenceFieldUpdater2 = c;
                y5b y5bVar3 = y5b.c;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = s0o.a;
                    j = d;
                    if (unsafe.compareAndSwapObject(nr60Var, j, y5bVar2, y5bVar3)) {
                        nr60Var.a.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(nr60Var, j) == y5bVar2);
            }
            this = nr60Var;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nr60(v1b<? super T> v1bVar) {
        this(v1bVar, y5b.b);
        v1bVar.getClass();
    }
}
