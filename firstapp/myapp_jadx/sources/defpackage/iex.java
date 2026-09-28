package defpackage;

import com.sportygames.crash.models.bet.BetContainerState;

/* JADX INFO: loaded from: classes7.dex */
public final class iex {
    public static final /* synthetic */ int a = 0;

    public static boolean a(ul2 ul2Var, long j, String str) {
        ul2Var.getClass();
        wwd0 wwd0Var = ul2Var.a;
        return ((BetContainerState) wwd0Var.getValue()).isStakeSafeApplied() && (!(((Boolean) ((x5a0) gci0.n).getValue()).booleanValue()) || (((BetContainerState) wwd0Var.getValue()).isStakeSafeApplied() && (j > ((BetContainerState) wwd0Var.getValue()).getRoundId() ? 1 : (j == ((BetContainerState) wwd0Var.getValue()).getRoundId() ? 0 : -1)) == 0 && str.equals("ROUND_WAITING")));
    }
}
