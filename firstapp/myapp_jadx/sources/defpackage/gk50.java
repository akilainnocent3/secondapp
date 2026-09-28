package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class gk50 {
    public static final gk50 a;
    public static final /* synthetic */ gk50[] b;

    static {
        gk50 gk50Var = new gk50("Ok", 0);
        a = gk50Var;
        b = new gk50[]{gk50Var, new gk50("Error", 1), new gk50("Cancel", 2)};
    }

    public gk50() {
        throw null;
    }

    public static gk50 valueOf(String str) {
        return (gk50) Enum.valueOf(gk50.class, str);
    }

    public static gk50[] values() {
        return (gk50[]) b.clone();
    }
}
