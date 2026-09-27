package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n262#1:285\n1#2:286\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n283#1:285\n*E\n"})
public final class r3 {
    @oy.l
    public static final <T> q3<T> a(@oy.l ThreadLocal<T> threadLocal, T t10) {
        return new qv.j1(t10, threadLocal);
    }

    public static /* synthetic */ q3 b(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @oy.m
    public static final Object c(@oy.l ThreadLocal<?> threadLocal, @oy.l or.f<? super dr.w2> fVar) {
        if (fVar.getContext().get(new qv.k1(threadLocal)) != null) {
            return dr.w2.f79517a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + fVar.getContext()).toString());
    }

    public static final Object d(ThreadLocal<?> threadLocal, or.f<? super dr.w2> fVar) {
        kotlin.jvm.internal.j0.e(3);
        throw null;
    }

    @oy.m
    public static final Object e(@oy.l ThreadLocal<?> threadLocal, @oy.l or.f<? super Boolean> fVar) {
        return rr.b.a(fVar.getContext().get(new qv.k1(threadLocal)) != null);
    }

    public static final Object f(ThreadLocal<?> threadLocal, or.f<? super Boolean> fVar) {
        kotlin.jvm.internal.j0.e(3);
        throw null;
    }
}
