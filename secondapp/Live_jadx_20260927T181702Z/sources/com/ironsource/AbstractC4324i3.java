package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4324i3 implements InterfaceC4455p7 {

    /* JADX INFO: renamed from: com.ironsource.i3$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends AbstractC4324i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final b f61983a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@oy.l b firstReason) {
            super(null);
            kotlin.jvm.internal.m0.p(firstReason, "firstReason");
            this.f61983a = firstReason;
        }

        @oy.l
        public final a a(@oy.l b firstReason) {
            kotlin.jvm.internal.m0.p(firstReason, "firstReason");
            return new a(firstReason);
        }

        @oy.l
        public final b d() {
            return this.f61983a;
        }

        @oy.l
        public final b e() {
            return this.f61983a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m0.g(this.f61983a, ((a) obj).f61983a);
        }

        public int hashCode() {
            return this.f61983a.hashCode();
        }

        @oy.l
        public String toString() {
            return "First(firstReason=" + this.f61983a + gi.j.f86771d;
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f61983a;
            }
            return aVar.a(bVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b implements InterfaceC4455p7 {

        /* JADX INFO: renamed from: com.ironsource.i3$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final a f61984a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0576b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final C0576b f61985a = new C0576b();

            private C0576b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$b$c */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final c f61986a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC4455p7
        @oy.l
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0576b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new dr.o0();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends AbstractC4324i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f61987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final d f61988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, @oy.l d recurringReason) {
            super(null);
            kotlin.jvm.internal.m0.p(recurringReason, "recurringReason");
            this.f61987a = j10;
            this.f61988b = recurringReason;
        }

        @oy.l
        public final c a(long j10, @oy.l d recurringReason) {
            kotlin.jvm.internal.m0.p(recurringReason, "recurringReason");
            return new c(j10, recurringReason);
        }

        public final long d() {
            return this.f61987a;
        }

        @oy.l
        public final d e() {
            return this.f61988b;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f61987a == cVar.f61987a && kotlin.jvm.internal.m0.g(this.f61988b, cVar.f61988b);
        }

        @oy.l
        public final d f() {
            return this.f61988b;
        }

        public final long g() {
            return this.f61987a;
        }

        public int hashCode() {
            return (f0.p.a(this.f61987a) * 31) + this.f61988b.hashCode();
        }

        @oy.l
        public String toString() {
            return "Recurring(reloadDuration=" + this.f61987a + ", recurringReason=" + this.f61988b + gi.j.f86771d;
        }

        public static /* synthetic */ c a(c cVar, long j10, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f61987a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f61988b;
            }
            return cVar.a(j10, dVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d implements InterfaceC4455p7 {

        /* JADX INFO: renamed from: com.ironsource.i3$d$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final a f61989a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final b f61990a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$c */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final c f61991a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0577d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final C0577d f61992a = new C0577d();

            private C0577d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$e */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final e f61993a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$f */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f61994a;

            public f(long j10) {
                super(null);
                this.f61994a = j10;
            }

            @oy.l
            public final f a(long j10) {
                return new f(j10);
            }

            public final long c() {
                return this.f61994a;
            }

            public final long d() {
                return this.f61994a;
            }

            public boolean equals(@oy.m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f61994a == ((f) obj).f61994a;
            }

            public int hashCode() {
                return f0.p.a(this.f61994a);
            }

            @oy.l
            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f61994a + gi.j.f86771d;
            }

            public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = fVar.f61994a;
                }
                return fVar.a(j10);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$g */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final g f61995a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$h */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final h f61996a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(kotlin.jvm.internal.x xVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC4455p7
        @oy.l
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0577d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new dr.o0();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC4324i3(kotlin.jvm.internal.x xVar) {
        this();
    }

    @Override // com.ironsource.InterfaceC4455p7
    @oy.l
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new dr.o0();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new dr.o0();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new dr.o0();
    }

    private AbstractC4324i3() {
    }
}
