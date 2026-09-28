package defpackage;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pge0 {
    public final m26 a;
    public final int b;
    public final int c;
    public final Rational d;
    public final qge0 e;

    public pge0(m26 m26Var, Size size) {
        Rational rational;
        this.a = m26Var;
        this.b = m26Var.c();
        this.c = m26Var.f();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> listJ = m26Var.j(256);
            if (listJ.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listJ, new ql8(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.d = rational;
        this.e = new qge0(m26Var, rational);
    }

    public static ArrayList a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ky0.a);
        arrayList.add(ky0.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i = 0;
                do {
                    if (i >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    obj = arrayList.get(i);
                    i++;
                } while (!ky0.a((Rational) obj, size));
            }
        }
        return arrayList;
    }

    public static Rational c(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? ky0.a : ky0.b;
        }
        if (i == 1) {
            return z ? ky0.c : ky0.d;
        }
        pgt.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap d(List list) {
        HashMap map = new HashMap();
        ArrayList arrayListA = a(list);
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            map.put((Rational) obj, new ArrayList());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size2 = (Size) it.next();
            for (Rational rational : map.keySet()) {
                if (ky0.a(rational, size2)) {
                    ((List) map.get(rational)).add(size2);
                }
            }
        }
        return map;
    }

    public static ArrayList e(xf50 xf50Var, List list, Size size, int i, Rational rational, int i2, int i3) {
        jy0 jy0Var = xf50Var.a;
        HashMap mapD = d(list);
        boolean z = rational == null || rational.getNumerator() >= rational.getDenominator();
        jy0Var.getClass();
        Rational rationalC = c(0, z);
        ArrayList arrayList = new ArrayList(mapD.keySet());
        Collections.sort(arrayList, new ky0.a(rationalC, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            Rational rational2 = (Rational) obj;
            linkedHashMap.put(rational2, (List) mapD.get(rational2));
        }
        if (size != null) {
            Size size3 = kx90.a;
            int height = size.getHeight() * size.getWidth();
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size4 : list2) {
                    if (kx90.a(size4) <= height) {
                        arrayList2.add(size4);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        yf50 yf50Var = xf50Var.b;
        if (yf50Var != null) {
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it2.next());
                if (!list3.isEmpty()) {
                    int i5 = yf50Var.b;
                    if (yf50Var != yf50.c) {
                        Size size5 = yf50Var.a;
                        if (i5 == 0) {
                            boolean zContains = list3.contains(size5);
                            list3.clear();
                            if (zContains) {
                                list3.add(size5);
                            }
                        } else if (i5 == 1) {
                            f(list3, size5, true);
                        } else if (i5 == 2) {
                            f(list3, size5, false);
                        } else if (i5 == 3) {
                            g(list3, size5, true);
                        } else if (i5 == 4) {
                            g(list3, size5, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            for (Size size6 : (List) it3.next()) {
                if (!arrayList3.contains(size6)) {
                    arrayList3.add(size6);
                }
            }
        }
        return arrayList3;
    }

    public static void f(List<Size> list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void g(List<Size> list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[LOOP:5: B:59:0x0133->B:115:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x0181 A[LOOP:2: B:75:0x017b->B:77:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x00f4 A[SYNTHETIC] */
    public final List<Size> b(snh0<?> snh0Var) {
        Size[] sizeArr;
        Size size;
        Size size2;
        int size3;
        int i;
        Size sizeA;
        ArrayList arrayListA;
        int size4;
        int i2;
        Rational rational;
        ArrayList arrayList;
        HashMap mapD;
        ArrayList arrayList2;
        int size5;
        Iterator it;
        Size size6;
        x9n x9nVar = (x9n) snh0Var;
        ArrayList arrayListL = x9nVar.L();
        if (arrayListL != null) {
            return arrayListL;
        }
        xf50 xf50VarK = x9nVar.k();
        List listJ = x9nVar.j();
        int iM = snh0Var.m();
        Rational rational2 = null;
        if (listJ == null) {
            sizeArr = null;
            break;
        }
        Iterator it2 = listJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it2.next();
            if (((Integer) pair.first).intValue() == iM) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List<Size> listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = this.a.j(iM);
        }
        ArrayList arrayList3 = new ArrayList(listAsList);
        Collections.sort(arrayList3, new ql8(true));
        if (arrayList3.isEmpty()) {
            pgt.i("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iM + ".");
        }
        int i3 = 0;
        if (xf50VarK != null) {
            Size sizeB = ((x9n) snh0Var).B();
            int iE = x9nVar.E(0);
            if (!snh0Var.o()) {
                snh0Var.m();
            }
            pgt.a("SupportedOutputSizesCollector", "useCaseConfig = " + snh0Var + yFmFZvuWxAYfEj.wksSNDslbDheHig + arrayList3);
            return e(x9nVar.p(), arrayList3, sizeB, iE, this.d, this.b, this.c);
        }
        if (arrayList3.isEmpty()) {
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        Collections.sort(arrayList4, new ql8(true));
        ArrayList arrayList5 = new ArrayList();
        x9n x9nVar2 = (x9n) snh0Var;
        Size sizeB2 = x9nVar2.B();
        Size size7 = (Size) arrayList4.get(0);
        if (sizeB2 == null) {
            size = size7;
        } else if (kx90.a(size7) < sizeB2.getHeight() * sizeB2.getWidth()) {
            size = size7;
        } else {
            size = sizeB2;
        }
        qge0 qge0Var = this.e;
        Size sizeA2 = qge0Var.a(x9nVar2);
        Size size8 = kx90.b;
        int iA = kx90.a(size8);
        if (kx90.a(size) >= iA) {
            if (sizeA2 != null) {
                if (sizeA2.getHeight() * sizeA2.getWidth() < iA) {
                    size2 = sizeA2;
                }
            }
            size3 = arrayList4.size();
            i = 0;
            while (i < size3) {
                Object obj = arrayList4.get(i);
                i++;
                size6 = (Size) obj;
                if (kx90.a(size6) <= size.getHeight() * size.getWidth()) {
                    if (size6.getHeight() * size6.getWidth() < kx90.a(size2) && !arrayList5.contains(size6)) {
                        arrayList5.add(size6);
                    }
                }
            }
            if (!arrayList5.isEmpty()) {
                e9h0.a(size2, "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", "\nmaxSize = ", size, "\ninitial size list: ", arrayList4);
                return null;
            }
            if (x9nVar2.x()) {
                sizeA = qge0Var.a(x9nVar2);
                if (sizeA != null) {
                    arrayListA = a(arrayList5);
                    size4 = arrayListA.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size4) {
                            rational2 = new Rational(sizeA.getWidth(), sizeA.getHeight());
                            break;
                        }
                        Object obj2 = arrayListA.get(i2);
                        i2++;
                        rational = (Rational) obj2;
                        if (ky0.a(rational, sizeA)) {
                            rational2 = rational;
                            break;
                        }
                    }
                }
            } else {
                rational2 = c(x9nVar2.y(), qge0Var.d);
            }
            if (sizeA2 == null) {
                sizeA2 = x9nVar2.r();
            }
            arrayList = new ArrayList();
            new HashMap();
            if (rational2 == null) {
                arrayList.addAll(arrayList5);
                if (sizeA2 != null) {
                    f(arrayList, sizeA2, true);
                    return arrayList;
                }
            } else {
                mapD = d(arrayList5);
                if (sizeA2 != null) {
                    it = mapD.keySet().iterator();
                    while (it.hasNext()) {
                        f((List) mapD.get((Rational) it.next()), sizeA2, true);
                    }
                }
                arrayList2 = new ArrayList(mapD.keySet());
                Collections.sort(arrayList2, new ky0.a(rational2, qge0Var.c));
                size5 = arrayList2.size();
                while (i3 < size5) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    for (Size size9 : (List) mapD.get((Rational) obj3)) {
                        if (!arrayList.contains(size9)) {
                            arrayList.add(size9);
                        }
                    }
                }
            }
            return arrayList;
        }
        size8 = kx90.a;
        size2 = size8;
        size3 = arrayList4.size();
        i = 0;
        while (i < size3) {
            Object obj4 = arrayList4.get(i);
            i++;
            size6 = (Size) obj4;
            if (kx90.a(size6) <= size.getHeight() * size.getWidth()) {
                if (size6.getHeight() * size6.getWidth() < kx90.a(size2)) {
                }
            }
        }
        if (!arrayList5.isEmpty()) {
            e9h0.a(size2, "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", "\nmaxSize = ", size, "\ninitial size list: ", arrayList4);
            return null;
        }
        if (x9nVar2.x()) {
            sizeA = qge0Var.a(x9nVar2);
            if (sizeA != null) {
                arrayListA = a(arrayList5);
                size4 = arrayListA.size();
                i2 = 0;
                while (true) {
                    if (i2 < size4) {
                        rational2 = new Rational(sizeA.getWidth(), sizeA.getHeight());
                        break;
                    }
                    Object obj5 = arrayListA.get(i2);
                    i2++;
                    rational = (Rational) obj5;
                    if (ky0.a(rational, sizeA)) {
                        rational2 = rational;
                        break;
                    }
                }
            }
        } else {
            rational2 = c(x9nVar2.y(), qge0Var.d);
        }
        if (sizeA2 == null) {
            sizeA2 = x9nVar2.r();
        }
        arrayList = new ArrayList();
        new HashMap();
        if (rational2 == null) {
            arrayList.addAll(arrayList5);
            if (sizeA2 != null) {
                f(arrayList, sizeA2, true);
                return arrayList;
            }
        } else {
            mapD = d(arrayList5);
            if (sizeA2 != null) {
                it = mapD.keySet().iterator();
                while (it.hasNext()) {
                    f((List) mapD.get((Rational) it.next()), sizeA2, true);
                }
            }
            arrayList2 = new ArrayList(mapD.keySet());
            Collections.sort(arrayList2, new ky0.a(rational2, qge0Var.c));
            size5 = arrayList2.size();
            while (i3 < size5) {
                Object obj6 = arrayList2.get(i3);
                i3++;
                while (r3.hasNext()) {
                    if (!arrayList.contains(size9)) {
                        arrayList.add(size9);
                    }
                }
            }
        }
        return arrayList;
    }
}
