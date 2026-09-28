package defpackage;

import com.sportygames.campaign.data.model.TournamentConfigVO;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.CashoutRequest;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ts6 {

    public static final class a {
        public final int a;
        public final String b;
        public final boolean c;
        public final CashoutRequest d;

        public a(int i, String str, boolean z, CashoutRequest cashoutRequest) {
            this.a = i;
            this.b = str;
            this.c = z;
            this.d = cashoutRequest;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            int iA = mtg0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            CashoutRequest cashoutRequest = this.d;
            return iA + (cashoutRequest == null ? 0 : cashoutRequest.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = uqe0.a(this.a, "CashoutResult(betIndex=", ", message=", this.b, ", shouldCashout=");
            sbA.append(this.c);
            sbA.append(", cashoutRequest=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("AUTO", 0);
            a = bVar;
            b bVar2 = new b("MANUAL", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public static ArrayList a(List list, MultiplierResponse multiplierResponse, boolean z, String str, boolean z2, b bVar) {
        double dDoubleValue;
        String currentMultiplier;
        boolean z3;
        CashoutRequest cashoutRequest;
        list.getClass();
        multiplierResponse.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            ul2 ul2Var = (ul2) it.next();
            wwd0 wwd0Var = ul2Var.a;
            xsw xswVar = ul2Var.L;
            ytw<String> ytwVar = ul2Var.N;
            ytw<Boolean> ytwVar2 = ul2Var.c;
            fsw fswVar = ul2Var.O;
            BetContainerState betContainerState = (BetContainerState) wwd0Var.getValue();
            long roundId = betContainerState.getRoundId();
            Boolean bool = (Boolean) ((HashMap) ((x5a0) ul2Var.d).getValue()).get(Long.valueOf(roundId));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            String messageType = multiplierResponse.getMessageType();
            boolean z4 = Intrinsics.g(messageType, "ROUND_ONGOING") || Intrinsics.g(messageType, "ROUND_END_WAIT");
            a aVar = null;
            if (z4) {
                if (z4) {
                    String currentMultiplier2 = multiplierResponse.getCurrentMultiplier();
                    dDoubleValue = fswVar.getValue().doubleValue() * (currentMultiplier2 != null ? Double.parseDouble(currentMultiplier2) : 0.0d);
                } else {
                    dDoubleValue = 0.0d;
                }
                String currentMultiplier3 = multiplierResponse.getCurrentMultiplier();
                double d = currentMultiplier3 != null ? Double.parseDouble(currentMultiplier3) : 0.0d;
                double maxPayoutAmount = betContainerState.getDetailResponse().getMaxPayoutAmount();
                b bVar2 = b.a;
                boolean z5 = bVar == bVar2 && ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue() && d >= Double.parseDouble((String) ((x5a0) ytwVar).getValue());
                boolean z6 = bVar == b.b || z5 || ((dDoubleValue > maxPayoutAmount ? 1 : (dDoubleValue == maxPayoutAmount ? 0 : -1)) >= 0);
                op5.a.getClass();
                String strB = op5.b("CASH_OUT", "Cashout", null);
                BigDecimal scale = BigDecimal.valueOf(fswVar.getValue().doubleValue() * d).setScale(2, RoundingMode.HALF_UP);
                scale.getClass();
                BigDecimal bigDecimalMin = scale.min(new BigDecimal(String.valueOf(maxPayoutAmount)));
                String str2 = z ? strB + "\n " + bigDecimalMin : strB + "\n" + str + " " + bigDecimalMin;
                if (((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue() && bVar == bVar2) {
                    currentMultiplier = (String) ((x5a0) ytwVar).getValue();
                } else {
                    currentMultiplier = multiplierResponse.getCurrentMultiplier();
                    if (currentMultiplier == null) {
                        currentMultiplier = "";
                    }
                }
                String str3 = currentMultiplier;
                if (!betContainerState.getBetPlaced() || zBooleanValue || betContainerState.getCashoutInProgress() || multiplierResponse.getRoundId() != roundId || !z6 || xswVar.getValue().longValue() <= 0) {
                    z3 = z6;
                    cashoutRequest = null;
                } else {
                    boolean z7 = z6;
                    long jLongValue = xswVar.getValue().longValue();
                    Boolean boolValueOf = Boolean.valueOf(z5);
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    boolean z8 = egb.a((BetContainerState) wwd0Var.getValue()) > 0;
                    ssw<List<TournamentConfigVO>> sswVar = wag0.a;
                    Double dH = kotlin.text.b.h(str3);
                    z3 = z7;
                    cashoutRequest = new CashoutRequest(jLongValue, roundId, str3, boolValueOf, strValueOf, z2, wag0.a(dH != null ? dH.doubleValue() : 0.0d, z8), Boolean.valueOf(((BetContainerState) wwd0Var.getValue()).isTurboBet()), Boolean.valueOf(((BetContainerState) wwd0Var.getValue()).isStakeSafeBet() || ((BetContainerState) wwd0Var.getValue()).isStakeSafeApplied()));
                }
                aVar = new a(betContainerState.getDetailResponse().getBetIndex(), str2, z3, cashoutRequest);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
