package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wyi0 {
    public static final wyi0 a;
    public static final wyi0 b;
    public static final wyi0 c;
    public static final /* synthetic */ wyi0[] d;

    static {
        wyi0 wyi0Var = new wyi0("OPENED", 0);
        a = wyi0Var;
        wyi0 wyi0Var2 = new wyi0("CLOSED", 1);
        b = wyi0Var2;
        wyi0 wyi0Var3 = new wyi0("ERROR", 2);
        c = wyi0Var3;
        d = new wyi0[]{wyi0Var, wyi0Var2, wyi0Var3};
    }

    public wyi0() {
        throw null;
    }

    public static wyi0 valueOf(String str) {
        return (wyi0) Enum.valueOf(wyi0.class, str);
    }

    public static wyi0[] values() {
        return (wyi0[]) d.clone();
    }
}
