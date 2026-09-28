package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class wwd0<T> extends y4<ywd0> implements ztw<T>, lyh, abj<T> {
    public static final /* synthetic */ long f = s0o.a.objectFieldOffset(wwd0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    @c0d(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    public static final class a extends x1b {
        public wwd0 a;
        public myh b;
        public ywd0 c;
        public c9p d;
        public Object e;
        public /* synthetic */ Object f;
        public final /* synthetic */ wwd0<T> i;
        public int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wwd0<T> wwd0Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.i = wwd0Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f = obj;
            this.v |= Integer.MIN_VALUE;
            this.i.collect(null, this);
            return y5b.a;
        }
    }

    public wwd0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.vtw
    public final boolean a(T t) {
        setValue(t);
        return true;
    }

    @Override // defpackage.a390
    public final List<T> c() {
        return kotlin.collections.a.c(getValue());
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0108 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:38:0x009a, B:40:0x00a4, B:43:0x00ab, B:44:0x00af, B:46:0x00b2, B:57:0x00d7, B:60:0x00e7, B:61:0x0101, B:67:0x0115, B:70:0x011e, B:64:0x0108, B:66:0x010e, B:48:0x00b8, B:52:0x00bf, B:73:0x0123, B:74:0x0128, B:36:0x0089, B:29:0x006d, B:31:0x0071), top: B:77:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:0: B:61:0x0101->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ywd0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ywd0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a5] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [ywd0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ywd0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [ywd0] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [myh] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [myh] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [myh] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00e6 -> B:37:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.lyh
    public final java.lang.Object collect(defpackage.myh<? super T> r14, defpackage.v1b<?> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwd0.collect(myh, v1b):java.lang.Object");
    }

    @Override // defpackage.abj
    public final lyh<T> d(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return (((i < 0 || i >= 2) && i != -2) || pb5Var != pb5.b) ? d390.c(this, coroutineContext, i, pb5Var) : this;
    }

    @Override // defpackage.vtw, defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        setValue(t);
        return Unit.a;
    }

    @Override // defpackage.y4
    public final a5 f() {
        return new ywd0();
    }

    @Override // defpackage.ztw
    public final boolean g(T t, T t2) {
        toe0 toe0Var = k5y.a;
        if (t == null) {
            t = (T) toe0Var;
        }
        if (t2 == null) {
            t2 = (T) toe0Var;
        }
        return k(t, t2);
    }

    @Override // defpackage.ztw, defpackage.uwd0
    public final T getValue() {
        T t = (T) s0o.a.getObjectVolatile(this, f);
        if (t == k5y.a) {
            return null;
        }
        return t;
    }

    @Override // defpackage.vtw
    public final void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.y4
    public final a5[] i() {
        return new ywd0[2];
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        Object obj3;
        toe0 toe0Var;
        synchronized (this) {
            Object objectVolatile = s0o.a.getObjectVolatile(this, f);
            if (obj != null && !Intrinsics.g(objectVolatile, obj)) {
                return false;
            }
            if (Intrinsics.g(objectVolatile, obj2)) {
                return true;
            }
            s0o.a.putObjectVolatile(this, f, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            Object obj4 = this.a;
            Unit unit = Unit.a;
            while (true) {
                ywd0[] ywd0VarArr = (ywd0[]) obj4;
                if (ywd0VarArr != null) {
                    for (ywd0 ywd0Var : ywd0VarArr) {
                        if (ywd0Var != null) {
                            AtomicReference<Object> atomicReference = ywd0Var.a;
                            while (true) {
                                Object obj5 = atomicReference.get();
                                if (obj5 == null || obj5 == (toe0Var = xwd0.b)) {
                                    break;
                                }
                                toe0 toe0Var2 = xwd0.a;
                                if (obj5 != toe0Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj5, toe0Var2)) {
                                            zi50.a aVar = zi50.b;
                                            ((bc6) obj5).resumeWith(Unit.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj5);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj5, toe0Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj5);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    obj3 = this.a;
                    Unit unit2 = Unit.a;
                }
                obj4 = obj3;
                i3 = i;
            }
        }
    }

    @Override // defpackage.ztw
    public final void setValue(T t) {
        if (t == null) {
            t = (T) k5y.a;
        }
        k(null, t);
    }
}
