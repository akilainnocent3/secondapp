package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.core.model.cashout.AdditionMarket;
import com.sporty.android.core.model.cashout.AdditionOutcome;
import com.sportybet.android.data.OddsStatusSocket;
import com.sportybet.android.data.OutcomeSocket;
import com.sportybet.ntespm.socket.NonNullTopicInfo;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class dz2 {
    public static final List<String> a = b.k("hcp=1:0", "hcp=0:1");

    public static final ArrayList b(BetSelection betSelection) {
        String strA = a(betSelection);
        List<AdditionMarket> list = betSelection.markets;
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            AdditionMarket additionMarket = (AdditionMarket) obj;
            if (f(betSelection, additionMarket.getId(), additionMarket.getSpecifier(), strA)) {
                arrayListA.add(obj);
            }
        }
        return arrayListA;
    }

    public static final AdditionMarket c(BetSelection betSelection, int i) {
        Object next;
        Integer product;
        List<AdditionMarket> list = betSelection.markets;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AdditionMarket additionMarket = (AdditionMarket) next;
            if (Intrinsics.g(additionMarket.getId(), betSelection.marketId) && Intrinsics.g(additionMarket.getSpecifier(), betSelection.specifier) && (product = additionMarket.getProduct()) != null && product.intValue() == i) {
                break;
            }
        }
        AdditionMarket additionMarket2 = (AdditionMarket) next;
        return additionMarket2 == null ? new AdditionMarket(null, null, null, null, null, null, null, null, 255, null) : additionMarket2;
    }

    public static final String d(BetSelection betSelection) {
        StringBuilder sb = new StringBuilder();
        if (b3.T(betSelection.eventId)) {
            sb.append(betSelection.tournamentName);
        } else {
            sb.append(betSelection.home);
            sb.append(" vs ");
            sb.append(betSelection.away);
        }
        return sb.toString();
    }

    public static final void e(BetSelection betSelection, int i) {
        Integer status = betSelection.prematchAdditionMarket.getStatus();
        if (status != null && status.intValue() == 0) {
            betSelection.marketStatus = 0;
            AdditionMarket additionMarket = betSelection.prematchAdditionMarket;
            additionMarket.getClass();
            k(betSelection, additionMarket, betSelection.outcomeId);
            return;
        }
        Integer status2 = betSelection.liveAdditionMarket.getStatus();
        if (status2 != null && status2.intValue() == 0) {
            IntRange intRange = new IntRange(1, 2, 1);
            Integer status3 = betSelection.prematchAdditionMarket.getStatus();
            if (status3 != null && intRange.e(status3.intValue())) {
                betSelection.marketStatus = 0;
                AdditionMarket additionMarket2 = betSelection.liveAdditionMarket;
                additionMarket2.getClass();
                k(betSelection, additionMarket2, betSelection.outcomeId);
                return;
            }
        }
        IntRange intRange2 = new IntRange(1, 2, 1);
        Integer status4 = betSelection.liveAdditionMarket.getStatus();
        if (status4 != null && intRange2.e(status4.intValue())) {
            IntRange intRange3 = new IntRange(1, 2, 1);
            Integer status5 = betSelection.prematchAdditionMarket.getStatus();
            if (status5 != null && intRange3.e(status5.intValue())) {
                betSelection.marketStatus = i;
                AdditionMarket additionMarket3 = betSelection.prematchAdditionMarket;
                additionMarket3.getClass();
                k(betSelection, additionMarket3, betSelection.outcomeId);
                return;
            }
        }
        betSelection.marketStatus = i;
        AdditionMarket additionMarket4 = betSelection.prematchAdditionMarket;
        additionMarket4.getClass();
        k(betSelection, additionMarket4, betSelection.outcomeId);
    }

    public static final boolean f(BetSelection betSelection, String str, String str2, String str3) {
        String str4;
        try {
            String str5 = betSelection.marketId;
            cqu[] cquVarArr = cqu.a;
            if (!Intrinsics.g(str5, "1") && !Intrinsics.g(str5, "60")) {
                if ((Intrinsics.g(str5, "18") || Intrinsics.g(str5, "19") || Intrinsics.g(str5, "20") || Intrinsics.g(str5, "68")) && str3 != null && Intrinsics.g(str, betSelection.marketId) && str2 != null && StringsKt.M(str2, str3, false)) {
                }
            }
            return ((Intrinsics.g(str, "7") || Intrinsics.g(str, "61")) && (str4 = betSelection.setScore) != null && str2 != null && StringsKt.M(str2, str4, false)) || ((Intrinsics.g(str, "14") || Intrinsics.g(str, "65")) && CollectionsKt.M(a, str2));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, com.sporty.android.core.model.cashout.AdditionOutcome] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void g(BetSelection betSelection, NonNullTopicInfo nonNullTopicInfo, OddsStatusSocket oddsStatusSocket) {
        Object additionMarket;
        boolean z;
        T t;
        if (betSelection.additionMarketIdList.contains(nonNullTopicInfo.getMarketId())) {
            List<AdditionMarket> list = betSelection.markets;
            list.getClass();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    additionMarket = null;
                    break;
                }
                additionMarket = it.next();
                AdditionMarket additionMarket2 = (AdditionMarket) additionMarket;
                if (Intrinsics.g(nonNullTopicInfo.getMarketId(), additionMarket2.getId()) && Intrinsics.g(nonNullTopicInfo.getMarketSpecifiers(), additionMarket2.getSpecifier())) {
                    break;
                }
            }
            if (additionMarket == null) {
                z = true;
                additionMarket = new AdditionMarket(nonNullTopicInfo.getMarketId(), nonNullTopicInfo.getMarketSpecifiers(), null, null, null, null, null, null, 252, null);
            } else {
                z = false;
            }
            Long lastOddsChangeTime = oddsStatusSocket.getLastOddsChangeTime();
            if (lastOddsChangeTime != null) {
                ((AdditionMarket) additionMarket).setLastOddsChangeTime(Long.valueOf(lastOddsChangeTime.longValue()));
            }
            Integer status = oddsStatusSocket.getStatus();
            if (status != null) {
                ((AdditionMarket) additionMarket).setStatus(Integer.valueOf(status.intValue()));
            }
            List<OutcomeSocket> outcomes = oddsStatusSocket.getOutcomes();
            if (outcomes != null) {
                for (OutcomeSocket outcomeSocket : outcomes) {
                    dq40 dq40Var = new dq40();
                    AdditionMarket additionMarket3 = (AdditionMarket) additionMarket;
                    ArrayList<AdditionOutcome> outcomes2 = additionMarket3.getOutcomes();
                    int size = outcomes2.size();
                    int i = 0;
                    do {
                        if (i >= size) {
                            t = 0;
                            break;
                        } else {
                            t = outcomes2.get(i);
                            i++;
                        }
                    } while (!Intrinsics.g(((AdditionOutcome) t).getId(), outcomeSocket.getOutcomeId()));
                    dq40Var.a = t;
                    if (t == 0) {
                        dq40Var.a = new AdditionOutcome(null, null, null, null, null, 31, null);
                        Double probability = outcomeSocket.getProbability();
                        if (probability != null) {
                            ((AdditionOutcome) dq40Var.a).setProbability(String.valueOf(probability.doubleValue()));
                        }
                        Double voidProbability = outcomeSocket.getVoidProbability();
                        if (voidProbability != null) {
                            ((AdditionOutcome) dq40Var.a).setVoidProbability(Double.valueOf(voidProbability.doubleValue()));
                        }
                        ((AdditionOutcome) dq40Var.a).setId(outcomeSocket.getOutcomeId());
                        ((AdditionOutcome) dq40Var.a).setOdds(outcomeSocket.getOdds());
                        ((AdditionOutcome) dq40Var.a).setActive(Integer.valueOf(outcomeSocket.getIsOutcomeActive()));
                        additionMarket3.getOutcomes().add(dq40Var.a);
                    } else {
                        Double probability2 = outcomeSocket.getProbability();
                        if (probability2 != null) {
                            ((AdditionOutcome) dq40Var.a).setProbability(String.valueOf(probability2.doubleValue()));
                        }
                        Double voidProbability2 = outcomeSocket.getVoidProbability();
                        if (voidProbability2 != null) {
                            ((AdditionOutcome) dq40Var.a).setVoidProbability(Double.valueOf(voidProbability2.doubleValue()));
                        }
                        String odds = outcomeSocket.getOdds();
                        if (odds != null) {
                            ((AdditionOutcome) dq40Var.a).setOdds(odds);
                        }
                        ((AdditionOutcome) dq40Var.a).setActive(Integer.valueOf(outcomeSocket.getIsOutcomeActive()));
                    }
                }
            }
            if (z) {
                betSelection.markets.add((AdditionMarket) additionMarket);
            }
        }
    }

    public static final void h(BetSelection betSelection, NonNullTopicInfo nonNullTopicInfo, String str, String str2, Integer num, Long l) {
        Object next;
        boolean z;
        if (betSelection.additionMarketIdList.contains(nonNullTopicInfo.getMarketId())) {
            List<AdditionMarket> list = betSelection.markets;
            list.getClass();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AdditionMarket additionMarket = (AdditionMarket) next;
                if (Intrinsics.g(nonNullTopicInfo.getMarketId(), additionMarket.getId()) && Intrinsics.g(nonNullTopicInfo.getMarketSpecifiers(), additionMarket.getSpecifier())) {
                    break;
                }
            }
            AdditionMarket additionMarket2 = (AdditionMarket) next;
            if (additionMarket2 == null) {
                z = true;
                additionMarket2 = new AdditionMarket(nonNullTopicInfo.getMarketId(), nonNullTopicInfo.getMarketSpecifiers(), null, null, null, null, null, null, 252, null);
            } else {
                z = false;
            }
            additionMarket2.setStatus(str != null ? StringsKt.toIntOrNull(str) : null);
            additionMarket2.setSuspendedReason(str2);
            additionMarket2.setCashOutStatus(num);
            additionMarket2.setLastOddsChangeTime(l);
            if (z) {
                betSelection.markets.add(additionMarket2);
            }
        }
    }

    public static final void i(BetSelection betSelection) {
        Integer status;
        AdditionOutcome additionOutcome;
        AdditionMarket additionMarket = betSelection.liveAdditionMarket;
        if (additionMarket == null || (status = additionMarket.getStatus()) == null || status.intValue() != 0) {
            return;
        }
        IntRange intRange = new IntRange(1, 2, 1);
        Integer status2 = betSelection.prematchAdditionMarket.getStatus();
        if (status2 != null && intRange.e(status2.intValue()) && Intrinsics.g(betSelection.liveAdditionMarket.getId(), betSelection.marketId)) {
            ArrayList<AdditionOutcome> outcomes = betSelection.liveAdditionMarket.getOutcomes();
            int size = outcomes.size();
            int i = 0;
            do {
                if (i >= size) {
                    additionOutcome = null;
                    break;
                } else {
                    additionOutcome = outcomes.get(i);
                    i++;
                }
            } while (!Intrinsics.g(additionOutcome.getId(), betSelection.outcomeId));
            AdditionOutcome additionOutcome2 = additionOutcome;
            if (additionOutcome2 != null) {
                betSelection.currentOdds = additionOutcome2.getOdds();
                String probability = additionOutcome2.getProbability();
                betSelection.currentProbability = probability != null ? Double.parseDouble(probability) : betSelection.currentProbability;
                Double voidProbability = additionOutcome2.getVoidProbability();
                if (voidProbability != null) {
                    betSelection.currentVoidProbability = voidProbability.doubleValue();
                }
                Integer numIsActive = additionOutcome2.isActive();
                betSelection.isOutcomeActive = numIsActive != null ? numIsActive.intValue() : betSelection.isOutcomeActive;
                betSelection.marketStatus = 0;
            }
        }
    }

    public static final int j(BetSelection betSelection, String str, int i, List<OutcomeSocket> list) {
        Object next;
        Object next2;
        OutcomeSocket outcomeSocket;
        str.getClass();
        int i2 = 0;
        if (str.equals("1")) {
            AdditionMarket additionMarket = betSelection.liveAdditionMarket;
            additionMarket.setStatus(Integer.valueOf(i));
            additionMarket.setId(betSelection.marketId);
            additionMarket.setSpecifier(betSelection.specifier);
            additionMarket.setProduct(1);
            if (additionMarket.getOutcomes().isEmpty() && list != null && (outcomeSocket = (OutcomeSocket) CollectionsKt.firstOrNull(list)) != null) {
                additionMarket.getOutcomes().add(new AdditionOutcome(outcomeSocket.getOutcomeId(), String.valueOf(outcomeSocket.getProbability()), Integer.valueOf(outcomeSocket.getIsOutcomeActive()), outcomeSocket.getOdds(), outcomeSocket.getVoidProbability()));
            }
            ArrayList<AdditionOutcome> outcomes = additionMarket.getOutcomes();
            int size = outcomes.size();
            while (i2 < size) {
                AdditionOutcome additionOutcome = outcomes.get(i2);
                i2++;
                AdditionOutcome additionOutcome2 = additionOutcome;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.g(((OutcomeSocket) next2).getOutcomeId(), additionOutcome2.getId()));
                    OutcomeSocket outcomeSocket2 = (OutcomeSocket) next2;
                    if (outcomeSocket2 != null) {
                        additionOutcome2.setOdds(outcomeSocket2.getOdds());
                        additionOutcome2.setProbability(String.valueOf(outcomeSocket2.getProbability()));
                        additionOutcome2.setVoidProbability(outcomeSocket2.getVoidProbability());
                        additionOutcome2.setActive(Integer.valueOf(outcomeSocket2.getIsOutcomeActive()));
                    }
                }
            }
            e(betSelection, i);
        } else if (str.equals("3")) {
            betSelection.prematchAdditionMarket.setStatus(Integer.valueOf(i));
            ArrayList<AdditionOutcome> outcomes2 = betSelection.prematchAdditionMarket.getOutcomes();
            int size2 = outcomes2.size();
            while (i2 < size2) {
                AdditionOutcome additionOutcome3 = outcomes2.get(i2);
                i2++;
                AdditionOutcome additionOutcome4 = additionOutcome3;
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.g(((OutcomeSocket) next).getOutcomeId(), additionOutcome4.getId()));
                    OutcomeSocket outcomeSocket3 = (OutcomeSocket) next;
                    if (outcomeSocket3 != null) {
                        additionOutcome4.setOdds(outcomeSocket3.getOdds());
                        additionOutcome4.setProbability(String.valueOf(outcomeSocket3.getProbability()));
                        additionOutcome4.setVoidProbability(outcomeSocket3.getVoidProbability());
                        additionOutcome4.setActive(Integer.valueOf(outcomeSocket3.getIsOutcomeActive()));
                    }
                }
            }
            e(betSelection, i);
        }
        return betSelection.marketStatus;
    }

    public static final void k(BetSelection betSelection, AdditionMarket additionMarket, String str) {
        AdditionOutcome additionOutcome;
        int i;
        additionMarket.getClass();
        ArrayList<AdditionOutcome> outcomes = additionMarket.getOutcomes();
        int size = outcomes.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                additionOutcome = null;
                break;
            } else {
                additionOutcome = outcomes.get(i2);
                i2++;
            }
        } while (!Intrinsics.g(additionOutcome.getId(), str));
        AdditionOutcome additionOutcome2 = additionOutcome;
        if (additionOutcome2 != null) {
            String odds = additionOutcome2.getOdds();
            if (odds == null) {
                odds = betSelection.currentOdds;
                odds.getClass();
            }
            float f = Float.parseFloat(odds);
            String str2 = betSelection.currentOdds;
            str2.getClass();
            float f2 = Float.parseFloat(str2);
            if (f > f2) {
                i = 1;
            } else {
                i = f < f2 ? 2 : betSelection.oddsFlag;
            }
            betSelection.oddsFlag = i;
            String probability = additionOutcome2.getProbability();
            betSelection.currentProbability = probability != null ? Double.parseDouble(probability) : betSelection.currentProbability;
            Double voidProbability = additionOutcome2.getVoidProbability();
            if (voidProbability != null) {
                betSelection.currentVoidProbability = voidProbability.doubleValue();
            }
            String odds2 = additionOutcome2.getOdds();
            if (odds2 == null) {
                odds2 = betSelection.currentOdds;
            }
            betSelection.currentOdds = odds2;
            Integer numIsActive = additionOutcome2.isActive();
            betSelection.isOutcomeActive = numIsActive != null ? numIsActive.intValue() : betSelection.isOutcomeActive;
        }
    }

    public static final String a(BetSelection betSelection) {
        if (betSelection.isTargetScoreCached) {
            return betSelection.cachedTargetScore;
        }
        String strValueOf = null;
        try {
            String str = betSelection.marketId;
            cqu[] cquVarArr = cqu.a;
            if (Intrinsics.g(str, LxHElgWAiSeM.qsFlHVSEoAH) || Intrinsics.g(str, "19") || Intrinsics.g(str, "20") || Intrinsics.g(str, "68")) {
                String str2 = betSelection.specifier;
                str2.getClass();
                strValueOf = String.valueOf(Float.parseFloat((String) StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null).get(1)) - 1.0f);
            }
        } catch (Exception unused) {
        }
        betSelection.cachedTargetScore = strValueOf;
        betSelection.isTargetScoreCached = true;
        return strValueOf;
    }
}
