package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.k7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4363k7 {

    /* JADX INFO: renamed from: com.ironsource.k7$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends InterfaceC4363k7 {

        /* JADX INFO: renamed from: com.ironsource.k7$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0582a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            private final Exception f62205a;

            public C0582a(@oy.l Exception exception) {
                kotlin.jvm.internal.m0.p(exception, "exception");
                this.f62205a = exception;
            }

            @oy.l
            public final C0582a a(@oy.l Exception exception) {
                kotlin.jvm.internal.m0.p(exception, "exception");
                return new C0582a(exception);
            }

            @Override // com.ironsource.InterfaceC4363k7.a
            public boolean b() {
                return true;
            }

            @oy.l
            public final Exception c() {
                return this.f62205a;
            }

            @oy.l
            public final Exception d() {
                return this.f62205a;
            }

            public boolean equals(@oy.m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0582a) && kotlin.jvm.internal.m0.g(this.f62205a, ((C0582a) obj).f62205a);
            }

            public int hashCode() {
                return this.f62205a.hashCode();
            }

            @oy.l
            public String toString() {
                return "Exception(exception=" + this.f62205a + gi.j.f86771d;
            }

            public static /* synthetic */ C0582a a(C0582a c0582a, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = c0582a.f62205a;
                }
                return c0582a.a(exc);
            }

            @Override // com.ironsource.InterfaceC4363k7.a
            @oy.l
            public String a() {
                String message = this.f62205a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.k7$a$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f62206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.m
            private final String f62207b;

            public b(int i10, @oy.m String str) {
                this.f62206a = i10;
                this.f62207b = str;
            }

            @oy.l
            public final b a(int i10, @oy.m String str) {
                return new b(i10, str);
            }

            @Override // com.ironsource.InterfaceC4363k7.a
            public boolean b() {
                return this.f62206a != 400;
            }

            public final int c() {
                return this.f62206a;
            }

            @oy.m
            public final String d() {
                return this.f62207b;
            }

            public final int e() {
                return this.f62206a;
            }

            public boolean equals(@oy.m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f62206a == bVar.f62206a && kotlin.jvm.internal.m0.g(this.f62207b, bVar.f62207b);
            }

            @oy.m
            public final String f() {
                return this.f62207b;
            }

            public int hashCode() {
                int i10 = this.f62206a * 31;
                String str = this.f62207b;
                return i10 + (str == null ? 0 : str.hashCode());
            }

            @oy.l
            public String toString() {
                return "HttpError(errorCode=" + this.f62206a + ", errorMessage=" + this.f62207b + gi.j.f86771d;
            }

            public static /* synthetic */ b a(b bVar, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = bVar.f62206a;
                }
                if ((i11 & 2) != 0) {
                    str = bVar.f62207b;
                }
                return bVar.a(i10, str);
            }

            @Override // com.ironsource.InterfaceC4363k7.a
            @oy.l
            public String a() {
                int i10 = this.f62206a;
                String str = this.f62207b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i10 + ", Message: " + str;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.k7$a$c */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4363k7.a
            @oy.l
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4363k7.a
            public boolean b() {
                return true;
            }
        }

        @oy.l
        String a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.ironsource.k7$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4363k7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62208a;

        public b(@oy.l String response) {
            kotlin.jvm.internal.m0.p(response, "response");
            this.f62208a = response;
        }

        @oy.l
        public final b a(@oy.l String response) {
            kotlin.jvm.internal.m0.p(response, "response");
            return new b(response);
        }

        @oy.l
        public final String c() {
            return this.f62208a;
        }

        @oy.l
        public final String d() {
            return this.f62208a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m0.g(this.f62208a, ((b) obj).f62208a);
        }

        public int hashCode() {
            return this.f62208a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Success(response=" + this.f62208a + gi.j.f86771d;
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f62208a;
            }
            return bVar.a(str);
        }
    }
}
