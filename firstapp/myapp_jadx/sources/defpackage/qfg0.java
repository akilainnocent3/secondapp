package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qfg0 {
    public static final qfg0 a;
    public static final qfg0 b;
    public static final /* synthetic */ qfg0[] c;
    public static final /* synthetic */ uag d;

    static {
        qfg0 qfg0Var = new qfg0("Groups", 0);
        a = qfg0Var;
        qfg0 qfg0Var2 = new qfg0("Knockout", 1);
        b = qfg0Var2;
        qfg0[] qfg0VarArr = {qfg0Var, qfg0Var2};
        c = qfg0VarArr;
        d = new uag(qfg0VarArr);
    }

    public qfg0() {
        throw null;
    }

    public static qfg0 valueOf(String str) {
        return (qfg0) Enum.valueOf(qfg0.class, str);
    }

    public static qfg0[] values() {
        return (qfg0[]) c.clone();
    }
}
