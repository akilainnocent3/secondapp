package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class py90 {
    public static final py90 a;
    public static final py90 b;
    public static final py90 c;
    public static final /* synthetic */ py90[] d;

    static {
        py90 py90Var = new py90("Init", 0);
        a = py90Var;
        py90 py90Var2 = new py90("Loading", 1);
        b = py90Var2;
        py90 py90Var3 = new py90("Done", 2);
        c = py90Var3;
        d = new py90[]{py90Var, py90Var2, py90Var3};
    }

    public py90() {
        throw null;
    }

    public static py90 valueOf(String str) {
        return (py90) Enum.valueOf(py90.class, str);
    }

    public static py90[] values() {
        return (py90[]) d.clone();
    }
}
