package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF9' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class yue0 {
    public static final /* synthetic */ yue0[] b;
    public static final /* synthetic */ uag c;
    public final CMSRes a;

    /* JADX INFO: Fake field, exist only in values array */
    yue0 EF9;

    static {
        vue0 vue0Var = vue0.X0;
        yue0[] yue0VarArr = {new yue0("FIRST", 0, vue0Var.b0), new yue0("SECOND", 1, vue0Var.c0)};
        b = yue0VarArr;
        c = new uag(yue0VarArr);
    }

    public yue0(String str, int i, CMSRes cMSRes) {
        super(str, i);
        this.a = cMSRes;
    }

    public static yue0 valueOf(String str) {
        return (yue0) Enum.valueOf(yue0.class, str);
    }

    public static yue0[] values() {
        return (yue0[]) b.clone();
    }
}
