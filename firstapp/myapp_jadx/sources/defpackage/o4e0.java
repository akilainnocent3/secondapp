package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o4e0 {
    public static final o4e0 a;
    public static final o4e0 b;
    public static final o4e0 c;
    public static final o4e0 d;
    public static final o4e0 e;
    public static final /* synthetic */ o4e0[] f;

    static {
        o4e0 o4e0Var = new o4e0("Streak", 0);
        a = o4e0Var;
        o4e0 o4e0Var2 = new o4e0("StreakBreak", 1);
        b = o4e0Var2;
        o4e0 o4e0Var3 = new o4e0("EventOfTheDay", 2);
        c = o4e0Var3;
        o4e0 o4e0Var4 = new o4e0("UpcomingDay", 3);
        d = o4e0Var4;
        o4e0 o4e0Var5 = new o4e0("RepairedDay", 4);
        e = o4e0Var5;
        f = new o4e0[]{o4e0Var, o4e0Var2, o4e0Var3, o4e0Var4, o4e0Var5};
    }

    public o4e0() {
        throw null;
    }

    public static o4e0 valueOf(String str) {
        return (o4e0) Enum.valueOf(o4e0.class, str);
    }

    public static o4e0[] values() {
        return (o4e0[]) f.clone();
    }
}
