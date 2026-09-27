package wh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f143164a = 48.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f143165b = 0.7d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f143166c = 0.3d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f143167d = 0.1d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f143168e = 5.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f143169f = 0.01d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f143170g = -12417548;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f143171h = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar2.f143173b, bVar.f143173b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f143172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f143173b;

        public b(m mVar, double d10) {
            this.f143172a = mVar;
            this.f143173b = d10;
        }
    }

    public static List<Integer> a(Map<Integer, Integer> map) {
        return d(map, 4, f143170g, true);
    }

    public static List<Integer> b(Map<Integer, Integer> map, int i10) {
        return d(map, i10, f143170g, true);
    }

    public static List<Integer> c(Map<Integer, Integer> map, int i10, int i11) {
        return d(map, i10, i11, true);
    }

    public static List<Integer> d(Map<Integer, Integer> map, int i10, int i11, boolean z10) {
        ArrayList<m> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d10 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            m mVarB = m.b(entry.getKey().intValue());
            arrayList.add(mVarB);
            int iFloor = (int) Math.floor(mVarB.d());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d10 += (double) iIntValue;
        }
        double[] dArr = new double[360];
        for (int i12 = 0; i12 < 360; i12++) {
            double d11 = ((double) iArr[i12]) / d10;
            for (int i13 = i12 - 14; i13 < i12 + 16; i13++) {
                int iH = w5.h(i13);
                dArr[iH] = dArr[iH] + d11;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (m mVar : arrayList) {
            double d12 = dArr[w5.h((int) Math.round(mVar.d()))];
            if (!z10 || (mVar.c() >= 5.0d && d12 > 0.01d)) {
                arrayList2.add(new b(mVar, (d12 * 100.0d * 0.7d) + ((mVar.c() - 48.0d) * (mVar.c() < 48.0d ? 0.1d : 0.3d))));
            }
        }
        Collections.sort(arrayList2, new a());
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 90; i14 >= 15; i14--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m mVar2 = ((b) it.next()).f143172a;
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList3.add(mVar2);
                        break;
                    }
                } while (w5.c(mVar2.d(), ((m) it2.next()).d()) >= i14);
                if (arrayList3.size() >= i10) {
                    break;
                }
            }
            if (arrayList3.size() >= i10) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i11));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((m) it3.next()).k()));
        }
        return arrayList4;
    }
}
