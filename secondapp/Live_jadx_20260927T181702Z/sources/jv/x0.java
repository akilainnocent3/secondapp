package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class x0 {
    @oy.l
    public static final String a(@oy.l Object obj) {
        return obj.getClass().getSimpleName();
    }

    @oy.l
    public static final String b(@oy.l Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @oy.l
    public static final String c(@oy.l or.f<?> fVar) {
        Object objB;
        if (fVar instanceof qv.m) {
            return ((qv.m) fVar).toString();
        }
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(fVar + '@' + b(fVar));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.e(objB) != null) {
            objB = fVar.getClass().getName() + '@' + b(fVar);
        }
        return (String) objB;
    }
}
