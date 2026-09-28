package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h6f {
    public static final h6f a;
    public static final /* synthetic */ h6f[] b;

    static {
        h6f h6fVar = new h6f("ONE_X_TWO", 0);
        a = h6fVar;
        b = new h6f[]{h6fVar};
    }

    public h6f() {
        throw null;
    }

    public static h6f valueOf(String str) {
        return (h6f) Enum.valueOf(h6f.class, str);
    }

    public static h6f[] values() {
        return (h6f[]) b.clone();
    }
}
