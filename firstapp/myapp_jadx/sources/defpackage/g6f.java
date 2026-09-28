package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g6f {
    public static final g6f a;
    public static final /* synthetic */ g6f[] b;

    static {
        g6f g6fVar = new g6f("ONE_DOWN", 0);
        a = g6fVar;
        b = new g6f[]{g6fVar};
    }

    public g6f() {
        throw null;
    }

    public static g6f valueOf(String str) {
        return (g6f) Enum.valueOf(g6f.class, str);
    }

    public static g6f[] values() {
        return (g6f[]) b.clone();
    }
}
