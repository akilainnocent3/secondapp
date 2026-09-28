package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class kgj0 {
    public static final a c;
    public static final b d;
    public static final c e;
    public static final /* synthetic */ kgj0[] f;
    public final ngj0 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    kgj0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    kgj0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    kgj0 EF2;

    public final enum a extends kgj0 {
    }

    public final enum b extends kgj0 {
    }

    public final enum c extends kgj0 {
    }

    public final enum d extends kgj0 {
    }

    static {
        kgj0 kgj0Var = new kgj0("DOUBLE", 0, ngj0.DOUBLE, 1);
        kgj0 kgj0Var2 = new kgj0("FLOAT", 1, ngj0.FLOAT, 5);
        ngj0 ngj0Var = ngj0.LONG;
        kgj0 kgj0Var3 = new kgj0("INT64", 2, ngj0Var, 0);
        kgj0 kgj0Var4 = new kgj0("UINT64", 3, ngj0Var, 0);
        ngj0 ngj0Var2 = ngj0.INT;
        kgj0 kgj0Var5 = new kgj0("INT32", 4, ngj0Var2, 0);
        kgj0 kgj0Var6 = new kgj0("FIXED64", 5, ngj0Var, 1);
        kgj0 kgj0Var7 = new kgj0("FIXED32", 6, ngj0Var2, 5);
        kgj0 kgj0Var8 = new kgj0("BOOL", 7, ngj0.BOOLEAN, 0);
        a aVar = new a("STRING", 8, ngj0.STRING, 2);
        c = aVar;
        ngj0 ngj0Var3 = ngj0.MESSAGE;
        b bVar = new b("GROUP", 9, ngj0Var3, 3);
        d = bVar;
        c cVar = new c("MESSAGE", 10, ngj0Var3, 2);
        e = cVar;
        f = new kgj0[]{kgj0Var, kgj0Var2, kgj0Var3, kgj0Var4, kgj0Var5, kgj0Var6, kgj0Var7, kgj0Var8, aVar, bVar, cVar, new d("BYTES", 11, ngj0.BYTE_STRING, 2), new kgj0("UINT32", 12, ngj0Var2, 0), new kgj0("ENUM", 13, ngj0.ENUM, 0), new kgj0("SFIXED32", 14, ngj0Var2, 5), new kgj0("SFIXED64", 15, ngj0Var, 1), new kgj0("SINT32", 16, ngj0Var2, 0), new kgj0("SINT64", 17, ngj0Var, 0)};
    }

    public kgj0(String str, int i, ngj0 ngj0Var, int i2) {
        super(str, i);
        this.a = ngj0Var;
        this.b = i2;
    }

    public static kgj0 valueOf(String str) {
        return (kgj0) Enum.valueOf(kgj0.class, str);
    }

    public static kgj0[] values() {
        return (kgj0[]) f.clone();
    }
}
