package b3;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final String f20495a;

        public a(@l String name) {
            m0.p(name, "name");
            this.f20495a = name;
        }

        @l
        public final String a() {
            return this.f20495a;
        }

        @l
        public final b<T> b(T t10) {
            return new b<>(this, t10);
        }

        public boolean equals(@m Object obj) {
            if (obj instanceof a) {
                return m0.g(this.f20495a, ((a) obj).f20495a);
            }
            return false;
        }

        public int hashCode() {
            return this.f20495a.hashCode();
        }

        @l
        public String toString() {
            return this.f20495a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final a<T> f20496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f20497b;

        public b(@l a<T> key, T t10) {
            m0.p(key, "key");
            this.f20496a = key;
            this.f20497b = t10;
        }

        @l
        public final a<T> a() {
            return this.f20496a;
        }

        public final T b() {
            return this.f20497b;
        }
    }

    @l
    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(@l a<T> aVar);

    @m
    public abstract <T> T c(@l a<T> aVar);

    @l
    public final c d() {
        return new c(n1.J0(a()), false);
    }

    @l
    public final f e() {
        return new c(n1.J0(a()), true);
    }
}
