package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class taw {
    /* JADX WARN: Code duplicated, block: B:132:0x031e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x029e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b1  */
    public static final vaw a(int i, BetContainerState betContainerState, BetContainerState betContainerState2, jph0 jph0Var, List list, String str, long j, HashMap map, HashMap map2, dnb0 dnb0Var, dnb0 dnb0Var2, dnb0 dnb0Var3, a aVar) {
        UserLevelProgressDto userLevelProgressDto;
        Double stakeAmountCapForNextRound;
        boolean z;
        boolean z2;
        Object sawVar;
        a aVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        betContainerState2.getClass();
        jph0Var.getClass();
        list.getClass();
        str.getClass();
        map.getClass();
        map2.getClass();
        dnb0Var.getClass();
        xsw xswVar = dnb0Var.R;
        dnb0Var2.getClass();
        xsw xswVar2 = dnb0Var2.M;
        dnb0Var3.getClass();
        boolean z7 = jph0Var instanceof jph0.d;
        UserLevelProgressDto userLevelProgressDto2 = z7 ? ((jph0.d) jph0Var).a : null;
        Object[] objArr = {jph0Var, Boolean.valueOf(betContainerState.getBetPlaced()), Long.valueOf(betContainerState.getTopBets().getBetId()), betContainerState.getTopBets().getBonusPercentage(), Boolean.valueOf(betContainerState2.getBetPlaced()), Long.valueOf(betContainerState2.getTopBets().getBetId()), betContainerState2.getTopBets().getBonusPercentage()};
        boolean zA = aVar.A(dnb0Var) | aVar.A(betContainerState) | aVar.A(betContainerState2) | aVar.M(userLevelProgressDto2);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zA || objY == c0042a) {
            userLevelProgressDto = userLevelProgressDto2;
            raw rawVar = new raw(dnb0Var, betContainerState, betContainerState2, userLevelProgressDto, null);
            aVar.r(rawVar);
            objY = rawVar;
        } else {
            userLevelProgressDto = userLevelProgressDto2;
        }
        xvf.h(objArr, (Function2) objY, aVar);
        qaw qawVarB = b(betContainerState);
        Double d = qawVarB.e;
        long j2 = qawVarB.c;
        qaw qawVarB2 = b(betContainerState2);
        Double d2 = qawVarB2.e;
        UserLevelProgressDto userLevelProgressDto3 = userLevelProgressDto;
        long j3 = qawVarB2.c;
        if (z7) {
            UserLevelProgressDto userLevelProgressDto4 = ((jph0.d) jph0Var).a;
            if (!userLevelProgressDto4.isNextBonusRound() || (stakeAmountCapForNextRound = userLevelProgressDto4.getStakeAmountCapForNextRound()) == null) {
                stakeAmountCapForNextRound = null;
            } else {
                double dDoubleValue = stakeAmountCapForNextRound.doubleValue();
                if (dDoubleValue <= 0.0d || Math.abs(dDoubleValue) > Double.MAX_VALUE) {
                    stakeAmountCapForNextRound = null;
                }
            }
        } else {
            stakeAmountCapForNextRound = null;
        }
        if (stakeAmountCapForNextRound == null) {
            stakeAmountCapForNextRound = (Double) ((x5a0) dnb0Var.O).getValue();
        }
        Double d3 = stakeAmountCapForNextRound;
        boolean zIsNextBonusRound = z7 ? ((jph0.d) jph0Var).a.isNextBonusRound() : false;
        if (j2 <= 0) {
            z = false;
        } else {
            if ((d != null ? d.doubleValue() : 0.0d) > 0.0d) {
                z = true;
            } else {
                z = false;
            }
        }
        if (j3 <= 0) {
            z2 = false;
        } else {
            if ((d2 != null ? d2.doubleValue() : 0.0d) > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        boolean z8 = z || z2;
        long jU = ((v5a0) xswVar2).u();
        boolean z9 = jU > 0 && j == jU;
        boolean z10 = jU > 0 && j < jU;
        boolean z11 = ((!j94.a(j, r16, map) && !j94.a(j, qawVarB2, map2)) || j94.b(j, qawVarB2, map2) || j94.b(j, r16, map)) ? false : true;
        boolean z12 = zIsNextBonusRound;
        dnb0 dnb0Var4 = dnb0Var;
        boolean z13 = z8;
        Double d4 = d3;
        String str2 = str;
        Object[] objArr2 = {Long.valueOf(j), str2, Boolean.valueOf(z8), Boolean.valueOf(zIsNextBonusRound), d4, Boolean.valueOf(z10), Boolean.valueOf(z9), Boolean.valueOf(z11), Boolean.valueOf(betContainerState.getBetPlaced()), Boolean.valueOf(betContainerState2.getBetPlaced()), ((x5a0) dnb0Var2.G).getValue(), Long.valueOf(jU)};
        boolean z14 = z10;
        boolean z15 = z9;
        boolean z16 = z11;
        boolean zA2 = aVar.A(dnb0Var4) | aVar.A(dnb0Var2) | aVar.A(betContainerState) | aVar.A(betContainerState2) | aVar.M(str2) | aVar.e(j) | aVar.b(z13) | aVar.b(z12) | aVar.M(d4) | aVar.b(z14) | aVar.b(z15) | aVar.b(z16) | aVar.e(jU);
        Object objY2 = aVar.y();
        if (zA2 || objY2 == c0042a) {
            aVar2 = aVar;
            sawVar = new saw(dnb0Var4, dnb0Var2, betContainerState, betContainerState2, str2, j, z13, z12, d4, z14, z15, z16, jU, null);
            dnb0Var4 = dnb0Var4;
            str2 = str2;
            d4 = d4;
            aVar2.r(sawVar);
        } else {
            sawVar = objY2;
            aVar2 = aVar;
        }
        xvf.h(objArr2, (Function2) sawVar, aVar2);
        long j4 = qawVarB.b;
        boolean z17 = qawVarB.a;
        if (j2 <= 0) {
            z3 = false;
        } else {
            if ((d != null ? d.doubleValue() : 0.0d) > 0.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (j3 <= 0) {
            z4 = false;
        } else {
            if ((d2 != null ? d2.doubleValue() : 0.0d) > 0.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        boolean z18 = z3 || z4;
        long jU2 = ((v5a0) xswVar2).u();
        boolean z19 = jU2 > 0 && j == jU2;
        boolean z20 = jU2 > 0 && j < jU2;
        boolean z21 = z17 && j4 == j;
        boolean zB = j94.b(j, qawVarB, map);
        boolean zB2 = j94.b(j, qawVarB2, map2);
        if (z17 && j4 == j && j2 > 0) {
            if ((d != null ? d.doubleValue() : 0.0d) <= 0.0d) {
                z5 = z18;
                if (!Intrinsics.g(map.get(Long.valueOf(j)), Boolean.TRUE)) {
                    z6 = true;
                }
            } else {
                z5 = z18;
            }
            z6 = false;
        } else {
            z5 = z18;
            z6 = false;
        }
        boolean z22 = ((!j94.a(j, qawVarB, map) && !j94.a(j, qawVarB2, map2)) || zB2 || zB) ? false : true;
        boolean z23 = str2.equals("ROUND_ONGOING") && z5 && zB2 && !zB;
        boolean z24 = d4 != null;
        int iB = k94.b(userLevelProgressDto3, list);
        boolean z25 = z22;
        boolean z26 = z6;
        Double d5 = d4;
        boolean z27 = (z25 || z20 || (!(z12 && !z5 && z24 && z19 && !z21 && str2.equals("ROUND_ONGOING")) && !(z12 && !z5 && z24 && z19 && z21 && str2.equals("ROUND_END_WAIT")) && !(z5 && !z26 && (str2.equals("ROUND_WAITING") || str2.equals("ROUND_PRE_START") || str2.equals("ROUND_ONGOING") || str2.equals("ROUND_END_WAIT"))) && !(((Boolean) ((x5a0) dnb0Var4.P).getValue()).booleanValue() && !((((v5a0) xswVar).u() > 0L ? 1 : (((v5a0) xswVar).u() == 0L ? 0 : -1)) > 0 && (j > ((v5a0) xswVar).u() ? 1 : (j == ((v5a0) xswVar).u() ? 0 : -1)) == 0) && !z20 && !z19 && !z26 && z24 && (str2.equals("ROUND_WAITING") || str2.equals("ROUND_PRE_START") || str2.equals("ROUND_ONGOING") || str2.equals("ROUND_END_WAIT"))) && !(((Boolean) ((x5a0) dnb0Var4.Q).getValue()).booleanValue() && z24 && !z25 && !z20 && !z21 && (str2.equals("ROUND_WAITING") || str2.equals("ROUND_PRE_START") || str2.equals("ROUND_ONGOING") || str2.equals("ROUND_END_WAIT"))))) ? false : true;
        if (i == 1) {
            ((x5a0) dnb0Var4.y0).setValue(Boolean.valueOf(z27));
        } else if (i == 2) {
            ((x5a0) dnb0Var4.z0).setValue(Boolean.valueOf(z27));
        }
        return new vaw(z27, (z27 && z24) ? d5 : null, iB, z23);
    }

    public static final qaw b(BetContainerState betContainerState) {
        return new qaw(betContainerState.getBetPlaced(), betContainerState.getRoundId(), betContainerState.getTopBets().getBetId(), betContainerState.getTopBets().getRoundId(), betContainerState.getTopBets().getBonusPercentage());
    }
}
