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
/* JADX INFO: loaded from: classes4.dex */
public class lgj0 {
    public static final b a;
    public static final /* synthetic */ lgj0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    lgj0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    lgj0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    lgj0 EF2;

    public final enum a extends lgj0 {
    }

    public final enum b extends lgj0 {
    }

    public final enum c extends lgj0 {
    }

    public final enum d extends lgj0 {
    }

    static {
        lgj0 lgj0Var = new lgj0("DOUBLE", 0, mgj0.DOUBLE, 1);
        lgj0 lgj0Var2 = new lgj0("FLOAT", 1, mgj0.FLOAT, 5);
        mgj0 mgj0Var = mgj0.LONG;
        lgj0 lgj0Var3 = new lgj0("INT64", 2, mgj0Var, 0);
        lgj0 lgj0Var4 = new lgj0("UINT64", 3, mgj0Var, 0);
        mgj0 mgj0Var2 = mgj0.INT;
        lgj0 lgj0Var5 = new lgj0("INT32", 4, mgj0Var2, 0);
        lgj0 lgj0Var6 = new lgj0("FIXED64", 5, mgj0Var, 1);
        lgj0 lgj0Var7 = new lgj0("FIXED32", 6, mgj0Var2, 5);
        lgj0 lgj0Var8 = new lgj0("BOOL", 7, mgj0.BOOLEAN, 0);
        a aVar = new a("STRING", 8, mgj0.STRING, 2);
        mgj0 mgj0Var3 = mgj0.MESSAGE;
        b bVar = new b("GROUP", 9, mgj0Var3, 3);
        a = bVar;
        b = new lgj0[]{lgj0Var, lgj0Var2, lgj0Var3, lgj0Var4, lgj0Var5, lgj0Var6, lgj0Var7, lgj0Var8, aVar, bVar, new c("MESSAGE", 10, mgj0Var3, 2), new d("BYTES", 11, mgj0.BYTE_STRING, 2), new lgj0("UINT32", 12, mgj0Var2, 0), new lgj0("ENUM", 13, mgj0.ENUM, 0), new lgj0("SFIXED32", 14, mgj0Var2, 5), new lgj0("SFIXED64", 15, mgj0Var, 1), new lgj0("SINT32", 16, mgj0Var2, 0), new lgj0("SINT64", 17, mgj0Var, 0)};
    }

    public lgj0(String str, int i, mgj0 mgj0Var, int i2) {
        super(str, i);
    }

    public static lgj0 valueOf(String str) {
        return (lgj0) Enum.valueOf(lgj0.class, str);
    }

    public static lgj0[] values() {
        return (lgj0[]) b.clone();
    }
}
