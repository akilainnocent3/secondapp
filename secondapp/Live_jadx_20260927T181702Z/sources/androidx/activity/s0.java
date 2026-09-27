package androidx.activity;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f6136e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final ds.l<Resources, Boolean> f6140d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: androidx.activity.s0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0031a extends kotlin.jvm.internal.o0 implements ds.l<Resources, Boolean> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0031a f6141g = new C0031a();

            public C0031a() {
                super(1);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@oy.l Resources resources) {
                kotlin.jvm.internal.m0.p(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b extends kotlin.jvm.internal.o0 implements ds.l<Resources, Boolean> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final b f6142g = new b();

            public b() {
                super(1);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@oy.l Resources resources) {
                kotlin.jvm.internal.m0.p(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends kotlin.jvm.internal.o0 implements ds.l<Resources, Boolean> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final c f6143g = new c();

            public c() {
                super(1);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@oy.l Resources resources) {
                kotlin.jvm.internal.m0.p(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ s0 c(a aVar, int i10, int i11, ds.l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = C0031a.f6141g;
            }
            return aVar.b(i10, i11, lVar);
        }

        @oy.l
        @cs.k
        @cs.o
        public final s0 a(@k.k int i10, @k.k int i11) {
            return c(this, i10, i11, null, 4, null);
        }

        @oy.l
        @cs.k
        @cs.o
        public final s0 b(@k.k int i10, @k.k int i11, @oy.l ds.l<? super Resources, Boolean> detectDarkMode) {
            kotlin.jvm.internal.m0.p(detectDarkMode, "detectDarkMode");
            return new s0(i10, i11, 0, detectDarkMode, null);
        }

        @oy.l
        @cs.o
        public final s0 d(@k.k int i10) {
            return new s0(i10, i10, 2, b.f6142g, null);
        }

        @oy.l
        @cs.o
        public final s0 e(@k.k int i10, @k.k int i11) {
            return new s0(i10, i11, 1, c.f6143g, null);
        }

        public a() {
        }
    }

    public /* synthetic */ s0(int i10, int i11, int i12, ds.l lVar, kotlin.jvm.internal.x xVar) {
        this(i10, i11, i12, lVar);
    }

    @oy.l
    @cs.k
    @cs.o
    public static final s0 a(@k.k int i10, @k.k int i11) {
        return f6136e.a(i10, i11);
    }

    @oy.l
    @cs.k
    @cs.o
    public static final s0 b(@k.k int i10, @k.k int i11, @oy.l ds.l<? super Resources, Boolean> lVar) {
        return f6136e.b(i10, i11, lVar);
    }

    @oy.l
    @cs.o
    public static final s0 c(@k.k int i10) {
        return f6136e.d(i10);
    }

    @oy.l
    @cs.o
    public static final s0 i(@k.k int i10, @k.k int i11) {
        return f6136e.e(i10, i11);
    }

    public final int d() {
        return this.f6138b;
    }

    @oy.l
    public final ds.l<Resources, Boolean> e() {
        return this.f6140d;
    }

    public final int f() {
        return this.f6139c;
    }

    public final int g(boolean z10) {
        return z10 ? this.f6138b : this.f6137a;
    }

    public final int h(boolean z10) {
        if (this.f6139c == 0) {
            return 0;
        }
        return z10 ? this.f6138b : this.f6137a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(int i10, int i11, int i12, ds.l<? super Resources, Boolean> lVar) {
        this.f6137a = i10;
        this.f6138b = i11;
        this.f6139c = i12;
        this.f6140d = lVar;
    }
}
