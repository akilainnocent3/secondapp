package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements j {
    public static final g0 BE;
    public static final g0 BEFORE_BE;
    public static final /* synthetic */ g0[] a;

    static {
        g0 g0Var = new g0("BEFORE_BE", 0);
        BEFORE_BE = g0Var;
        g0 g0Var2 = new g0("BE", 1);
        BE = g0Var2;
        a = new g0[]{g0Var, g0Var2};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
