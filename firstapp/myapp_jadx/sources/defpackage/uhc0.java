package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class uhc0 {
    public static final uhc0 a;
    public static final uhc0 b;
    public static final /* synthetic */ uhc0[] c;

    static {
        uhc0 uhc0Var = new uhc0("TEAM_SELECTION", 0);
        a = uhc0Var;
        uhc0 uhc0Var2 = new uhc0("EVENT", 1);
        b = uhc0Var2;
        c = new uhc0[]{uhc0Var, uhc0Var2};
    }

    public uhc0() {
        throw null;
    }

    public static uhc0 valueOf(String str) {
        return (uhc0) Enum.valueOf(uhc0.class, str);
    }

    public static uhc0[] values() {
        return (uhc0[]) c.clone();
    }
}
