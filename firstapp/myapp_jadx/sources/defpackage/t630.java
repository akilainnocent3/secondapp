package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t630 {
    public static final t630 a;
    public static final t630 b;
    public static final t630 c;
    public static final /* synthetic */ t630[] d;

    static {
        t630 t630Var = new t630("PROTO2", 0);
        a = t630Var;
        t630 t630Var2 = new t630("PROTO3", 1);
        b = t630Var2;
        t630 t630Var3 = new t630("EDITIONS", 2);
        c = t630Var3;
        d = new t630[]{t630Var, t630Var2, t630Var3};
    }

    public t630() {
        throw null;
    }

    public static t630 valueOf(String str) {
        return (t630) Enum.valueOf(t630.class, str);
    }

    public static t630[] values() {
        return (t630[]) d.clone();
    }
}
