package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class m5d0 {
    public static final m5d0 a;
    public static final m5d0 b;
    public static final /* synthetic */ m5d0[] c;

    static {
        m5d0 m5d0Var = new m5d0("LEFT", 0);
        a = m5d0Var;
        m5d0 m5d0Var2 = new m5d0("RIGHT", 1);
        b = m5d0Var2;
        c = new m5d0[]{m5d0Var, m5d0Var2};
    }

    public m5d0() {
        throw null;
    }

    public static m5d0 valueOf(String str) {
        return (m5d0) Enum.valueOf(m5d0.class, str);
    }

    public static m5d0[] values() {
        return (m5d0[]) c.clone();
    }
}
