package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qm2 {
    public static final qm2 a;
    public static final qm2 b;
    public static final /* synthetic */ qm2[] c;

    static {
        qm2 qm2Var = new qm2("RESULT", 0);
        a = qm2Var;
        qm2 qm2Var2 = new qm2("STATUS", 1);
        b = qm2Var2;
        c = new qm2[]{qm2Var, qm2Var2};
    }

    public qm2() {
        throw null;
    }

    public static qm2 valueOf(String str) {
        return (qm2) Enum.valueOf(qm2.class, str);
    }

    public static qm2[] values() {
        return (qm2[]) c.clone();
    }
}
