package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class vt4 {
    public static final vt4 a;
    public static final vt4 b;
    public static final vt4 c;
    public static final vt4 d;
    public static final /* synthetic */ vt4[] e;

    static {
        vt4 vt4Var = new vt4("LOCKED", 0);
        a = vt4Var;
        vt4 vt4Var2 = new vt4("COMING_SOON", 1);
        b = vt4Var2;
        vt4 vt4Var3 = new vt4("AVAILABLE", 2);
        c = vt4Var3;
        vt4 vt4Var4 = new vt4("CONTINUE", 3);
        d = vt4Var4;
        e = new vt4[]{vt4Var, vt4Var2, vt4Var3, vt4Var4};
    }

    public vt4() {
        throw null;
    }

    public static vt4 valueOf(String str) {
        return (vt4) Enum.valueOf(vt4.class, str);
    }

    public static vt4[] values() {
        return (vt4[]) e.clone();
    }
}
