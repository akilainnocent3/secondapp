package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i790 {
    public static final i790 a;
    public static final i790 b;
    public static final i790 c;
    public static final /* synthetic */ i790[] d;

    static {
        i790 i790Var = new i790("HOT", 0);
        a = i790Var;
        i790 i790Var2 = new i790("NEW", 1);
        b = i790Var2;
        i790 i790Var3 = new i790("NORMAL", 2);
        c = i790Var3;
        d = new i790[]{i790Var, i790Var2, i790Var3};
    }

    public i790() {
        throw null;
    }

    public static i790 valueOf(String str) {
        return (i790) Enum.valueOf(i790.class, str);
    }

    public static i790[] values() {
        return (i790[]) d.clone();
    }
}
