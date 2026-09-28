package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dh2 extends pf implements iaj<BetBuilderConfig, List<? extends hh2>, BetBuilderOutcome, v1b<? super Map<String, ? extends gh2>>, Object> {
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    @Override // defpackage.iaj
    public final Object d(BetBuilderConfig betBuilderConfig, List<? extends hh2> list, BetBuilderOutcome betBuilderOutcome, v1b<? super Map<String, ? extends gh2>> v1bVar) {
        Iterator it;
        BetBuilderOutcome betBuilderOutcome2;
        ArrayList arrayList;
        int i;
        boolean z;
        ArrayList arrayListC0;
        BetBuilderConfig betBuilderConfig2 = betBuilderConfig;
        List<? extends hh2> list2 = list;
        BetBuilderOutcome betBuilderOutcome3 = betBuilderOutcome;
        ((fh2) this.a).getClass();
        if (list2.isEmpty()) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        xnu xnuVar = new xnu();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = ((hh2) it2.next()).b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                ih2 ih2Var = (ih2) obj;
                String str = ih2Var.a;
                String str2 = ih2Var.c;
                String str3 = ih2Var.b;
                BetBuilderRequest betBuilderRequest = new BetBuilderRequest(str, str3, str2);
                List list3 = betBuilderOutcome3.originalData;
                if (list3 == null) {
                    list3 = m2g.a;
                }
                boolean zContains = list3.contains(betBuilderRequest);
                String strA = oxc.a(ih2Var.a, ":", str3);
                String str4 = ih2Var.a;
                String str5 = ih2Var.d;
                String str6 = ih2Var.e;
                boolean z2 = ih2Var.f;
                BetBuilderConfig betBuilderConfig3 = betBuilderConfig2;
                if (zContains) {
                    it = it2;
                    betBuilderOutcome2 = betBuilderOutcome3;
                    arrayList = arrayList2;
                    i = size;
                    z = false;
                } else {
                    List list4 = betBuilderOutcome3.originalData;
                    if (list4 == null) {
                        list4 = m2g.a;
                    }
                    if (betBuilderConfig3 == null || list4.isEmpty()) {
                        it = it2;
                        betBuilderOutcome2 = betBuilderOutcome3;
                        arrayList = arrayList2;
                        i = size;
                    } else {
                        List list5 = list4;
                        HashMap<String, List<Integer>> mutexMapping = betBuilderConfig3.getMutexMapping();
                        it = it2;
                        List<Integer> list6 = mutexMapping.get(betBuilderRequest.lookupKey);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list5.iterator();
                        ArrayList arrayList4 = arrayList3;
                        while (true) {
                            if (it3.hasNext()) {
                                betBuilderOutcome2 = betBuilderOutcome3;
                                BetBuilderRequest betBuilderRequest2 = (BetBuilderRequest) it3.next();
                                arrayList = arrayList2;
                                i = size;
                                if (!Intrinsics.g(betBuilderRequest2.marketId, betBuilderRequest.marketId)) {
                                    List<Integer> list7 = mutexMapping.get(betBuilderRequest2.lookupKey);
                                    List listC = fh2.c(list6, list7);
                                    if (!listC.isEmpty() && !fh2.d(list7, listC) && !fh2.d(list6, listC)) {
                                        if (arrayList4.isEmpty()) {
                                            if (list7 == null) {
                                                list7 = m2g.a;
                                            }
                                            arrayListC0 = CollectionsKt.C0(list7);
                                        } else {
                                            arrayListC0 = CollectionsKt.C0(fh2.c(arrayList4, list7));
                                        }
                                        arrayList2 = arrayList;
                                        arrayList4 = arrayListC0;
                                        betBuilderOutcome3 = betBuilderOutcome2;
                                        size = i;
                                    }
                                }
                            } else {
                                betBuilderOutcome2 = betBuilderOutcome3;
                                arrayList = arrayList2;
                                i = size;
                                ArrayList arrayList5 = arrayList4;
                                List listC2 = fh2.c(arrayList5, list6);
                                if (listC2.isEmpty() || fh2.d(arrayList5, listC2) || fh2.d(list6, listC2)) {
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
                xnuVar.put(strA, new gh2(str4, str3, str2, str5, str6, z2, zContains, z));
                betBuilderConfig2 = betBuilderConfig3;
                it2 = it;
                arrayList2 = arrayList;
                betBuilderOutcome3 = betBuilderOutcome2;
                size = i;
            }
        }
        return xnuVar.c();
    }
}
