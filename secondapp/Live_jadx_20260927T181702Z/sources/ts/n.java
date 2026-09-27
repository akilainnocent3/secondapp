package ts;

import kotlin.jvm.internal.m0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f137317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f137318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f137319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f137320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n[] f137321i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final wt.b f137322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final wt.f f137323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final wt.b f137324d;

    static {
        wt.b bVarE = wt.b.e("kotlin/UByte");
        m0.o(bVarE, "fromString(\"kotlin/UByte\")");
        f137317e = new n("UBYTE", 0, bVarE);
        wt.b bVarE2 = wt.b.e("kotlin/UShort");
        m0.o(bVarE2, "fromString(\"kotlin/UShort\")");
        f137318f = new n("USHORT", 1, bVarE2);
        wt.b bVarE3 = wt.b.e("kotlin/UInt");
        m0.o(bVarE3, "fromString(\"kotlin/UInt\")");
        f137319g = new n("UINT", 2, bVarE3);
        wt.b bVarE4 = wt.b.e("kotlin/ULong");
        m0.o(bVarE4, "fromString(\"kotlin/ULong\")");
        f137320h = new n("ULONG", 3, bVarE4);
        f137321i = d();
    }

    public n(String str, int i10, wt.b bVar) {
        super(str, i10);
        this.f137322b = bVar;
        wt.f fVarJ = bVar.j();
        m0.o(fVarJ, "classId.shortClassName");
        this.f137323c = fVarJ;
        this.f137324d = new wt.b(bVar.h(), wt.f.f(fVarJ.b() + "Array"));
    }

    public static final /* synthetic */ n[] d() {
        return new n[]{f137317e, f137318f, f137319g, f137320h};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f137321i.clone();
    }

    @oy.l
    public final wt.b g() {
        return this.f137324d;
    }

    @oy.l
    public final wt.b h() {
        return this.f137322b;
    }

    @oy.l
    public final wt.f i() {
        return this.f137323c;
    }
}
