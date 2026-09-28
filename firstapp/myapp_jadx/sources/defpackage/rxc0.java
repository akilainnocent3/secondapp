package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rxc0 extends pf implements kaj<i1d0, List<? extends oxc0>, List<? extends oxc0>, it7<BigDecimal>, List<? extends e1d0>, v1b<? super Unit>, Object> {
    @Override // defpackage.kaj
    public final Object f(i1d0 i1d0Var, List<? extends oxc0> list, List<? extends oxc0> list2, it7<BigDecimal> it7Var, List<? extends e1d0> list3, v1b<? super Unit> v1bVar) {
        Object value;
        ArrayList arrayList;
        int i;
        Object next;
        Object obj;
        List<? extends oxc0> list4;
        it7<BigDecimal> it7Var2;
        List<? extends e1d0> list5;
        ArrayList arrayList2;
        List<pwc0> list6;
        Iterator it;
        Iterator it2;
        LinkedHashMap linkedHashMap;
        wwd0 wwd0Var;
        ArrayList arrayList3;
        vyc0 vyc0Var;
        vyc0 vyc0Var2;
        boolean z;
        int i2;
        qcn qcnVarB;
        String str;
        qgy.a aVar;
        it7<BigDecimal> it7Var3;
        boolean z2;
        int i3;
        qcn qcnVarB2;
        Iterator it3;
        qgy.a aVar2;
        it7<BigDecimal> it7Var4;
        BigDecimal bigDecimal;
        boolean z3;
        int i4;
        Iterable iterableB;
        int i5;
        BigDecimal bigDecimal2;
        qgy.a aVar3;
        Object value2;
        String str2;
        i1d0 i1d0Var2 = i1d0Var;
        List<? extends oxc0> list7 = list;
        List<? extends oxc0> list8 = list2;
        it7<BigDecimal> it7Var5 = it7Var;
        List<? extends e1d0> list9 = list3;
        sxc0 sxc0Var = (sxc0) this.a;
        sxc0Var.getClass();
        List<pwc0> list10 = i1d0Var2.b;
        lwc0 lwc0Var = (lwc0) CollectionsKt.firstOrNull(i1d0Var2.d);
        List<owc0> list11 = lwc0Var != null ? lwc0Var.d : null;
        if (list11 == null) {
            list11 = m2g.a;
        }
        wwd0 wwd0Var2 = sxc0Var.a;
        wwd0 wwd0Var3 = sxc0Var.b;
        do {
            value = wwd0Var3.getValue();
            i = 10;
            arrayList = new ArrayList(l48.r(list10, 10));
            for (pwc0 pwc0Var : list10) {
                arrayList.add(new jxc0(pwc0Var.a, pwc0Var.b));
            }
        } while (!wwd0Var3.g(value, a4h.b(arrayList)));
        String str3 = (String) wwd0Var2.getValue();
        Iterator<T> it4 = list10.iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (!((pwc0) next).a.equals(str3));
        String str4 = "";
        if (((pwc0) next) == null) {
            do {
                value2 = wwd0Var2.getValue();
                pwc0 pwc0Var2 = (pwc0) CollectionsKt.firstOrNull(list10);
                str2 = pwc0Var2 != null ? pwc0Var2.a : null;
                if (str2 == null) {
                    str2 = "";
                }
            } while (!wwd0Var2.g(value2, str2));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list11) {
            String str5 = ((owc0) obj2).c;
            Object objA = linkedHashMap2.get(str5);
            if (objA == null) {
                objA = r9i.a(str5, linkedHashMap2);
            }
            ((List) objA).add(obj2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (!((Collection) entry.getValue()).isEmpty()) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        wwd0 wwd0Var4 = sxc0Var.c;
        while (true) {
            Object value3 = wwd0Var4.getValue();
            ArrayList arrayList4 = new ArrayList(l48.r(list10, i));
            Iterator it5 = list10.iterator();
            while (it5.hasNext()) {
                pwc0 pwc0Var3 = (pwc0) it5.next();
                String str6 = pwc0Var3.a;
                List<String> list12 = pwc0Var3.c;
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = list12.iterator();
                while (it6.hasNext()) {
                    List list13 = (List) linkedHashMap3.get((String) it6.next());
                    if (list13 != null) {
                        owc0 owc0Var = (owc0) CollectionsKt.p0(list13);
                        list4 = list7;
                        if (owc0Var != null) {
                            list5 = list9;
                            if (owc0Var.g == gyc0.NONE) {
                                list4.getClass();
                                list8.getClass();
                                list5.getClass();
                                String str7 = owc0Var.c;
                                List<hyc0> list14 = owc0Var.i;
                                oxc0 oxc0Var = new oxc0(str6, str7);
                                if (list4.isEmpty()) {
                                    list6 = list10;
                                    z3 = true;
                                    break;
                                }
                                Iterator<T> it7 = list4.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        list6 = list10;
                                        z3 = true;
                                        break;
                                    }
                                    list6 = list10;
                                    if (Intrinsics.g((oxc0) it7.next(), oxc0Var)) {
                                        z3 = false;
                                        break;
                                    }
                                    list10 = list6;
                                }
                                it = it5;
                                xxc0 xxc0Var = new xxc0(z3, owc0Var.d);
                                int size = list14.size();
                                int i6 = size < 4 ? size : size == 4 ? 2 : 3;
                                int i7 = size % i6;
                                Integer numValueOf = Integer.valueOf(i7);
                                if (i7 == 0) {
                                    numValueOf = null;
                                }
                                int iIntValue = numValueOf != null ? i6 - numValueOf.intValue() : 0;
                                it2 = it6;
                                obj = value3;
                                linkedHashMap = linkedHashMap3;
                                ArrayList arrayList6 = new ArrayList(l48.r(list14, 10));
                                Iterator it8 = list14.iterator();
                                while (it8.hasNext()) {
                                    hyc0 hyc0Var = (hyc0) it8.next();
                                    boolean z4 = hyc0Var.d;
                                    Iterator it9 = it8;
                                    BigDecimal bigDecimal3 = hyc0Var.b;
                                    if (z4) {
                                        if (!list5.isEmpty()) {
                                            Iterator it10 = list5.iterator();
                                            while (true) {
                                                if (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    if (Intrinsics.g(((e1d0) it10.next()).c, hyc0Var)) {
                                                        aVar3 = qgy.a.i;
                                                    } else {
                                                        it10 = it11;
                                                    }
                                                }
                                            }
                                        }
                                        if (it7Var5 != null) {
                                            bigDecimal2 = bigDecimal3;
                                            if (it7Var5.c(bigDecimal3)) {
                                                aVar3 = qgy.a.FOCUSED;
                                            }
                                            wwd0 wwd0Var5 = wwd0Var4;
                                            String str8 = hyc0Var.c;
                                            ArrayList arrayList7 = arrayList4;
                                            String string = bigDecimal2.toString();
                                            string.getClass();
                                            arrayList6.add(new pyc0.b(hyc0Var.a, new qgy(str8, gky.a.a(string, false), aVar3)));
                                            it8 = it9;
                                            arrayList5 = arrayList5;
                                            wwd0Var4 = wwd0Var5;
                                            arrayList4 = arrayList7;
                                            it7Var5 = it7Var5;
                                        } else {
                                            bigDecimal2 = bigDecimal3;
                                        }
                                        aVar3 = qgy.a.f;
                                        wwd0 wwd0Var6 = wwd0Var4;
                                        String str9 = hyc0Var.c;
                                        ArrayList arrayList8 = arrayList4;
                                        String string2 = bigDecimal2.toString();
                                        string2.getClass();
                                        arrayList6.add(new pyc0.b(hyc0Var.a, new qgy(str9, gky.a.a(string2, false), aVar3)));
                                        it8 = it9;
                                        arrayList5 = arrayList5;
                                        wwd0Var4 = wwd0Var6;
                                        arrayList4 = arrayList8;
                                        it7Var5 = it7Var5;
                                    } else {
                                        aVar3 = qgy.a.v;
                                    }
                                    bigDecimal2 = bigDecimal3;
                                    wwd0 wwd0Var7 = wwd0Var4;
                                    String str10 = hyc0Var.c;
                                    ArrayList arrayList9 = arrayList4;
                                    String string3 = bigDecimal2.toString();
                                    string3.getClass();
                                    arrayList6.add(new pyc0.b(hyc0Var.a, new qgy(str10, gky.a.a(string3, false), aVar3)));
                                    it8 = it9;
                                    arrayList5 = arrayList5;
                                    wwd0Var4 = wwd0Var7;
                                    arrayList4 = arrayList9;
                                    it7Var5 = it7Var5;
                                }
                                it7<BigDecimal> it7Var6 = it7Var5;
                                arrayList2 = arrayList4;
                                wwd0Var = wwd0Var4;
                                arrayList3 = arrayList5;
                                ArrayList arrayListL = CollectionsKt.L(a4h.b(arrayList6), i6);
                                ArrayList arrayList10 = new ArrayList(l48.r(arrayListL, 10));
                                int size2 = arrayListL.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Object obj3 = arrayListL.get(i8);
                                    i8++;
                                    arrayList10.add(a4h.b((List) obj3));
                                }
                                mxc0 mxc0Var = arrayList10.size() < 4 ? null : list8.contains(oxc0Var) ? mxc0.c : mxc0.SHOW_MORE;
                                if (mxc0Var == null) {
                                    iterableB = arrayList10;
                                    i5 = iIntValue;
                                    i4 = 3;
                                } else {
                                    i4 = 3;
                                    iterableB = a4h.b(CollectionsKt.t0(arrayList10, 3));
                                    i5 = 0;
                                }
                                vyc0Var2 = new vyc0(str7, xxc0Var, new pyc0(owc0Var.b, a4h.b(iterableB), i5, mxc0Var != null ? new pyc0.a(mxc0Var, a4h.b(CollectionsKt.u0(arrayList10.size() - i4, arrayList10)), iIntValue) : null));
                                it7Var2 = it7Var6;
                            }
                            vyc0Var = vyc0Var2;
                        } else {
                            list5 = list9;
                        }
                        obj = value3;
                        it7<BigDecimal> it7Var7 = it7Var5;
                        arrayList2 = arrayList4;
                        list6 = list10;
                        str4 = str4;
                        it = it5;
                        it2 = it6;
                        linkedHashMap = linkedHashMap3;
                        wwd0Var = wwd0Var4;
                        arrayList3 = arrayList5;
                        int i9 = 6;
                        String str11 = ";";
                        if (owc0Var == null || owc0Var.g != gyc0.PENALTY_WINNER_AND_TOTAL) {
                            it7Var2 = it7Var7;
                            if (list13.isEmpty()) {
                                vyc0Var2 = null;
                            } else {
                                if (!list13.isEmpty()) {
                                    Iterator it12 = list13.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            if (((owc0) it12.next()).g != gyc0.COMBO) {
                                                vyc0Var2 = null;
                                            }
                                        }
                                    }
                                }
                                list4.getClass();
                                list8.getClass();
                                list5.getClass();
                                owc0 owc0Var2 = (owc0) CollectionsKt.firstOrNull(list13);
                                if (owc0Var2 != null) {
                                    String str12 = owc0Var2.c;
                                    oxc0 oxc0Var2 = new oxc0(str6, str12);
                                    if (list4.isEmpty()) {
                                        z = true;
                                        break;
                                    }
                                    Iterator<T> it13 = list4.iterator();
                                    while (true) {
                                        if (!it13.hasNext()) {
                                            z = true;
                                            break;
                                        }
                                        if (Intrinsics.g((oxc0) it13.next(), oxc0Var2)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                    xxc0 xxc0Var2 = new xxc0(z, owc0Var2.d);
                                    List listO = CollectionsKt.O(StringsKt__StringsKt.split$default(owc0Var2.e, new String[]{";"}, false, 0, 6, null), 1);
                                    ArrayList arrayList11 = new ArrayList(l48.r(list13, 10));
                                    Iterator it14 = list13.iterator();
                                    while (it14.hasNext()) {
                                        owc0 owc0Var3 = (owc0) it14.next();
                                        String str13 = owc0Var3.b;
                                        String str14 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(owc0Var3.e, new String[]{str11}, false, 0, i9, null));
                                        if (str14 == null) {
                                            str14 = str4;
                                        }
                                        List<hyc0> list15 = owc0Var3.i;
                                        list15.getClass();
                                        ArrayList arrayList12 = new ArrayList(l48.r(list15, 10));
                                        Iterator it15 = list15.iterator();
                                        while (it15.hasNext()) {
                                            hyc0 hyc0Var2 = (hyc0) it15.next();
                                            boolean z5 = hyc0Var2.d;
                                            Iterator it16 = it15;
                                            BigDecimal bigDecimal4 = hyc0Var2.b;
                                            if (z5) {
                                                if (!list5.isEmpty()) {
                                                    Iterator<T> it17 = list5.iterator();
                                                    while (true) {
                                                        if (it17.hasNext()) {
                                                            str = str11;
                                                            if (Intrinsics.g(((e1d0) it17.next()).c, hyc0Var2)) {
                                                                aVar = qgy.a.i;
                                                            } else {
                                                                str11 = str;
                                                            }
                                                        }
                                                    }
                                                }
                                                str = str11;
                                                if (it7Var2 != null) {
                                                    it7Var3 = it7Var2;
                                                    bigDecimal4 = bigDecimal4;
                                                    if (it7Var3.c(bigDecimal4)) {
                                                        aVar = qgy.a.FOCUSED;
                                                    }
                                                    it7Var2 = it7Var3;
                                                    String string4 = bigDecimal4.toString();
                                                    string4.getClass();
                                                    arrayList12.add(new uyc0.b(hyc0Var2.a, new qgy(null, gky.a.a(string4, false), aVar)));
                                                    it15 = it16;
                                                    listO = listO;
                                                    str11 = str;
                                                    it14 = it14;
                                                } else {
                                                    bigDecimal4 = bigDecimal4;
                                                    it7Var3 = it7Var2;
                                                }
                                                aVar = qgy.a.f;
                                                it7Var2 = it7Var3;
                                                String string5 = bigDecimal4.toString();
                                                string5.getClass();
                                                arrayList12.add(new uyc0.b(hyc0Var2.a, new qgy(null, gky.a.a(string5, false), aVar)));
                                                it15 = it16;
                                                listO = listO;
                                                str11 = str;
                                                it14 = it14;
                                            } else {
                                                aVar = qgy.a.v;
                                                str = str11;
                                            }
                                            it7Var3 = it7Var2;
                                            it7Var2 = it7Var3;
                                            String string6 = bigDecimal4.toString();
                                            string6.getClass();
                                            arrayList12.add(new uyc0.b(hyc0Var2.a, new qgy(null, gky.a.a(string6, false), aVar)));
                                            it15 = it16;
                                            listO = listO;
                                            str11 = str;
                                            it14 = it14;
                                        }
                                        arrayList11.add(new uyc0.c(a4h.b(arrayList12), str13, str14));
                                        listO = listO;
                                        it14 = it14;
                                        i9 = 6;
                                    }
                                    List list16 = listO;
                                    qcn qcnVarB3 = a4h.b(arrayList11);
                                    mxc0 mxc0Var2 = qcnVarB3.size() < 4 ? null : list8.contains(oxc0Var2) ? mxc0.c : mxc0.SHOW_MORE;
                                    if (mxc0Var2 == null) {
                                        qcnVarB = qcnVarB3;
                                        i2 = 3;
                                    } else {
                                        i2 = 3;
                                        qcnVarB = a4h.b(CollectionsKt.t0(qcnVarB3, 3));
                                    }
                                    vyc0Var2 = new vyc0(str12, xxc0Var2, new uyc0(a4h.b(list16), qcnVarB, mxc0Var2 != null ? new uyc0.a(mxc0Var2, a4h.b(CollectionsKt.u0(qcnVarB3.size() - i2, qcnVarB3))) : null));
                                }
                            }
                            vyc0Var = vyc0Var2;
                        } else {
                            list4.getClass();
                            list8.getClass();
                            list5.getClass();
                            List listSplit$default = StringsKt__StringsKt.split$default(owc0Var.e, new String[]{";"}, false, 0, 6, null);
                            if (listSplit$default.size() != 4) {
                                it7Var2 = it7Var7;
                            } else {
                                String str15 = owc0Var.c;
                                oxc0 oxc0Var3 = new oxc0(str6, str15);
                                if (list4.isEmpty()) {
                                    z2 = true;
                                    break;
                                }
                                Iterator<T> it18 = list4.iterator();
                                while (true) {
                                    if (!it18.hasNext()) {
                                        z2 = true;
                                        break;
                                    }
                                    if (Intrinsics.g((oxc0) it18.next(), oxc0Var3)) {
                                        z2 = false;
                                        break;
                                    }
                                }
                                xxc0 xxc0Var3 = new xxc0(z2, owc0Var.d);
                                String str16 = (String) listSplit$default.get(0);
                                String str17 = (String) listSplit$default.get(1);
                                List listO2 = CollectionsKt.O(listSplit$default, 2);
                                List<hyc0> list17 = owc0Var.i;
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                Iterator<T> it19 = list17.iterator();
                                while (true) {
                                    String str18 = "UNKNOWN";
                                    if (!it19.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it19.next();
                                    String str19 = ((hyc0) next2).c;
                                    if (StringsKt.M(str19, str16, true)) {
                                        str18 = str16;
                                    } else if (StringsKt.M(str19, str17, true)) {
                                        str18 = str17;
                                    }
                                    Object objA2 = linkedHashMap4.get(str18);
                                    if (objA2 == null) {
                                        objA2 = r9i.a(str18, linkedHashMap4);
                                    }
                                    ((List) objA2).add(next2);
                                }
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                                    if (!Intrinsics.g(entry2.getKey(), "UNKNOWN")) {
                                        linkedHashMap5.put(entry2.getKey(), entry2.getValue());
                                    }
                                }
                                ArrayList arrayList13 = new ArrayList(linkedHashMap5.size());
                                Iterator it20 = linkedHashMap5.entrySet().iterator();
                                while (it20.hasNext()) {
                                    Map.Entry entry3 = (Map.Entry) it20.next();
                                    String str20 = (String) entry3.getKey();
                                    List list18 = (List) entry3.getValue();
                                    String str21 = owc0Var.b;
                                    list18.getClass();
                                    ArrayList arrayList14 = new ArrayList(l48.r(list18, 10));
                                    Iterator it21 = list18.iterator();
                                    while (it21.hasNext()) {
                                        hyc0 hyc0Var3 = (hyc0) it21.next();
                                        boolean z6 = hyc0Var3.d;
                                        List list19 = listO2;
                                        BigDecimal bigDecimal5 = hyc0Var3.b;
                                        if (z6) {
                                            if (!list5.isEmpty()) {
                                                Iterator<T> it22 = list5.iterator();
                                                while (true) {
                                                    if (it22.hasNext()) {
                                                        it3 = it20;
                                                        if (Intrinsics.g(((e1d0) it22.next()).c, hyc0Var3)) {
                                                            aVar2 = qgy.a.i;
                                                        } else {
                                                            it20 = it3;
                                                        }
                                                    }
                                                }
                                            }
                                            it3 = it20;
                                            it7Var4 = it7Var7;
                                            if (it7Var7 != null) {
                                                bigDecimal = bigDecimal5;
                                                if (it7Var4.c(bigDecimal5)) {
                                                    aVar2 = qgy.a.FOCUSED;
                                                }
                                                Iterator it23 = it21;
                                                String string7 = bigDecimal.toString();
                                                string7.getClass();
                                                it7<BigDecimal> it7Var8 = it7Var4;
                                                arrayList14.add(new uyc0.b(hyc0Var3.a, new qgy(null, gky.a.a(string7, false), aVar2)));
                                                listO2 = list19;
                                                owc0Var = owc0Var;
                                                it21 = it23;
                                                it20 = it3;
                                                it7Var7 = it7Var8;
                                            } else {
                                                bigDecimal = bigDecimal5;
                                            }
                                            aVar2 = qgy.a.f;
                                            Iterator it24 = it21;
                                            String string8 = bigDecimal.toString();
                                            string8.getClass();
                                            it7<BigDecimal> it7Var9 = it7Var4;
                                            arrayList14.add(new uyc0.b(hyc0Var3.a, new qgy(null, gky.a.a(string8, false), aVar2)));
                                            listO2 = list19;
                                            owc0Var = owc0Var;
                                            it21 = it24;
                                            it20 = it3;
                                            it7Var7 = it7Var9;
                                        } else {
                                            aVar2 = qgy.a.v;
                                            it3 = it20;
                                        }
                                        it7Var4 = it7Var7;
                                        bigDecimal = bigDecimal5;
                                        Iterator it25 = it21;
                                        String string9 = bigDecimal.toString();
                                        string9.getClass();
                                        it7<BigDecimal> it7Var10 = it7Var4;
                                        arrayList14.add(new uyc0.b(hyc0Var3.a, new qgy(null, gky.a.a(string9, false), aVar2)));
                                        listO2 = list19;
                                        owc0Var = owc0Var;
                                        it21 = it25;
                                        it20 = it3;
                                        it7Var7 = it7Var10;
                                    }
                                    arrayList13.add(new uyc0.c(a4h.b(arrayList14), str21, str20));
                                    listO2 = listO2;
                                    it7Var7 = it7Var7;
                                }
                                List list20 = listO2;
                                it7Var2 = it7Var7;
                                qcn qcnVarB4 = a4h.b(arrayList13);
                                mxc0 mxc0Var3 = qcnVarB4.size() < 4 ? null : list8.contains(oxc0Var3) ? mxc0.c : mxc0.SHOW_MORE;
                                if (mxc0Var3 == null) {
                                    qcnVarB2 = qcnVarB4;
                                    i3 = 3;
                                } else {
                                    i3 = 3;
                                    qcnVarB2 = a4h.b(CollectionsKt.t0(qcnVarB4, 3));
                                }
                                vyc0Var2 = new vyc0(str15, xxc0Var3, new uyc0(a4h.b(list20), qcnVarB2, mxc0Var3 != null ? new uyc0.a(mxc0Var3, a4h.b(CollectionsKt.u0(qcnVarB4.size() - i3, qcnVarB4))) : null));
                            }
                            vyc0Var = vyc0Var2;
                        }
                        vyc0Var2 = null;
                        vyc0Var = vyc0Var2;
                    } else {
                        obj = value3;
                        list4 = list7;
                        it7Var2 = it7Var5;
                        list5 = list9;
                        arrayList2 = arrayList4;
                        list6 = list10;
                        str4 = str4;
                        it = it5;
                        it2 = it6;
                        linkedHashMap = linkedHashMap3;
                        wwd0Var = wwd0Var4;
                        arrayList3 = arrayList5;
                        vyc0Var = null;
                    }
                    ArrayList arrayList15 = arrayList3;
                    if (vyc0Var != null) {
                        arrayList15.add(vyc0Var);
                    }
                    list7 = list4;
                    arrayList5 = arrayList15;
                    list9 = list5;
                    str4 = str4;
                    it5 = it;
                    list10 = list6;
                    it6 = it2;
                    linkedHashMap3 = linkedHashMap;
                    value3 = obj;
                    wwd0Var4 = wwd0Var;
                    arrayList4 = arrayList2;
                    it7Var5 = it7Var2;
                }
                ArrayList arrayList16 = arrayList4;
                arrayList16.add(new axc0(a4h.b(arrayList5), str6));
                list7 = list7;
                arrayList4 = arrayList16;
                value3 = value3;
                it7Var5 = it7Var5;
            }
            List<? extends oxc0> list21 = list7;
            it7<BigDecimal> it7Var11 = it7Var5;
            List<? extends e1d0> list22 = list9;
            List<pwc0> list23 = list10;
            String str22 = str4;
            LinkedHashMap linkedHashMap6 = linkedHashMap3;
            wwd0 wwd0Var8 = wwd0Var4;
            if (wwd0Var8.g(value3, a4h.b(arrayList4))) {
                return Unit.a;
            }
            wwd0Var4 = wwd0Var8;
            list9 = list22;
            str4 = str22;
            list10 = list23;
            linkedHashMap3 = linkedHashMap6;
            it7Var5 = it7Var11;
            i = 10;
            list7 = list21;
        }
    }
}
