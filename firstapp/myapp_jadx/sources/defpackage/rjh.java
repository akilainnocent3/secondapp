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
public final class rjh {
    public static final rjh b;
    public static final rjh c;
    public static final rjh[] d;
    public static final /* synthetic */ rjh[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    rjh EF0;

    static {
        a8p a8pVar = a8p.DOUBLE;
        rjh rjhVar = new rjh("DOUBLE", 0, 0, 1, a8pVar);
        a8p a8pVar2 = a8p.FLOAT;
        rjh rjhVar2 = new rjh("FLOAT", 1, 1, 1, a8pVar2);
        a8p a8pVar3 = a8p.LONG;
        rjh rjhVar3 = new rjh("INT64", 2, 2, 1, a8pVar3);
        rjh rjhVar4 = new rjh("UINT64", 3, 3, 1, a8pVar3);
        a8p a8pVar4 = a8p.INT;
        rjh rjhVar5 = new rjh("INT32", 4, 4, 1, a8pVar4);
        rjh rjhVar6 = new rjh("FIXED64", 5, 5, 1, a8pVar3);
        rjh rjhVar7 = new rjh("FIXED32", 6, 6, 1, a8pVar4);
        a8p a8pVar5 = a8p.BOOLEAN;
        rjh rjhVar8 = new rjh("BOOL", 7, 7, 1, a8pVar5);
        a8p a8pVar6 = a8p.STRING;
        rjh rjhVar9 = new rjh("STRING", 8, 8, 1, a8pVar6);
        a8p a8pVar7 = a8p.MESSAGE;
        rjh rjhVar10 = new rjh("MESSAGE", 9, 9, 1, a8pVar7);
        a8p a8pVar8 = a8p.BYTE_STRING;
        rjh rjhVar11 = new rjh("BYTES", 10, 10, 1, a8pVar8);
        rjh rjhVar12 = new rjh("UINT32", 11, 11, 1, a8pVar4);
        a8p a8pVar9 = a8p.ENUM;
        rjh rjhVar13 = new rjh("ENUM", 12, 12, 1, a8pVar9);
        rjh rjhVar14 = new rjh("SFIXED32", 13, 13, 1, a8pVar4);
        rjh rjhVar15 = new rjh("SFIXED64", 14, 14, 1, a8pVar3);
        rjh rjhVar16 = new rjh("SINT32", 15, 15, 1, a8pVar4);
        rjh rjhVar17 = new rjh("SINT64", 16, 16, 1, a8pVar3);
        rjh rjhVar18 = new rjh("GROUP", 17, 17, 1, a8pVar7);
        rjh rjhVar19 = new rjh("DOUBLE_LIST", 18, 18, 2, a8pVar);
        rjh rjhVar20 = new rjh("FLOAT_LIST", 19, 19, 2, a8pVar2);
        rjh rjhVar21 = new rjh("INT64_LIST", 20, 20, 2, a8pVar3);
        rjh rjhVar22 = new rjh("UINT64_LIST", 21, 21, 2, a8pVar3);
        rjh rjhVar23 = new rjh("INT32_LIST", 22, 22, 2, a8pVar4);
        rjh rjhVar24 = new rjh("FIXED64_LIST", 23, 23, 2, a8pVar3);
        rjh rjhVar25 = new rjh("FIXED32_LIST", 24, 24, 2, a8pVar4);
        rjh rjhVar26 = new rjh("BOOL_LIST", 25, 25, 2, a8pVar5);
        rjh rjhVar27 = new rjh("STRING_LIST", 26, 26, 2, a8pVar6);
        rjh rjhVar28 = new rjh("MESSAGE_LIST", 27, 27, 2, a8pVar7);
        rjh rjhVar29 = new rjh("BYTES_LIST", 28, 28, 2, a8pVar8);
        rjh rjhVar30 = new rjh("UINT32_LIST", 29, 29, 2, a8pVar4);
        rjh rjhVar31 = new rjh("ENUM_LIST", 30, 30, 2, a8pVar9);
        rjh rjhVar32 = new rjh("SFIXED32_LIST", 31, 31, 2, a8pVar4);
        rjh rjhVar33 = new rjh("SFIXED64_LIST", 32, 32, 2, a8pVar3);
        rjh rjhVar34 = new rjh("SINT32_LIST", 33, 33, 2, a8pVar4);
        rjh rjhVar35 = new rjh("SINT64_LIST", 34, 34, 2, a8pVar3);
        rjh rjhVar36 = new rjh("DOUBLE_LIST_PACKED", 35, 35, 3, a8pVar);
        b = rjhVar36;
        rjh rjhVar37 = new rjh("FLOAT_LIST_PACKED", 36, 36, 3, a8pVar2);
        rjh rjhVar38 = new rjh("INT64_LIST_PACKED", 37, 37, 3, a8pVar3);
        rjh rjhVar39 = new rjh("UINT64_LIST_PACKED", 38, 38, 3, a8pVar3);
        rjh rjhVar40 = new rjh("INT32_LIST_PACKED", 39, 39, 3, a8pVar4);
        rjh rjhVar41 = new rjh("FIXED64_LIST_PACKED", 40, 40, 3, a8pVar3);
        rjh rjhVar42 = new rjh("FIXED32_LIST_PACKED", 41, 41, 3, a8pVar4);
        rjh rjhVar43 = new rjh("BOOL_LIST_PACKED", 42, 42, 3, a8pVar5);
        rjh rjhVar44 = new rjh("UINT32_LIST_PACKED", 43, 43, 3, a8pVar4);
        rjh rjhVar45 = new rjh("ENUM_LIST_PACKED", 44, 44, 3, a8pVar9);
        rjh rjhVar46 = new rjh("SFIXED32_LIST_PACKED", 45, 45, 3, a8pVar4);
        rjh rjhVar47 = new rjh("SFIXED64_LIST_PACKED", 46, 46, 3, a8pVar3);
        rjh rjhVar48 = new rjh("SINT32_LIST_PACKED", 47, 47, 3, a8pVar4);
        rjh rjhVar49 = new rjh("SINT64_LIST_PACKED", 48, 48, 3, a8pVar3);
        c = rjhVar49;
        e = new rjh[]{rjhVar, rjhVar2, rjhVar3, rjhVar4, rjhVar5, rjhVar6, rjhVar7, rjhVar8, rjhVar9, rjhVar10, rjhVar11, rjhVar12, rjhVar13, rjhVar14, rjhVar15, rjhVar16, rjhVar17, rjhVar18, rjhVar19, rjhVar20, rjhVar21, rjhVar22, rjhVar23, rjhVar24, rjhVar25, rjhVar26, rjhVar27, rjhVar28, rjhVar29, rjhVar30, rjhVar31, rjhVar32, rjhVar33, rjhVar34, rjhVar35, rjhVar36, rjhVar37, rjhVar38, rjhVar39, rjhVar40, rjhVar41, rjhVar42, rjhVar43, rjhVar44, rjhVar45, rjhVar46, rjhVar47, rjhVar48, rjhVar49, new rjh("GROUP_LIST", 49, 49, 2, a8pVar7), new rjh("MAP", 50, 50, 4, a8p.VOID)};
        rjh[] rjhVarArrValues = values();
        d = new rjh[rjhVarArrValues.length];
        for (rjh rjhVar50 : rjhVarArrValues) {
            d[rjhVar50.a] = rjhVar50;
        }
    }

    public rjh(String str, int i, int i2, int i3, a8p a8pVar) {
        super(str, i);
        this.a = i2;
        int iB = pjh.b(i3);
        if (iB == 1 || iB == 3) {
            Class<?> cls = a8pVar.a;
        }
        if (i3 == 1) {
            a8pVar.ordinal();
        }
    }

    public static rjh valueOf(String str) {
        return (rjh) Enum.valueOf(rjh.class, str);
    }

    public static rjh[] values() {
        return (rjh[]) e.clone();
    }
}
