package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bo90 {
    public static final bo90 a;
    public static final bo90 b;
    public static final /* synthetic */ bo90[] c;

    static {
        bo90 bo90Var = new bo90("EXPANDED", 0);
        a = bo90Var;
        bo90 bo90Var2 = new bo90("COLLAPSED", 1);
        b = bo90Var2;
        c = new bo90[]{bo90Var, bo90Var2};
    }

    public bo90() {
        throw null;
    }

    public static bo90 valueOf(String str) {
        return (bo90) Enum.valueOf(bo90.class, str);
    }

    public static bo90[] values() {
        return (bo90[]) c.clone();
    }

    public final boolean a() {
        return this == a;
    }
}
