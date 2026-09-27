package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class j1 {
    @f1
    @oy.l
    @l1(version = "1.3")
    public static final Object a(@oy.l Throwable exception) {
        kotlin.jvm.internal.m0.p(exception, "exception");
        return new i1.b(exception);
    }

    @l1(version = "1.3")
    @ur.f
    public static final <R, T> R b(Object obj, ds.l<? super T, ? extends R> onSuccess, ds.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.m0.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.m0.p(onFailure, "onFailure");
        Throwable thE = i1.e(obj);
        return thE == null ? onSuccess.invoke(obj) : onFailure.invoke(thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l1(version = "1.3")
    @ur.f
    public static final <R, T extends R> R c(Object obj, R r10) {
        return i1.i(obj) ? r10 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l1(version = "1.3")
    @ur.f
    public static final <R, T extends R> R d(Object obj, ds.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.m0.p(onFailure, "onFailure");
        Throwable thE = i1.e(obj);
        return thE == null ? obj : onFailure.invoke(thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l1(version = "1.3")
    @ur.f
    public static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @l1(version = "1.3")
    @ur.f
    public static final <R, T> Object f(Object obj, ds.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(transform, "transform");
        if (!i1.j(obj)) {
            return i1.b(obj);
        }
        i1.a aVar = i1.f79460c;
        return i1.b(transform.invoke(obj));
    }

    @l1(version = "1.3")
    @ur.f
    public static final <R, T> Object g(Object obj, ds.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(transform, "transform");
        if (!i1.j(obj)) {
            return i1.b(obj);
        }
        try {
            i1.a aVar = i1.f79460c;
            return i1.b(transform.invoke(obj));
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            return i1.b(a(th2));
        }
    }

    @l1(version = "1.3")
    @ur.f
    public static final <T> Object h(Object obj, ds.l<? super Throwable, w2> action) {
        kotlin.jvm.internal.m0.p(action, "action");
        Throwable thE = i1.e(obj);
        if (thE != null) {
            action.invoke(thE);
        }
        return obj;
    }

    @l1(version = "1.3")
    @ur.f
    public static final <T> Object i(Object obj, ds.l<? super T, w2> action) {
        kotlin.jvm.internal.m0.p(action, "action");
        if (i1.j(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    @l1(version = "1.3")
    @ur.f
    public static final <R, T extends R> Object j(Object obj, ds.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(transform, "transform");
        Throwable thE = i1.e(obj);
        if (thE == null) {
            return obj;
        }
        i1.a aVar = i1.f79460c;
        return i1.b(transform.invoke(thE));
    }

    @l1(version = "1.3")
    @ur.f
    public static final <R, T extends R> Object k(Object obj, ds.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.m0.p(transform, "transform");
        Throwable thE = i1.e(obj);
        if (thE == null) {
            return obj;
        }
        try {
            i1.a aVar = i1.f79460c;
            return i1.b(transform.invoke(thE));
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            return i1.b(a(th2));
        }
    }

    @l1(version = "1.3")
    @ur.f
    public static final <R> Object l(ds.a<? extends R> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        try {
            i1.a aVar = i1.f79460c;
            return i1.b(block.invoke());
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            return i1.b(a(th2));
        }
    }

    @l1(version = "1.3")
    @ur.f
    public static final <T, R> Object m(T t10, ds.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        try {
            i1.a aVar = i1.f79460c;
            return i1.b(block.invoke(t10));
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            return i1.b(a(th2));
        }
    }

    @f1
    @l1(version = "1.3")
    public static final void n(@oy.l Object obj) {
        if (obj instanceof i1.b) {
            throw ((i1.b) obj).f79462b;
        }
    }
}
