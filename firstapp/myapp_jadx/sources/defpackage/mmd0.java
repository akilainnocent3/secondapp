package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mmd0 {
    public static final mmd0 a;
    public static final mmd0 b;
    public static final mmd0 c;
    public static final mmd0 d;
    public static final mmd0 e;
    public static final mmd0 f;
    public static final mmd0 i;
    public static final mmd0 v;
    public static final mmd0 w;
    public static final mmd0 y;
    public static final /* synthetic */ mmd0[] z;

    /* JADX INFO: Fake field, exist only in values array */
    mmd0 EF0;

    static {
        mmd0 mmd0Var = new mmd0("NONE", 0);
        mmd0 mmd0Var2 = new mmd0("GAME_INITIALISED_STARTED", 1);
        a = mmd0Var2;
        mmd0 mmd0Var3 = new mmd0("START_CLICKED", 2);
        b = mmd0Var3;
        mmd0 mmd0Var4 = new mmd0("STACK_CLICKED", 3);
        c = mmd0Var4;
        mmd0 mmd0Var5 = new mmd0("PRIZE_READY_TO_CLAIM", 4);
        d = mmd0Var5;
        mmd0 mmd0Var6 = new mmd0("PRIZE_ADDED", 5);
        mmd0 mmd0Var7 = new mmd0("STACKERS_MOVING", 6);
        mmd0 mmd0Var8 = new mmd0("FAIL_STACK", 7);
        e = mmd0Var8;
        mmd0 mmd0Var9 = new mmd0("PARTIAL_STACK", 8);
        mmd0 mmd0Var10 = new mmd0("PERFECT_STACK", 9);
        f = mmd0Var10;
        mmd0 mmd0Var11 = new mmd0("ROUND_IN_PROGRESS", 10);
        i = mmd0Var11;
        mmd0 mmd0Var12 = new mmd0("GAME_OVER", 11);
        v = mmd0Var12;
        mmd0 mmd0Var13 = new mmd0("GAME_WON_PARTIALLY", 12);
        w = mmd0Var13;
        mmd0 mmd0Var14 = new mmd0("GAME_WON_COMPLETELY", 13);
        y = mmd0Var14;
        z = new mmd0[]{mmd0Var, mmd0Var2, mmd0Var3, mmd0Var4, mmd0Var5, mmd0Var6, mmd0Var7, mmd0Var8, mmd0Var9, mmd0Var10, mmd0Var11, mmd0Var12, mmd0Var13, mmd0Var14};
    }

    public mmd0() {
        throw null;
    }

    public static mmd0 valueOf(String str) {
        return (mmd0) Enum.valueOf(mmd0.class, str);
    }

    public static mmd0[] values() {
        return (mmd0[]) z.clone();
    }
}
