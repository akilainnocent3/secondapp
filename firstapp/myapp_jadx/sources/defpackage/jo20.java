package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jo20 {
    public static final jo20 a;
    public static final /* synthetic */ jo20[] b;

    /* JADX INFO: Fake field, exist only in values array */
    jo20 EF0;

    static {
        jo20 jo20Var = new jo20("SRGB", 0);
        jo20 jo20Var2 = new jo20("DISPLAY_P3", 1);
        a = jo20Var2;
        b = new jo20[]{jo20Var, jo20Var2};
    }

    public jo20() {
        throw null;
    }

    public static jo20 valueOf(String str) {
        return (jo20) Enum.valueOf(jo20.class, str);
    }

    public static jo20[] values() {
        return (jo20[]) b.clone();
    }
}
