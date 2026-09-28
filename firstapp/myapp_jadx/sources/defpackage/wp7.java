package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class wp7 {
    public static final wp7 a;
    public static final wp7 b;
    public static final /* synthetic */ wp7[] c;

    static {
        wp7 wp7Var = new wp7("NONE", 0);
        a = wp7Var;
        wp7 wp7Var2 = new wp7("ALL_JSON_OBJECTS", 1);
        wp7 wp7Var3 = new wp7("POLYMORPHIC", 2);
        b = wp7Var3;
        c = new wp7[]{wp7Var, wp7Var2, wp7Var3};
    }

    public wp7() {
        throw null;
    }

    public static wp7 valueOf(String str) {
        return (wp7) Enum.valueOf(wp7.class, str);
    }

    public static wp7[] values() {
        return (wp7[]) c.clone();
    }
}
