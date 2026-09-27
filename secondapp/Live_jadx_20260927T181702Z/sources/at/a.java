package at;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;
import ws.o1;
import ws.p1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f20365a = new a();

    /* JADX INFO: renamed from: at.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0183a extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        public static final C0183a f20366c = new C0183a();

        public C0183a() {
            super("package", false);
        }

        @Override // ws.p1
        @m
        public Integer a(@l p1 visibility) {
            m0.p(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            return o1.f143775a.b(visibility) ? 1 : -1;
        }

        @Override // ws.p1
        @l
        public String b() {
            return "public/*package*/";
        }

        @Override // ws.p1
        @l
        public p1 d() {
            return o1.g.f143784c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        public static final b f20367c = new b();

        public b() {
            super("protected_and_package", true);
        }

        @Override // ws.p1
        @m
        public Integer a(@l p1 visibility) {
            m0.p(visibility, "visibility");
            if (m0.g(this, visibility)) {
                return 0;
            }
            if (visibility == o1.b.f143779c) {
                return null;
            }
            return o1.f143775a.b(visibility) ? 1 : -1;
        }

        @Override // ws.p1
        @l
        public String b() {
            return "protected/*protected and package*/";
        }

        @Override // ws.p1
        @l
        public p1 d() {
            return o1.g.f143784c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        public static final c f20368c = new c();

        public c() {
            super("protected_static", true);
        }

        @Override // ws.p1
        @l
        public String b() {
            return "protected/*protected static*/";
        }

        @Override // ws.p1
        @l
        public p1 d() {
            return o1.g.f143784c;
        }
    }
}
