package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class kq {
    /* JADX WARN: Multi-variable type inference failed */
    public static List a(List list) {
        int i;
        bz3 bz3Var;
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (true) {
            List list2 = null;
            Pair pair = null;
            int i2 = 2;
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = arrayListA.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListA.get(i4);
                    i4++;
                    Pair pair2 = (Pair) obj;
                    bz3 bz3Var2 = (bz3) pair2.a;
                    Object arrayList = linkedHashMap.get(bz3Var2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(bz3Var2, arrayList);
                    }
                    ((List) arrayList).add((mp) pair2.b);
                }
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                int i6 = 0;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    bz3 bz3Var3 = (bz3) entry.getKey();
                    List<mp> list3 = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (mp mpVar : list3) {
                        if (bz3Var3 == bz3.SYSTEM) {
                            i3++;
                        }
                        List<oq> list4 = mpVar.m;
                        ArrayList arrayList4 = new ArrayList();
                        for (oq oqVar : list4) {
                            if (bz3Var3 == bz3.SINGLE) {
                                i5++;
                            }
                            if (bz3Var3 == bz3.MULTIPLE) {
                                i6++;
                            }
                            int iOrdinal = bz3Var3.ordinal();
                            if (iOrdinal == 0) {
                                i = i5;
                            } else if (iOrdinal == 1) {
                                i = i6;
                            } else {
                                if (iOrdinal != i2) {
                                    uhc.a();
                                    return list2;
                                }
                                i = i3;
                            }
                            List<sq> list5 = oqVar.h;
                            ArrayList arrayList5 = new ArrayList(l48.r(list5, 10));
                            Iterator<T> it2 = list5.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(new vci(((sq) it2.next()).c, bz3Var3, i));
                            }
                            p48.w(arrayList5, arrayList4);
                            list2 = null;
                            i2 = 2;
                        }
                        p48.w(arrayList4, arrayList3);
                        list2 = null;
                        i2 = 2;
                    }
                    p48.w(arrayList3, arrayList2);
                    list2 = null;
                    i2 = 2;
                }
                return CollectionsKt.A0(CollectionsKt.D0(arrayList2));
            }
            mp mpVar2 = (mp) it.next();
            cd3.a aVar = cd3.b;
            String str = mpVar2.c;
            aVar.getClass();
            cd3 cd3VarA = cd3.a.a(str);
            if (cd3VarA != null) {
                int iOrdinal2 = cd3VarA.ordinal();
                if (iOrdinal2 == 0) {
                    bz3Var = bz3.SINGLE;
                } else if (iOrdinal2 == 1) {
                    bz3Var = bz3.MULTIPLE;
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                        uhc.a();
                        return null;
                    }
                    bz3Var = bz3.MULTIPLE;
                } else {
                    bz3Var = bz3.SYSTEM;
                }
                pair = new Pair(bz3Var, mpVar2);
            }
            if (pair != null) {
                arrayListA.add(pair);
            }
        }
    }

    public static qcn b(final List list, List list2, List list3, List list4, sq sqVar, boolean z, String str) {
        Object next;
        Object next2;
        Object next3;
        mei aVar;
        int i;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        String str2 = sqVar.c;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((lr) next).a.equals(sqVar.b));
        lr lrVar = (lr) next;
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((nr) next2).a.equals(str2));
        nr nrVar = (nr) next2;
        Iterator it3 = list3.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!((pq) next3).a.equals(str2));
        pq pqVar = (pq) next3;
        qei qeiVar = z ? null : ((nrVar == null || !nrVar.e) && (pqVar == null || !pqVar.c)) ? qei.a.a : nei.a;
        int i2 = 0;
        if (nrVar != null) {
            aVar = new mei.b(uf80.a(new StringBuilder(nrVar.c), " @", gky.a.a(bjb0.L(nrVar.b, Locale.US), false)));
        } else if (pqVar != null) {
            String strA = gky.a.a(bjb0.L(pqVar.b, Locale.US), false);
            StringUiText stringUiText = vch0.a;
            Iterator it4 = b.k(new ResourceUiText(R.string.page_instant_virtual__bet_builder), new StringUiText(" @"), vch0.d(strA)).iterator();
            if (!it4.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next4 = it4.next();
            while (it4.hasNext()) {
                next4 = ((UiText) next4).h((UiText) it4.next());
            }
            aVar = new mei.a((UiText) next4, CollectionsKt.a0(pqVar.d, "\n\n", null, null, new Function1() { // from class: fq
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object next5;
                    rq rqVar = (rq) obj;
                    rqVar.getClass();
                    Iterator it5 = list.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it5.next();
                    } while (!((lr) next5).a.equals(rqVar.a));
                    lr lrVar2 = (lr) next5;
                    String str3 = lrVar2 != null ? lrVar2.b : null;
                    return str3 == null ? "" : str3;
                }
            }, 30), CollectionsKt.a0(pqVar.d, "\n\n", null, null, new gq(list2, i2), 30));
        } else {
            aVar = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            if (((vci) obj).a.equals(str2)) {
                arrayList.add(obj);
            }
        }
        List listR0 = CollectionsKt.r0(arrayList, vl8.a(new hq(), new iq()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listR0) {
            bz3 bz3Var = ((vci) obj2).b;
            Object arrayList2 = linkedHashMap.get(bz3Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(bz3Var, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bz3 bz3Var2 = (bz3) entry.getKey();
            List list5 = (List) entry.getValue();
            String strA2 = oxc.a(bz3Var2.name(), "_", str2);
            int iOrdinal = bz3Var2.ordinal();
            if (iOrdinal == 0) {
                i = R.string.component_betslip__single;
            } else if (iOrdinal == 1) {
                i = R.string.component_betslip__multiple;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                i = R.string.component_betslip__system;
            }
            StringUiText stringUiText2 = vch0.a;
            arrayList3.add(new rei(strA2, qeiVar, strA2.equals(str), jz4.a(new ResourceUiText(i), CollectionsKt.a0(list5, null, " ", null, new jq(), 29)), lrVar != null ? lrVar.b : null, aVar));
        }
        return a4h.b(arrayList3);
    }
}
