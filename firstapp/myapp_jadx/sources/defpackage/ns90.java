package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ns90 {
    public static final ns90 a;
    public static final ns90 b;
    public static final /* synthetic */ ns90[] c;

    static {
        ns90 ns90Var = new ns90("ONE_UP", 0);
        a = ns90Var;
        ns90 ns90Var2 = new ns90("TWO_UP", 1);
        b = ns90Var2;
        c = new ns90[]{ns90Var, ns90Var2};
    }

    public ns90() {
        throw null;
    }

    public static ns90 valueOf(String str) {
        return (ns90) Enum.valueOf(ns90.class, str);
    }

    public static ns90[] values() {
        return (ns90[]) c.clone();
    }
}
