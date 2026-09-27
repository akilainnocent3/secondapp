package ts;

import kotlin.jvm.internal.m0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
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
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f137310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f137311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f137312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f137313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m[] f137314h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final wt.b f137315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final wt.f f137316c;

    static {
        wt.b bVarE = wt.b.e("kotlin/UByteArray");
        m0.o(bVarE, "fromString(\"kotlin/UByteArray\")");
        f137310d = new m("UBYTEARRAY", 0, bVarE);
        wt.b bVarE2 = wt.b.e("kotlin/UShortArray");
        m0.o(bVarE2, "fromString(\"kotlin/UShortArray\")");
        f137311e = new m("USHORTARRAY", 1, bVarE2);
        wt.b bVarE3 = wt.b.e("kotlin/UIntArray");
        m0.o(bVarE3, "fromString(\"kotlin/UIntArray\")");
        f137312f = new m("UINTARRAY", 2, bVarE3);
        wt.b bVarE4 = wt.b.e("kotlin/ULongArray");
        m0.o(bVarE4, "fromString(\"kotlin/ULongArray\")");
        f137313g = new m("ULONGARRAY", 3, bVarE4);
        f137314h = d();
    }

    public m(String str, int i10, wt.b bVar) {
        super(str, i10);
        this.f137315b = bVar;
        wt.f fVarJ = bVar.j();
        m0.o(fVarJ, "classId.shortClassName");
        this.f137316c = fVarJ;
    }

    public static final /* synthetic */ m[] d() {
        return new m[]{f137310d, f137311e, f137312f, f137313g};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f137314h.clone();
    }

    @oy.l
    public final wt.f g() {
        return this.f137316c;
    }
}
