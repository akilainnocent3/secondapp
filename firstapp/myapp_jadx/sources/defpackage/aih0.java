package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class aih0 {
    public final jrm a;

    public aih0(jrm jrmVar) {
        jrmVar.getClass();
        this.a = jrmVar;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Selection selection = (Selection) obj;
            if (u7u.e(selection) || u7u.f(selection) || (rlc.b(selection) && !rlc.c(selection))) {
                if (!selection.n()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static boolean d(Selection selection, Selection selection2) {
        if (Intrinsics.g(selection, selection2) || rlc.a(selection, selection2)) {
            return true;
        }
        return u7u.d(selection, selection2) && Intrinsics.g(selection.b.id, selection2.b.id);
    }

    public final List<Selection> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayListA = a(this.a.U());
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            Selection selection = (Selection) obj;
            if (!linkedHashSet2.isEmpty()) {
                Iterator it = linkedHashSet2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (d((Selection) it.next(), selection)) {
                            linkedHashSet.add(selection);
                            break;
                        }
                    }
                }
            }
            linkedHashSet2.add(selection);
        }
        return CollectionsKt.A0(linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r5
      0x0065: PHI (r5v4 com.sportybet.plugin.realsports.betslip.Selection) = 
      (r5v1 com.sportybet.plugin.realsports.betslip.Selection)
      (r5v3 com.sportybet.plugin.realsports.betslip.Selection)
      (r5v5 com.sportybet.plugin.realsports.betslip.Selection)
      (r5v7 com.sportybet.plugin.realsports.betslip.Selection)
      (r5v9 com.sportybet.plugin.realsports.betslip.Selection)
      (r5v10 com.sportybet.plugin.realsports.betslip.Selection)
     binds: [B:71:0x00f0, B:60:0x00cd, B:55:0x00c0, B:42:0x0099, B:31:0x0076, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    public final List<Selection> c(List<? extends Selection> list, huy huyVar, avy avyVar) {
        String str;
        String str2;
        String str3;
        String str4;
        list.getClass();
        huyVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayListA = a(list);
        ArrayList arrayList = new ArrayList(l48.r(arrayListA, 10));
        int size = arrayListA.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            Selection selectionS = null;
            if (i2 < size) {
                Object obj = arrayListA.get(i2);
                i2++;
                Selection selection = (Selection) obj;
                int iOrdinal = avyVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            int iOrdinal2 = huyVar.ordinal();
                            String str5 = lTGEJfVytU.mzf;
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 == 1) {
                                    selection.getClass();
                                    if (u7u.f(selection)) {
                                        selectionS = g880.s(selection);
                                        Market market = selectionS.b;
                                        MarketExtend marketExtendB = xvy.b(selection.b);
                                        if (marketExtendB != null && (str4 = marketExtendB.rootMarketId) != null) {
                                            str5 = str4;
                                        }
                                        market.id = str5;
                                    }
                                    if (selectionS != null) {
                                        selection = selectionS;
                                    }
                                } else {
                                    uhc.a();
                                    return null;
                                }
                            } else if (rlc.b(selection)) {
                                selectionS = rlc.h(selection);
                                if (selectionS != null) {
                                    selection = selectionS;
                                }
                            } else {
                                selection.getClass();
                                if (u7u.e(selection)) {
                                    selectionS = g880.s(selection);
                                    Market market2 = selectionS.b;
                                    MarketExtend marketExtendA = xvy.a(selection.b);
                                    if (marketExtendA != null && (str3 = marketExtendA.rootMarketId) != null) {
                                        str5 = str3;
                                    }
                                    market2.id = str5;
                                }
                                if (selectionS != null) {
                                    selection = selectionS;
                                }
                            }
                        } else {
                            uhc.a();
                            return null;
                        }
                    } else {
                        selection.getClass();
                        if (u7u.i(selection)) {
                            selectionS = g880.s(selection);
                            Market market3 = selectionS.b;
                            MarketExtend marketExtendB2 = xvy.b(selection.b);
                            if (marketExtendB2 == null || (str2 = marketExtendB2.nodeMarketId) == null) {
                                str2 = "60100";
                            }
                            market3.id = str2;
                        }
                        if (selectionS != null) {
                            selection = selectionS;
                        }
                    }
                } else if (rlc.b(selection)) {
                    selectionS = rlc.g(selection);
                    if (selectionS != null) {
                        selection = selectionS;
                    }
                } else {
                    selection.getClass();
                    if (u7u.h(selection)) {
                        selectionS = g880.s(selection);
                        Market market4 = selectionS.b;
                        MarketExtend marketExtendA2 = xvy.a(selection.b);
                        if (marketExtendA2 == null || (str = marketExtendA2.nodeMarketId) == null) {
                            str = "60200";
                        }
                        market4.id = str;
                    }
                    if (selectionS != null) {
                        selection = selectionS;
                    }
                }
                arrayList.add(selection);
            } else {
                ArrayList arrayListA2 = a(this.a.U());
                int size2 = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    int i5 = i3 + 1;
                    if (i3 >= 0) {
                        Selection selection2 = (Selection) obj2;
                        Selection selection3 = (Selection) arrayListA.get(i3);
                        if (!arrayListA2.isEmpty()) {
                            int size3 = arrayListA2.size();
                            int i6 = 0;
                            while (i6 < size3) {
                                Object obj3 = arrayListA2.get(i6);
                                i6++;
                                Selection selection4 = (Selection) obj3;
                                if (Intrinsics.g(selection2, selection4) && !Intrinsics.g(selection3, selection4) && (u7u.d(selection3, selection4) || rlc.a(selection3, selection4))) {
                                    linkedHashSet.add(selection3);
                                    break;
                                }
                            }
                        }
                        i3 = i5;
                    } else {
                        b.q();
                        throw null;
                    }
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size4 = arrayList.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj4 = arrayList.get(i7);
                    i7++;
                    int i8 = i + 1;
                    if (i >= 0) {
                        Selection selection5 = (Selection) obj4;
                        if (!linkedHashSet2.isEmpty()) {
                            Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                if (d((Selection) it.next(), selection5)) {
                                    linkedHashSet.add(arrayListA.get(i));
                                    break;
                                }
                            }
                        }
                        linkedHashSet2.add(selection5);
                        i = i8;
                    } else {
                        b.q();
                        throw null;
                    }
                }
                return CollectionsKt.A0(linkedHashSet);
            }
        }
    }
}
