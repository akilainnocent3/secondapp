package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class tq30 {
    public static final tq30 d;
    public static final tq30 e;
    public static final /* synthetic */ tq30[] f;
    public static final /* synthetic */ uag i;
    public final String a;
    public final String b;
    public final CMSRes c;

    static {
        jn30 jn30Var = jn30.c0;
        CMSRes cMSRes = jn30Var.j;
        tq30 tq30Var = new tq30("RED", 0, "UP", "1", cMSRes);
        d = tq30Var;
        tq30 tq30Var2 = new tq30("YELLOW", 1, "DOWN", "2", jn30Var.k);
        e = tq30Var2;
        tq30[] tq30VarArr = {tq30Var, tq30Var2, new tq30("NO_FOUL", 2, "MIDDLE", "3", cMSRes)};
        f = tq30VarArr;
        i = new uag(tq30VarArr);
    }

    public tq30(String str, int i2, String str2, String str3, CMSRes cMSRes) {
        super(str, i2);
        this.a = str2;
        this.b = str3;
        this.c = cMSRes;
    }

    public static tq30 valueOf(String str) {
        return (tq30) Enum.valueOf(tq30.class, str);
    }

    public static tq30[] values() {
        return (tq30[]) f.clone();
    }
}
