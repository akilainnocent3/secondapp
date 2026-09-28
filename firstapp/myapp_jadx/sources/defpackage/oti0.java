package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class oti0 {
    public static final oti0 c;
    public static final oti0 d;
    public static final /* synthetic */ oti0[] e;
    public static final /* synthetic */ uag f;
    public final String a;
    public final CMSRes b;

    static {
        eyi0 eyi0Var = eyi0.v0;
        oti0 oti0Var = new oti0("LOW", 0, "low", eyi0Var.P);
        c = oti0Var;
        oti0 oti0Var2 = new oti0("MEDIUM", 1, "medium", eyi0Var.Q);
        d = oti0Var2;
        oti0[] oti0VarArr = {oti0Var, oti0Var2, new oti0("HIGH", 2, "high", eyi0Var.R)};
        e = oti0VarArr;
        f = new uag(oti0VarArr);
    }

    public oti0(String str, int i, String str2, CMSRes cMSRes) {
        super(str, i);
        this.a = str2;
        this.b = cMSRes;
    }

    public static oti0 valueOf(String str) {
        return (oti0) Enum.valueOf(oti0.class, str);
    }

    public static oti0[] values() {
        return (oti0[]) e.clone();
    }
}
