package wh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f143181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f143182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<m> f143183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<m> f143184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<m, Double> f143185e;

    public s6() {
        throw new UnsupportedOperationException();
    }

    public static boolean k(double d10, double d11, double d12) {
        if (d11 < d12) {
            return d11 <= d10 && d10 <= d12;
        }
        return d11 <= d10 || d10 <= d12;
    }

    public static double l(m mVar) {
        double[] dArrL = c.l(mVar.k());
        return ((Math.pow(Math.hypot(dArrL[1], dArrL[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(w5.g(w5.g(Math.toDegrees(Math.atan2(dArrL[2], dArrL[1]))) - 50.0d)))) - 0.5d;
    }

    public List<m> b() {
        return c(5, 12);
    }

    public List<m> c(int i10, int i11) {
        int iRound = (int) Math.round(this.f143181a.d());
        m mVar = f().get(iRound);
        double dH = h(mVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i12 = 0;
        while (i12 < 360) {
            double dH2 = h(f().get(w5.h(iRound + i12)));
            dAbs2 += Math.abs(dH2 - dH);
            i12++;
            dH = dH2;
        }
        double d10 = dAbs2 / ((double) i11);
        double dH3 = h(mVar);
        int i13 = 1;
        while (arrayList.size() < i11) {
            m mVar2 = f().get(w5.h(iRound + i13));
            double dH4 = h(mVar2);
            dAbs += Math.abs(dH4 - dH3);
            boolean z10 = dAbs >= ((double) arrayList.size()) * d10;
            int i14 = 1;
            while (z10 && arrayList.size() < i11) {
                arrayList.add(mVar2);
                int i15 = i13;
                z10 = dAbs >= ((double) (arrayList.size() + i14)) * d10;
                i14++;
                i13 = i15;
            }
            i13++;
            if (i13 > 360) {
                while (arrayList.size() < i11) {
                    arrayList.add(mVar2);
                }
                break;
            }
            dH3 = dH4;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f143181a);
        int iFloor = (int) Math.floor((((double) i10) - 1.0d) / 2.0d);
        for (int i16 = 1; i16 < iFloor + 1; i16++) {
            int size = 0 - i16;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (m) arrayList.get(size));
        }
        int i17 = i10 - iFloor;
        for (int i18 = 1; i18 < i17; i18++) {
            int size2 = i18;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((m) arrayList.get(size2));
        }
        return arrayList2;
    }

    public final m d() {
        return g().get(0);
    }

    public m e() {
        double d10;
        m mVar = this.f143182b;
        if (mVar != null) {
            return mVar;
        }
        double d11 = d().d();
        double dDoubleValue = i().get(d()).doubleValue();
        double d12 = j().d();
        double dDoubleValue2 = i().get(j()).doubleValue() - dDoubleValue;
        boolean zK = k(this.f143181a.d(), d11, d12);
        double d13 = zK ? d12 : d11;
        double d14 = zK ? d11 : d12;
        m mVar2 = f().get((int) Math.round(this.f143181a.d()));
        double d15 = 1.0d;
        double dH = 1.0d - h(this.f143181a);
        double d16 = 1000.0d;
        double d17 = 0.0d;
        while (d17 <= 360.0d) {
            double dG = w5.g((d15 * d17) + d13);
            if (k(dG, d13, d14)) {
                d10 = d15;
                m mVar3 = f().get((int) Math.round(dG));
                double dAbs = Math.abs(dH - ((i().get(mVar3).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d16) {
                    mVar2 = mVar3;
                    d16 = dAbs;
                }
            } else {
                d10 = d15;
            }
            d17 += d10;
            d15 = d10;
        }
        this.f143182b = mVar2;
        return mVar2;
    }

    public final List<m> f() {
        List<m> list = this.f143184d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            arrayList.add(m.a(d10, this.f143181a.c(), this.f143181a.e()));
        }
        List<m> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f143184d = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public final List<m> g() {
        List<m> list = this.f143183c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(f());
        arrayList.add(this.f143181a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: wh.q6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f143177a.i().get((m) obj);
            }
        }, new Comparator() { // from class: wh.r6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f143183c = arrayList;
        return arrayList;
    }

    public double h(m mVar) {
        double dDoubleValue = i().get(j()).doubleValue() - i().get(d()).doubleValue();
        double dDoubleValue2 = i().get(mVar).doubleValue() - i().get(d()).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public final Map<m, Double> i() {
        Map<m, Double> map = this.f143185e;
        if (map != null) {
            return map;
        }
        ArrayList<m> arrayList = new ArrayList(f());
        arrayList.add(this.f143181a);
        HashMap map2 = new HashMap();
        for (m mVar : arrayList) {
            map2.put(mVar, Double.valueOf(l(mVar)));
        }
        this.f143185e = map2;
        return map2;
    }

    public final m j() {
        return g().get(g().size() - 1);
    }

    public s6(m mVar) {
        this.f143181a = mVar;
    }
}
