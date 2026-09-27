package androidx.window.layout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface r extends m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final C0175a f19949b = new C0175a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        @cs.g
        public static final a f19950c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        @cs.g
        public static final a f19951d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final String f19952a;

        /* JADX INFO: renamed from: androidx.window.layout.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0175a {
            public /* synthetic */ C0175a(kotlin.jvm.internal.x xVar) {
                this();
            }

            public C0175a() {
            }
        }

        public a(String str) {
            this.f19952a = str;
        }

        @oy.l
        public String toString() {
            return this.f19952a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final a f19953b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        @cs.g
        public static final b f19954c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        @cs.g
        public static final b f19955d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final String f19956a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f19956a = str;
        }

        @oy.l
        public String toString() {
            return this.f19956a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final a f19957b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        @cs.g
        public static final c f19958c = new c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        @cs.g
        public static final c f19959d = new c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final String f19960a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }

            public a() {
            }
        }

        public c(String str) {
            this.f19960a = str;
        }

        @oy.l
        public String toString() {
            return this.f19960a;
        }
    }

    boolean a();

    @oy.l
    a b();

    @oy.l
    b getOrientation();

    @oy.l
    c getState();
}
