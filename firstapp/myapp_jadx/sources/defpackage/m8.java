package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m8 {
    public static final m8 a;
    public static final m8 b;
    public static final /* synthetic */ m8[] c;

    static {
        m8 m8Var = new m8("CLOSE_LOGIN_DIALOG", 0);
        a = m8Var;
        m8 m8Var2 = new m8("CLOSE_LOGIN_DIALOG_BACK_KEY", 1);
        b = m8Var2;
        c = new m8[]{m8Var, m8Var2};
    }

    public m8() {
        throw null;
    }

    public static m8 valueOf(String str) {
        return (m8) Enum.valueOf(m8.class, str);
    }

    public static m8[] values() {
        return (m8[]) c.clone();
    }
}
