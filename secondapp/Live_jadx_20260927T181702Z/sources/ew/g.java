package ew;

import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,684:1\n1069#2,2:685\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n647#1:685,2\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public String f81759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public String f81761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public a f81762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.m
    public f0 f81764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f81767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f81768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f81769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f81770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.l
    public gw.f f81771r;

    public g(@oy.l c json) {
        kotlin.jvm.internal.m0.p(json, "json");
        this.f81754a = json.i().m();
        this.f81755b = json.i().n();
        this.f81756c = json.i().o();
        this.f81757d = json.i().w();
        this.f81758e = json.i().r();
        this.f81759f = json.i().s();
        this.f81760g = json.i().j();
        this.f81761h = json.i().g();
        this.f81762i = json.i().h();
        this.f81763j = json.i().u();
        this.f81764k = json.i().p();
        this.f81765l = json.i().k();
        this.f81766m = json.i().e();
        this.f81767n = json.i().a();
        this.f81768o = json.i().c();
        this.f81769p = json.i().d();
        this.f81770q = json.i().v();
        this.f81771r = json.a();
    }

    public final void A(boolean z10) {
        this.f81768o = z10;
    }

    public final void B(boolean z10) {
        this.f81769p = z10;
    }

    public final void C(boolean z10) {
        this.f81766m = z10;
    }

    public final void D(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f81761h = str;
    }

    public final void E(@oy.l a aVar) {
        kotlin.jvm.internal.m0.p(aVar, "<set-?>");
        this.f81762i = aVar;
    }

    public final void F(boolean z10) {
        this.f81760g = z10;
    }

    public final void G(boolean z10) {
        this.f81765l = z10;
    }

    public final void H(boolean z10) {
        this.f81754a = z10;
    }

    public final void I(boolean z10) {
        this.f81755b = z10;
    }

    public final void J(boolean z10) {
        this.f81756c = z10;
    }

    public final void K(boolean z10) {
        this.f81757d = z10;
    }

    public final void L(@oy.m f0 f0Var) {
        this.f81764k = f0Var;
    }

    public final void M(boolean z10) {
        this.f81758e = z10;
    }

    public final void N(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f81759f = str;
    }

    public final void O(@oy.l gw.f fVar) {
        kotlin.jvm.internal.m0.p(fVar, "<set-?>");
        this.f81771r = fVar;
    }

    public final void P(boolean z10) {
        this.f81763j = z10;
    }

    public final void Q(boolean z10) {
        this.f81770q = z10;
    }

    @oy.l
    public final i a() {
        if (this.f81770q) {
            if (!kotlin.jvm.internal.m0.g(this.f81761h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f81762i != a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f81758e) {
            if (!kotlin.jvm.internal.m0.g(this.f81759f, b0.f81731a)) {
                String str = this.f81759f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f81759f).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.m0.g(this.f81759f, b0.f81731a)) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new i(this.f81754a, this.f81756c, this.f81757d, this.f81769p, this.f81758e, this.f81755b, this.f81759f, this.f81760g, this.f81770q, this.f81761h, this.f81768o, this.f81763j, this.f81764k, this.f81765l, this.f81766m, this.f81767n, this.f81762i);
    }

    public final boolean b() {
        return this.f81767n;
    }

    public final boolean d() {
        return this.f81768o;
    }

    public final boolean e() {
        return this.f81769p;
    }

    public final boolean f() {
        return this.f81766m;
    }

    @oy.l
    public final String h() {
        return this.f81761h;
    }

    @oy.l
    public final a i() {
        return this.f81762i;
    }

    public final boolean k() {
        return this.f81760g;
    }

    public final boolean l() {
        return this.f81765l;
    }

    public final boolean n() {
        return this.f81754a;
    }

    public final boolean o() {
        return this.f81755b;
    }

    public final boolean p() {
        return this.f81756c;
    }

    @oy.m
    public final f0 q() {
        return this.f81764k;
    }

    public final boolean s() {
        return this.f81758e;
    }

    @oy.l
    public final String t() {
        return this.f81759f;
    }

    @oy.l
    public final gw.f v() {
        return this.f81771r;
    }

    public final boolean w() {
        return this.f81763j;
    }

    public final boolean x() {
        return this.f81770q;
    }

    public final boolean y() {
        return this.f81757d;
    }

    public final void z(boolean z10) {
        this.f81767n = z10;
    }

    @zv.g
    public static /* synthetic */ void c() {
    }

    @zv.g
    public static /* synthetic */ void g() {
    }

    @zv.g
    public static /* synthetic */ void j() {
    }

    @zv.g
    public static /* synthetic */ void m() {
    }

    @zv.g
    public static /* synthetic */ void r() {
    }

    @zv.g
    public static /* synthetic */ void u() {
    }
}
