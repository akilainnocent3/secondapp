package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class q27 {
    public static final q27 a;
    public static final q27 b;
    public static final q27 c;
    public static final /* synthetic */ q27[] d;

    static {
        q27 q27Var = new q27("Default", 0);
        a = q27Var;
        q27 q27Var2 = new q27("Swapping", 1);
        b = q27Var2;
        q27 q27Var3 = new q27("Swapped", 2);
        c = q27Var3;
        d = new q27[]{q27Var, q27Var2, q27Var3};
    }

    public q27() {
        throw null;
    }

    public static q27 valueOf(String str) {
        return (q27) Enum.valueOf(q27.class, str);
    }

    public static q27[] values() {
        return (q27[]) d.clone();
    }
}
