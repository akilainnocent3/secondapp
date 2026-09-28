package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class m040 {
    public static final m040 a;
    public static final m040 b;
    public static final /* synthetic */ m040[] c;

    static {
        m040 m040Var = new m040("Up", 0);
        a = m040Var;
        m040 m040Var2 = new m040("Down", 1);
        b = m040Var2;
        c = new m040[]{m040Var, m040Var2};
    }

    public m040() {
        throw null;
    }

    public static m040 valueOf(String str) {
        return (m040) Enum.valueOf(m040.class, str);
    }

    public static m040[] values() {
        return (m040[]) c.clone();
    }
}
