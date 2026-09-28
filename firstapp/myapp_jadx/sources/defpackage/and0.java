package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class and0 {
    public static final /* synthetic */ and0[] A;
    public static final and0 a;
    public static final and0 b;
    public static final and0 c;
    public static final and0 d;
    public static final and0 e;
    public static final and0 f;
    public static final and0 i;
    public static final and0 v;
    public static final and0 w;
    public static final and0 y;
    public static final and0 z;

    static {
        and0 and0Var = new and0("NONE", 0);
        a = and0Var;
        and0 and0Var2 = new and0("GAME_INITIALISED_STARTED", 1);
        b = and0Var2;
        and0 and0Var3 = new and0("ROUND_IN_PROGRESS", 2);
        c = and0Var3;
        and0 and0Var4 = new and0("GAME_OVER", 3);
        d = and0Var4;
        and0 and0Var5 = new and0("GAME_WON_COMPLETELY", 4);
        e = and0Var5;
        and0 and0Var6 = new and0("GAME_WON_PARTIALLY", 5);
        f = and0Var6;
        and0 and0Var7 = new and0("LOCKED", 6);
        i = and0Var7;
        and0 and0Var8 = new and0("PERFECT_STACK", 7);
        v = and0Var8;
        and0 and0Var9 = new and0("PRIZE_READY_TO_CLAIM", 8);
        w = and0Var9;
        and0 and0Var10 = new and0("START_CLICKED", 9);
        y = and0Var10;
        and0 and0Var11 = new and0("STACK_CLICKED", 10);
        z = and0Var11;
        A = new and0[]{and0Var, and0Var2, and0Var3, and0Var4, and0Var5, and0Var6, and0Var7, and0Var8, and0Var9, and0Var10, and0Var11};
    }

    public and0() {
        throw null;
    }

    public static and0 valueOf(String str) {
        return (and0) Enum.valueOf(and0.class, str);
    }

    public static and0[] values() {
        return (and0[]) A.clone();
    }
}
