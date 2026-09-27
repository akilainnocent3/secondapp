package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class n1 {
    @ur.f
    public static final Void a() {
        throw new p0(null, 1, null);
    }

    @ur.f
    public static final Void b(String reason) {
        kotlin.jvm.internal.m0.p(reason, "reason");
        throw new p0("An operation is not implemented: " + reason);
    }

    @l1(version = "1.1")
    @ur.f
    public static final <T> T c(T t10, ds.l<? super T, w2> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        block.invoke(t10);
        return t10;
    }

    @ur.f
    public static final <T> T d(T t10, ds.l<? super T, w2> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        block.invoke(t10);
        return t10;
    }

    @ur.f
    public static final <T, R> R e(T t10, ds.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        return block.invoke(t10);
    }

    @ur.f
    public static final void f(int i10, ds.l<? super Integer, w2> action) {
        kotlin.jvm.internal.m0.p(action, "action");
        for (int i11 = 0; i11 < i10; i11++) {
            action.invoke(Integer.valueOf(i11));
        }
    }

    @ur.f
    public static final <R> R g(ds.a<? extends R> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        return block.invoke();
    }

    @ur.f
    public static final <T, R> R h(T t10, ds.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        return block.invoke(t10);
    }

    @l1(version = "1.1")
    @ur.f
    public static final <T> T i(T t10, ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return t10;
        }
        return null;
    }

    @l1(version = "1.1")
    @ur.f
    public static final <T> T j(T t10, ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return null;
        }
        return t10;
    }

    @ur.f
    public static final <T, R> R k(T t10, ds.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        return block.invoke(t10);
    }
}
