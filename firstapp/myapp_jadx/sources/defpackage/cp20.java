package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class cp20 {
    public static final cp20 a;
    public static final cp20 b;
    public static final cp20 c;
    public static final cp20 d;
    public static final /* synthetic */ cp20[] e;

    static {
        cp20 cp20Var = new cp20("WILD_WEST", 0);
        a = cp20Var;
        cp20 cp20Var2 = new cp20("JUNGLE", 1);
        b = cp20Var2;
        cp20 cp20Var3 = new cp20("ROBOTIC", 2);
        c = cp20Var3;
        cp20 cp20Var4 = new cp20("ASIAN", 3);
        d = cp20Var4;
        e = new cp20[]{cp20Var, cp20Var2, cp20Var3, cp20Var4};
    }

    public cp20() {
        throw null;
    }

    public static cp20 valueOf(String str) {
        return (cp20) Enum.valueOf(cp20.class, str);
    }

    public static cp20[] values() {
        return (cp20[]) e.clone();
    }
}
