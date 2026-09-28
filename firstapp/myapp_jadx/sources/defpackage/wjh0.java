package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wjh0 {
    public static final wjh0 a;
    public static final wjh0 b;
    public static final /* synthetic */ wjh0[] c;

    static {
        wjh0 wjh0Var = new wjh0("STATE_UPDATE_BEGIN", 0);
        a = wjh0Var;
        wjh0 wjh0Var2 = new wjh0("STATE_UPDATE_END", 1);
        b = wjh0Var2;
        c = new wjh0[]{wjh0Var, wjh0Var2};
    }

    public wjh0() {
        throw null;
    }

    public static wjh0 valueOf(String str) {
        return (wjh0) Enum.valueOf(wjh0.class, str);
    }

    public static wjh0[] values() {
        return (wjh0[]) c.clone();
    }
}
