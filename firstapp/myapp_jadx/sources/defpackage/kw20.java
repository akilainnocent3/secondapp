package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kw20 {
    public static final kw20 a;
    public static final kw20 b;
    public static final kw20 c;
    public static final /* synthetic */ kw20[] d;

    static {
        kw20 kw20Var = new kw20("DEFAULT", 0);
        a = kw20Var;
        kw20 kw20Var2 = new kw20("VERY_LOW", 1);
        b = kw20Var2;
        kw20 kw20Var3 = new kw20("HIGHEST", 2);
        c = kw20Var3;
        d = new kw20[]{kw20Var, kw20Var2, kw20Var3};
    }

    public kw20() {
        throw null;
    }

    public static kw20 valueOf(String str) {
        return (kw20) Enum.valueOf(kw20.class, str);
    }

    public static kw20[] values() {
        return (kw20[]) d.clone();
    }
}
