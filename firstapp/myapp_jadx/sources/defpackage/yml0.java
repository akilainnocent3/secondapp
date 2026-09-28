package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class yml0 {
    public static final yml0 c;
    public static final yml0 d;
    public static final /* synthetic */ yml0[] e;
    public final anl0 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    yml0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    yml0 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    yml0 EF0;

    static {
        yml0 yml0Var = new yml0("DOUBLE", 0, anl0.d, 1);
        yml0 yml0Var2 = new yml0("FLOAT", 1, anl0.c, 5);
        anl0 anl0Var = anl0.b;
        yml0 yml0Var3 = new yml0("INT64", 2, anl0Var, 0);
        yml0 yml0Var4 = new yml0("UINT64", 3, anl0Var, 0);
        anl0 anl0Var2 = anl0.a;
        yml0 yml0Var5 = new yml0("INT32", 4, anl0Var2, 0);
        yml0 yml0Var6 = new yml0("FIXED64", 5, anl0Var, 1);
        yml0 yml0Var7 = new yml0("FIXED32", 6, anl0Var2, 5);
        yml0 yml0Var8 = new yml0("BOOL", 7, anl0.e, 0);
        yml0 yml0Var9 = new yml0("STRING", 8, anl0.f, 2);
        c = yml0Var9;
        anl0 anl0Var3 = anl0.w;
        yml0 yml0Var10 = new yml0("GROUP", 9, anl0Var3, 3);
        d = yml0Var10;
        e = new yml0[]{yml0Var, yml0Var2, yml0Var3, yml0Var4, yml0Var5, yml0Var6, yml0Var7, yml0Var8, yml0Var9, yml0Var10, new yml0("MESSAGE", 10, anl0Var3, 2), new yml0("BYTES", 11, anl0.i, 2), new yml0("UINT32", 12, anl0Var2, 0), new yml0("ENUM", 13, anl0.v, 0), new yml0("SFIXED32", 14, anl0Var2, 5), new yml0("SFIXED64", 15, anl0Var, 1), new yml0("SINT32", 16, anl0Var2, 0), new yml0("SINT64", 17, anl0Var, 0)};
    }

    public yml0(String str, int i, anl0 anl0Var, int i2) {
        super(str, i);
        this.a = anl0Var;
        this.b = i2;
    }

    public static yml0[] values() {
        return (yml0[]) e.clone();
    }
}
