package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g8e0 extends pnh0 {
    public ehe0 A;
    public ehe0 B;
    public wf80.b C;
    public wf80.b D;
    public wf80.c E;
    public final i8e0 r;
    public final pei0 s;
    public final ona t;
    public final ona u;
    public she0 v;
    public ggf w;
    public ehe0 x;
    public ehe0 y;
    public ehe0 z;

    public g8e0(n26 n26Var, n26 n26Var2, ona onaVar, ona onaVar2, HashSet hashSet, tnh0 tnh0Var) {
        super(K(hashSet));
        this.r = K(hashSet);
        this.t = onaVar;
        this.u = onaVar2;
        this.s = new pei0(n26Var, n26Var2, hashSet, tnh0Var, new e8e0(this));
        HashSet hashSet2 = ((pnh0) hashSet.iterator().next()).g;
        this.g = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static ArrayList J(pnh0 pnh0Var) {
        ArrayList arrayList = new ArrayList();
        if (!(pnh0Var instanceof g8e0)) {
            arrayList.add(pnh0Var.h.P());
            return arrayList;
        }
        Iterator it = ((g8e0) pnh0Var).s.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((pnh0) it.next()).h.P());
        }
        return arrayList;
    }

    public static i8e0 K(HashSet hashSet) {
        ftw ftwVarV = ftw.V();
        new h8e0(ftwVarV);
        ftwVarV.Y(d9n.h, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pnh0 pnh0Var = (pnh0) it.next();
            if (pnh0Var.h.e(snh0.I)) {
                arrayList.add(pnh0Var.h.P());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        ftwVarV.Y(i8e0.O, arrayList);
        ftwVarV.Y(x9n.n, 2);
        ftwVarV.Y(snh0.M, o8e0.PREVIEW_VIDEO_STILL);
        return new i8e0(w2z.U(ftwVarV));
    }

    @Override // defpackage.pnh0
    public final void A() {
        F();
        pei0 pei0Var = this.s;
        for (pnh0 pnh0Var : pei0Var.a) {
            oei0 oei0Var = (oei0) pei0Var.c.get(pnh0Var);
            Objects.requireNonNull(oei0Var);
            pnh0Var.D(oei0Var);
        }
    }

    public final void F() {
        wf80.c cVar = this.E;
        if (cVar != null) {
            cVar.b();
            this.E = null;
        }
        ehe0 ehe0Var = this.x;
        if (ehe0Var != null) {
            ehe0Var.b();
            this.x = null;
        }
        ehe0 ehe0Var2 = this.y;
        if (ehe0Var2 != null) {
            ehe0Var2.b();
            this.y = null;
        }
        ehe0 ehe0Var3 = this.z;
        if (ehe0Var3 != null) {
            ehe0Var3.b();
            this.z = null;
        }
        ehe0 ehe0Var4 = this.A;
        if (ehe0Var4 != null) {
            ehe0Var4.b();
            this.A = null;
        }
        ehe0 ehe0Var5 = this.B;
        if (ehe0Var5 != null) {
            ehe0Var5.b();
            this.B = null;
        }
        final she0 she0Var = this.v;
        if (she0Var != null) {
            she0Var.a.release();
            kpf0.c(new Runnable() { // from class: rhe0
                @Override // java.lang.Runnable
                public final void run() {
                    she0.c cVar2 = she0Var.c;
                    if (cVar2 != null) {
                        Iterator<ehe0> it = cVar2.values().iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                    }
                }
            });
            this.v = null;
        }
        final ggf ggfVar = this.w;
        if (ggfVar != null) {
            ggfVar.a.release();
            kpf0.c(new Runnable() { // from class: egf
                @Override // java.lang.Runnable
                public final void run() {
                    ggf.c cVar2 = ggfVar.d;
                    if (cVar2 != null) {
                        Iterator<ehe0> it = cVar2.values().iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                    }
                }
            });
            this.w = null;
        }
    }

    public final List<wf80> G(String str, String str2, snh0<?> snh0Var, k8e0 k8e0Var, k8e0 k8e0Var2) {
        boolean z;
        aq20 aq20Var;
        Rect rect;
        kpf0.a();
        pei0 pei0Var = this.s;
        if (k8e0Var2 != null) {
            ehe0 ehe0VarH = H(str, str2, snh0Var, k8e0Var, k8e0Var2);
            Matrix matrix = this.l;
            n26 n26VarI = i();
            Objects.requireNonNull(n26VarI);
            boolean zO = n26VarI.o();
            Size sizeF = k8e0Var2.f();
            Rect rect2 = this.k;
            if (rect2 != null) {
                z = false;
            } else {
                z = false;
                rect2 = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
            }
            Rect rect3 = rect2;
            n26 n26VarI2 = i();
            Objects.requireNonNull(n26VarI2);
            int iH = h(n26VarI2, z);
            n26 n26VarI3 = i();
            Objects.requireNonNull(n26VarI3);
            ehe0 ehe0Var = new ehe0(3, 34, k8e0Var2, matrix, zO, rect3, iH, -1, o(n26VarI3));
            this.y = ehe0Var;
            Objects.requireNonNull(i());
            this.A = ehe0Var;
            wf80.b bVarI = I(this.y, snh0Var, k8e0Var2);
            this.D = bVarI;
            wf80.c cVar = this.E;
            if (cVar != null) {
                cVar.b();
            }
            wf80.c cVar2 = new wf80.c(new f8e0(this, str, str2, snh0Var, k8e0Var, k8e0Var2));
            this.E = cVar2;
            bVarI.f = cVar2;
            ehe0 ehe0Var2 = this.A;
            ggf ggfVar = new ggf(c(), i(), new dgf(k8e0Var.b(), this.t, this.u));
            this.w = ggfVar;
            c26 c26Var = this.o;
            Rect rect4 = this.k;
            if (c26Var != null) {
                boolean z2 = rect4 != null;
                int iL = l();
                for (pnh0 pnh0Var : pei0Var.a) {
                    if (pnh0Var instanceof aq20) {
                        aq20Var = (aq20) pnh0Var;
                        aq20Var.getClass();
                        this.B = ggfVar.b(new ci1(ehe0VarH, ehe0Var2, Arrays.asList(new bi1(pei0Var.r(aq20Var, pei0Var.z, pei0Var.f, ehe0VarH, iL, z2), pei0Var.r(aq20Var, pei0Var.z, pei0Var.i, ehe0Var2, iL, z2))))).values().iterator().next();
                        this.o.getClass();
                        Objects.requireNonNull(this.B);
                        Objects.requireNonNull(c());
                        this.o.getClass();
                        throw null;
                    }
                }
                aq20Var = null;
                aq20Var.getClass();
                this.B = ggfVar.b(new ci1(ehe0VarH, ehe0Var2, Arrays.asList(new bi1(pei0Var.r(aq20Var, pei0Var.z, pei0Var.f, ehe0VarH, iL, z2), pei0Var.r(aq20Var, pei0Var.z, pei0Var.i, ehe0Var2, iL, z2))))).values().iterator().next();
                this.o.getClass();
                Objects.requireNonNull(this.B);
                Objects.requireNonNull(c());
                this.o.getClass();
                throw null;
            }
            boolean z3 = rect4 != null;
            int iL2 = l();
            pei0Var.getClass();
            HashMap map = new HashMap();
            for (pnh0 pnh0Var2 : pei0Var.a) {
                ehe0 ehe0Var3 = ehe0VarH;
                sj1 sj1VarR = pei0Var.r(pnh0Var2, pei0Var.z, pei0Var.f, ehe0Var3, iL2, z3);
                zf50 zf50Var = pei0Var.A;
                Objects.requireNonNull(zf50Var);
                n26 n26Var = pei0Var.i;
                Objects.requireNonNull(n26Var);
                ehe0 ehe0Var4 = ehe0Var2;
                sj1 sj1VarR2 = pei0Var.r(pnh0Var2, zf50Var, n26Var, ehe0Var4, iL2, z3);
                int iO = pei0Var.f.a().o(((x9n) pnh0Var2.h).E(0));
                oei0 oei0Var = (oei0) pei0Var.c.get(pnh0Var2);
                Objects.requireNonNull(oei0Var);
                oei0Var.c.c = iO;
                map.put(pnh0Var2, new bi1(sj1VarR, sj1VarR2));
                ehe0Var2 = ehe0Var4;
                ehe0VarH = ehe0Var3;
            }
            ehe0 ehe0Var5 = ehe0VarH;
            ggf.c cVarB = this.w.b(new ci1(ehe0Var5, ehe0Var2, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((pnh0) entry.getKey(), cVarB.get(entry.getValue()));
            }
            pei0Var.x(map2, pei0Var.u(ehe0Var5, z3));
            Object[] objArr = {this.C.c(), this.D.c()};
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                Object obj = objArr[i];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            return Collections.unmodifiableList(arrayList);
        }
        ehe0 ehe0VarH2 = H(str, str2, snh0Var, k8e0Var, null);
        n26 n26VarC = c();
        Objects.requireNonNull(n26VarC);
        final she0 she0Var = new she0(n26VarC, new jhd(k8e0Var.b()));
        this.v = she0Var;
        boolean z4 = this.k != null;
        int iL3 = l();
        pei0Var.getClass();
        HashMap map3 = new HashMap();
        for (pnh0 pnh0Var3 : pei0Var.a) {
            ehe0 ehe0Var6 = ehe0VarH2;
            zf50 zf50Var2 = pei0Var.z;
            n26 n26Var2 = pei0Var.f;
            pei0 pei0Var2 = pei0Var;
            boolean z5 = z4;
            sj1 sj1VarR3 = pei0Var2.r(pnh0Var3, zf50Var2, n26Var2, ehe0Var6, iL3, z5);
            int iO2 = pei0Var2.f.a().o(((x9n) pnh0Var3.h).E(0));
            oei0 oei0Var2 = (oei0) pei0Var2.c.get(pnh0Var3);
            Objects.requireNonNull(oei0Var2);
            oei0Var2.c.c = iO2;
            map3.put(pnh0Var3, sj1VarR3);
            ehe0VarH2 = ehe0Var6;
            z4 = z5;
            pei0Var = pei0Var2;
        }
        ehe0 ehe0Var7 = ehe0VarH2;
        pei0 pei0Var3 = pei0Var;
        boolean z6 = z4;
        el1 el1Var = new el1(ehe0Var7, new ArrayList(map3.values()));
        kpf0.a();
        StringBuilder sb = new StringBuilder("SurfaceProcessorNode Transform (Processor=");
        jhd jhdVar = she0Var.a;
        sb.append(jhdVar);
        sb.append("\n   inputEdge = ");
        final ehe0 ehe0Var8 = el1Var.a;
        sb.append(ehe0Var8);
        pgt.a("SurfaceProcessorNode", sb.toString());
        ArrayList arrayList2 = el1Var.b;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            pgt.a("SurfaceProcessorNode", "   outputConfig = " + ((v7z) obj2));
        }
        she0Var.c = new she0.c();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList2.get(i3);
            int i4 = i3 + 1;
            v7z v7zVar = (v7z) obj3;
            she0.c cVar3 = she0Var.c;
            Rect rectA = v7zVar.a();
            int iC = v7zVar.c();
            boolean zG = v7zVar.g();
            ArrayList arrayList3 = arrayList2;
            int i5 = size2;
            Matrix matrix2 = ehe0Var8.b;
            Rect rect5 = ehe0Var8.d;
            Matrix matrix3 = new Matrix(matrix2);
            HashMap map4 = map3;
            Matrix matrixA = lsg0.a(new RectF(rectA), lsg0.i(v7zVar.d()), iC, zG);
            matrix3.postConcat(matrixA);
            km20.b(lsg0.e(lsg0.h(lsg0.g(rectA), iC), false, v7zVar.d()));
            if (v7zVar.h()) {
                km20.a("Output crop rect " + v7zVar.a() + " must contain input crop rect " + rect5, v7zVar.a().contains(rect5));
                Rect rect6 = new Rect();
                RectF rectF = new RectF(rect5);
                matrixA.mapRect(rectF);
                rectF.round(rect6);
                rect = rect6;
            } else {
                Size sizeD = v7zVar.d();
                rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
            }
            xk1.a aVarI = ehe0Var8.g.i();
            Size sizeD2 = v7zVar.d();
            if (sizeD2 == null) {
                bmy.a("Null resolution");
                return null;
            }
            aVarI.a = sizeD2;
            cVar3.put(v7zVar, new ehe0(v7zVar.e(), v7zVar.b(), aVarI.a(), matrix3, false, rect, ehe0Var8.i - iC, -1, ehe0Var8.e != zG));
            arrayList2 = arrayList3;
            size2 = i5;
            i3 = i4;
            map3 = map4;
        }
        HashMap map5 = map3;
        jhdVar.b(ehe0Var8.c(she0Var.b, true));
        for (final Map.Entry<v7z, ehe0> entry2 : she0Var.c.entrySet()) {
            she0Var.a(ehe0Var8, entry2);
            ehe0 value = entry2.getValue();
            Runnable runnable = new Runnable() { // from class: phe0
                @Override // java.lang.Runnable
                public final void run() {
                    she0Var.a(ehe0Var8, entry2);
                }
            };
            value.getClass();
            kpf0.a();
            value.a();
            value.m.add(runnable);
        }
        final she0.c cVar4 = she0Var.c;
        ehe0Var8.o.add(new qya() { // from class: qhe0
            @Override // defpackage.qya
            public final void accept(Object obj4) {
                cie0.d dVar = (cie0.d) obj4;
                for (Map.Entry entry3 : cVar4.entrySet()) {
                    int iB = dVar.b() - ((v7z) entry3.getKey()).c();
                    if (((v7z) entry3.getKey()).g()) {
                        iB = -iB;
                    }
                    int iJ = lsg0.j(iB);
                    ehe0 ehe0Var9 = (ehe0) entry3.getValue();
                    ehe0Var9.getClass();
                    kpf0.c(new ahe0(ehe0Var9, iJ, -1));
                }
            }
        });
        she0.c cVar5 = she0Var.c;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((pnh0) entry3.getKey(), cVar5.get(entry3.getValue()));
        }
        pei0Var3.x(map6, pei0Var3.u(ehe0Var7, z6));
        Object[] objArr2 = {this.C.c()};
        ArrayList arrayList4 = new ArrayList(1);
        Object obj4 = objArr2[0];
        Objects.requireNonNull(obj4);
        arrayList4.add(obj4);
        return Collections.unmodifiableList(arrayList4);
    }

    public final ehe0 H(String str, String str2, snh0<?> snh0Var, k8e0 k8e0Var, k8e0 k8e0Var2) {
        Matrix matrix = this.l;
        n26 n26VarC = c();
        Objects.requireNonNull(n26VarC);
        boolean zO = n26VarC.o();
        Size sizeF = k8e0Var.f();
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
        }
        Rect rect2 = rect;
        n26 n26VarC2 = c();
        Objects.requireNonNull(n26VarC2);
        int iH = h(n26VarC2, false);
        n26 n26VarC3 = c();
        Objects.requireNonNull(n26VarC3);
        ehe0 ehe0Var = new ehe0(3, 34, k8e0Var, matrix, zO, rect2, iH, -1, o(n26VarC3));
        this.x = ehe0Var;
        boolean z = str2 != null;
        Objects.requireNonNull(c());
        c26 c26Var = this.o;
        if (c26Var != null && !z) {
            c26Var.getClass();
            throw null;
        }
        this.z = ehe0Var;
        wf80.b bVarI = I(this.x, snh0Var, k8e0Var);
        this.C = bVarI;
        wf80.c cVar = this.E;
        if (cVar != null) {
            cVar.b();
        }
        wf80.c cVar2 = new wf80.c(new f8e0(this, str, str2, snh0Var, k8e0Var, k8e0Var2));
        this.E = cVar2;
        bVarI.f = cVar2;
        return this.z;
    }

    public final wf80.b I(ehe0 ehe0Var, snh0<?> snh0Var, k8e0 k8e0Var) {
        wf80.b bVarD = wf80.b.d(snh0Var, k8e0Var.f());
        ue6.a aVar = bVarD.b;
        pei0 pei0Var = this.s;
        Iterator it = pei0Var.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((pnh0) it.next()).h.M().g.c;
            List<Integer> list = wf80.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            aVar.c = i;
        }
        Size sizeF = k8e0Var.f();
        Iterator it2 = pei0Var.a.iterator();
        while (it2.hasNext()) {
            wf80 wf80VarC = wf80.b.d(((pnh0) it2.next()).h, sizeF).c();
            ue6 ue6Var = wf80VarC.g;
            aVar.a(ue6Var.e);
            List<tz5> list2 = wf80VarC.e;
            ArrayList arrayList = bVarD.e;
            for (tz5 tz5Var : list2) {
                aVar.b(tz5Var);
                if (!arrayList.contains(tz5Var)) {
                    arrayList.add(tz5Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : wf80VarC.d) {
                ArrayList arrayList2 = bVarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : wf80VarC.c) {
                ArrayList arrayList3 = bVarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            aVar.c(ue6Var.b);
        }
        ehe0Var.getClass();
        kpf0.a();
        ehe0Var.a();
        km20.g("Consumer can only be linked once.", !ehe0Var.j);
        ehe0Var.j = true;
        bVarD.b(ehe0Var.l, k8e0Var.b(), -1);
        aVar.b(pei0Var.v);
        if (k8e0Var.d() != null) {
            bVarD.a(k8e0Var.d());
        }
        bVarD.h = k8e0Var.g();
        a(bVarD, k8e0Var);
        return bVarD;
    }

    @Override // defpackage.pnh0
    public final snh0<?> f(boolean z, tnh0 tnh0Var) {
        i8e0 i8e0Var = this.r;
        hoa hoaVarA = tnh0Var.a(i8e0Var.P(), 1);
        if (z) {
            hoaVarA = hoa.N(hoaVarA, i8e0Var.N);
        }
        if (hoaVarA == null) {
            return null;
        }
        return ((h8e0) m(hoaVarA)).d();
    }

    @Override // defpackage.pnh0
    public final Set<dhf> j(m26 m26Var) {
        HashSet hashSet = this.s.a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set<dhf> setJ = ((pnh0) it.next()).j(m26Var);
            if (setJ != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setJ);
                } else {
                    hashSet2.retainAll(setJ);
                }
            }
        }
        return hashSet2;
    }

    @Override // defpackage.pnh0
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.pnh0
    public final snh0.b<?, ?, ?> m(hoa hoaVar) {
        return new h8e0(ftw.W(hoaVar));
    }

    @Override // defpackage.pnh0
    public final void t() {
        pei0 pei0Var = this.s;
        for (pnh0 pnh0Var : pei0Var.a) {
            oei0 oei0Var = (oei0) pei0Var.c.get(pnh0Var);
            Objects.requireNonNull(oei0Var);
            pnh0Var.b(oei0Var, null, null, pnh0Var.f(true, pei0Var.e));
        }
    }

    @Override // defpackage.pnh0
    public final void u() {
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((pnh0) it.next()).u();
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    @Override // defpackage.pnh0
    public final snh0<?> v(m26 m26Var, snh0.b<?, ?, ?> bVar) {
        dhf dhfVar;
        boolean z;
        Object objA = bVar.a();
        pei0 pei0Var = this.s;
        HashSet hashSet = pei0Var.w;
        zf50 zf50Var = pei0Var.z;
        List<Size> listJ = zf50Var.f.j(34);
        HashSet<snh0> hashSet2 = zf50Var.d;
        for (snh0 snh0Var : hashSet2) {
            if (!snh0Var.o() && (snh0Var instanceof x9n)) {
                ((x9n) snh0Var).k();
            }
        }
        List list = (List) ((w2z) objA).b(x9n.r, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    listJ = new ArrayList<>();
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).equals(34)) {
                    listJ = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = zf50Var.c;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            hashSet3.addAll(zf50Var.c((snh0) it2.next()));
        }
        Iterator it3 = hashSet3.iterator();
        while (it3.hasNext()) {
            if (!ky0.a(rational, (Size) it3.next())) {
                arrayList.addAll(zf50Var.g(zf50Var.b, listJ, false));
                break;
            }
        }
        int size = arrayList.size();
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            loop4: do {
                if (!it4.hasNext()) {
                    size = 0;
                    break;
                }
                Iterator<Size> it5 = zf50Var.c((snh0) it4.next()).iterator();
                z = false;
                boolean z2 = false;
                while (it5.hasNext()) {
                    boolean zA = ky0.a(rational, it5.next());
                    if (zA) {
                        z = true;
                    }
                    if (z2 && zA) {
                        break loop4;
                    }
                    if (!zA) {
                        z2 = true;
                    }
                }
            } while (z);
        }
        arrayList.addAll(size, zf50Var.g(rational, listJ, false));
        arrayList.addAll(zf50Var.f(listJ, false));
        if (arrayList.isEmpty()) {
            pgt.i("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(zf50Var.f(listJ, true));
        }
        pgt.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        ftw ftwVar = (ftw) objA;
        ftwVar.Y(x9n.t, arrayList);
        wg1 wg1Var = snh0.C;
        Iterator it6 = hashSet.iterator();
        int iMax = 0;
        while (it6.hasNext()) {
            iMax = Math.max(iMax, ((snh0) it6.next()).J());
        }
        ftwVar.Y(wg1Var, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            arrayList2.add(((snh0) it7.next()).F());
        }
        if (arrayList2.isEmpty()) {
            dhfVar = null;
            break;
        }
        dhf dhfVar2 = (dhf) arrayList2.get(0);
        Integer numValueOf = Integer.valueOf(dhfVar2.a);
        Integer numValueOf2 = Integer.valueOf(dhfVar2.b);
        int i = 1;
        while (true) {
            if (i >= arrayList2.size()) {
                dhfVar = new dhf(numValueOf.intValue(), numValueOf2.intValue());
                break;
            }
            dhf dhfVar3 = (dhf) arrayList2.get(i);
            Integer numValueOf3 = Integer.valueOf(dhfVar3.a);
            if (numValueOf.equals(0)) {
                numValueOf = numValueOf3;
            } else if (!numValueOf3.equals(0)) {
                if (numValueOf.equals(2) && !numValueOf3.equals(1)) {
                    numValueOf = numValueOf3;
                } else if ((!numValueOf3.equals(2) || numValueOf.equals(1)) && !numValueOf.equals(numValueOf3)) {
                    numValueOf = null;
                }
            }
            Integer numValueOf4 = Integer.valueOf(dhfVar3.b);
            if (numValueOf2.equals(0)) {
                numValueOf2 = numValueOf4;
            } else if (!numValueOf4.equals(0) && !numValueOf2.equals(numValueOf4)) {
                numValueOf2 = null;
            }
            if (numValueOf == null || numValueOf2 == null) {
                dhfVar = null;
                break;
            }
            i++;
        }
        if (dhfVar == null) {
            hb5.a("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return null;
        }
        ftwVar.Y(d9n.j, dhfVar);
        wg1 wg1Var2 = snh0.E;
        Range<Integer> rangeExtend = k8e0.a;
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            Range<Integer> rangeW = ((snh0) it8.next()).w(rangeExtend);
            Objects.requireNonNull(rangeW);
            if (k8e0.a.equals(rangeExtend)) {
                rangeExtend = rangeW;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(rangeW);
                } catch (IllegalArgumentException unused) {
                    pgt.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeExtend + " <<>> " + rangeW);
                    rangeExtend = rangeExtend.extend(rangeW);
                }
            }
        }
        ftwVar.Y(wg1Var2, rangeExtend);
        Iterator it9 = pei0Var.a.iterator();
        while (it9.hasNext()) {
            snh0 snh0Var2 = (snh0) pei0Var.y.get((pnh0) it9.next());
            Objects.requireNonNull(snh0Var2);
            if (snh0Var2.u() != 0) {
                ftwVar.Y(snh0.K, Integer.valueOf(snh0Var2.u()));
            }
            if (snh0Var2.z() != 0) {
                ftwVar.Y(snh0.J, Integer.valueOf(snh0Var2.z()));
            }
        }
        return bVar.d();
    }

    @Override // defpackage.pnh0
    public final void w() {
        this.a = true;
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((pnh0) it.next()).w();
        }
    }

    @Override // defpackage.pnh0
    public final void x() {
        this.a = false;
        Iterator it = this.s.a.iterator();
        while (it.hasNext()) {
            ((pnh0) it.next()).x();
        }
    }

    @Override // defpackage.pnh0
    public final xk1 y(hoa hoaVar) {
        this.C.b.c(hoaVar);
        Object[] objArr = {this.C.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        xk1.a aVarI = this.i.i();
        aVarI.f = hoaVar;
        return aVarI.a();
    }

    @Override // defpackage.pnh0
    public final k8e0 z(k8e0 k8e0Var, k8e0 k8e0Var2) {
        pgt.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + k8e0Var + ", secondaryStreamSpec " + k8e0Var2);
        E(G(e(), i() == null ? null : i().h().d(), this.h, k8e0Var, k8e0Var2));
        q();
        return k8e0Var;
    }
}
