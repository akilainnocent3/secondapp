package ew;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f81779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f81780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f81781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final String f81782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f81783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f81784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public final String f81785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f81786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f81787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.m
    public final f0 f81788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f81789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f81790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f81791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    public a f81792q;

    public i() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    public final boolean a() {
        return this.f81791p;
    }

    public final boolean c() {
        return this.f81786k;
    }

    public final boolean d() {
        return this.f81779d;
    }

    public final boolean e() {
        return this.f81790o;
    }

    @oy.l
    public final String g() {
        return this.f81785j;
    }

    @oy.l
    public final a h() {
        return this.f81792q;
    }

    public final boolean j() {
        return this.f81783h;
    }

    public final boolean k() {
        return this.f81789n;
    }

    public final boolean m() {
        return this.f81776a;
    }

    public final boolean n() {
        return this.f81781f;
    }

    public final boolean o() {
        return this.f81777b;
    }

    @oy.m
    public final f0 p() {
        return this.f81788m;
    }

    public final boolean r() {
        return this.f81780e;
    }

    @oy.l
    public final String s() {
        return this.f81782g;
    }

    @oy.l
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f81776a + ", ignoreUnknownKeys=" + this.f81777b + ", isLenient=" + this.f81778c + ", allowStructuredMapKeys=" + this.f81779d + ", prettyPrint=" + this.f81780e + ", explicitNulls=" + this.f81781f + ", prettyPrintIndent='" + this.f81782g + "', coerceInputValues=" + this.f81783h + ", useArrayPolymorphism=" + this.f81784i + ", classDiscriminator='" + this.f81785j + "', allowSpecialFloatingPointValues=" + this.f81786k + ", useAlternativeNames=" + this.f81787l + ", namingStrategy=" + this.f81788m + ", decodeEnumsCaseInsensitive=" + this.f81789n + ", allowTrailingComma=" + this.f81790o + ", allowComments=" + this.f81791p + ", classDiscriminatorMode=" + this.f81792q + ')';
    }

    public final boolean u() {
        return this.f81787l;
    }

    public final boolean v() {
        return this.f81784i;
    }

    public final boolean w() {
        return this.f81778c;
    }

    @dr.o(level = dr.q.ERROR, message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.")
    public final void x(@oy.l a aVar) {
        kotlin.jvm.internal.m0.p(aVar, "<set-?>");
        this.f81792q = aVar;
    }

    public i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @oy.l String prettyPrintIndent, boolean z16, boolean z17, @oy.l String classDiscriminator, boolean z18, boolean z19, @oy.m f0 f0Var, boolean z20, boolean z21, boolean z22, @oy.l a classDiscriminatorMode) {
        kotlin.jvm.internal.m0.p(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.m0.p(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.m0.p(classDiscriminatorMode, "classDiscriminatorMode");
        this.f81776a = z10;
        this.f81777b = z11;
        this.f81778c = z12;
        this.f81779d = z13;
        this.f81780e = z14;
        this.f81781f = z15;
        this.f81782g = prettyPrintIndent;
        this.f81783h = z16;
        this.f81784i = z17;
        this.f81785j = classDiscriminator;
        this.f81786k = z18;
        this.f81787l = z19;
        this.f81788m = f0Var;
        this.f81789n = z20;
        this.f81790o = z21;
        this.f81791p = z22;
        this.f81792q = classDiscriminatorMode;
    }

    public /* synthetic */ i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, f0 f0Var, boolean z20, boolean z21, boolean z22, a aVar, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? b0.f81731a : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : f0Var, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & 65536) != 0 ? a.POLYMORPHIC : aVar);
    }

    @zv.g
    public static /* synthetic */ void b() {
    }

    @zv.g
    public static /* synthetic */ void f() {
    }

    @zv.g
    public static /* synthetic */ void i() {
    }

    @zv.g
    public static /* synthetic */ void l() {
    }

    @zv.g
    public static /* synthetic */ void q() {
    }

    @zv.g
    public static /* synthetic */ void t() {
    }
}
