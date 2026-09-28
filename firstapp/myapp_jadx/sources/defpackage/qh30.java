package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.realsports.MaxCombinationRejectConfig;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckBetDto;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckRequestDto;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckSelectionDto;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qh30 {
    public final jrm a;
    public final lrm b;

    public static final class a<T> {
        public final List<List<T>> a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends List<? extends T>> list, boolean z) {
            list.getClass();
            this.a = list;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CombinationResult(combos=" + this.a + ", truncated=" + this.b + ")";
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OrderBetType.values().length];
            try {
                iArr[OrderBetType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderBetType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderBetType.FLEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderBetType.ONE_CUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderBetType.ANY_WIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public qh30(jrm jrmVar, lrm lrmVar) {
        jrmVar.getClass();
        lrmVar.getClass();
        this.a = jrmVar;
        this.b = lrmVar;
    }

    public static void a(ArrayList arrayList, Selection selection) {
        List<PreCannedBBOutcome> list = selection.c.childOutcomes;
        if (!selection.p()) {
            if (list == null || list.isEmpty()) {
                arrayList.add(new ci30(selection.getEventId(), selection.getMarketId(), selection.getOutcomeId(), selection.getSpecifier(), null));
                return;
            }
            for (PreCannedBBOutcome preCannedBBOutcome : list) {
                arrayList.add(new ci30(selection.getEventId(), String.valueOf(preCannedBBOutcome.getMarketId()), preCannedBBOutcome.getOutcomeId(), preCannedBBOutcome.getSpecifier(), null));
            }
            return;
        }
        Iterable<Selection> iterable = selection.d;
        if (iterable == null) {
            iterable = m2g.a;
        }
        for (Selection selection2 : iterable) {
            selection2.getClass();
            arrayList.add(new ci30(selection2.getEventId(), selection2.getMarketId(), selection2.getOutcomeId(), selection2.getSpecifier(), selection.b.id));
        }
        arrayList.add(new ci30(selection.getEventId(), selection.getMarketId(), selection.getOutcomeId(), selection.getSpecifier(), null));
    }

    public final th30 b(OrderBetType orderBetType, MaxCombinationRejectConfig maxCombinationRejectConfig) {
        int i;
        ArrayList arrayList;
        String str;
        a aVar;
        Integer maxCombinations;
        orderBetType.getClass();
        maxCombinationRejectConfig.getClass();
        boolean zG = Intrinsics.g(maxCombinationRejectConfig.getEnabled(), Boolean.TRUE);
        int iIntValue = Reader.READ_DONE;
        if (zG && (maxCombinations = maxCombinationRejectConfig.getMaxCombinations()) != null) {
            iIntValue = maxCombinations.intValue();
        }
        ArrayList arrayListU = this.a.U();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListU.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListU.get(i3);
            i3++;
            if (qz3.b((Selection) obj)) {
                arrayList2.add(obj);
            }
        }
        int i4 = b.a[orderBetType.ordinal()];
        lrm lrmVar = this.b;
        if (i4 == 1) {
            i = 0;
            ArrayList arrayList3 = new ArrayList();
            ConcurrentHashMap concurrentHashMapB = lrmVar.B();
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                Selection selection = (Selection) obj2;
                if (concurrentHashMapB.containsKey(selection) && (str = (String) concurrentHashMapB.get(selection)) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    a(arrayList4, selection);
                    arrayList3.add(new mh30(arrayList4, Long.valueOf(lrmVar.s(str))));
                }
            }
            arrayList = arrayList3;
        } else if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
            sl8 sl8VarA = vl8.a(new nh30(), new oh30(), new a03(1), new ph30());
            ArrayList arrayList5 = new ArrayList();
            String str2 = lrmVar.d0().a;
            str2.getClass();
            long jS = lrmVar.s(str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size3 = arrayList2.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList2.get(i6);
                i6++;
                Event event = ((Selection) obj3).a;
                Object arrayList6 = linkedHashMap.get(event);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap.put(event, arrayList6);
                }
                ((List) arrayList6).add(obj3);
            }
            Collection collectionValues = linkedHashMap.values();
            ArrayList arrayList7 = new ArrayList(l48.r(collectionValues, 10));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList7.add(CollectionsKt.r0((List) it.next(), sl8VarA));
            }
            List listA0 = CollectionsKt.A0(CollectionsKt.r0(arrayList7, new rh30()));
            if (!listA0.isEmpty()) {
                if (!listA0.isEmpty()) {
                    Iterator it2 = listA0.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((List) it2.next()).isEmpty()) {
                                i = 0;
                                aVar = new a(m2g.a, false);
                            }
                        }
                    }
                }
                ArrayList arrayListL = kotlin.collections.b.l(m2g.a);
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = listA0.iterator();
                loop7: while (true) {
                    if (!it3.hasNext()) {
                        i = 0;
                        aVar = new a(arrayList8, false);
                        break;
                    }
                    List list = (List) it3.next();
                    ArrayList arrayList9 = new ArrayList();
                    int size4 = arrayListL.size();
                    int i7 = i2;
                    while (i7 < size4) {
                        Object obj4 = arrayListL.get(i7);
                        i7++;
                        List list2 = (List) obj4;
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayListJ0 = CollectionsKt.j0(list2, (Selection) it4.next());
                            listA0 = listA0;
                            if (arrayListJ0.size() == listA0.size()) {
                                arrayList8.add(arrayListJ0);
                                if (arrayList8.size() >= iIntValue) {
                                    aVar = new a(arrayList8, true);
                                    i = 0;
                                    break loop7;
                                }
                            } else {
                                arrayList9.add(arrayListJ0);
                            }
                            i2 = 0;
                        }
                    }
                    arrayListL = arrayList9;
                }
            } else {
                i = 0;
                aVar = new a(m2g.a, false);
            }
            for (List list3 : aVar.a) {
                ArrayList arrayList10 = new ArrayList();
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    a(arrayList10, (Selection) it5.next());
                }
                arrayList5.add(new mh30(arrayList10, Long.valueOf(jS)));
            }
            arrayList = arrayList5;
        } else {
            arrayList = new ArrayList();
            i = 0;
        }
        ArrayList arrayList11 = new ArrayList(l48.r(arrayList2, 10));
        int size5 = arrayList2.size();
        int i8 = i;
        while (i8 < size5) {
            Object obj5 = arrayList2.get(i8);
            i8++;
            Selection selection2 = (Selection) obj5;
            selection2.getClass();
            arrayList11.add(new ci30(selection2.getEventId(), selection2.getMarketId(), selection2.getOutcomeId(), selection2.getSpecifier(), null));
        }
        int value = orderBetType.getValue();
        ArrayList arrayList12 = new ArrayList(l48.r(arrayList, 10));
        int size6 = arrayList.size();
        int i9 = i;
        while (i9 < size6) {
            Object obj6 = arrayList.get(i9);
            i9++;
            mh30 mh30Var = (mh30) obj6;
            mh30Var.getClass();
            ArrayList arrayList13 = mh30Var.a;
            ArrayList arrayList14 = new ArrayList(l48.r(arrayList13, 10));
            int size7 = arrayList13.size();
            int i10 = i;
            while (i10 < size7) {
                Object obj7 = arrayList13.get(i10);
                i10++;
                ci30 ci30Var = (ci30) obj7;
                ci30Var.getClass();
                arrayList14.add(new QuickLiabilityCheckSelectionDto(ci30Var.a, ci30Var.b, ci30Var.c, ci30Var.d, ci30Var.e));
                arrayList = arrayList;
            }
            arrayList12.add(new QuickLiabilityCheckBetDto(arrayList14, mh30Var.b));
            arrayList = arrayList;
            i = 0;
        }
        return new th30(new QuickLiabilityCheckRequestDto(arrayList12, Integer.valueOf(value)), arrayList11);
    }
}
