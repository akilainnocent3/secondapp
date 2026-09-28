package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i590 {
    public static final i590 a;
    public static final i590 b;
    public static final /* synthetic */ i590[] c;

    static {
        i590 i590Var = new i590("Collapsed", 0);
        a = i590Var;
        i590 i590Var2 = new i590("Expanded", 1);
        b = i590Var2;
        c = new i590[]{i590Var, i590Var2};
    }

    public i590() {
        throw null;
    }

    public static i590 valueOf(String str) {
        return (i590) Enum.valueOf(i590.class, str);
    }

    public static i590[] values() {
        return (i590[]) c.clone();
    }
}
