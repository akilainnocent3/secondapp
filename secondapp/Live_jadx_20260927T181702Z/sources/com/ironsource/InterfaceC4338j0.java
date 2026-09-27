package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4338j0 {

    /* JADX INFO: renamed from: com.ironsource.j0$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4338j0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final C0579a f62042c = new C0579a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private final String f62043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f62044b;

        /* JADX INFO: renamed from: com.ironsource.j0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0579a {
            public /* synthetic */ C0579a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            public final a a(@oy.m String str) {
                return new a(str);
            }

            private C0579a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @oy.l
        public final a a(@oy.m String str) {
            return new a(str);
        }

        @oy.m
        public final String b() {
            return this.f62043a;
        }

        @oy.m
        public final String c() {
            return this.f62043a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m0.g(this.f62043a, ((a) obj).f62043a);
        }

        public int hashCode() {
            String str = this.f62043a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @oy.l
        public String toString() {
            return "NotReady(reason=" + this.f62043a + gi.j.f86771d;
        }

        public a(@oy.m String str) {
            this.f62043a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f62043a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.x xVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC4338j0
        public boolean a() {
            return this.f62044b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j0$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4338j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f62045a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f62046b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4338j0
        public boolean a() {
            return f62046b;
        }
    }

    boolean a();
}
