package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zf50 {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final pge0 e;
    public final m26 f;
    public final HashMap g;

    public static class a implements Comparator<Rational> {
        public final Rational a;

        public a(Rational rational) {
            this.a = rational;
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational2;
            float fFloatValue = rational.floatValue();
            Rational rational4 = this.a;
            float fFloatValue2 = rational4.floatValue();
            float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
            float fFloatValue3 = rational3.floatValue();
            float fFloatValue4 = rational4.floatValue();
            return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }

    public zf50(n26 n26Var, HashSet hashSet) {
        Size sizeG = lsg0.g(n26Var.h().e());
        m26 m26VarH = n26Var.h();
        pge0 pge0Var = new pge0(m26VarH, sizeG);
        this.g = new HashMap();
        this.a = sizeG;
        Rational rational = ((double) sizeG.getWidth()) / ((double) sizeG.getHeight()) > h ? ky0.c : ky0.a;
        pgt.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeG + ") is " + rational + ".");
        this.b = rational;
        Rational rational2 = ky0.a;
        if (rational.equals(rational2)) {
            rational2 = ky0.c;
        } else if (!rational.equals(ky0.c)) {
            z9l.a(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.c = rational2;
        this.f = m26VarH;
        this.d = hashSet;
        this.e = pge0Var;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalH = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalH2 = h(size);
        if (rationalH.floatValue() == rationalH2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalH.floatValue() > rationalH2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalH.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalH.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final io20 b(snh0<?> snh0Var, Rect rect, int i, boolean z) {
        boolean z2;
        Size next;
        Size size;
        Pair pairCreate;
        if (lsg0.d(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size sizeG = lsg0.g(rect);
            Iterator<Size> it = c(snh0Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeG, sizeG);
                    break;
                }
                Size next2 = it.next();
                Size sizeG2 = lsg0.g(a(next2, sizeG));
                if (!d(sizeG2, sizeG)) {
                    pairCreate = Pair.create(next2, sizeG2);
                    break;
                }
            }
            next = (Size) pairCreate.first;
            size = (Size) pairCreate.second;
        } else {
            Size sizeG3 = lsg0.g(rect);
            List<Size> listC = c(snh0Var);
            Iterator<Size> it2 = listC.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator<Size> it3 = listC.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = sizeG3;
                            break;
                        }
                        next = it3.next();
                    } while (d(next, sizeG3));
                } else {
                    Size next3 = it2.next();
                    Rational rationalH = ky0.a;
                    if (!ky0.a(rationalH, sizeG3)) {
                        rationalH = ky0.c;
                        if (!ky0.a(rationalH, sizeG3)) {
                            rationalH = h(sizeG3);
                        }
                    }
                    if (!e(rationalH, next3) && !d(next3, sizeG3)) {
                        next = next3;
                        break;
                    }
                }
            }
            rect = a(sizeG3, next);
            size = next;
        }
        return z2 ? new io20(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size.getHeight(), size.getWidth()), next) : new io20(rect, size, next);
    }

    public final List<Size> c(snh0<?> snh0Var) {
        Rational rationalH;
        if (!this.d.contains(snh0Var)) {
            z9l.a(snh0Var, "Invalid child config: ");
            return null;
        }
        HashMap map = this.g;
        if (map.containsKey(snh0Var)) {
            List<Size> list = (List) map.get(snh0Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listB = this.e.b(snh0Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) listB;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Size size2 = (Size) obj;
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalH = null;
                    break;
                }
                rationalH = (Rational) it.next();
            } while (!ky0.a(rationalH, size2));
            if (rationalH != null) {
                Size size3 = (Size) map2.get(rationalH);
                Objects.requireNonNull(size3);
                if (size2.getHeight() > size3.getHeight() || size2.getWidth() > size3.getWidth() || (size2.getWidth() == size3.getWidth() && size2.getHeight() == size3.getHeight())) {
                }
            } else {
                rationalH = h(size2);
            }
            arrayList.add(size2);
            map2.put(rationalH, size2);
        }
        map.put(snh0Var, arrayList);
        return arrayList;
    }

    public final boolean e(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational) || ky0.a(rational, size)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalH = ky0.a;
        if (!ky0.a(rationalH, size)) {
            rationalH = ky0.c;
            if (!ky0.a(rationalH, size)) {
                rationalH = h(size);
            }
        }
        float fFloatValue3 = rationalH.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }

    public final ArrayList f(List list, boolean z) {
        int i;
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = ky0.a;
        map.put(rational, new ArrayList());
        Rational rational2 = ky0.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList2.size();
                while (true) {
                    if (i >= size2) {
                        arrayList = null;
                        break;
                    }
                    Object obj = arrayList2.get(i);
                    i++;
                    Rational rational3 = (Rational) obj;
                    if (ky0.a(rational3, size)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalH = h(size);
                    arrayList2.add(rationalH);
                    map.put(rationalH, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new a(h(this.a)));
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            Rational rational4 = (Rational) obj2;
            if (!rational4.equals(ky0.c) && !rational4.equals(ky0.a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(g(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList g(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (ky0.a(rational, size)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new ql8(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    Size size3 = (Size) obj;
                    if (!hashSet.contains(size3)) {
                        arrayList3.add(size3);
                    }
                }
                return arrayList3;
            }
            List<Size> listC = c((snh0) it2.next());
            if (!z) {
                ArrayList arrayList4 = new ArrayList();
                for (Size size4 : listC) {
                    if (!e(rational, size4)) {
                        arrayList4.add(size4);
                    }
                }
                listC = arrayList4;
            }
            if (listC.isEmpty()) {
                return new ArrayList();
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size5 = arrayList2.size();
                int i2 = 0;
                while (i2 < size5) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    Size size6 = (Size) obj2;
                    Iterator<Size> it3 = listC.iterator();
                    while (it3.hasNext()) {
                        if (!d(it3.next(), size6)) {
                            arrayList5.add(size6);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList5;
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList6 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                int size7 = arrayList6.size();
                while (i < size7) {
                    Object obj3 = arrayList6.get(i);
                    i++;
                    Size size8 = (Size) obj3;
                    Iterator<Size> it4 = listC.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size8);
                            break;
                        }
                    } while (!d(it4.next(), size8));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
    }
}
