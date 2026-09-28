package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yg4 {
    public static final yg4 a;
    public static final yg4 b;
    public static final /* synthetic */ yg4[] c;

    static {
        yg4 yg4Var = new yg4("FRONT", 0);
        a = yg4Var;
        yg4 yg4Var2 = new yg4("BACK", 1);
        b = yg4Var2;
        c = new yg4[]{yg4Var, yg4Var2};
    }

    public yg4() {
        throw null;
    }

    public static yg4 valueOf(String str) {
        return (yg4) Enum.valueOf(yg4.class, str);
    }

    public static yg4[] values() {
        return (yg4[]) c.clone();
    }
}
