package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wnh {
    public final jrm a;

    public wnh(jrm jrmVar) {
        jrmVar.getClass();
        this.a = jrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[PHI: r6
      0x0062: PHI (r6v13 com.sportybet.plugin.realsports.betslip.Selection) = (r6v11 com.sportybet.plugin.realsports.betslip.Selection), (r6v14 com.sportybet.plugin.realsports.betslip.Selection) binds: [B:23:0x0082, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    public final List a(ArrayList arrayList, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (yay.j((Selection) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            Selection selection = (Selection) obj2;
            Selection selectionS = null;
            if (z) {
                selection.getClass();
                if (yay.j(selection)) {
                    selectionS = g880.s(selection);
                    Market market = selectionS.b;
                    market.id = g880.h(selection, true);
                    market.specifier = g880.i(selection, true);
                }
                if (selectionS != null) {
                    selection = selectionS;
                }
            } else {
                if (z) {
                    uhc.a();
                    return null;
                }
                selection.getClass();
                if (yay.j(selection)) {
                    selectionS = g880.s(selection);
                    Market market2 = selectionS.b;
                    market2.id = g880.h(selection, false);
                    market2.specifier = g880.i(selection, false);
                }
                if (selectionS != null) {
                    selection = selectionS;
                }
            }
            arrayList3.add(selection);
        }
        ArrayList arrayListU = this.a.U();
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayListU.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayListU.get(i3);
            i3++;
            if (yay.j((Selection) obj3)) {
                arrayList4.add(obj3);
            }
        }
        int size4 = arrayList3.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Selection selection2 = (Selection) arrayList3.get(i4);
            Selection selection3 = (Selection) arrayList2.get(i4);
            int size5 = arrayList4.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj4 = arrayList4.get(i5);
                i5++;
                Selection selection4 = (Selection) obj4;
                if (Intrinsics.g(selection2, selection4) && !Intrinsics.g(selection3, selection4) && yay.b(selection2, selection4)) {
                    linkedHashSet.add(selection3);
                    break;
                }
            }
        }
        LinkedHashSet<Selection> linkedHashSet2 = new LinkedHashSet();
        int size6 = arrayList3.size();
        for (int i6 = 0; i6 < size6; i6++) {
            Selection selection5 = (Selection) arrayList3.get(i6);
            Selection selection6 = (Selection) arrayList2.get(i6);
            if (!linkedHashSet2.isEmpty()) {
                for (Selection selection7 : linkedHashSet2) {
                    if (Intrinsics.g(selection7, selection5) || (yay.b(selection7, selection5) && Intrinsics.g(selection7.b.id, selection5.b.id) && Intrinsics.g(selection7.b.specifier, selection5.b.specifier))) {
                        linkedHashSet.add(selection6);
                        break;
                    }
                }
            }
            linkedHashSet2.add(selection5);
        }
        return CollectionsKt.A0(linkedHashSet);
    }
}
