package defpackage;

import android.graphics.Color;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetOrderDTO;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetSelectionDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNLotteryBallColorDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNDrawDetailDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNMarketDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNMyNumberDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNOutcomeDTO;
import com.sportybet.feature.luckynumber.placebet.data.data.LNStatisticsNumbersDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetPlaceBetConfigFlowUseCase$invoke$1", f = "GetPlaceBetConfigFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rbk extends tje0 implements jaj<LNDrawDetailDTO, Pair<? extends avq, ? extends lk50<? extends List<? extends LNMyNumberDTO>>>, Unit, lk50<? extends LNBetOrderDTO>, v1b<? super qxp>, Object> {
    public /* synthetic */ LNDrawDetailDTO a;
    public /* synthetic */ Pair b;
    public /* synthetic */ lk50 c;
    public final /* synthetic */ zbk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbk(zbk zbkVar, v1b<? super rbk> v1bVar) {
        super(5, v1bVar);
        this.d = zbkVar;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0574  */
    /* JADX WARN: Code duplicated, block: B:192:0x05be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uf00 uf00VarF;
        uf00 uf00VarF2;
        Object bVar;
        dvq dvqVarB;
        Object bVar2;
        s4r s4rVar;
        List<LNBetSelectionDTO> selections;
        LNBetSelectionDTO lNBetSelectionDTO;
        Object next;
        String leastDrawn;
        List listSplit$default;
        String mostDrawn;
        List listSplit$default2;
        Pair pair;
        Object bVar3;
        Object next2;
        Integer num;
        LNDrawDetailDTO lNDrawDetailDTO;
        lk50 lk50Var;
        Object bVar4;
        Integer num2;
        int iIntValue;
        String str;
        LNDrawDetailDTO lNDrawDetailDTO2 = this.a;
        Pair pair2 = this.b;
        lk50 lk50Var2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        avq avqVar = (avq) pair2.a;
        lk50 lk50Var3 = (lk50) pair2.b;
        zbk zbkVar = this.d;
        zbkVar.getClass();
        List<LNMarketDTO> markets = lNDrawDetailDTO2.getDraw().getMarkets();
        int i = 10;
        ArrayList arrayList = new ArrayList(l48.r(markets, 10));
        int i2 = 0;
        for (Object obj2 : markets) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            LNMarketDTO lNMarketDTO = (LNMarketDTO) obj2;
            Integer numValueOf = Integer.valueOf(i2);
            List<LNOutcomeDTO> outcomes = lNMarketDTO.getOutcomes();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : outcomes) {
                if (((LNOutcomeDTO) obj3).getActive()) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, i));
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                LNOutcomeDTO lNOutcomeDTO = (LNOutcomeDTO) arrayList2.get(i4);
                try {
                    zi50.a aVar = zi50.b;
                    String id = lNOutcomeDTO.getId();
                    if (!StringsKt.M(id, ":", false)) {
                        id = null;
                    }
                    if (id != null) {
                        lNDrawDetailDTO = lNDrawDetailDTO2;
                        try {
                            lk50Var = lk50Var2;
                            try {
                                List listSplit$default3 = StringsKt__StringsKt.split$default(id, new String[]{":"}, false, 0, 6, null);
                                if (listSplit$default3 != null && (str = (String) CollectionsKt.b0(listSplit$default3)) != null) {
                                    bVar4 = Integer.valueOf(Integer.parseInt(str));
                                }
                            } catch (Throwable th) {
                                th = th;
                                zi50.a aVar2 = zi50.b;
                                bVar4 = new zi50.b(th);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            lk50Var = lk50Var2;
                            zi50.a aVar3 = zi50.b;
                            bVar4 = new zi50.b(th);
                            if (bVar4 instanceof zi50.b) {
                                bVar4 = null;
                            }
                            num2 = (Integer) bVar4;
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 1;
                            }
                            String id2 = lNOutcomeDTO.getId();
                            BigDecimal bigDecimal = new BigDecimal(lNOutcomeDTO.getOdds());
                            rkd0.a aVar4 = rkd0.Companion;
                            arrayList3.add(new yxq(lNOutcomeDTO.getTitle(), id2, lNOutcomeDTO.getOdds(), lNOutcomeDTO.getProb(), iIntValue, bigDecimal));
                            i4 = i5;
                            lNDrawDetailDTO2 = lNDrawDetailDTO;
                            lk50Var2 = lk50Var;
                        }
                        if (bVar4 instanceof zi50.b) {
                            bVar4 = null;
                        }
                        num2 = (Integer) bVar4;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 1;
                        }
                        String id3 = lNOutcomeDTO.getId();
                        BigDecimal bigDecimal2 = new BigDecimal(lNOutcomeDTO.getOdds());
                        rkd0.a aVar5 = rkd0.Companion;
                        arrayList3.add(new yxq(lNOutcomeDTO.getTitle(), id3, lNOutcomeDTO.getOdds(), lNOutcomeDTO.getProb(), iIntValue, bigDecimal2));
                        i4 = i5;
                        lNDrawDetailDTO2 = lNDrawDetailDTO;
                        lk50Var2 = lk50Var;
                    } else {
                        lNDrawDetailDTO = lNDrawDetailDTO2;
                        lk50Var = lk50Var2;
                    }
                    bVar4 = null;
                } catch (Throwable th3) {
                    th = th3;
                    lNDrawDetailDTO = lNDrawDetailDTO2;
                }
                if (bVar4 instanceof zi50.b) {
                    bVar4 = null;
                }
                num2 = (Integer) bVar4;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 1;
                }
                String id4 = lNOutcomeDTO.getId();
                BigDecimal bigDecimal3 = new BigDecimal(lNOutcomeDTO.getOdds());
                rkd0.a aVar6 = rkd0.Companion;
                arrayList3.add(new yxq(lNOutcomeDTO.getTitle(), id4, lNOutcomeDTO.getOdds(), lNOutcomeDTO.getProb(), iIntValue, bigDecimal3));
                i4 = i5;
                lNDrawDetailDTO2 = lNDrawDetailDTO;
                lk50Var2 = lk50Var;
            }
            LNDrawDetailDTO lNDrawDetailDTO3 = lNDrawDetailDTO2;
            lk50 lk50Var4 = lk50Var2;
            uf00 uf00VarF3 = a4h.f(arrayList3);
            String id5 = lNMarketDTO.getId();
            String title = lNMarketDTO.getTitle();
            String description = lNMarketDTO.getDescription();
            if (description == null) {
                description = "";
            }
            String str2 = description;
            Iterator<T> it = atq.w.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!((atq) next2).a.equals(lNMarketDTO.getType()));
            next2.getClass();
            atq atqVar = (atq) next2;
            Iterator<E> it2 = uf00VarF3.iterator();
            if (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((yxq) it2.next()).e);
                while (true) {
                    num = numValueOf2;
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                        numValueOf2 = Integer.valueOf(((yxq) it2.next()).e);
                    } while (num.compareTo(numValueOf2) >= 0);
                }
            } else {
                num = null;
            }
            arrayList.add(new Pair(numValueOf, new ssq(id5, title, str2, atqVar, num != null ? num.intValue() : 0, lNMarketDTO.getSpecifier(), uf00VarF3)));
            i2 = i3;
            lNDrawDetailDTO2 = lNDrawDetailDTO3;
            lk50Var2 = lk50Var4;
            i = 10;
        }
        LNDrawDetailDTO lNDrawDetailDTO4 = lNDrawDetailDTO2;
        lk50 lk50Var5 = lk50Var2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj4 = arrayList.get(i6);
            i6++;
            String str3 = ((ssq) ((Pair) obj4).b).a;
            Object objA = linkedHashMap.get(str3);
            if (objA == null) {
                objA = r9i.a(str3, linkedHashMap);
            }
            ((List) objA).add(obj4);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (Pair) CollectionsKt.firstOrNull((List) entry.getValue()));
        }
        ArrayList arrayListA = o5u.a(avqVar.n, zbkVar.g, "sportyNumbers/api/v1/lottery/config", "marketGroups_id", new mbk(0));
        ArrayList arrayList4 = new ArrayList(l48.r(arrayListA, 10));
        int size3 = arrayListA.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj5 = arrayListA.get(i7);
            i7++;
            bvq bvqVar = (bvq) obj5;
            List<String> list = bvqVar.c;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                Pair pair3 = (Pair) linkedHashMap2.get((String) it3.next());
                if (pair3 != null) {
                    arrayList5.add(pair3);
                }
            }
            arrayList4.add(new Pair(bvqVar, arrayList5));
        }
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList4.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj6 = arrayList4.get(i8);
            i8++;
            if (!((Collection) ((Pair) obj6).b).isEmpty()) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList(l48.r(arrayList6, 10));
        int size5 = arrayList6.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj7 = arrayList6.get(i9);
            i9++;
            Pair pair4 = (Pair) obj7;
            bvq bvqVar2 = (bvq) pair4.a;
            String str4 = bvqVar2.a;
            String str5 = bvqVar2.b;
            Iterable iterable = (Iterable) pair4.b;
            ArrayList arrayList8 = new ArrayList(l48.r(iterable, 10));
            Iterator it4 = iterable.iterator();
            while (it4.hasNext()) {
                arrayList8.add((ssq) ((Pair) it4.next()).b);
            }
            arrayList7.add(new tsq(a4h.f(arrayList8), str4, str5));
        }
        uf00 uf00VarF4 = a4h.f(arrayList7);
        ArrayList arrayList9 = avqVar.l;
        ArrayList arrayList10 = new ArrayList(l48.r(arrayList9, 10));
        int size6 = arrayList9.size();
        int i10 = 0;
        while (i10 < size6) {
            Object obj8 = arrayList9.get(i10);
            i10++;
            zuq zuqVar = (zuq) obj8;
            String str6 = zuqVar.a;
            List<String> list2 = zuqVar.b;
            ArrayList arrayList11 = new ArrayList(l48.r(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList11.add(new j58(r58.b(Color.parseColor((String) it5.next()))));
            }
            arrayList10.add(new n4q(str6, a4h.f(arrayList11)));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        int size7 = arrayList10.size();
        int i11 = 0;
        while (i11 < size7) {
            Object obj9 = arrayList10.get(i11);
            i11++;
            String str7 = ((n4q) obj9).a;
            Object objA2 = linkedHashMap3.get(str7);
            if (objA2 == null) {
                objA2 = r9i.a(str7, linkedHashMap3);
            }
            ((List) objA2).add(obj9);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(jpu.a(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), (n4q) CollectionsKt.T((List) entry2.getValue()));
        }
        wf00 wf00VarG = a4h.g(linkedHashMap4);
        List<LNLotteryBallColorDTO> colors = lNDrawDetailDTO4.getDraw().getColors();
        ArrayList arrayList12 = new ArrayList();
        for (LNLotteryBallColorDTO lNLotteryBallColorDTO : colors) {
            n4q n4qVar = (n4q) wf00VarG.get(lNLotteryBallColorDTO.getId());
            if (n4qVar == null) {
                pair = null;
            } else {
                List<String> marketOutcomeIds = lNLotteryBallColorDTO.getMarketOutcomeIds();
                ArrayList arrayList13 = new ArrayList();
                for (String str8 : marketOutcomeIds) {
                    try {
                        zi50.a aVar7 = zi50.b;
                        List listSplit$default4 = StringsKt__StringsKt.split$default(str8, new String[]{"-"}, false, 0, 6, null);
                        bVar3 = new ysq((String) listSplit$default4.get(0), (String) listSplit$default4.get(1));
                    } catch (Throwable th4) {
                        zi50.a aVar8 = zi50.b;
                        bVar3 = new zi50.b(th4);
                    }
                    if (bVar3 instanceof zi50.b) {
                        bVar3 = null;
                    }
                    ysq ysqVar = (ysq) bVar3;
                    if (ysqVar != null) {
                        arrayList13.add(ysqVar);
                    }
                }
                pair = new Pair(n4qVar, arrayList13);
            }
            if (pair != null) {
                arrayList12.add(pair);
            }
        }
        ArrayList arrayList14 = new ArrayList();
        int size8 = arrayList12.size();
        int i12 = 0;
        while (i12 < size8) {
            Object obj10 = arrayList12.get(i12);
            i12++;
            Pair pair5 = (Pair) obj10;
            Iterable iterable2 = (Iterable) pair5.b;
            ArrayList arrayList15 = new ArrayList(l48.r(iterable2, 10));
            Iterator it6 = iterable2.iterator();
            while (it6.hasNext()) {
                arrayList15.add(new Pair((ysq) it6.next(), pair5.a));
            }
            p48.w(arrayList15, arrayList14);
        }
        wf00 wf00VarG2 = a4h.g(kpu.k(arrayList14));
        List<LNLotteryBallColorDTO> colors2 = lNDrawDetailDTO4.getDraw().getColors();
        ArrayList arrayList16 = new ArrayList();
        for (LNLotteryBallColorDTO lNLotteryBallColorDTO2 : colors2) {
            n4q n4qVar2 = (n4q) wf00VarG.get(lNLotteryBallColorDTO2.getId());
            Pair pair6 = n4qVar2 == null ? null : new Pair(n4qVar2, lNLotteryBallColorDTO2.getNumbers());
            if (pair6 != null) {
                arrayList16.add(pair6);
            }
        }
        ArrayList arrayList17 = new ArrayList();
        int size9 = arrayList16.size();
        int i13 = 0;
        while (i13 < size9) {
            Object obj11 = arrayList16.get(i13);
            i13++;
            Pair pair7 = (Pair) obj11;
            Iterable iterable3 = (Iterable) pair7.b;
            ArrayList arrayList18 = new ArrayList(l48.r(iterable3, 10));
            Iterator it7 = iterable3.iterator();
            while (it7.hasNext()) {
                arrayList18.add(new Pair(Integer.valueOf(((Number) it7.next()).intValue()), pair7.a));
            }
            p48.w(arrayList18, arrayList17);
        }
        Map mapK = kpu.k(arrayList17);
        int i14 = Integer.parseInt((String) CollectionsKt.b0(StringsKt__StringsKt.split$default(lNDrawDetailDTO4.getDraw().getLottery().getGameType(), new String[]{"/"}, false, 0, 6, null)));
        LNStatisticsNumbersDTO statisticsNumbers = lNDrawDetailDTO4.getDraw().getStatisticsNumbers();
        if (statisticsNumbers == null || (mostDrawn = statisticsNumbers.getMostDrawn()) == null || (listSplit$default2 = StringsKt__StringsKt.split$default(mostDrawn, new String[]{","}, false, 0, 6, null)) == null) {
            uf00VarF = n1a0.c;
        } else {
            ArrayList arrayList19 = new ArrayList(l48.r(listSplit$default2, 10));
            Iterator it8 = listSplit$default2.iterator();
            while (it8.hasNext()) {
                arrayList19.add(Integer.valueOf(Integer.parseInt((String) it8.next())));
            }
            uf00VarF = a4h.f(arrayList19);
            if (uf00VarF == null) {
                uf00VarF = n1a0.c;
            }
        }
        LNStatisticsNumbersDTO statisticsNumbers2 = lNDrawDetailDTO4.getDraw().getStatisticsNumbers();
        if (statisticsNumbers2 == null || (leastDrawn = statisticsNumbers2.getLeastDrawn()) == null || (listSplit$default = StringsKt__StringsKt.split$default(leastDrawn, new String[]{","}, false, 0, 6, null)) == null) {
            uf00VarF2 = n1a0.c;
        } else {
            ArrayList arrayList20 = new ArrayList(l48.r(listSplit$default, 10));
            Iterator it9 = listSplit$default.iterator();
            while (it9.hasNext()) {
                arrayList20.add(Integer.valueOf(Integer.parseInt((String) it9.next())));
            }
            uf00VarF2 = a4h.f(arrayList20);
            if (uf00VarF2 == null) {
                uf00VarF2 = n1a0.c;
            }
        }
        uf00<ixp> uf00VarA = zbk.a(new IntRange(1, i14, 1), mapK, uf00VarF, uf00VarF2);
        try {
            zi50.a aVar9 = zi50.b;
            List listSplit$default5 = StringsKt__StringsKt.split$default(lNDrawDetailDTO4.getDraw().getLottery().getBonusRange(), new String[]{"-"}, false, 0, 6, null);
            bVar = zbk.a(new IntRange(Integer.parseInt((String) listSplit$default5.get(0)), Integer.parseInt((String) listSplit$default5.get(1)), 1), mapK, uf00VarF, uf00VarF2);
        } catch (Throwable th5) {
            zi50.a aVar10 = zi50.b;
            bVar = new zi50.b(th5);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        qcn qcnVar = (uf00) bVar;
        if (qcnVar == null) {
            qcnVar = n1a0.c;
        }
        qcn qcnVar2 = qcnVar;
        if (lk50Var3 instanceof lk50.a) {
            dvqVarB = dvq.a.a;
        } else if (lk50Var3 instanceof lk50.c) {
            dvqVarB = fvq.b((List) ((lk50.c) lk50Var3).a, uf00VarF4);
        } else {
            if (!Intrinsics.g(lk50Var3, lk50.b.a) && lk50Var3 != null) {
                uhc.a();
                return null;
            }
            dvqVarB = dvq.c.a;
        }
        dvq dvqVar = dvqVarB;
        if (lk50Var5 == null) {
            s4rVar = null;
        } else {
            try {
                LNBetOrderDTO lNBetOrderDTO = (LNBetOrderDTO) bm50.i(lk50Var5);
                bVar2 = (lNBetOrderDTO == null || (selections = lNBetOrderDTO.getSelections()) == null || (lNBetSelectionDTO = (LNBetSelectionDTO) CollectionsKt.firstOrNull(selections)) == null) ? null : zbk.b(lNBetSelectionDTO, uf00VarF4);
            } catch (Throwable th6) {
                zi50.a aVar11 = zi50.b;
                bVar2 = new zi50.b(th6);
            }
            if (bVar2 instanceof zi50.b) {
                bVar2 = null;
            }
            s4r s4rVar2 = (s4r.a) bVar2;
            if (s4rVar2 == null) {
                s4rVar2 = s4r.b.a;
            }
            s4rVar = s4rVar2;
        }
        boolean z = avqVar.f;
        BigDecimal bigDecimalC = zbk.c(avqVar.a);
        BigDecimal bigDecimalC2 = zbk.c(avqVar.b);
        Long l = avqVar.c;
        BigDecimal bigDecimalC3 = l != null ? zbk.c(l.longValue()) : null;
        Iterator<T> it10 = f3q.d.iterator();
        do {
            if (!it10.hasNext()) {
                next = null;
                break;
            }
            next = it10.next();
        } while (!((f3q) next).a.equals(lNDrawDetailDTO4.getDraw().getLottery().getBonusBallDrumType()));
        next.getClass();
        qxp qxpVar = new qxp(uf00VarF4, uf00VarA, qcnVar2, z, wf00VarG2, bigDecimalC, bigDecimalC2, bigDecimalC3, (f3q) next, dvqVar, s4rVar);
        if (!uf00VarF4.isEmpty()) {
            return qxpVar;
        }
        ib5.a("market group should not be empty");
        return null;
    }

    @Override // defpackage.jaj
    public final Object l(LNDrawDetailDTO lNDrawDetailDTO, Pair<? extends avq, ? extends lk50<? extends List<? extends LNMyNumberDTO>>> pair, Unit unit, lk50<? extends LNBetOrderDTO> lk50Var, v1b<? super qxp> v1bVar) {
        rbk rbkVar = new rbk(this.d, v1bVar);
        rbkVar.a = lNDrawDetailDTO;
        rbkVar.b = pair;
        rbkVar.c = lk50Var;
        return rbkVar.invokeSuspend(Unit.a);
    }
}
