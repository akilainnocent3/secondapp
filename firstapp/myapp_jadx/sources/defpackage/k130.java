package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k130 {
    public static final k130 a;
    public static final k130 b;
    public static final k130 c;
    public static final k130 d;
    public static final /* synthetic */ k130[] e;

    static {
        k130 k130Var = new k130("FOR_YOU", 0);
        a = k130Var;
        k130 k130Var2 = new k130("BOOKING_CODES", 1);
        b = k130Var2;
        k130 k130Var3 = new k130("CODE_CHAT", 2);
        c = k130Var3;
        k130 k130Var4 = new k130("CUSTOM_CODES", 3);
        d = k130Var4;
        e = new k130[]{k130Var, k130Var2, k130Var3, k130Var4};
    }

    public k130() {
        throw null;
    }

    public static k130 valueOf(String str) {
        return (k130) Enum.valueOf(k130.class, str);
    }

    public static k130[] values() {
        return (k130[]) e.clone();
    }
}
