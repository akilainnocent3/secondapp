package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class okj implements htm {
    public final jzm a;
    public final kzm b;
    public final lzm c;
    public final msm d;
    public final zsm e;

    public okj(jzm jzmVar, kzm kzmVar, lzm lzmVar, msm msmVar, zsm zsmVar) {
        jzmVar.getClass();
        kzmVar.getClass();
        lzmVar.getClass();
        msmVar.getClass();
        zsmVar.getClass();
        this.a = jzmVar;
        this.b = kzmVar;
        this.c = lzmVar;
        this.d = msmVar;
        this.e = zsmVar;
    }

    @Override // defpackage.htm
    public final ArrayList a(int i, List list) {
        ArrayList arrayListC0 = CollectionsKt.C0(list);
        ArrayList arrayListC1 = CollectionsKt.C0((Collection) arrayListC0.get(i));
        int size = arrayListC1.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListC1.get(i3);
            i3++;
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            mf4 mf4Var = (mf4) obj;
            if ((mf4Var instanceof nld0 ? (nld0) mf4Var : null) != null) {
                arrayListC1.set(i2, r1g.a);
            }
            i2 = i4;
        }
        arrayListC0.set(i, arrayListC1);
        return arrayListC0;
    }

    @Override // defpackage.htm
    public final zmd0 b(String str, ymd0 ymd0Var, List<ild0> list) {
        str.getClass();
        list.getClass();
        long j = ymd0Var.a;
        int i = ymd0Var.c;
        List<cpd0> list2 = ymd0Var.d;
        this.d.e(j);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (ild0 ild0Var : list) {
            int i4 = i3 + 1;
            int i5 = ild0Var.a;
            int i6 = ild0Var.b;
            ArrayList arrayList2 = i3 != 0 ? arrayList : null;
            List list3 = arrayList2 != null ? (List) arrayList2.get(i3 - 1) : null;
            ArrayList arrayList3 = new ArrayList(i);
            for (int i7 = 0; i7 < i; i7++) {
                mf4 mf4Var = list3 != null ? (mf4) list3.get(i7) : null;
                Object nld0Var = r1g.a;
                boolean zG = Intrinsics.g(mf4Var, nld0Var);
                if (i5 <= i7 && i7 < i5 + i6 && !zG) {
                    nld0Var = new nld0(old0.b);
                }
                arrayList3.add(nld0Var);
            }
            arrayList.add(arrayList3);
            i3 = i4;
        }
        int size = ymd0Var.b - list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList4 = new ArrayList(i);
            for (int i9 = 0; i9 < i; i9++) {
                arrayList4.add(r1g.a);
            }
            arrayList.add(arrayList4);
        }
        double d = 0.0d;
        for (Object obj : list2) {
            int i10 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            cpd0 cpd0Var = (cpd0) obj;
            Iterable iterable = (Iterable) arrayList.get(i2);
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.g((mf4) it.next(), r1g.a)) {
                        d += cpd0Var.d;
                        break;
                    }
                }
            }
            i2 = i10;
        }
        ArrayList arrayList5 = new ArrayList(l48.r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(Double.valueOf(((cpd0) it2.next()).d));
        }
        ArrayList arrayList6 = new ArrayList(l48.r(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Long.valueOf((long) (1000.0f / ((cpd0) it3.next()).c)));
        }
        return new zmd0(arrayList, arrayList5, arrayList6, d, str, 2);
    }

    @Override // defpackage.htm
    public final boolean c(int i, int i2, List<cpd0> list, List<ild0> list2) {
        Object obj;
        boolean z;
        list.getClass();
        list2.getClass();
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i3 = ((cpd0) next).a;
                do {
                    Object next2 = it.next();
                    int i4 = ((cpd0) next2).a;
                    if (i3 < i4) {
                        next = next2;
                        i3 = i4;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        cpd0 cpd0Var = (cpd0) obj;
        boolean z2 = i2 >= (cpd0Var != null ? cpd0Var.a : Reader.READ_DONE);
        boolean z3 = i == list.size();
        if (list2 != null && list2.isEmpty()) {
            z = true;
            break;
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = true;
                break;
            }
            ild0 ild0Var = (ild0) it2.next();
            if (ild0Var.b + ild0Var.a > i2) {
                z = false;
                break;
            }
        }
        return z2 && z3 && z && (list2.size() <= i && list2.size() <= list.size());
    }

    @Override // defpackage.htm
    public final zmd0 d(String str, ymd0 ymd0Var) {
        str.getClass();
        ymd0Var.getClass();
        long j = ymd0Var.a;
        List<cpd0> list = ymd0Var.d;
        this.d.e(j);
        int i = ymd0Var.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ymd0Var.c;
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList2.add(r1g.a);
            }
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(Double.valueOf(((cpd0) it.next()).d));
        }
        ArrayList arrayList4 = new ArrayList(l48.r(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf((long) (1000.0f / ((cpd0) it2.next()).c)));
        }
        return new zmd0(arrayList, arrayList3, arrayList4, 0.0d, str, 18);
    }

    @Override // defpackage.htm
    public final ArrayList e(List list, boolean z, int i, int i2) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayListC0 = CollectionsKt.C0((Collection) arrayList.get(i2));
        if (!z) {
            int size = arrayListC0.size() - i;
            int size2 = arrayListC0.size() - 1;
            if (size <= size2) {
                while (true) {
                    arrayListC0.set(size, new nld0(old0.c));
                    if (size == size2) {
                        break;
                    }
                    size++;
                }
            }
        } else {
            for (int i3 = 0; i3 < i; i3++) {
                arrayListC0.set(i3, new nld0(old0.c));
            }
        }
        arrayList.set(i2, arrayListC0);
        return arrayList;
    }

    @Override // defpackage.htm
    public final Object f(double d, x1b x1bVar) {
        this.a.b(d);
        Object objA = this.b.a(mmd0.d, x1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    @Override // defpackage.htm
    public final Object g(int i, x1b x1bVar, List list) {
        mkj mkjVar;
        ?? C0;
        ?? C1;
        boolean z;
        int i2;
        ?? r13;
        ?? r15;
        nld0 nld0Var;
        int i3;
        if (x1bVar instanceof mkj) {
            mkjVar = (mkj) x1bVar;
            int i4 = mkjVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mkjVar.f = i4 - Integer.MIN_VALUE;
            } else {
                mkjVar = new mkj(this, x1bVar);
            }
        } else {
            mkjVar = new mkj(this, x1bVar);
        }
        Object obj = mkjVar.d;
        y5b y5bVar = y5b.a;
        int i5 = mkjVar.f;
        kzm kzmVar = this.b;
        boolean z2 = false;
        Boolean bool = null;
        if (i5 != 0) {
            if (i5 == 1) {
                i = mkjVar.a;
                C1 = mkjVar.c;
                C0 = mkjVar.b;
                uj50.b(obj);
            } else {
                if (i5 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = mkjVar.a;
                List list2 = mkjVar.c;
                List list3 = mkjVar.b;
                uj50.b(obj);
                r13 = list2;
                r15 = list3;
            }
            i2 = i3;
            r15.set(i2, r13);
            return r15;
        }
        uj50.b(obj);
        C0 = CollectionsKt.C0(list);
        C1 = CollectionsKt.C0((Collection) C0.get(i));
        int size = C1.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = C1.get(i7);
            i7++;
            int i8 = i6 + 1;
            if (i6 < 0) {
                b.q();
                throw null;
            }
            mf4 mf4Var = (mf4) obj2;
            if ((mf4Var instanceof nld0 ? (nld0) mf4Var : null) != null) {
                if (i == 0) {
                    C1.set(i6, new nld0(old0.a));
                } else {
                    Object obj3 = ((List) C0.get(i - 1)).get(i6);
                    nld0 nld0Var2 = obj3 instanceof nld0 ? (nld0) obj3 : null;
                    if ((nld0Var2 != null ? nld0Var2.a : null) == old0.b) {
                        C1.set(i6, new nld0(old0.a));
                    } else {
                        C1.set(i6, new nld0(old0.d));
                    }
                }
            }
            i6 = i8;
        }
        if (!C1.isEmpty()) {
            int size2 = C1.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size2) {
                    z = true;
                    break;
                }
                Object obj4 = C1.get(i9);
                i9++;
                mf4 mf4Var2 = (mf4) obj4;
                nld0 nld0Var3 = mf4Var2 instanceof nld0 ? (nld0) mf4Var2 : null;
                if ((nld0Var3 != null ? nld0Var3.a : null) == old0.d) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (!z || i == 0) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            mmd0 mmd0Var = mmd0.f;
            mkjVar.b = C0;
            mkjVar.c = C1;
            mkjVar.a = i;
            mkjVar.f = 1;
            if (kzmVar.a(mmd0Var, mkjVar) != y5bVar) {
            }
            return y5bVar;
        }
        r15.set(i2, r13);
        return r15;
        i2 = i;
        r13 = C1;
        r15 = C0;
        if (r13 != 0 && r13.isEmpty()) {
            z2 = true;
            break;
        }
        Iterator it = r13.iterator();
        do {
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            mf4 mf4Var3 = (mf4) it.next();
            nld0Var = mf4Var3 instanceof nld0 ? (nld0) mf4Var3 : null;
        } while ((nld0Var != null ? nld0Var.a : null) != old0.a);
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        if (z2 && i2 != 0) {
            bool = boolValueOf2;
        }
        if (bool != null) {
            mmd0 mmd0Var2 = mmd0.e;
            mkjVar.b = r15;
            mkjVar.c = r13;
            mkjVar.a = i2;
            mkjVar.f = 2;
            if (kzmVar.a(mmd0Var2, mkjVar) != y5bVar) {
                i3 = i2;
                r13 = r13;
                r15 = r15;
                i2 = i3;
            }
            return y5bVar;
        }
        r15.set(i2, r13);
        return r15;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[PHI: r2 r5 r13
      0x00f4: PHI (r2v8 double) = (r2v6 double), (r2v9 double) binds: [B:40:0x00f1, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r5v9 double) = (r5v7 double), (r5v10 double) binds: [B:40:0x00f1, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r13v10 int) = (r13v8 int), (r13v13 int) binds: [B:40:0x00f1, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r3.a(r13, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        if (r12.e.a(null, "", r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if (r3.a(r13, r0) == r1) goto L51;
     */
    @Override // defpackage.htm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.zmd0 r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okj.h(zmd0, x1b):java.lang.Object");
    }

    @Override // defpackage.htm
    public final ArrayList i(int i, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayListC0 = CollectionsKt.C0((Collection) arrayList.get(i));
        int size = arrayListC0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListC0.get(i3);
            i3++;
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            mf4 mf4Var = (mf4) obj;
            nld0 nld0Var = mf4Var instanceof nld0 ? (nld0) mf4Var : null;
            if (nld0Var != null) {
                old0 old0Var = nld0Var.a;
                if (old0Var == old0.d) {
                    arrayListC0.set(i2, r1g.a);
                }
                if (old0Var == old0.a) {
                    arrayListC0.set(i2, new nld0(old0.b));
                }
            }
            i2 = i4;
        }
        arrayList.set(i, arrayListC0);
        return arrayList;
    }
}
