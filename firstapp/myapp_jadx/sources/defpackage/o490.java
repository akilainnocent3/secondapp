package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class o490 {
    public static final o490 a;
    public static final o490 b;
    public static final o490 c;
    public static final /* synthetic */ o490[] d;

    static {
        o490 o490Var = new o490("START", 0);
        a = o490Var;
        o490 o490Var2 = new o490("STOP", 1);
        b = o490Var2;
        o490 o490Var3 = new o490("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = o490Var3;
        d = new o490[]{o490Var, o490Var2, o490Var3};
    }

    public o490() {
        throw null;
    }

    public static o490 valueOf(String str) {
        return (o490) Enum.valueOf(o490.class, str);
    }

    public static o490[] values() {
        return (o490[]) d.clone();
    }
}
