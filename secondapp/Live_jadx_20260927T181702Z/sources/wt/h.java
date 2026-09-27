package wt;

import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nSpecialNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNames.kt\norg/jetbrains/kotlin/name/SpecialNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final h f143848a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @l
    @cs.g
    public static final f f143865r;

    static {
        f fVarI = f.i("<no name provided>");
        m0.o(fVarI, "special(\"<no name provided>\")");
        f143849b = fVarI;
        f fVarI2 = f.i("<root package>");
        m0.o(fVarI2, "special(\"<root package>\")");
        f143850c = fVarI2;
        f fVarF = f.f("Companion");
        m0.o(fVarF, "identifier(\"Companion\")");
        f143851d = fVarF;
        f fVarF2 = f.f("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        m0.o(fVarF2, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f143852e = fVarF2;
        f fVarI3 = f.i("<anonymous>");
        m0.o(fVarI3, "special(ANONYMOUS_STRING)");
        f143853f = fVarI3;
        f fVarI4 = f.i("<unary>");
        m0.o(fVarI4, "special(\"<unary>\")");
        f143854g = fVarI4;
        f fVarI5 = f.i("<unary-result>");
        m0.o(fVarI5, "special(\"<unary-result>\")");
        f143855h = fVarI5;
        f fVarI6 = f.i("<this>");
        m0.o(fVarI6, "special(\"<this>\")");
        f143856i = fVarI6;
        f fVarI7 = f.i("<init>");
        m0.o(fVarI7, "special(\"<init>\")");
        f143857j = fVarI7;
        f fVarI8 = f.i("<iterator>");
        m0.o(fVarI8, "special(\"<iterator>\")");
        f143858k = fVarI8;
        f fVarI9 = f.i("<destruct>");
        m0.o(fVarI9, "special(\"<destruct>\")");
        f143859l = fVarI9;
        f fVarI10 = f.i(aa.f.f4516h);
        m0.o(fVarI10, "special(\"<local>\")");
        f143860m = fVarI10;
        f fVarI11 = f.i("<unused var>");
        m0.o(fVarI11, "special(\"<unused var>\")");
        f143861n = fVarI11;
        f fVarI12 = f.i("<set-?>");
        m0.o(fVarI12, "special(\"<set-?>\")");
        f143862o = fVarI12;
        f fVarI13 = f.i("<array>");
        m0.o(fVarI13, "special(\"<array>\")");
        f143863p = fVarI13;
        f fVarI14 = f.i("<receiver>");
        m0.o(fVarI14, "special(\"<receiver>\")");
        f143864q = fVarI14;
        f fVarI15 = f.i("<get-entries>");
        m0.o(fVarI15, "special(\"<get-entries>\")");
        f143865r = fVarI15;
    }

    @l
    @o
    public static final f b(@m f fVar) {
        return (fVar == null || fVar.g()) ? f143852e : fVar;
    }

    public final boolean a(@l f name) {
        m0.p(name, "name");
        String strB = name.b();
        m0.o(strB, "name.asString()");
        return strB.length() > 0 && !name.g();
    }
}
