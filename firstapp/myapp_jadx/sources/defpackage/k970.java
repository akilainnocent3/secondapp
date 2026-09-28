package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF22' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class k970 {
    public static final a b;
    public static final /* synthetic */ k970[] c;
    public static final /* synthetic */ uag d;
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    k970 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    k970 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    k970 EF22;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
    }

    public k970(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static k970 valueOf(String str) {
        return (k970) Enum.valueOf(k970.class, str);
    }

    public static k970[] values() {
        return (k970[]) c.clone();
    }

    static {
        k970 k970Var = new k970("BET_OPEN", 0, "BET_OPEN");
        k970 k970Var2 = new k970("BET_CLOSE", 1, "BET_CLOSE");
        String str = siPCzPFw.ODEC;
        k970[] k970VarArr = {k970Var, k970Var2, new k970(str, 2, str), new k970("FINISHED", 3, "FINISHED"), new k970("VOID", 4, "VOID")};
        c = k970VarArr;
        d = new uag(k970VarArr);
        b = new a();
    }
}
