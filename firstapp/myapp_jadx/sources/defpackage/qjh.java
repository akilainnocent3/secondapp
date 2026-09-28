package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;

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
public final class qjh {
    public static final qjh b;
    public static final qjh c;
    public static final qjh[] d;
    public static final /* synthetic */ qjh[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    qjh EF0;

    public qjh(String str, int i, int i2, int i3, z7p z7pVar) {
        super(str, i);
        this.a = i2;
        int iB = pjh.b(i3);
        if (iB == 1 || iB == 3) {
            Class<?> cls = z7pVar.a;
        }
        if (i3 == 1) {
            z7pVar.ordinal();
        }
    }

    public static qjh valueOf(String str) {
        return (qjh) Enum.valueOf(qjh.class, str);
    }

    public static qjh[] values() {
        return (qjh[]) e.clone();
    }

    static {
        z7p z7pVar = z7p.DOUBLE;
        qjh qjhVar = new qjh("DOUBLE", 0, 0, 1, z7pVar);
        z7p z7pVar2 = z7p.FLOAT;
        qjh qjhVar2 = new qjh("FLOAT", 1, 1, 1, z7pVar2);
        z7p z7pVar3 = z7p.LONG;
        qjh qjhVar3 = new qjh("INT64", 2, 2, 1, z7pVar3);
        qjh qjhVar4 = new qjh("UINT64", 3, 3, 1, z7pVar3);
        z7p z7pVar4 = z7p.INT;
        qjh qjhVar5 = new qjh("INT32", 4, 4, 1, z7pVar4);
        qjh qjhVar6 = new qjh("FIXED64", 5, 5, 1, z7pVar3);
        qjh qjhVar7 = new qjh("FIXED32", 6, 6, 1, z7pVar4);
        z7p z7pVar5 = z7p.BOOLEAN;
        qjh qjhVar8 = new qjh("BOOL", 7, 7, 1, z7pVar5);
        z7p z7pVar6 = z7p.STRING;
        qjh qjhVar9 = new qjh("STRING", 8, 8, 1, z7pVar6);
        z7p z7pVar7 = z7p.MESSAGE;
        qjh qjhVar10 = new qjh("MESSAGE", 9, 9, 1, z7pVar7);
        z7p z7pVar8 = z7p.BYTE_STRING;
        qjh qjhVar11 = new qjh("BYTES", 10, 10, 1, z7pVar8);
        qjh qjhVar12 = new qjh("UINT32", 11, 11, 1, z7pVar4);
        z7p z7pVar9 = z7p.ENUM;
        qjh qjhVar13 = new qjh("ENUM", 12, 12, 1, z7pVar9);
        qjh qjhVar14 = new qjh("SFIXED32", 13, 13, 1, z7pVar4);
        qjh qjhVar15 = new qjh(LGxrN.WxhWfNrihtkq, 14, 14, 1, z7pVar3);
        qjh qjhVar16 = new qjh("SINT32", 15, 15, 1, z7pVar4);
        qjh qjhVar17 = new qjh("SINT64", 16, 16, 1, z7pVar3);
        qjh qjhVar18 = new qjh("GROUP", 17, 17, 1, z7pVar7);
        qjh qjhVar19 = new qjh("DOUBLE_LIST", 18, 18, 2, z7pVar);
        qjh qjhVar20 = new qjh("FLOAT_LIST", 19, 19, 2, z7pVar2);
        qjh qjhVar21 = new qjh("INT64_LIST", 20, 20, 2, z7pVar3);
        qjh qjhVar22 = new qjh("UINT64_LIST", 21, 21, 2, z7pVar3);
        qjh qjhVar23 = new qjh("INT32_LIST", 22, 22, 2, z7pVar4);
        qjh qjhVar24 = new qjh("FIXED64_LIST", 23, 23, 2, z7pVar3);
        qjh qjhVar25 = new qjh("FIXED32_LIST", 24, 24, 2, z7pVar4);
        qjh qjhVar26 = new qjh("BOOL_LIST", 25, 25, 2, z7pVar5);
        qjh qjhVar27 = new qjh("STRING_LIST", 26, 26, 2, z7pVar6);
        qjh qjhVar28 = new qjh("MESSAGE_LIST", 27, 27, 2, z7pVar7);
        qjh qjhVar29 = new qjh("BYTES_LIST", 28, 28, 2, z7pVar8);
        qjh qjhVar30 = new qjh("UINT32_LIST", 29, 29, 2, z7pVar4);
        qjh qjhVar31 = new qjh("ENUM_LIST", 30, 30, 2, z7pVar9);
        qjh qjhVar32 = new qjh("SFIXED32_LIST", 31, 31, 2, z7pVar4);
        qjh qjhVar33 = new qjh("SFIXED64_LIST", 32, 32, 2, z7pVar3);
        qjh qjhVar34 = new qjh("SINT32_LIST", 33, 33, 2, z7pVar4);
        qjh qjhVar35 = new qjh("SINT64_LIST", 34, 34, 2, z7pVar3);
        qjh qjhVar36 = new qjh(yFmFZvuWxAYfEj.aMicyoFUi, 35, 35, 3, z7pVar);
        b = qjhVar36;
        qjh qjhVar37 = new qjh("FLOAT_LIST_PACKED", 36, 36, 3, z7pVar2);
        qjh qjhVar38 = new qjh("INT64_LIST_PACKED", 37, 37, 3, z7pVar3);
        qjh qjhVar39 = new qjh("UINT64_LIST_PACKED", 38, 38, 3, z7pVar3);
        qjh qjhVar40 = new qjh("INT32_LIST_PACKED", 39, 39, 3, z7pVar4);
        qjh qjhVar41 = new qjh("FIXED64_LIST_PACKED", 40, 40, 3, z7pVar3);
        qjh qjhVar42 = new qjh("FIXED32_LIST_PACKED", 41, 41, 3, z7pVar4);
        qjh qjhVar43 = new qjh("BOOL_LIST_PACKED", 42, 42, 3, z7pVar5);
        qjh qjhVar44 = new qjh("UINT32_LIST_PACKED", 43, 43, 3, z7pVar4);
        qjh qjhVar45 = new qjh("ENUM_LIST_PACKED", 44, 44, 3, z7pVar9);
        qjh qjhVar46 = new qjh("SFIXED32_LIST_PACKED", 45, 45, 3, z7pVar4);
        qjh qjhVar47 = new qjh("SFIXED64_LIST_PACKED", 46, 46, 3, z7pVar3);
        qjh qjhVar48 = new qjh("SINT32_LIST_PACKED", 47, 47, 3, z7pVar4);
        qjh qjhVar49 = new qjh("SINT64_LIST_PACKED", 48, 48, 3, z7pVar3);
        c = qjhVar49;
        e = new qjh[]{qjhVar, qjhVar2, qjhVar3, qjhVar4, qjhVar5, qjhVar6, qjhVar7, qjhVar8, qjhVar9, qjhVar10, qjhVar11, qjhVar12, qjhVar13, qjhVar14, qjhVar15, qjhVar16, qjhVar17, qjhVar18, qjhVar19, qjhVar20, qjhVar21, qjhVar22, qjhVar23, qjhVar24, qjhVar25, qjhVar26, qjhVar27, qjhVar28, qjhVar29, qjhVar30, qjhVar31, qjhVar32, qjhVar33, qjhVar34, qjhVar35, qjhVar36, qjhVar37, qjhVar38, qjhVar39, qjhVar40, qjhVar41, qjhVar42, qjhVar43, qjhVar44, qjhVar45, qjhVar46, qjhVar47, qjhVar48, qjhVar49, new qjh("GROUP_LIST", 49, 49, 2, z7pVar7), new qjh("MAP", 50, 50, 4, z7p.VOID)};
        qjh[] qjhVarArrValues = values();
        d = new qjh[qjhVarArrValues.length];
        for (qjh qjhVar50 : qjhVarArrValues) {
            d[qjhVar50.a] = qjhVar50;
        }
    }
}
