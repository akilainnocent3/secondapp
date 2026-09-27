package dw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@d3
@kotlin.jvm.internal.s1({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class v<T> extends ClassValue<p1<T>> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements ds.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.a<T> f79681b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ds.a<? extends T> aVar) {
            this.f79681b = aVar;
        }

        @Override // ds.a
        public final T invoke() {
            return this.f79681b.invoke();
        }
    }

    @Override // java.lang.ClassValue
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1<T> computeValue(@oy.l Class<?> type) {
        kotlin.jvm.internal.m0.p(type, "type");
        return new p1<>();
    }

    public final T b(@oy.l Class<?> key, @oy.l ds.a<? extends T> factory) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(factory, "factory");
        Object obj = get(key);
        kotlin.jvm.internal.m0.o(obj, "get(...)");
        p1 p1Var = (p1) obj;
        T t10 = p1Var.f79645a.get();
        return t10 != null ? t10 : (T) p1Var.a(new a(factory));
    }

    public final boolean c(@oy.l Class<?> key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return ((p1) get(key)).f79645a.get() != null;
    }
}
