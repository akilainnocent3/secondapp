package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fz90 {
    public static final fz90 a;
    public static final fz90 b;
    public static final /* synthetic */ fz90[] c;

    static {
        fz90 fz90Var = new fz90("THUMB", 0);
        a = fz90Var;
        fz90 fz90Var2 = new fz90("TRACK", 1);
        b = fz90Var2;
        c = new fz90[]{fz90Var, fz90Var2};
    }

    public fz90() {
        throw null;
    }

    public static fz90 valueOf(String str) {
        return (fz90) Enum.valueOf(fz90.class, str);
    }

    public static fz90[] values() {
        return (fz90[]) c.clone();
    }
}
