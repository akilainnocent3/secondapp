package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v36 implements qz5 {
    public pnh0 C;
    public g8e0 D;
    public final ona E;
    public final ona F;
    public final m8e0 H;
    public final sf a;
    public final sf b;
    public final tnh0 c;
    public final k26 d;
    public final o16 i;
    public final h16 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public List<c26> v = Collections.EMPTY_LIST;
    public Range<Integer> w = k8e0.a;
    public final Object z = new Object();
    public boolean A = true;
    public hoa B = null;
    public final j8e0 G = new j8e0();

    public static final class a extends Exception {
    }

    public static class b {
        public snh0<?> a;
        public snh0<?> b;

        public b() {
            throw null;
        }
    }

    public v36(n26 n26Var, n26 n26Var2, rf rfVar, rf rfVar2, ona onaVar, ona onaVar2, o16 o16Var, m8e0 m8e0Var, tnh0 tnh0Var) {
        h16 h16Var = rfVar.d;
        this.y = h16Var;
        this.a = new sf(n26Var, rfVar);
        if (n26Var2 == null || rfVar2 == null) {
            this.b = null;
        } else {
            this.b = new sf(n26Var2, rfVar2);
        }
        this.E = onaVar;
        this.F = onaVar2;
        this.i = o16Var;
        this.c = tnh0Var;
        String strD = rfVar2 != null ? rfVar2.a.d() : null;
        pi1 pi1Var = ((j16.a) h16Var).N;
        String strD2 = rfVar.a.d();
        strD2.getClass();
        ArrayList arrayListL = kotlin.collections.b.l(strD2);
        if (strD != null) {
            arrayListL.add(strD);
        }
        this.d = new k26(arrayListL, pi1Var);
        this.H = m8e0Var;
    }

    public static boolean A(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            if (B((pnh0) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(pnh0 pnh0Var) {
        if (pnh0Var != null) {
            if (!pnh0Var.h.e(snh0.I)) {
                Log.e("CameraUseCaseAdapter", pnh0Var + " UseCase does not have capture type.");
            } else if (pnh0Var.h.P() == tnh0.b.d) {
                return true;
            }
        }
        return false;
    }

    public static void D(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            pnh0 pnh0Var = (pnh0) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                pnh0Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            pnh0Var.g = hashSet;
        }
    }

    public static ArrayList E(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pnh0 pnh0Var = (pnh0) obj;
            pnh0Var.getClass();
            pnh0Var.o = null;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c26 c26Var = (c26) it.next();
                c26Var.getClass();
                if (pnh0Var.n(0)) {
                    km20.g(pnh0Var + " already has effect" + pnh0Var.o, pnh0Var.o == null);
                    km20.b(pnh0Var.n(0));
                    pnh0Var.o = c26Var;
                    arrayList2.remove(c26Var);
                }
            }
        }
        return arrayList2;
    }

    public static HashMap k(LinkedHashSet linkedHashSet, kg50 kg50Var) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            pnh0 pnh0Var = (pnh0) it.next();
            map.put(pnh0Var, pnh0Var.g);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = kg50Var != null ? kg50Var.a : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            pnh0Var.g = hashSet;
        }
        return map;
    }

    public static Matrix s(Rect rect, Size size) {
        km20.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap v(ArrayList arrayList, tnh0 tnh0Var, tnh0 tnh0Var2, Range range) {
        snh0 snh0VarF;
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pnh0 pnh0Var = (pnh0) obj;
            if (pnh0Var instanceof g8e0) {
                g8e0 g8e0Var = (g8e0) pnh0Var;
                lq20 lq20Var = new lq20(w2z.U(new aq20.a().a));
                x9n.D(lq20Var);
                aq20 aq20Var = new aq20(lq20Var);
                aq20Var.s = aq20.z;
                snh0<?> snh0VarF2 = aq20Var.f(false, tnh0Var);
                if (snh0VarF2 == null) {
                    snh0VarF = null;
                } else {
                    ftw ftwVarW = ftw.W(snh0VarF2);
                    ftwVarW.N.remove(h5f0.w);
                    snh0VarF = ((h8e0) g8e0Var.m(ftwVarW)).d();
                }
            } else {
                snh0VarF = pnh0Var.f(false, tnh0Var);
            }
            snh0<?> snh0VarF3 = pnh0Var.f(true, tnh0Var2);
            ftw ftwVarW2 = snh0VarF3 != null ? ftw.W(snh0VarF3) : ftw.V();
            ftwVarW2.Y(snh0.D, 0);
            if (!k8e0.a.equals(range)) {
                ftwVarW2.X(snh0.E, hoa.b.b, range);
                ftwVarW2.Y(snh0.F, Boolean.TRUE);
            }
            snh0<?> snh0VarD = pnh0Var.m(ftwVarW2).d();
            b bVar = new b();
            bVar.a = snh0VarF;
            bVar.b = snh0VarD;
            map.put(pnh0Var, bVar);
        }
        return map;
    }

    public static boolean z(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            pnh0 pnh0Var = (pnh0) it.next();
            if (pnh0Var instanceof h8n) {
                snh0<?> snh0Var = pnh0Var.h;
                wg1 wg1Var = i8n.S;
                if (snh0Var.e(wg1Var)) {
                    Integer num = (Integer) snh0Var.d(wg1Var);
                    num.getClass();
                    if (num.intValue() == 2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void C(ArrayList arrayList) {
        synchronized (this.z) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((pnh0) obj).g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
            linkedHashSet.removeAll(arrayList);
            j(r(linkedHashSet, this.b != null));
        }
    }

    @Override // defpackage.qz5
    public final l26 a() {
        return this.a.b;
    }

    public final void d(Collection<pnh0> collection, kg50 kg50Var) {
        pgt.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + kg50Var);
        synchronized (this.z) {
            try {
                sf sfVar = this.a;
                h16 h16Var = this.y;
                sfVar.c(h16Var);
                sf sfVar2 = this.b;
                if (sfVar2 != null) {
                    sfVar2.c(h16Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
                linkedHashSet.addAll(collection);
                HashMap mapK = k(linkedHashSet, kg50Var);
                try {
                    j(r(linkedHashSet, this.b != null));
                } catch (IllegalArgumentException e) {
                    D(mapK);
                    throw new a(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(wt5 wt5Var) {
        int i;
        Map<pnh0, k8e0> map = wt5Var.i.a;
        ArrayList arrayList = wt5Var.b;
        synchronized (this.z) {
            try {
                int size = arrayList.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    pnh0 pnh0Var = (pnh0) obj;
                    Rect rectE = this.a.b.a.e();
                    k8e0 k8e0Var = map.get(pnh0Var);
                    k8e0Var.getClass();
                    pnh0Var.B(s(rectE, k8e0Var.f()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List<c26> list = this.v;
        ArrayList arrayList2 = wt5Var.b;
        LinkedHashSet linkedHashSet = wt5Var.a;
        ArrayList arrayListE = E(list, arrayList2);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListE2 = E(arrayListE, arrayList3);
        if (!arrayListE2.isEmpty()) {
            pgt.i("CameraUseCaseAdapter", "Unused effects: " + arrayListE2);
        }
        ArrayList arrayList4 = wt5Var.e;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            ((pnh0) obj2).D(this.a);
        }
        this.a.l(wt5Var.e);
        if (this.b != null) {
            ArrayList arrayList5 = wt5Var.e;
            int size3 = arrayList5.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                sf sfVar = this.b;
                Objects.requireNonNull(sfVar);
                ((pnh0) obj3).D(sfVar);
            }
            sf sfVar2 = this.b;
            Objects.requireNonNull(sfVar2);
            sfVar2.l(wt5Var.e);
        }
        if (wt5Var.e.isEmpty()) {
            ArrayList arrayList6 = wt5Var.d;
            int size4 = arrayList6.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj4 = arrayList6.get(i5);
                i5++;
                pnh0 pnh0Var2 = (pnh0) obj4;
                Map<pnh0, k8e0> map2 = wt5Var.i.a;
                if (map2.containsKey(pnh0Var2)) {
                    k8e0 k8e0Var2 = map2.get(pnh0Var2);
                    Objects.requireNonNull(k8e0Var2);
                    hoa hoaVarD = k8e0Var2.d();
                    if (hoaVarD != null) {
                        wf80 wf80Var = pnh0Var2.p;
                        hoa hoaVarD2 = k8e0Var2.d();
                        w2z w2zVar = wf80Var.g.b;
                        Objects.requireNonNull(hoaVarD2);
                        if (hoaVarD2.c().size() == wf80Var.g.b.c().size()) {
                            Iterator<hoa.a<?>> it = hoaVarD2.c().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    hoa.a<?> next = it.next();
                                    if (!w2zVar.N.containsKey(next) || !Objects.equals(w2zVar.d(next), hoaVarD2.d(next))) {
                                    }
                                }
                            }
                        }
                        pnh0Var2.i = pnh0Var2.y(hoaVarD);
                        if (this.A) {
                            this.a.k(pnh0Var2);
                            sf sfVar3 = this.b;
                            if (sfVar3 != null) {
                                sfVar3.k(pnh0Var2);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = wt5Var.c;
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj5 = arrayList7.get(i6);
            i6++;
            pnh0 pnh0Var3 = (pnh0) obj5;
            b bVar = (b) wt5Var.h.get(pnh0Var3);
            Objects.requireNonNull(bVar);
            sf sfVar4 = this.b;
            sf sfVar5 = this.a;
            snh0<?> snh0Var = bVar.a;
            if (sfVar4 != null) {
                pnh0Var3.b(sfVar5, sfVar4, snh0Var, bVar.b);
                k8e0 k8e0Var3 = wt5Var.i.a.get(pnh0Var3);
                k8e0Var3.getClass();
                l8e0 l8e0Var = wt5Var.j;
                l8e0Var.getClass();
                pnh0Var3.i = pnh0Var3.z(k8e0Var3, l8e0Var.a.get(pnh0Var3));
            } else {
                pnh0Var3.b(sfVar5, null, snh0Var, bVar.b);
                k8e0 k8e0Var4 = wt5Var.i.a.get(pnh0Var3);
                k8e0Var4.getClass();
                pnh0Var3.i = pnh0Var3.z(k8e0Var4, null);
            }
        }
        if (this.A) {
            this.a.m(wt5Var.c);
            sf sfVar6 = this.b;
            if (sfVar6 != null) {
                sfVar6.m(wt5Var.c);
            }
        }
        ArrayList arrayList8 = wt5Var.c;
        int size6 = arrayList8.size();
        while (i < size6) {
            Object obj6 = arrayList8.get(i);
            i++;
            ((pnh0) obj6).s();
        }
        this.e.clear();
        this.e.addAll(wt5Var.a);
        this.f.clear();
        this.f.addAll(wt5Var.b);
        this.C = wt5Var.g;
        this.D = wt5Var.f;
    }

    public final void q() {
        synchronized (this.z) {
            try {
                if (!this.A) {
                    if (!this.f.isEmpty()) {
                        this.a.c(this.y);
                        sf sfVar = this.b;
                        if (sfVar != null) {
                            sfVar.c(this.y);
                        }
                    }
                    this.a.m(this.f);
                    sf sfVar2 = this.b;
                    if (sfVar2 != null) {
                        sfVar2.m(this.f);
                    }
                    synchronized (this.z) {
                        try {
                            hoa hoaVar = this.B;
                            if (hoaVar != null) {
                                this.a.c.a(hoaVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ArrayList arrayList = this.f;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((pnh0) obj).s();
                    }
                    this.A = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x02f9  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0182, code lost:
    
        if (r7 != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wt5 r(java.util.LinkedHashSet r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v36.r(java.util.LinkedHashSet, boolean):wt5");
    }

    public final void t() {
        synchronized (this.z) {
            try {
                if (this.A) {
                    this.a.l(new ArrayList(this.f));
                    sf sfVar = this.b;
                    if (sfVar != null) {
                        sfVar.l(new ArrayList(this.f));
                    }
                    synchronized (this.z) {
                        qf qfVar = this.a.c;
                        this.B = qfVar.b.d();
                        qfVar.h();
                    }
                    this.A = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int u() {
        synchronized (this.z) {
            try {
                return ((qw5) this.i).b() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet w(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.z) {
            try {
                Iterator<c26> it = this.v.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                i = z ? 3 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            pnh0 pnh0Var = (pnh0) it2.next();
            km20.a("Only support one level of sharing for now.", !(pnh0Var instanceof g8e0));
            if (pnh0Var.n(i)) {
                hashSet.add(pnh0Var);
            }
        }
        return hashSet;
    }

    public final List<pnh0> x() {
        ArrayList arrayList;
        synchronized (this.z) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.z) {
            z = this.y.v() != null;
        }
        return z;
    }
}
