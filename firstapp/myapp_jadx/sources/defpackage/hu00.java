package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hu00 {
    public static final hu00 a;
    public static final hu00 b;
    public static final hu00 c;
    public static final hu00 d;
    public static final /* synthetic */ hu00[] e;

    static {
        hu00 hu00Var = new hu00("RED", 0);
        a = hu00Var;
        hu00 hu00Var2 = new hu00("GREEN", 1);
        b = hu00Var2;
        hu00 hu00Var3 = new hu00("BLUE", 2);
        c = hu00Var3;
        hu00 hu00Var4 = new hu00("ROBOTIC", 3);
        d = hu00Var4;
        e = new hu00[]{hu00Var, hu00Var2, hu00Var3, hu00Var4};
    }

    public hu00() {
        throw null;
    }

    public static hu00 valueOf(String str) {
        return (hu00) Enum.valueOf(hu00.class, str);
    }

    public static hu00[] values() {
        return (hu00[]) e.clone();
    }
}
