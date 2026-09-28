package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class tnd0 {
    public static final tnd0 a;
    public static final tnd0 b;
    public static final /* synthetic */ tnd0[] c;

    static {
        tnd0 tnd0Var = new tnd0("SOUND", 0);
        a = tnd0Var;
        tnd0 tnd0Var2 = new tnd0("HOW_TO_PLAY", 1);
        b = tnd0Var2;
        c = new tnd0[]{tnd0Var, tnd0Var2};
    }

    public tnd0() {
        throw null;
    }

    public static tnd0 valueOf(String str) {
        return (tnd0) Enum.valueOf(tnd0.class, str);
    }

    public static tnd0[] values() {
        return (tnd0[]) c.clone();
    }
}
