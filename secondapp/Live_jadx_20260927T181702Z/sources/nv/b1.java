package nv;

import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f117715a = new qv.z0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f117716b = new qv.z0("PENDING");

    @oy.l
    public static final <T> k0<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) ov.u.f119984a;
        }
        return new a1(t10);
    }

    @oy.l
    public static final <T> i<T> d(@oy.l z0<? extends T> z0Var, @oy.l or.j jVar, int i10, @oy.l lv.j jVar2) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || jVar2 != lv.j.DROP_OLDEST) ? q0.e(z0Var, jVar, i10, jVar2) : z0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@oy.l k0<T> k0Var, @oy.l ds.l<? super T, ? extends T> lVar) {
        ?? r10;
        do {
            r10 = (Object) k0Var.getValue();
        } while (!k0Var.d(r10, lVar.invoke(r10)));
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@oy.l k0<T> k0Var, @oy.l ds.l<? super T, ? extends T> lVar) {
        a0.c cVar;
        do {
            cVar = (Object) k0Var.getValue();
        } while (!k0Var.d(cVar, lVar.invoke(cVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@oy.l k0<T> k0Var, @oy.l ds.l<? super T, ? extends T> lVar) {
        a0.c cVar;
        T tInvoke;
        do {
            cVar = (Object) k0Var.getValue();
            tInvoke = lVar.invoke(cVar);
        } while (!k0Var.d(cVar, tInvoke));
        return tInvoke;
    }
}
