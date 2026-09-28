package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.protobuf.Reader;
import com.sportybet.android.instantwin.newtork.model.response.DynamicMultiBetBonus;
import com.sportybet.android.instantwin.newtork.model.response.MultiBetBonus;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o4p {
    public static final Map<Integer, Integer> r = kpu.f(new Pair(50, 47), new Pair(49, 46), new Pair(48, 45), new Pair(47, 44), new Pair(46, 43), new Pair(45, 42), new Pair(44, 41), new Pair(43, 40), new Pair(42, 39), new Pair(41, 38), new Pair(40, 37), new Pair(39, 36), new Pair(38, 35), new Pair(37, 34), new Pair(36, 33), new Pair(35, 32), new Pair(34, 31), new Pair(33, 30), new Pair(32, 29), new Pair(31, 28), new Pair(30, 27), new Pair(29, 25), new Pair(28, 24), new Pair(27, 23), new Pair(26, 22), new Pair(25, 21), new Pair(24, 20), new Pair(23, 18), new Pair(22, 17), new Pair(21, 16), new Pair(20, 14), new Pair(19, 13), new Pair(18, 11));
    public tlo b;
    public String c;
    public int h;
    public BigDecimal j;
    public BigDecimal k;
    public BigDecimal l;
    public BigDecimal m;
    public BigDecimal n;
    public boolean o;
    public Map<String, String> p;
    public Map<String, ? extends BigDecimal> q;
    public String a = SimulateBetConsts.BetslipType.SINGLE;
    public final ArrayList d = new ArrayList();
    public final SparseIntArray e = new SparseIntArray();
    public int f = Reader.READ_DONE;
    public int g = Integer.MIN_VALUE;
    public SparseArray<d> i = new SparseArray<>();

    public static final class a {
        public BigDecimal a = BigDecimal.ZERO;
        public final ArrayList b = new ArrayList();

        public final String a() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.b;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                b bVar = (b) obj;
                boolean zG = Intrinsics.g(bVar.a.marketId, "special-bb");
                BetSlipData betSlipData = bVar.a;
                if (zG) {
                    arrayList.add(betSlipData.betBuilderMarketId);
                } else {
                    arrayList.add(betSlipData.marketId);
                }
            }
            o48.u(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb.append((String) next);
            }
            return sb.toString();
        }

        public final String toString() {
            return "Bet{stake=" + this.a + ", betSlipDataList=" + this.b + "}";
        }
    }

    public static final class b {
        public final BetSlipData a;
        public final String b;

        public b(BetSlipData betSlipData) {
            betSlipData.getClass();
            this.a = betSlipData;
            BigDecimal bigDecimal = sqo.a;
            this.b = sqo.b(betSlipData.eventId, betSlipData.marketId, betSlipData.outcomeId);
        }
    }

    public static final class c {
        public final o4p a = new o4p();

        public final o4p a() {
            o4p o4pVar = this.a;
            SparseIntArray sparseIntArray = o4pVar.e;
            ArrayList arrayList = o4pVar.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                int size2 = ((a) obj).b.size();
                sparseIntArray.put(size2, sparseIntArray.get(size2) + 1);
                int i2 = o4pVar.f;
                if (size2 <= i2) {
                    i2 = size2;
                }
                o4pVar.f = i2;
                int i3 = o4pVar.g;
                if (size2 < i3) {
                    size2 = i3;
                }
                o4pVar.g = size2;
            }
            return o4pVar;
        }
    }

    public static final class d {
        public BigDecimal a;
        public BigDecimal b;
        public BigDecimal c;
        public BigDecimal d;
        public BigDecimal e;
        public BigDecimal f;
        public BigDecimal g;
        public BigDecimal h;
        public BigDecimal i;
        public boolean j;

        public d() {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            this.a = bigDecimal;
            bigDecimal.getClass();
            this.b = bigDecimal;
            bigDecimal.getClass();
            this.c = bigDecimal;
            bigDecimal.getClass();
            this.d = bigDecimal;
            bigDecimal.getClass();
            this.e = bigDecimal;
            bigDecimal.getClass();
            this.f = bigDecimal;
            bigDecimal.getClass();
            this.g = bigDecimal;
            bigDecimal.getClass();
            this.h = bigDecimal;
            bigDecimal.getClass();
            this.i = bigDecimal;
        }
    }

    public o4p() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.j = bigDecimal;
        this.k = bigDecimal;
        this.l = bigDecimal;
        this.m = bigDecimal;
        this.o = true;
        this.p = new HashMap();
        this.q = new HashMap();
    }

    public static BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal3) == 0) {
            BigDecimal bigDecimalMax = bigDecimal.max(bigDecimal2);
            bigDecimalMax.getClass();
            return bigDecimalMax;
        }
        if (bigDecimal2.compareTo(bigDecimal3) == 0) {
            return bigDecimal;
        }
        BigDecimal bigDecimalMin = bigDecimal.min(bigDecimal2);
        bigDecimalMin.getClass();
        return bigDecimalMin;
    }

    public final BigDecimal b(int i) {
        if (TextUtils.equals(SimulateBetConsts.BetslipType.SINGLE, this.a)) {
            ib5.a("can't get stake by folds for single type");
            return null;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            a aVar = (a) obj;
            if (aVar.b.size() == i) {
                return aVar.a;
            }
        }
        ib5.a(hce0.a(i, "can't find stake by folds: "));
        return null;
    }

    public final BigDecimal c(String str) {
        if (!TextUtils.equals(SimulateBetConsts.BetslipType.SINGLE, this.a)) {
            ib5.a("can't get stake by key for non-single types");
            return null;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            ArrayList arrayList2 = aVar.b;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (TextUtils.equals(str, ((b) obj2).b)) {
                    return aVar.a;
                }
            }
        }
        ib5.a("can't find stake by key: ".concat(str));
        return null;
    }

    public final boolean d() {
        tlo tloVar = this.b;
        if (tloVar == null) {
            return false;
        }
        if (tloVar.u() == 2) {
            DynamicMultiBetBonus dynamicMultiBetBonusR = tloVar.r();
            if (dynamicMultiBetBonusR != null) {
                return dynamicMultiBetBonusR.getEnable();
            }
            return false;
        }
        MultiBetBonus multiBetBonusL = tloVar.l();
        if (multiBetBonusL != null) {
            return multiBetBonusL.enable;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x028d  */
    /* JADX WARN: Code duplicated, block: B:227:0x05ec A[LOOP:0: B:5:0x0016->B:227:0x05ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x05f4 A[EDGE_INSN: B:232:0x05f4->B:228:0x05f4 BREAK  A[LOOP:0: B:5:0x0016->B:227:0x05ec], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0260  */
    public final void e() {
        SparseArray<d> sparseArray;
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalA;
        BigDecimal bigDecimalAdd2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        int i;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        boolean z;
        BigDecimal bigDecimal5;
        String str;
        boolean z2;
        SparseArray<d> sparseArray2;
        BigDecimal bigDecimal6;
        ArrayList arrayList;
        int i2;
        BigDecimal bigDecimalMultiply;
        tlo tloVar;
        BigDecimal oddsThreshold;
        BigDecimal oddsThreshold2;
        int i3;
        BigDecimal bigDecimal7;
        BigDecimal bigDecimal8;
        String str2;
        BigDecimal bigDecimal9;
        HashMap map;
        tlo tloVar2;
        BigDecimal oddsThreshold3;
        BigDecimal oddsThreshold4;
        SparseArray<d> sparseArray3 = new SparseArray<>();
        BigDecimal bigDecimalAdd3 = BigDecimal.ZERO;
        int i4 = this.f;
        int i5 = this.g;
        if (i4 <= i5) {
            int i6 = 1;
            bigDecimalA = bigDecimalAdd3;
            bigDecimalAdd2 = bigDecimalA;
            int i7 = i4;
            boolean z3 = true;
            BigDecimal bigDecimal10 = null;
            BigDecimal bigDecimal11 = bigDecimalAdd2;
            while (true) {
                d dVar = new d();
                ArrayList arrayList2 = this.d;
                if (i7 == i6) {
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    BigDecimal bigDecimal12 = BigDecimal.ZERO;
                    if (!d() || (tloVar2 = this.b) == null) {
                        z = z3;
                    } else {
                        int iU = tloVar2.u();
                        MultiBetBonus multiBetBonusL = tloVar2.l();
                        DynamicMultiBetBonus dynamicMultiBetBonusR = tloVar2.r();
                        z = z3;
                        if (iU == 2) {
                            if (dynamicMultiBetBonusR != null && (oddsThreshold4 = dynamicMultiBetBonusR.getOddsThreshold()) != null) {
                                bigDecimal12 = oddsThreshold4;
                            }
                            bigDecimal12.getClass();
                        } else {
                            if (multiBetBonusL != null && (oddsThreshold3 = multiBetBonusL.getOddsThreshold()) != null) {
                                bigDecimal12 = oddsThreshold3;
                            }
                            bigDecimal12.getClass();
                        }
                    }
                    BigDecimal bigDecimal13 = bigDecimal12;
                    HashMap map4 = new HashMap();
                    int size = arrayList2.size();
                    bigDecimal5 = bigDecimal10;
                    int i8 = 0;
                    while (i8 < size) {
                        int i9 = i8;
                        a aVar = (a) arrayList2.get(i8);
                        int i10 = size;
                        int size2 = aVar.b.size();
                        int i11 = i5;
                        ArrayList arrayList3 = aVar.b;
                        if (size2 != i7) {
                            bigDecimal9 = bigDecimal11;
                            map = map2;
                            bigDecimal8 = bigDecimalA;
                            bigDecimal7 = bigDecimalAdd2;
                        } else {
                            bigDecimal7 = bigDecimalAdd2;
                            BigDecimal bigDecimalAdd4 = dVar.c.add(aVar.a);
                            bigDecimalAdd4.getClass();
                            dVar.c = bigDecimalAdd4;
                            BetSlipData betSlipData = ((b) arrayList3.get(0)).a;
                            bigDecimal8 = bigDecimalA;
                            if (Intrinsics.g(betSlipData.marketId, "special-bb")) {
                                str2 = betSlipData.betBuilderMarketId;
                                str2.getClass();
                            } else {
                                str2 = betSlipData.marketId;
                                str2.getClass();
                            }
                            BigDecimal bigDecimal14 = aVar.a;
                            bigDecimal14.getClass();
                            bigDecimal9 = bigDecimal11;
                            BigDecimal bigDecimalMultiply2 = bigDecimal14.multiply(new BigDecimal(betSlipData.odds));
                            BigDecimal bigDecimal15 = dVar.a;
                            bigDecimalMultiply2.getClass();
                            BigDecimal bigDecimalA2 = a(bigDecimal15, bigDecimalMultiply2);
                            tlo tloVar3 = this.b;
                            tloVar3.getClass();
                            BigDecimal bigDecimalMin = bigDecimalA2.min(tloVar3.i());
                            bigDecimalMin.getClass();
                            dVar.a = bigDecimalMin;
                            if (map2.containsKey(str2)) {
                                Object obj = map2.get(str2);
                                obj.getClass();
                                map2.put(str2, ((BigDecimal) obj).add(bigDecimalMultiply2));
                            } else {
                                map2.put(str2, bigDecimalMultiply2);
                            }
                            if (map3.containsKey(str2)) {
                                Object obj2 = map3.get(str2);
                                obj2.getClass();
                                map3.put(str2, ((BigDecimal) obj2).add(aVar.a));
                            } else {
                                map3.put(str2, aVar.a);
                            }
                            BigDecimal bigDecimalMultiply3 = BigDecimal.ONE;
                            int size3 = arrayList3.size();
                            int i12 = 0;
                            int i13 = 0;
                            while (i13 < size3) {
                                Object obj3 = arrayList3.get(i13);
                                i13++;
                                ArrayList arrayList4 = arrayList3;
                                b bVar = (b) obj3;
                                HashMap map5 = map2;
                                BigDecimal bigDecimal16 = new BigDecimal(bVar.a.odds);
                                if (d() && bigDecimal16.compareTo(bigDecimal13) >= 0) {
                                    i12++;
                                }
                                bigDecimalMultiply3 = bigDecimalMultiply3.multiply(bigDecimal16);
                                map2 = map5;
                                arrayList3 = arrayList4;
                            }
                            map = map2;
                            String strA = aVar.a();
                            if (map4.containsKey(strA)) {
                                Object obj4 = map4.get(strA);
                                obj4.getClass();
                                int iIntValue = ((Number) obj4).intValue();
                                if (iIntValue >= i12) {
                                    i12 = iIntValue;
                                }
                                map4.put(strA, Integer.valueOf(i12));
                            } else {
                                map4.put(strA, Integer.valueOf(i12));
                            }
                        }
                        i8 = i9 + 1;
                        size = i10;
                        i5 = i11;
                        bigDecimalAdd2 = bigDecimal7;
                        bigDecimalA = bigDecimal8;
                        bigDecimal11 = bigDecimal9;
                        map2 = map;
                    }
                    bigDecimal2 = bigDecimal11;
                    i = i5;
                    bigDecimal3 = bigDecimalA;
                    bigDecimal4 = bigDecimalAdd2;
                    Collection collectionValues = map2.values();
                    collectionValues.getClass();
                    BigDecimal bigDecimalAdd5 = BigDecimal.ZERO;
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        bigDecimalAdd5 = bigDecimalAdd5.add((BigDecimal) it.next());
                    }
                    tlo tloVar4 = this.b;
                    tloVar4.getClass();
                    BigDecimal bigDecimalMin2 = bigDecimalAdd5.min(tloVar4.i());
                    bigDecimalMin2.getClass();
                    dVar.b = bigDecimalMin2;
                    Collection collectionValues2 = map3.values();
                    collectionValues2.getClass();
                    BigDecimal bigDecimalAdd6 = BigDecimal.ZERO;
                    Iterator it2 = collectionValues2.iterator();
                    while (it2.hasNext()) {
                        bigDecimalAdd6 = bigDecimalAdd6.add((BigDecimal) it2.next());
                    }
                    bigDecimalAdd6.getClass();
                    dVar.i = bigDecimalAdd6;
                    if (d()) {
                        Collection collectionValues3 = map4.values();
                        collectionValues3.getClass();
                        Integer num = (Integer) CollectionsKt.e0(collectionValues3);
                        if (num != null) {
                            this.h = num.intValue();
                        }
                    }
                    sparseArray2 = sparseArray3;
                    bigDecimal6 = bigDecimalAdd3;
                    arrayList = arrayList2;
                } else {
                    bigDecimal2 = bigDecimal11;
                    i = i5;
                    bigDecimal3 = bigDecimalA;
                    bigDecimal4 = bigDecimalAdd2;
                    z = z3;
                    bigDecimal5 = bigDecimal10;
                    tlo tloVar5 = this.b;
                    int iU2 = tloVar5 != null ? tloVar5.u() : 0;
                    String str3 = this.a;
                    tlo tloVar6 = this.b;
                    int iU3 = tloVar6 != null ? tloVar6.u() : 0;
                    tlo tloVar7 = this.b;
                    if (tloVar7 == null) {
                        str = null;
                    } else if (tloVar7.n()) {
                        str = SimulateBetConsts.BetslipType.FLEX;
                    } else if (tloVar7.k()) {
                        str = SimulateBetConsts.BetslipType.CUTBET;
                    } else {
                        str = null;
                    }
                    if (!str3.equals(SimulateBetConsts.BetslipType.MULTIPLE) || str == null) {
                        str = str3;
                    }
                    if (iU3 == 2 ? str.equals(SimulateBetConsts.BetslipType.SINGLE) || str.equals(SimulateBetConsts.BetslipType.FLEX) : str3.equals(SimulateBetConsts.BetslipType.SINGLE)) {
                        z2 = false;
                    } else if (d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    BigDecimal bigDecimal17 = BigDecimal.ZERO;
                    if (z2 && (tloVar = this.b) != null) {
                        int iU4 = tloVar.u();
                        MultiBetBonus multiBetBonusL2 = tloVar.l();
                        DynamicMultiBetBonus dynamicMultiBetBonusR2 = tloVar.r();
                        if (iU4 == 2) {
                            if (dynamicMultiBetBonusR2 != null && (oddsThreshold2 = dynamicMultiBetBonusR2.getOddsThreshold()) != null) {
                                bigDecimal17 = oddsThreshold2;
                            }
                            bigDecimal17.getClass();
                        } else {
                            if (multiBetBonusL2 != null && (oddsThreshold = multiBetBonusL2.getOddsThreshold()) != null) {
                                bigDecimal17 = oddsThreshold;
                            }
                            bigDecimal17.getClass();
                        }
                    }
                    int size4 = arrayList2.size();
                    HashMap map6 = new HashMap();
                    HashMap map7 = new HashMap();
                    HashMap map8 = new HashMap();
                    HashMap map9 = new HashMap();
                    HashMap map10 = new HashMap();
                    int i14 = 0;
                    while (i14 < size4) {
                        boolean z4 = z2;
                        a aVar2 = (a) arrayList2.get(i14);
                        int i15 = size4;
                        int size5 = aVar2.b.size();
                        int i16 = i14;
                        ArrayList arrayList5 = aVar2.b;
                        if (size5 != i7) {
                            i2 = iU2;
                            bigDecimal17 = bigDecimal17;
                        } else {
                            BigDecimal bigDecimal18 = BigDecimal.ONE;
                            int size6 = arrayList5.size();
                            BigDecimal bigDecimalMultiply4 = bigDecimal18;
                            BigDecimal bigDecimalMultiply5 = bigDecimalMultiply4;
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < size6) {
                                Object obj5 = arrayList5.get(i17);
                                int i19 = i17 + 1;
                                b bVar2 = (b) obj5;
                                int i20 = size6;
                                BigDecimal bigDecimal19 = new BigDecimal(bVar2.a.odds);
                                boolean z5 = z4 && bigDecimal19.compareTo(bigDecimal17) >= 0;
                                if (z5) {
                                    i18++;
                                }
                                boolean z6 = z5;
                                if (iU2 == 2 && z6) {
                                    bigDecimalMultiply4 = bigDecimalMultiply4.multiply(bigDecimal19);
                                } else if (iU2 != 2) {
                                    bigDecimalMultiply4 = bigDecimalMultiply4.multiply(bigDecimal19);
                                }
                                bigDecimalMultiply5 = bigDecimalMultiply5.multiply(bigDecimal19);
                                size6 = i20;
                                i17 = i19;
                            }
                            BigDecimal bigDecimal20 = BigDecimal.ONE;
                            i2 = iU2;
                            BigDecimal bigDecimalMultiply6 = bigDecimal20.multiply(bigDecimalMultiply5).multiply(aVar2.a);
                            if (z4) {
                                tlo tloVar8 = this.b;
                                bigDecimalMultiply = bigDecimal20.multiply(bigDecimalMultiply4).multiply(aVar2.a).multiply(tloVar8 != null ? sqf0.c(i18, arrayList5, i2, tloVar8.l(), tloVar8.r(), tloVar8.c(), tloVar8.t()) : BigDecimal.ZERO);
                            } else {
                                i18 = i18;
                                bigDecimalMultiply = BigDecimal.ZERO;
                            }
                            String strA2 = aVar2.a();
                            if (map6.containsKey(strA2)) {
                                Object obj6 = map6.get(strA2);
                                obj6.getClass();
                                map6.put(strA2, ((BigDecimal) obj6).add(bigDecimalMultiply6));
                            } else {
                                map6.put(strA2, bigDecimalMultiply6);
                            }
                            if (map7.containsKey(strA2)) {
                                Object obj7 = map7.get(strA2);
                                obj7.getClass();
                                map7.put(strA2, ((BigDecimal) obj7).add(aVar2.a));
                            } else {
                                map7.put(strA2, aVar2.a);
                            }
                            if (map9.containsKey(strA2)) {
                                Object obj8 = map9.get(strA2);
                                obj8.getClass();
                                map9.put(strA2, ((BigDecimal) obj8).add(bigDecimalMultiply));
                            } else {
                                map9.put(strA2, bigDecimalMultiply);
                            }
                            if (map8.containsKey(strA2)) {
                                Object obj9 = map8.get(strA2);
                                obj9.getClass();
                                map8.put(strA2, ((BigDecimal) obj9).add(bigDecimalMultiply5));
                            } else {
                                map8.put(strA2, bigDecimalMultiply5);
                            }
                            if (map10.containsKey(strA2)) {
                                Object obj10 = map10.get(strA2);
                                obj10.getClass();
                                int iIntValue2 = ((Number) obj10).intValue();
                                if (iIntValue2 >= i18) {
                                    i18 = iIntValue2;
                                }
                                map10.put(strA2, Integer.valueOf(i18));
                            } else {
                                map10.put(strA2, Integer.valueOf(i18));
                            }
                            BigDecimal bigDecimalAdd7 = dVar.c.add(aVar2.a);
                            bigDecimalAdd7.getClass();
                            dVar.c = bigDecimalAdd7;
                            BigDecimal bigDecimal21 = dVar.d;
                            bigDecimalMultiply5.getClass();
                            dVar.d = a(bigDecimal21, bigDecimalMultiply5);
                            BigDecimal bigDecimal22 = dVar.a;
                            bigDecimalMultiply6.getClass();
                            BigDecimal bigDecimalA3 = a(bigDecimal22, bigDecimalMultiply6);
                            tlo tloVar9 = this.b;
                            tloVar9.getClass();
                            BigDecimal bigDecimalMin3 = bigDecimalA3.min(tloVar9.i());
                            bigDecimalMin3.getClass();
                            dVar.a = bigDecimalMin3;
                            BigDecimal bigDecimal23 = dVar.g;
                            bigDecimalMultiply.getClass();
                            BigDecimal bigDecimalA4 = a(bigDecimal23, bigDecimalMultiply);
                            tlo tloVar10 = this.b;
                            tloVar10.getClass();
                            BigDecimal bigDecimalMin4 = bigDecimalA4.min(tloVar10.i());
                            bigDecimalMin4.getClass();
                            dVar.g = bigDecimalMin4;
                        }
                        i14 = i16 + 1;
                        size4 = i15;
                        bigDecimal17 = bigDecimal17;
                        iU2 = i2;
                        z2 = z4;
                        arrayList2 = arrayList2;
                        bigDecimalAdd3 = bigDecimalAdd3;
                        sparseArray3 = sparseArray3;
                    }
                    sparseArray2 = sparseArray3;
                    bigDecimal6 = bigDecimalAdd3;
                    boolean z7 = z2;
                    arrayList = arrayList2;
                    Collection collectionValues4 = map6.values();
                    collectionValues4.getClass();
                    BigDecimal bigDecimalAdd8 = BigDecimal.ZERO;
                    Iterator it3 = collectionValues4.iterator();
                    while (it3.hasNext()) {
                        bigDecimalAdd8 = bigDecimalAdd8.add((BigDecimal) it3.next());
                    }
                    tlo tloVar11 = this.b;
                    tloVar11.getClass();
                    BigDecimal bigDecimalMin5 = bigDecimalAdd8.min(tloVar11.i());
                    bigDecimalMin5.getClass();
                    dVar.b = bigDecimalMin5;
                    Collection collectionValues5 = map7.values();
                    collectionValues5.getClass();
                    BigDecimal bigDecimalAdd9 = BigDecimal.ZERO;
                    Iterator it4 = collectionValues5.iterator();
                    while (it4.hasNext()) {
                        bigDecimalAdd9 = bigDecimalAdd9.add((BigDecimal) it4.next());
                    }
                    bigDecimalAdd9.getClass();
                    dVar.i = bigDecimalAdd9;
                    Collection collectionValues6 = map8.values();
                    collectionValues6.getClass();
                    BigDecimal bigDecimalAdd10 = BigDecimal.ZERO;
                    Iterator it5 = collectionValues6.iterator();
                    while (it5.hasNext()) {
                        bigDecimalAdd10 = bigDecimalAdd10.add((BigDecimal) it5.next());
                    }
                    bigDecimalAdd10.getClass();
                    dVar.e = bigDecimalAdd10;
                    if (bigDecimalAdd10.compareTo(dVar.d) == 0) {
                        BigDecimal bigDecimal24 = BigDecimal.ZERO;
                        bigDecimal24.getClass();
                        dVar.a = bigDecimal24;
                    }
                    Collection collectionValues7 = map9.values();
                    collectionValues7.getClass();
                    BigDecimal bigDecimalAdd11 = BigDecimal.ZERO;
                    Iterator it6 = collectionValues7.iterator();
                    while (it6.hasNext()) {
                        bigDecimalAdd11 = bigDecimalAdd11.add((BigDecimal) it6.next());
                    }
                    bigDecimalAdd11.getClass();
                    dVar.f = bigDecimalAdd11;
                    dVar.h = bigDecimalAdd11;
                    BigDecimal bigDecimal25 = dVar.f;
                    tlo tloVar12 = this.b;
                    tloVar12.getClass();
                    BigDecimal bigDecimalMin6 = bigDecimal25.min(tloVar12.i());
                    bigDecimalMin6.getClass();
                    dVar.f = bigDecimalMin6;
                    if (z7) {
                        Collection collectionValues8 = map10.values();
                        collectionValues8.getClass();
                        Integer num2 = (Integer) CollectionsKt.e0(collectionValues8);
                        if (num2 != null) {
                            this.h = num2.intValue();
                        }
                    }
                }
                if (dVar.d.compareTo(dVar.e) == 0) {
                    i3 = 1;
                    dVar.j = true;
                } else {
                    i3 = 1;
                }
                sparseArray = sparseArray2;
                sparseArray.put(i7, dVar);
                bigDecimalAdd3 = bigDecimal6.add(dVar.c);
                bigDecimalAdd = bigDecimal2.add(dVar.f);
                bigDecimal3.getClass();
                bigDecimalA = a(bigDecimal3, dVar.g);
                bigDecimalAdd2 = bigDecimal4.add(dVar.h);
                if (z) {
                    int size7 = arrayList.size();
                    bigDecimal10 = bigDecimal5;
                    int i21 = 0;
                    while (true) {
                        if (i21 < size7) {
                            ArrayList arrayList6 = arrayList;
                            Object obj11 = arrayList6.get(i21);
                            i21++;
                            a aVar3 = (a) obj11;
                            if (bigDecimal10 == null) {
                                bigDecimal10 = aVar3.a;
                            } else if (bigDecimal10.compareTo(aVar3.a) != 0) {
                                z3 = false;
                                bigDecimal10 = null;
                                break;
                            }
                            arrayList = arrayList6;
                        }
                    }
                    if (i7 != i) {
                        break;
                    }
                    i7++;
                    i6 = i3;
                    sparseArray3 = sparseArray;
                    bigDecimal11 = bigDecimalAdd;
                    i5 = i;
                } else {
                    bigDecimal10 = bigDecimal5;
                }
                z3 = z;
                if (i7 != i) {
                    break;
                    break;
                }
                i7++;
                i6 = i3;
                sparseArray3 = sparseArray;
                bigDecimal11 = bigDecimalAdd;
                i5 = i;
            }
            bigDecimal = bigDecimal10;
        } else {
            sparseArray = sparseArray3;
            bigDecimalAdd = bigDecimalAdd3;
            bigDecimalA = bigDecimalAdd;
            bigDecimalAdd2 = bigDecimalA;
            bigDecimal = null;
        }
        this.i = sparseArray;
        this.j = bigDecimalAdd3;
        this.k = bigDecimalAdd;
        this.l = bigDecimalA;
        this.m = bigDecimalAdd2;
        this.n = bigDecimal;
    }

    public final void f(int i, BigDecimal bigDecimal) {
        if (TextUtils.equals(SimulateBetConsts.BetslipType.SINGLE, this.a)) {
            ib5.a("can't set stake by folds for single type");
            return;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a aVar = (a) obj;
            if (aVar.b.size() == i && aVar.a.compareTo(bigDecimal) != 0) {
                aVar.a = bigDecimal;
                i2++;
            }
        }
        if (i2 > 0) {
            e();
        }
    }

    public final void g(BigDecimal bigDecimal) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            a aVar = (a) obj;
            if (aVar.a.compareTo(bigDecimal) != 0) {
                aVar.a = bigDecimal;
                i++;
            }
        }
        if (i > 0) {
            e();
        }
    }

    public final void h(BigDecimal bigDecimal, String str) {
        if (!TextUtils.equals(SimulateBetConsts.BetslipType.SINGLE, this.a)) {
            ib5.a("can't set stake by key for non-single types");
            return;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            a aVar = (a) obj;
            ArrayList arrayList2 = aVar.b;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                if (TextUtils.equals(str, ((b) obj2).b)) {
                    if (aVar.a.compareTo(bigDecimal) == 0) {
                        break;
                    }
                    aVar.a = bigDecimal;
                    i++;
                    break;
                }
            }
        }
        if (i > 0) {
            e();
        }
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("TicketData{betslipType='", this.a, "', roundId='", this.c, "', bets=");
        sbA.append(this.d);
        sbA.append("}");
        return sbA.toString();
    }
}
