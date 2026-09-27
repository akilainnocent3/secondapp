package pt;

import kotlin.jvm.internal.m0;
import ou.w1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    public static final a f120972k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final c0 f120981t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f120982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f120983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f120985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f120986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public final c0 f120987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f120988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.m
    public final c0 f120989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    public final c0 f120990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f120991j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120992a;

        static {
            int[] iArr = new int[w1.values().length];
            try {
                iArr[w1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w1.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120992a = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        c0 c0Var = new c0(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        f120973l = c0Var;
        c0 c0Var2 = new c0(false, false, z15, false, false, null, false, null, null, true, d1.n.f77587u, null);
        f120974m = c0Var2;
        f120975n = new c0(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f120976o = new c0(z10, z11, z12, z13, z14, c0Var, false, null, null, z15, 988, null);
        f120977p = new c0(false, false, z15, false, false, c0Var2, false, null, null, true, 476, null);
        kotlin.jvm.internal.x xVar = null;
        boolean z16 = false;
        c0 c0Var3 = null;
        c0 c0Var4 = null;
        f120978q = new c0(z10, true, z12, z13, z14, c0Var, z16, c0Var3, c0Var4, z15, 988, xVar);
        boolean z17 = false;
        boolean z18 = true;
        f120979r = new c0(z10, z17, z12, z18, z14, c0Var, z16, c0Var3, c0Var4, z15, 983, xVar);
        f120980s = new c0(z10, z17, z12, z18, z14, c0Var, z16, c0Var3, c0Var4, z15, 919, xVar);
        f120981t = new c0(z10, z17, true, false, z14, c0Var, z16, c0Var3, c0Var4, z15, 984, xVar);
    }

    public c0() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean a() {
        return this.f120988g;
    }

    public final boolean b() {
        return this.f120991j;
    }

    public final boolean c() {
        return this.f120983b;
    }

    public final boolean d() {
        return this.f120982a;
    }

    public final boolean e() {
        return this.f120984c;
    }

    @oy.l
    public final c0 f(@oy.l w1 effectiveVariance, boolean z10) {
        m0.p(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f120984c) {
            int i10 = b.f120992a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                c0 c0Var = this.f120989h;
                if (c0Var != null) {
                    return c0Var;
                }
            } else if (i10 != 2) {
                c0 c0Var2 = this.f120987f;
                if (c0Var2 != null) {
                    return c0Var2;
                }
            } else {
                c0 c0Var3 = this.f120990i;
                if (c0Var3 != null) {
                    return c0Var3;
                }
            }
        }
        return this;
    }

    @oy.l
    public final c0 g() {
        return new c0(this.f120982a, true, this.f120984c, this.f120985d, this.f120986e, this.f120987f, this.f120988g, this.f120989h, this.f120990i, false, 512, null);
    }

    public c0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @oy.m c0 c0Var, boolean z15, @oy.m c0 c0Var2, @oy.m c0 c0Var3, boolean z16) {
        this.f120982a = z10;
        this.f120983b = z11;
        this.f120984c = z12;
        this.f120985d = z13;
        this.f120986e = z14;
        this.f120987f = c0Var;
        this.f120988g = z15;
        this.f120989h = c0Var2;
        this.f120990i = c0Var3;
        this.f120991j = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, c0 c0Var, boolean z15, c0 c0Var2, c0 c0Var3, boolean z16, int i10, kotlin.jvm.internal.x xVar) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        c0Var = (i10 & 32) != 0 ? null : c0Var;
        this(z10, z11, z12, z13, z14, c0Var, (i10 & 64) != 0 ? true : z15, (i10 & 128) != 0 ? c0Var : c0Var2, (i10 & 256) != 0 ? c0Var : c0Var3, (i10 & 512) != 0 ? false : z16);
    }
}
