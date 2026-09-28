package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m8h0 {
    public static final m8h0 a;
    public static final m8h0 b;
    public static final /* synthetic */ m8h0[] c;

    static {
        m8h0 m8h0Var = new m8h0("COMPLETED", 0);
        a = m8h0Var;
        m8h0 m8h0Var2 = new m8h0("SUBMITTED", 1);
        b = m8h0Var2;
        c = new m8h0[]{m8h0Var, m8h0Var2};
    }

    public m8h0() {
        throw null;
    }

    public static m8h0 valueOf(String str) {
        return (m8h0) Enum.valueOf(m8h0.class, str);
    }

    public static m8h0[] values() {
        return (m8h0[]) c.clone();
    }
}
