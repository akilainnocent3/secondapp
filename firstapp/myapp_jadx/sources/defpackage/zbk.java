package defpackage;

import com.sportybet.feature.luckynumber.historydetail.data.LNBetOutcomeNumberDTO;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetSelectionDTO;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class zbk {
    public final uhq a;
    public final n37 b;
    public final a7q c;
    public final i6u d;
    public final wdq e;
    public final qq40 f;
    public final rdd0 g;

    public zbk(uhq uhqVar, n37 n37Var, a7q a7qVar, i6u i6uVar, wdq wdqVar, qq40 qq40Var, rdd0 rdd0Var) {
        i6uVar.getClass();
        wdqVar.getClass();
        rdd0Var.getClass();
        this.a = uhqVar;
        this.b = n37Var;
        this.c = a7qVar;
        this.d = i6uVar;
        this.e = wdqVar;
        this.f = qq40Var;
        this.g = rdd0Var;
    }

    public static final uf00<ixp> a(IntRange intRange, Map<Integer, n4q> map, uf00<Integer> uf00Var, uf00<Integer> uf00Var2) {
        zkq zkqVar;
        ArrayList arrayList = new ArrayList(l48.r(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (((mwo) it).c) {
            int iNextInt = ((zvo) it).nextInt();
            n4q n4qVar = map.get(Integer.valueOf(iNextInt));
            qcn<j58> qcnVar = n4qVar != null ? n4qVar.b : null;
            if (uf00Var.contains(Integer.valueOf(iNextInt))) {
                zkqVar = zkq.a;
            } else {
                zkqVar = uf00Var2.contains(Integer.valueOf(iNextInt)) ? zkq.b : zkq.c;
            }
            arrayList.add(new ixp(qcnVar, iNextInt, zkqVar));
        }
        return a4h.f(arrayList);
    }

    public static final s4r.a b(LNBetSelectionDTO lNBetSelectionDTO, uf00<tsq> uf00Var) {
        tsq next;
        qcn<ssq> qcnVar;
        ssq next2;
        qcn<yxq> qcnVar2;
        uf00 uf00VarF;
        uf00 uf00VarF2;
        List<Integer> bonusNumbers;
        List<Integer> mainNumbers;
        Iterator<tsq> it = uf00Var.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(next.a, lNBetSelectionDTO.getMarketGroupId()));
        tsq tsqVar = next;
        if (tsqVar != null && (qcnVar = tsqVar.c) != null) {
            Iterator<ssq> it2 = qcnVar.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.g(next2.a, lNBetSelectionDTO.getMarketId()));
            ssq ssqVar = next2;
            if (ssqVar != null && ((qcnVar2 = ssqVar.g) == null || !qcnVar2.isEmpty())) {
                Iterator<yxq> it3 = qcnVar2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.g(it3.next().b, lNBetSelectionDTO.getOutcomeId())) {
                        String marketGroupId = lNBetSelectionDTO.getMarketGroupId();
                        String marketId = lNBetSelectionDTO.getMarketId();
                        atq atqVar = ssqVar.d;
                        atq atqVar2 = atqVar.a.equals(lNBetSelectionDTO.getMarketType()) ? atqVar : null;
                        if (atqVar2 == null) {
                            break;
                        }
                        String outcomeId = lNBetSelectionDTO.getOutcomeId();
                        LNBetOutcomeNumberDTO outcomeNumber = lNBetSelectionDTO.getOutcomeNumber();
                        if (outcomeNumber == null || (mainNumbers = outcomeNumber.getMainNumbers()) == null || (uf00VarF = a4h.f(mainNumbers)) == null) {
                            uf00VarF = n1a0.c;
                        }
                        uf00 uf00Var2 = uf00VarF;
                        LNBetOutcomeNumberDTO outcomeNumber2 = lNBetSelectionDTO.getOutcomeNumber();
                        if (outcomeNumber2 == null || (bonusNumbers = outcomeNumber2.getBonusNumbers()) == null || (uf00VarF2 = a4h.f(bonusNumbers)) == null) {
                            uf00VarF2 = n1a0.c;
                        }
                        return new s4r.a(marketGroupId, marketId, atqVar2, outcomeId, uf00Var2, uf00VarF2);
                    }
                }
            }
        }
        return null;
    }

    public static BigDecimal c(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        bigDecimalValueOf.getClass();
        rkd0.a aVar = rkd0.Companion;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
        bigDecimalValueOf2.getClass();
        MathContext mathContext = MathContext.DECIMAL64;
        mathContext.getClass();
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, mathContext);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }
}
