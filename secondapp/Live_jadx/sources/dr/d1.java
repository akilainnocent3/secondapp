package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public class d1 extends c1 {
    @ur.f
    public static final void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @ur.f
    public static final void d(boolean z10, ds.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.m0.p(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @ur.f
    public static final <T> T e(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @ur.f
    public static final <T> T f(T t10, ds.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.m0.p(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @ur.f
    public static final Void g(Object message) {
        kotlin.jvm.internal.m0.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @ur.f
    public static final void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @ur.f
    public static final void i(boolean z10, ds.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.m0.p(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @ur.f
    public static final <T> T j(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @ur.f
    public static final <T> T k(T t10, ds.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.m0.p(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
