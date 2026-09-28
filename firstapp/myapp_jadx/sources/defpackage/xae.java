package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xae {
    public static final xae A;
    public static final xae B;
    public static final xae C;
    public static final xae D;
    public static final /* synthetic */ xae[] E;
    public static final xae a;
    public static final xae b;
    public static final xae c;
    public static final xae d;
    public static final xae e;
    public static final xae f;
    public static final xae i;
    public static final xae v;
    public static final xae w;
    public static final xae y;
    public static final xae z;

    static {
        xae xaeVar = new xae("Login", 0);
        a = xaeVar;
        xae xaeVar2 = new xae("Register", 1);
        b = xaeVar2;
        xae xaeVar3 = new xae("Deposit", 2);
        c = xaeVar3;
        xae xaeVar4 = new xae("Transaction", 3);
        d = xaeVar4;
        xae xaeVar5 = new xae("Withdraw", 4);
        e = xaeVar5;
        xae xaeVar6 = new xae("Limits", 5);
        f = xaeVar6;
        xae xaeVar7 = new xae("Me", 6);
        i = xaeVar7;
        xae xaeVar8 = new xae("SportyRoulette", 7);
        xae xaeVar9 = new xae("SportySoccer", 8);
        xae xaeVar10 = new xae("LiveCasino", 9);
        v = xaeVar10;
        xae xaeVar11 = new xae("InstantVirtual", 10);
        w = xaeVar11;
        xae xaeVar12 = new xae("SportyBingo", 11);
        y = xaeVar12;
        xae xaeVar13 = new xae("SportyWebGame", 12);
        z = xaeVar13;
        xae xaeVar14 = new xae("ScheduledVirtual", 13);
        A = xaeVar14;
        xae xaeVar15 = new xae("GoldenVirtual", 14);
        B = xaeVar15;
        xae xaeVar16 = new xae("CustomerService", 15);
        C = xaeVar16;
        xae xaeVar17 = new xae("InstallationError", 16);
        D = xaeVar17;
        E = new xae[]{xaeVar, xaeVar2, xaeVar3, xaeVar4, xaeVar5, xaeVar6, xaeVar7, xaeVar8, xaeVar9, xaeVar10, xaeVar11, xaeVar12, xaeVar13, xaeVar14, xaeVar15, xaeVar16, xaeVar17};
    }

    public xae() {
        throw null;
    }

    public static xae valueOf(String str) {
        return (xae) Enum.valueOf(xae.class, str);
    }

    public static xae[] values() {
        return (xae[]) E.clone();
    }
}
