package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;

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
public final class pgl0 {
    public static final pgl0 b;
    public static final pgl0 c;
    public static final pgl0[] d;
    public static final /* synthetic */ pgl0[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    pgl0 EF0;

    public pgl0(String str, int i, int i2, int i3, qil0 qil0Var) {
        super(str, i);
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = qil0Var.a;
        }
        if (i3 == 1) {
            qil0 qil0Var2 = qil0.VOID;
            qil0Var.ordinal();
        }
    }

    public static pgl0[] values() {
        return (pgl0[]) e.clone();
    }

    static {
        qil0 qil0Var = qil0.DOUBLE;
        pgl0 pgl0Var = new pgl0("DOUBLE", 0, 0, 1, qil0Var);
        qil0 qil0Var2 = qil0.FLOAT;
        pgl0 pgl0Var2 = new pgl0("FLOAT", 1, 1, 1, qil0Var2);
        qil0 qil0Var3 = qil0.LONG;
        pgl0 pgl0Var3 = new pgl0("INT64", 2, 2, 1, qil0Var3);
        pgl0 pgl0Var4 = new pgl0("UINT64", 3, 3, 1, qil0Var3);
        qil0 qil0Var4 = qil0.INT;
        pgl0 pgl0Var5 = new pgl0("INT32", 4, 4, 1, qil0Var4);
        pgl0 pgl0Var6 = new pgl0("FIXED64", 5, 5, 1, qil0Var3);
        pgl0 pgl0Var7 = new pgl0("FIXED32", 6, 6, 1, qil0Var4);
        qil0 qil0Var5 = qil0.BOOLEAN;
        pgl0 pgl0Var8 = new pgl0("BOOL", 7, 7, 1, qil0Var5);
        qil0 qil0Var6 = qil0.STRING;
        pgl0 pgl0Var9 = new pgl0("STRING", 8, 8, 1, qil0Var6);
        qil0 qil0Var7 = qil0.MESSAGE;
        pgl0 pgl0Var10 = new pgl0("MESSAGE", 9, 9, 1, qil0Var7);
        qil0 qil0Var8 = qil0.BYTE_STRING;
        pgl0 pgl0Var11 = new pgl0("BYTES", 10, 10, 1, qil0Var8);
        pgl0 pgl0Var12 = new pgl0("UINT32", 11, 11, 1, qil0Var4);
        qil0 qil0Var9 = qil0.ENUM;
        pgl0 pgl0Var13 = new pgl0("ENUM", 12, 12, 1, qil0Var9);
        pgl0 pgl0Var14 = new pgl0("SFIXED32", 13, 13, 1, qil0Var4);
        pgl0 pgl0Var15 = new pgl0("SFIXED64", 14, 14, 1, qil0Var3);
        pgl0 pgl0Var16 = new pgl0("SINT32", 15, 15, 1, qil0Var4);
        pgl0 pgl0Var17 = new pgl0("SINT64", 16, 16, 1, qil0Var3);
        pgl0 pgl0Var18 = new pgl0("GROUP", 17, 17, 1, qil0Var7);
        pgl0 pgl0Var19 = new pgl0("DOUBLE_LIST", 18, 18, 2, qil0Var);
        pgl0 pgl0Var20 = new pgl0("FLOAT_LIST", 19, 19, 2, qil0Var2);
        pgl0 pgl0Var21 = new pgl0("INT64_LIST", 20, 20, 2, qil0Var3);
        pgl0 pgl0Var22 = new pgl0("UINT64_LIST", 21, 21, 2, qil0Var3);
        pgl0 pgl0Var23 = new pgl0("INT32_LIST", 22, 22, 2, qil0Var4);
        pgl0 pgl0Var24 = new pgl0("FIXED64_LIST", 23, 23, 2, qil0Var3);
        pgl0 pgl0Var25 = new pgl0("FIXED32_LIST", 24, 24, 2, qil0Var4);
        pgl0 pgl0Var26 = new pgl0("BOOL_LIST", 25, 25, 2, qil0Var5);
        pgl0 pgl0Var27 = new pgl0("STRING_LIST", 26, 26, 2, qil0Var6);
        pgl0 pgl0Var28 = new pgl0("MESSAGE_LIST", 27, 27, 2, qil0Var7);
        pgl0 pgl0Var29 = new pgl0("BYTES_LIST", 28, 28, 2, qil0Var8);
        pgl0 pgl0Var30 = new pgl0("UINT32_LIST", 29, 29, 2, qil0Var4);
        pgl0 pgl0Var31 = new pgl0("ENUM_LIST", 30, 30, 2, qil0Var9);
        pgl0 pgl0Var32 = new pgl0("SFIXED32_LIST", 31, 31, 2, qil0Var4);
        pgl0 pgl0Var33 = new pgl0("SFIXED64_LIST", 32, 32, 2, qil0Var3);
        pgl0 pgl0Var34 = new pgl0(DZsoPoBl.EYobkWoyioe, 33, 33, 2, qil0Var4);
        pgl0 pgl0Var35 = new pgl0("SINT64_LIST", 34, 34, 2, qil0Var3);
        pgl0 pgl0Var36 = new pgl0("DOUBLE_LIST_PACKED", 35, 35, 3, qil0Var);
        b = pgl0Var36;
        pgl0 pgl0Var37 = new pgl0("FLOAT_LIST_PACKED", 36, 36, 3, qil0Var2);
        pgl0 pgl0Var38 = new pgl0("INT64_LIST_PACKED", 37, 37, 3, qil0Var3);
        pgl0 pgl0Var39 = new pgl0("UINT64_LIST_PACKED", 38, 38, 3, qil0Var3);
        pgl0 pgl0Var40 = new pgl0("INT32_LIST_PACKED", 39, 39, 3, qil0Var4);
        pgl0 pgl0Var41 = new pgl0("FIXED64_LIST_PACKED", 40, 40, 3, qil0Var3);
        pgl0 pgl0Var42 = new pgl0("FIXED32_LIST_PACKED", 41, 41, 3, qil0Var4);
        pgl0 pgl0Var43 = new pgl0("BOOL_LIST_PACKED", 42, 42, 3, qil0Var5);
        pgl0 pgl0Var44 = new pgl0("UINT32_LIST_PACKED", 43, 43, 3, qil0Var4);
        pgl0 pgl0Var45 = new pgl0("ENUM_LIST_PACKED", 44, 44, 3, qil0Var9);
        pgl0 pgl0Var46 = new pgl0("SFIXED32_LIST_PACKED", 45, 45, 3, qil0Var4);
        pgl0 pgl0Var47 = new pgl0(TEFcJcMqR.msU, 46, 46, 3, qil0Var3);
        pgl0 pgl0Var48 = new pgl0("SINT32_LIST_PACKED", 47, 47, 3, qil0Var4);
        pgl0 pgl0Var49 = new pgl0("SINT64_LIST_PACKED", 48, 48, 3, qil0Var3);
        c = pgl0Var49;
        e = new pgl0[]{pgl0Var, pgl0Var2, pgl0Var3, pgl0Var4, pgl0Var5, pgl0Var6, pgl0Var7, pgl0Var8, pgl0Var9, pgl0Var10, pgl0Var11, pgl0Var12, pgl0Var13, pgl0Var14, pgl0Var15, pgl0Var16, pgl0Var17, pgl0Var18, pgl0Var19, pgl0Var20, pgl0Var21, pgl0Var22, pgl0Var23, pgl0Var24, pgl0Var25, pgl0Var26, pgl0Var27, pgl0Var28, pgl0Var29, pgl0Var30, pgl0Var31, pgl0Var32, pgl0Var33, pgl0Var34, pgl0Var35, pgl0Var36, pgl0Var37, pgl0Var38, pgl0Var39, pgl0Var40, pgl0Var41, pgl0Var42, pgl0Var43, pgl0Var44, pgl0Var45, pgl0Var46, pgl0Var47, pgl0Var48, pgl0Var49, new pgl0("GROUP_LIST", 49, 49, 2, qil0Var7), new pgl0("MAP", 50, 50, 4, qil0.VOID)};
        pgl0[] pgl0VarArrValues = values();
        d = new pgl0[pgl0VarArrValues.length];
        for (pgl0 pgl0Var50 : pgl0VarArrValues) {
            d[pgl0Var50.a] = pgl0Var50;
        }
    }
}
