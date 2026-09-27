package cv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @oy.l
        public static b a(@oy.l r rVar) {
            return new b(rVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final r f77286a;

        public b(@oy.l r match) {
            kotlin.jvm.internal.m0.p(match, "match");
            this.f77286a = match;
        }

        @ur.f
        public final String a() {
            return k().c().get(1);
        }

        @ur.f
        public final String b() {
            return k().c().get(10);
        }

        @ur.f
        public final String c() {
            return k().c().get(2);
        }

        @ur.f
        public final String d() {
            return k().c().get(3);
        }

        @ur.f
        public final String e() {
            return k().c().get(4);
        }

        @ur.f
        public final String f() {
            return k().c().get(5);
        }

        @ur.f
        public final String g() {
            return k().c().get(6);
        }

        @ur.f
        public final String h() {
            return k().c().get(7);
        }

        @ur.f
        public final String i() {
            return k().c().get(8);
        }

        @ur.f
        public final String j() {
            return k().c().get(9);
        }

        @oy.l
        public final r k() {
            return this.f77286a;
        }

        @oy.l
        public final List<String> l() {
            return this.f77286a.c().subList(1, this.f77286a.c().size());
        }
    }

    @oy.l
    b a();

    @oy.l
    p b();

    @oy.l
    List<String> c();

    @oy.l
    ms.l d();

    @oy.l
    String getValue();

    @oy.m
    r next();
}
