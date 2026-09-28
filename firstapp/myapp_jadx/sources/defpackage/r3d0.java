package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r3d0 {
    public static final r3d0 a;
    public static final r3d0 b;
    public static final /* synthetic */ r3d0[] c;

    static {
        r3d0 r3d0Var = new r3d0("LEFT", 0);
        a = r3d0Var;
        r3d0 r3d0Var2 = new r3d0("RIGHT", 1);
        b = r3d0Var2;
        c = new r3d0[]{r3d0Var, r3d0Var2};
    }

    public r3d0() {
        throw null;
    }

    public static r3d0 valueOf(String str) {
        return (r3d0) Enum.valueOf(r3d0.class, str);
    }

    public static r3d0[] values() {
        return (r3d0[]) c.clone();
    }
}
