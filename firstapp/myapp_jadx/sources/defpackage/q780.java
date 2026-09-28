package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q780 {
    public static final q780 a;
    public static final /* synthetic */ q780[] b;

    static {
        q780 q780Var = new q780("EditableText", 0);
        a = q780Var;
        b = new q780[]{q780Var, new q780("StaticText", 1)};
    }

    public q780() {
        throw null;
    }

    public static q780 valueOf(String str) {
        return (q780) Enum.valueOf(q780.class, str);
    }

    public static q780[] values() {
        return (q780[]) b.clone();
    }
}
