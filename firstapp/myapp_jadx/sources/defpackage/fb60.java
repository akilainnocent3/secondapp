package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public interface fb60 {
    /* JADX WARN: Code duplicated, block: B:113:0x0200  */
    /* JADX WARN: Code duplicated, block: B:115:0x0204  */
    /* JADX WARN: Code duplicated, block: B:116:0x0207  */
    /* JADX WARN: Code duplicated, block: B:118:0x020b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0253  */
    /* JADX WARN: Code duplicated, block: B:128:0x0259  */
    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0260  */
    /* JADX WARN: Code duplicated, block: B:136:0x026c  */
    static wb60 v(na60 na60Var, qcn qcnVar, ub60 ub60Var) {
        long j;
        Object bVar;
        BigDecimal bigDecimal;
        skd0 skd0Var;
        BigDecimal bigDecimal2;
        Object bVar2;
        skd0 skd0Var2;
        BigDecimal bigDecimal3;
        boolean z;
        boolean z2;
        int i;
        na60Var.getClass();
        qcnVar.getClass();
        ub60Var.getClass();
        boolean z3 = ub60Var.d;
        if (na60Var.equals(na60.b.a)) {
            return new wb60.b(2, z3);
        }
        if (!(na60Var instanceof na60.a)) {
            uhc.a();
            return null;
        }
        qcn<qcn<Integer>> qcnVar2 = ((na60.a) na60Var).a;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar2, 10));
        int i2 = 0;
        for (qcn<Integer> qcnVar3 : qcnVar2) {
            ArrayList arrayList2 = new ArrayList(l48.r(qcnVar3, 10));
            Iterator<Integer> it = qcnVar3.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                arrayList2.add(new lg6(iIntValue == 0 ? y5y.a.a : new y5y.b(iIntValue), iIntValue == 0 ? !qcnVar.isEmpty() ? w5y.b : w5y.a : qcnVar.contains(Integer.valueOf(iIntValue)) ? w5y.b : w5y.a));
            }
            uf00<lg6> uf00VarF = a4h.f(arrayList2);
            if (uf00VarF != null && uf00VarF.isEmpty()) {
                z2 = true;
                break;
            }
            Iterator<E> it2 = uf00VarF.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                }
                if (((lg6) it2.next()).b != w5y.b) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                i2++;
                ArrayList arrayList3 = new ArrayList(l48.r(uf00VarF, 10));
                Iterator<E> it3 = uf00VarF.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(lg6.a((lg6) it3.next(), w5y.c));
                }
                uf00VarF = a4h.f(arrayList3);
            }
            if (qcnVar.size() == 60) {
                if (uf00VarF == null || !uf00VarF.isEmpty()) {
                    Iterator<E> it4 = uf00VarF.iterator();
                    i = 0;
                    while (it4.hasNext()) {
                        if (((lg6) it4.next()).b != w5y.b && (i = i + 1) < 0) {
                            b.p();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                Iterable iterable = uf00VarF;
                if (i == 1) {
                    ArrayList arrayList4 = new ArrayList(l48.r(uf00VarF, 10));
                    for (lg6 lg6VarA : uf00VarF) {
                        if (lg6VarA.b != w5y.b) {
                            lg6VarA = lg6.a(lg6VarA, w5y.d);
                        }
                        arrayList4.add(lg6VarA);
                    }
                    iterable = arrayList4;
                }
                uf00VarF = a4h.f(iterable);
            }
            arrayList.add(new vb60(uf00VarF, z2));
        }
        uf00 uf00VarF2 = a4h.f(arrayList);
        qcn<skd0> qcnVar4 = ub60Var.c;
        xc60 xc60Var = ub60Var.f;
        BigDecimal bigDecimal4 = ub60Var.b;
        int i3 = ub60Var.e;
        skd0 skd0Var3 = (skd0) CollectionsKt.V(i2 - 1, qcnVar4);
        BigDecimal bigDecimal5 = skd0Var3 != null ? skd0Var3.a : null;
        try {
            if (bigDecimal5 != null) {
                try {
                    zi50.a aVar = zi50.b;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0.5d);
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimal6 = skd0.b;
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(3L);
                    bigDecimalValueOf2.getClass();
                    j = 3;
                    try {
                        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(i3);
                        bigDecimalValueOf3.getClass();
                        BigDecimal bigDecimalSubtract = bigDecimalValueOf2.subtract(bigDecimalValueOf3);
                        bigDecimalSubtract.getClass();
                        BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(bigDecimalSubtract);
                        bigDecimalMultiply.getClass();
                        BigDecimal bigDecimalMultiply2 = bigDecimal5.multiply(bigDecimalMultiply);
                        bigDecimalMultiply2.getClass();
                        bVar = new skd0(bigDecimalMultiply2);
                    } catch (Throwable th) {
                        th = th;
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = 3;
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                skd0 skd0Var4 = (skd0) bVar;
                BigDecimal bigDecimal7 = skd0Var4 != null ? skd0Var4.a : null;
                skd0 skd0Var5 = bigDecimal7 != null ? new skd0(bigDecimal7) : null;
                bigDecimal = skd0Var5 != null ? skd0Var5.a : null;
                if (bigDecimal == null) {
                }
                BigDecimal bigDecimal8 = bigDecimal;
                skd0Var = new skd0(xc60Var.b);
                if (xc60Var.a == ub60Var.g || qcnVar.isEmpty()) {
                    skd0Var = null;
                }
                if (skd0Var != null) {
                    bigDecimal2 = skd0Var.a;
                } else {
                    bigDecimal2 = null;
                }
                if (bigDecimal2 == null) {
                    bigDecimal2 = skd0.b;
                }
                zi50.a aVar3 = zi50.b;
                BigDecimal bigDecimalAdd = bigDecimal4.add(bigDecimal2);
                bigDecimalAdd.getClass();
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(0.5d);
                bigDecimalValueOf4.getClass();
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j);
                bigDecimalValueOf5.getClass();
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(i3);
                bigDecimalValueOf6.getClass();
                BigDecimal bigDecimalSubtract2 = bigDecimalValueOf5.subtract(bigDecimalValueOf6);
                bigDecimalSubtract2.getClass();
                BigDecimal bigDecimalMultiply3 = bigDecimalValueOf4.multiply(bigDecimalSubtract2);
                bigDecimalMultiply3.getClass();
                BigDecimal bigDecimalMultiply4 = bigDecimalAdd.multiply(bigDecimalMultiply3);
                bigDecimalMultiply4.getClass();
                bVar2 = new skd0(bigDecimalMultiply4);
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                skd0Var2 = (skd0) bVar2;
                if (skd0Var2 != null) {
                    bigDecimal3 = skd0Var2.a;
                } else {
                    bigDecimal3 = null;
                }
                if (bigDecimal3 == null) {
                    bigDecimal3 = skd0.b;
                }
                BigDecimal bigDecimal9 = bigDecimal3;
                boolean z4 = ub60Var.a;
                if (z3 || i3 != 2) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z5 = ub60Var.i;
                String strA = tkd0.a(bigDecimal9, (4 & 2) != 0, (4 & 4) != 0);
                BigDecimal bigDecimalMultiply5 = bigDecimal4.multiply(bigDecimal8);
                bigDecimalMultiply5.getClass();
                BigDecimal bigDecimalMultiply6 = bigDecimal4.multiply(bigDecimal8);
                bigDecimalMultiply6.getClass();
                return new wb60.a(uf00VarF2, z4, i2, bigDecimal9, strA, bigDecimalMultiply5, tkd0.a(bigDecimalMultiply6, (4 & 2) != 0, (4 & 4) != 0), z, z5);
            }
            j = 3;
            zi50.a aVar4 = zi50.b;
            BigDecimal bigDecimalAdd2 = bigDecimal4.add(bigDecimal2);
            bigDecimalAdd2.getClass();
            BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(0.5d);
            bigDecimalValueOf7.getClass();
            BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(j);
            bigDecimalValueOf8.getClass();
            BigDecimal bigDecimalValueOf9 = BigDecimal.valueOf(i3);
            bigDecimalValueOf9.getClass();
            BigDecimal bigDecimalSubtract3 = bigDecimalValueOf8.subtract(bigDecimalValueOf9);
            bigDecimalSubtract3.getClass();
            BigDecimal bigDecimalMultiply7 = bigDecimalValueOf7.multiply(bigDecimalSubtract3);
            bigDecimalMultiply7.getClass();
            BigDecimal bigDecimalMultiply8 = bigDecimalAdd2.multiply(bigDecimalMultiply7);
            bigDecimalMultiply8.getClass();
            bVar2 = new skd0(bigDecimalMultiply8);
        } catch (Throwable th3) {
            zi50.a aVar5 = zi50.b;
            bVar2 = new zi50.b(th3);
        }
        bigDecimal = skd0.b;
        BigDecimal bigDecimal10 = bigDecimal;
        skd0Var = new skd0(xc60Var.b);
        if (xc60Var.a == ub60Var.g) {
            skd0Var = null;
        } else {
            skd0Var = null;
        }
        if (skd0Var != null) {
            bigDecimal2 = skd0Var.a;
        } else {
            bigDecimal2 = null;
        }
        if (bigDecimal2 == null) {
            bigDecimal2 = skd0.b;
        }
        if (bVar2 instanceof zi50.b) {
            bVar2 = null;
        }
        skd0Var2 = (skd0) bVar2;
        if (skd0Var2 != null) {
            bigDecimal3 = skd0Var2.a;
        } else {
            bigDecimal3 = null;
        }
        if (bigDecimal3 == null) {
            bigDecimal3 = skd0.b;
        }
        BigDecimal bigDecimal11 = bigDecimal3;
        boolean z6 = ub60Var.a;
        if (z3) {
            z = false;
        } else {
            z = false;
        }
        boolean z7 = ub60Var.i;
        String strA2 = tkd0.a(bigDecimal11, (4 & 2) != 0, (4 & 4) != 0);
        BigDecimal bigDecimalMultiply9 = bigDecimal4.multiply(bigDecimal10);
        bigDecimalMultiply9.getClass();
        BigDecimal bigDecimalMultiply10 = bigDecimal4.multiply(bigDecimal10);
        bigDecimalMultiply10.getClass();
        return new wb60.a(uf00VarF2, z6, i2, bigDecimal11, strA2, bigDecimalMultiply9, tkd0.a(bigDecimalMultiply10, (4 & 2) != 0, (4 & 4) != 0), z, z7);
    }

    lx30 M0();

    default na60.a S0() {
        int i;
        ArrayList arrayList = new ArrayList(3);
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            boolean[] zArr = new boolean[9];
            Iterator it = CollectionsKt.t0(b.o(f.n(0, 9), M0()), 5).iterator();
            while (it.hasNext()) {
                zArr[((Number) it.next()).intValue()] = true;
            }
            arrayList.add(zArr);
        }
        ArrayList arrayList2 = new ArrayList(3);
        for (int i4 = 0; i4 < 3; i4++) {
            ArrayList arrayList3 = new ArrayList(9);
            for (int iA = 0; iA < 9; iA = ndv.a(0, iA, 1, arrayList3)) {
            }
            arrayList2.add(arrayList3);
        }
        for (int i5 = 0; i5 < 9; i5++) {
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                int size = arrayList.size();
                i = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    if (((boolean[]) obj)[i5] && (i = i + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            if (i != 0) {
                int i7 = i5 * 10;
                Iterator it2 = ((ArrayList) b.o(new IntRange(i7 + 1, i7 + 10, 1), M0())).iterator();
                for (int i8 = 0; i8 < 3; i8++) {
                    if (((boolean[]) arrayList.get(i8))[i5]) {
                        ((List) arrayList2.get(i8)).set(i5, it2.next());
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(l48.r(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            arrayList4.add(a4h.f((List) obj2));
        }
        return new na60.a(a4h.f(arrayList4));
    }
}
