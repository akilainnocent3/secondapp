package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class fzg0 {
    public static final fzg0 a;
    public static final fzg0 b;
    public static final fzg0 c;
    public static final /* synthetic */ fzg0[] d;

    static {
        fzg0 fzg0Var = new fzg0("HIDE", 0);
        a = fzg0Var;
        fzg0 fzg0Var2 = new fzg0("DISPLAY_SWIPE_ACTION", 1);
        b = fzg0Var2;
        fzg0 fzg0Var3 = new fzg0("DISPLAY_TAP_ACTION", 2);
        c = fzg0Var3;
        d = new fzg0[]{fzg0Var, fzg0Var2, fzg0Var3};
    }

    public fzg0() {
        throw null;
    }

    public static fzg0 valueOf(String str) {
        return (fzg0) Enum.valueOf(fzg0.class, str);
    }

    public static fzg0[] values() {
        return (fzg0[]) d.clone();
    }
}
