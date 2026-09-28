package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mie0 {
    public static final mie0 a;
    public static final mie0 b;
    public static final mie0 c;
    public static final mie0 d;
    public static final mie0 e;
    public static final mie0 f;
    public static final mie0 i;
    public static final /* synthetic */ mie0[] v;

    static {
        mie0 mie0Var = new mie0("Home", 0);
        a = mie0Var;
        mie0 mie0Var2 = new mie0(AnalyticsParam.EVENT_PARAM_OPEN_BETS, 1);
        b = mie0Var2;
        mie0 mie0Var3 = new mie0("BetHistory", 2);
        c = mie0Var3;
        mie0 mie0Var4 = new mie0("PlaceBet", 3);
        d = mie0Var4;
        mie0 mie0Var5 = new mie0("Transaction", 4);
        e = mie0Var5;
        mie0 mie0Var6 = new mie0("DepositPending", 5);
        mie0 mie0Var7 = new mie0("DepositSuccess", 6);
        f = mie0Var7;
        mie0 mie0Var8 = new mie0("WithdrawalPending", 7);
        mie0 mie0Var9 = new mie0("WithdrawalSuccess", 8);
        i = mie0Var9;
        v = new mie0[]{mie0Var, mie0Var2, mie0Var3, mie0Var4, mie0Var5, mie0Var6, mie0Var7, mie0Var8, mie0Var9};
    }

    public mie0() {
        throw null;
    }

    public static mie0 valueOf(String str) {
        return (mie0) Enum.valueOf(mie0.class, str);
    }

    public static mie0[] values() {
        return (mie0[]) v.clone();
    }
}
