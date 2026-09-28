package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class vyi0 {
    public static final vyi0 a;
    public static final vyi0 b;
    public static final vyi0 c;
    public static final /* synthetic */ vyi0[] d;

    static {
        vyi0 vyi0Var = new vyi0("CLOSED", 0);
        a = vyi0Var;
        vyi0 vyi0Var2 = new vyi0("OPENED", 1);
        b = vyi0Var2;
        vyi0 vyi0Var3 = new vyi0("ERROR", 2);
        c = vyi0Var3;
        d = new vyi0[]{vyi0Var, vyi0Var2, vyi0Var3};
    }

    public vyi0() {
        throw null;
    }

    public static vyi0 valueOf(String str) {
        return (vyi0) Enum.valueOf(vyi0.class, str);
    }

    public static vyi0[] values() {
        return (vyi0[]) d.clone();
    }
}
