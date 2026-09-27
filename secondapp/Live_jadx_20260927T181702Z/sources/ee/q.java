package ee;

import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        public abstract q a();

        public abstract a b(ae.e eVar);

        public abstract a c(ae.f<?> fVar);

        public <T> a d(ae.f<T> fVar, ae.e eVar, ae.k<T, byte[]> kVar) {
            c(fVar);
            b(eVar);
            e(kVar);
            return this;
        }

        public abstract a e(ae.k<?, byte[]> kVar);

        public abstract a f(r rVar);

        public abstract a g(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract ae.e b();

    public abstract ae.f<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    public abstract ae.k<?, byte[]> e();

    public abstract r f();

    public abstract String g();
}
