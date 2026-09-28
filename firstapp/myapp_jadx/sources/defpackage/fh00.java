package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fh00<E> extends g4<E> implements Collection, ehp {
    public o4 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public yrw e = new yrw();
    public Object[] f;
    public Object[] i;
    public int v;

    public fh00(o4 o4Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = o4Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.i = objArr2;
        this.v = o4Var.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(Function1<? super E, Boolean> function1, Object[] objArr, int i, jcy jcyVar) {
        Object[] objArrM = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrM = m(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM[i2] = obj;
                i2++;
            }
        }
        jcyVar.a = objArrM;
        return i2;
    }

    public final int B(Function1<? super E, Boolean> function1, int i, jcy jcyVar) {
        int iA = A(function1, this.i, i, jcyVar);
        Object obj = jcyVar.a;
        if (iA == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iA, i, (Object) null);
        this.i = objArr;
        this.v -= i - iA;
        return iA;
    }

    public final boolean D(Function1<? super E, Boolean> function1) {
        int i;
        Function1<? super E, Boolean> function2 = function1;
        int iJ = J();
        Object[] objArrQ = null;
        jcy jcyVar = new jcy(null);
        boolean z = false;
        if (this.f != null) {
            s3 s3VarL = l(0);
            int iA = 32;
            while (iA == 32 && s3VarL.hasNext()) {
                iA = A(function2, (Object[]) s3VarL.next(), 32, jcyVar);
            }
            if (iA == 32) {
                int iB = B(function2, iJ, jcyVar);
                if (iB == 0) {
                    s(this.v, this.d, this.f);
                }
                if (iB != iJ) {
                }
            } else {
                int i2 = (s3VarL.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA;
                while (s3VarL.hasNext()) {
                    iZ = z(function2, (Object[]) s3VarL.next(), 32, iZ, jcyVar, arrayList2, arrayList);
                    function2 = function1;
                }
                int iZ2 = z(function1, this.i, iJ, iZ, jcyVar, arrayList2, arrayList);
                Object obj = jcyVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iZ2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrT = this.f;
                if (zIsEmpty) {
                    objArrT.getClass();
                } else {
                    objArrT = t(objArrT, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    lm20.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr2 = objArrT[0];
                        objArr2.getClass();
                        objArrT = objArr2;
                    }
                    objArrQ = q(i3, i, objArrT);
                }
                this.f = objArrQ;
                this.i = objArr;
                this.v = size + iZ2;
            }
            z = true;
        } else if (B(function2, iJ, jcyVar) != iJ) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, jcy jcyVar) {
        int iA = uv.a(i2, i);
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrM = m(objArr);
            xx0.e(iA, iA + 1, 32, objArr, objArrM);
            objArrM[31] = jcyVar.a;
            jcyVar.a = obj;
            return objArrM;
        }
        int iA2 = objArr[31] == null ? uv.a(G() - 1, i) : 31;
        Object[] objArrM2 = m(objArr);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj2 = objArrM2[iA2];
                obj2.getClass();
                objArrM2[iA2] = E((Object[]) obj2, i3, 0, jcyVar);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrM2[iA];
        obj3.getClass();
        objArrM2[iA] = E((Object[]) obj3, i3, i2, jcyVar);
        return objArrM2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.v - i;
        Object[] objArr2 = this.i;
        if (i4 == 1) {
            Object obj = objArr2[0];
            s(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM = m(objArr2);
        xx0.e(i3, i3 + 1, i4, objArr2, objArrM);
        objArrM[i4 - 1] = null;
        this.f = objArr;
        this.i = objArrM;
        this.v = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int G() {
        int i = this.v;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, E e, jcy jcyVar) {
        int iA = uv.a(i2, i);
        Object[] objArrM = m(objArr);
        if (i != 0) {
            Object obj = objArrM[iA];
            obj.getClass();
            objArrM[iA] = H((Object[]) obj, i - 5, i2, e, jcyVar);
            return objArrM;
        }
        if (objArrM != objArr) {
            ((AbstractList) this).modCount++;
        }
        jcyVar.a = objArrM[iA];
        objArrM[iA] = e;
        return objArrM;
    }

    public final void I(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrO;
        if (i3 < 1) {
            lm20.a("requires at least one nullBuffer");
        }
        Object[] objArrM = m(objArr);
        objArr2[0] = objArrM;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            xx0.e(size + 1, i4, i2, objArrM, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrO = objArrM;
            } else {
                objArrO = o();
                i3--;
                objArr2[i3] = objArrO;
            }
            int i7 = i2 - i6;
            xx0.e(0, i7, i2, objArrM, objArr3);
            xx0.e(size + 1, i4, i7, objArrM, objArrO);
            objArr3 = objArrO;
        }
        Iterator<? extends E> it = collection.iterator();
        e(objArrM, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrO2 = o();
            e(objArrO2, 0, it);
            objArr2[i8] = objArrO2;
        }
        e(objArr3, 0, it);
    }

    public final int J() {
        int i = this.v;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        xhs.b(i, getB());
        if (i == getB()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            j(i - iG, e, this.f);
            return;
        }
        jcy jcyVar = new jcy(null);
        Object[] objArr = this.f;
        objArr.getClass();
        j(0, jcyVar.a, i(objArr, this.d, i, e, jcyVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        Object[] objArrO;
        xhs.b(i, this.v);
        if (i == this.v) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.v - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.i;
            Object[] objArrM = m(objArr);
            xx0.e(size2 + 1, i3, J(), objArr, objArrM);
            e(objArrM, i3, collection.iterator());
            this.i = objArrM;
            this.v = collection.size() + this.v;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iJ = J();
        int size3 = collection.size() + this.v;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            objArrO = o();
            collection2 = collection;
            I(collection2, i, this.i, iJ, objArr2, size, objArrO);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.i;
            if (size3 > iJ) {
                int i4 = size3 - iJ;
                Object[] objArrN = n(i4, objArr3);
                h(collection2, i, i4, objArr2, size, objArrN);
                objArr2 = objArr2;
                objArrO = objArrN;
            } else {
                objArrO = o();
                int i5 = iJ - size3;
                xx0.e(0, i5, iJ, objArr3, objArrO);
                int i6 = 32 - i5;
                Object[] objArrN2 = n(i6, this.i);
                int i7 = size - 1;
                objArr2[i7] = objArrN2;
                h(collection2, i, i6, objArr2, i7, objArrN2);
                collection2 = collection2;
            }
        }
        this.f = v(this.f, i2, objArr2);
        this.i = objArrO;
        this.v = collection2.size() + this.v;
        return true;
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: b */
    public final int getB() {
        return this.v;
    }

    @Override // defpackage.g4
    public final E c(int i) {
        xhs.a(i, getB());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            return (E) F(this.f, iG, this.d, i - iG);
        }
        jcy jcyVar = new jcy(this.i[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        F(E(objArr, this.d, i, jcyVar), iG, this.d, 0);
        return (E) jcyVar.a;
    }

    public final o4 d() {
        o4 bh00Var;
        Object[] objArr = this.f;
        if (objArr == this.b && this.i == this.c) {
            bh00Var = this.a;
        } else {
            this.e = new yrw();
            this.b = objArr;
            Object[] objArr2 = this.i;
            this.c = objArr2;
            if (objArr == null) {
                bh00Var = objArr2.length == 0 ? o1a0.c : new o1a0(Arrays.copyOf(this.i, getB()));
            } else {
                Object[] objArr3 = this.f;
                objArr3.getClass();
                bh00Var = new bh00(objArr3, this.i, getB(), this.d);
            }
        }
        this.a = bh00Var;
        return bh00Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        xhs.a(i, getB());
        if (G() <= i) {
            objArr = this.i;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[uv.a(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    public final void h(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            ib5.a("root is null");
            return;
        }
        int i4 = i >> 5;
        s3 s3VarL = l(G() >> 5);
        int i5 = i3;
        Object[] objArrN = objArr2;
        while (s3VarL.a - 1 != i4) {
            Object[] objArr3 = (Object[]) s3VarL.previous();
            xx0.e(0, 32 - i2, 32, objArr3, objArrN);
            objArrN = n(i2, objArr3);
            i5--;
            objArr[i5] = objArrN;
        }
        Object[] objArr4 = (Object[]) s3VarL.previous();
        int iG = i3 - (((G() >> 5) - 1) - i4);
        if (iG < i3) {
            objArr2 = objArr[iG];
            objArr2.getClass();
        }
        I(collection, i, objArr4, 32, objArr, iG, objArr2);
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, jcy jcyVar) {
        Object obj2;
        int iA = uv.a(i2, i);
        if (i == 0) {
            jcyVar.a = objArr[31];
            Object[] objArrM = m(objArr);
            xx0.e(iA + 1, iA, 31, objArr, objArrM);
            objArrM[iA] = obj;
            return objArrM;
        }
        Object[] objArrM2 = m(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM2[iA];
        obj3.getClass();
        objArrM2[iA] = i((Object[]) obj3, i3, i2, obj, jcyVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrM2[iA]) == null) {
                break;
            }
            objArrM2[iA] = i((Object[]) obj2, i3, 0, jcyVar.a, jcyVar);
        }
        return objArrM2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj, Object[] objArr) {
        int iJ = J();
        Object[] objArrM = m(this.i);
        Object[] objArr2 = this.i;
        if (iJ >= 32) {
            Object obj2 = objArr2[31];
            xx0.e(i + 1, i, 31, objArr2, objArrM);
            objArrM[i] = obj;
            x(objArr, objArrM, p(obj2));
            return;
        }
        xx0.e(i + 1, i, iJ, objArr2, objArrM);
        objArrM[i] = obj;
        this.f = objArr;
        this.i = objArrM;
        this.v++;
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final s3 l(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            ib5.a("Invalid root");
            return null;
        }
        int iG = G() >> 5;
        xhs.b(i, iG);
        int i2 = this.d;
        return i2 == 0 ? new gu90(objArr, i) : new awg0(objArr, i, iG, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        xhs.b(i, this.v);
        return new jh00(this, i);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] objArrO = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        xx0.i(0, length, 6, objArr, objArrO);
        return objArrO;
    }

    public final Object[] n(int i, Object[] objArr) {
        if (k(objArr)) {
            xx0.e(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrO = o();
        xx0.e(i, 0, 32 - i, objArr, objArrO);
        return objArrO;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] q(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            lm20.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = uv.a(i, i2);
        Object obj = objArr[iA];
        obj.getClass();
        Object objQ = q(i, i2 - 5, (Object[]) obj);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrO = o();
                xx0.e(0, 0, i3, objArr, objArrO);
                objArr = objArrO;
            }
        }
        if (objQ == objArr[iA]) {
            return objArr;
        }
        Object[] objArrM = m(objArr);
        objArrM[iA] = objQ;
        return objArrM;
    }

    public final Object[] r(Object[] objArr, int i, int i2, jcy jcyVar) {
        Object[] objArrR;
        int iA = uv.a(i2 - 1, i);
        if (i == 5) {
            jcyVar.a = objArr[iA];
            objArrR = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrR = r((Object[]) obj, i - 5, i2, jcyVar);
        }
        if (objArrR == null && iA == 0) {
            return null;
        }
        Object[] objArrM = m(objArr);
        objArrM[iA] = objArrR;
        return objArrM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<?> collection) {
        return D(new Function1() { // from class: dh00
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    public final void s(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.i = objArr;
            this.v = i;
            this.d = i2;
            return;
        }
        jcy jcyVar = new jcy(null);
        objArr.getClass();
        Object[] objArrR = r(objArr, i2, i, jcyVar);
        objArrR.getClass();
        Object obj = jcyVar.a;
        obj.getClass();
        this.i = (Object[]) obj;
        this.v = i;
        if (objArrR[1] == null) {
            this.f = (Object[]) objArrR[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrR;
            this.d = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        xhs.a(i, getB());
        if (G() > i) {
            jcy jcyVar = new jcy(null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = H(objArr, this.d, i, e, jcyVar);
            return (E) jcyVar.a;
        }
        Object[] objArrM = m(this.i);
        if (objArrM != this.i) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrM[i2];
        objArrM[i2] = e;
        this.i = objArrM;
        return e2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            lm20.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            lm20.a("negative shift");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrM = m(objArr);
        int iA = uv.a(i, i2);
        int i3 = i2 - 5;
        objArrM[iA] = t((Object[]) objArrM[iA], i, i3, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrM[iA] = t((Object[]) objArrM[iA], 0, i3, it);
        }
        return objArrM;
    }

    public final Object[] v(Object[] objArr, int i, Object[][] objArr2) {
        hx0 hx0Var = new hx0(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrT = i2 < (1 << i3) ? t(objArr, i, i3, hx0Var) : m(objArr);
        while (hx0Var.hasNext()) {
            this.d += 5;
            objArrT = p(objArrT);
            int i4 = this.d;
            t(objArrT, 1 << i4, i4, hx0Var);
        }
        return objArrT;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.v;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = y(p(objArr), objArr2, this.d + 5);
            this.i = objArr3;
            this.d += 5;
            this.v++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.i = objArr3;
            this.v = i + 1;
        } else {
            this.f = y(objArr, objArr2, i3);
            this.i = objArr3;
            this.v++;
        }
    }

    public final Object[] y(Object[] objArr, Object[] objArr2, int i) {
        int iA = uv.a(getB() - 1, i);
        Object[] objArrM = m(objArr);
        if (i == 5) {
            objArrM[iA] = objArr2;
            return objArrM;
        }
        objArrM[iA] = y((Object[]) objArrM[iA], objArr2, i - 5);
        return objArrM;
    }

    public final int z(Function1 function1, Object[] objArr, int i, int i2, jcy jcyVar, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = jcyVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrO = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrO = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i2 = 0;
                }
                objArrO[i2] = obj2;
                i2++;
            }
        }
        jcyVar.a = objArrO;
        if (objArr2 != objArrO) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (iJ < 32) {
            Object[] objArrM = m(this.i);
            objArrM[iJ] = e;
            this.i = objArrM;
            this.v = getB() + 1;
        } else {
            x(this.f, this.i, p(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrM = m(this.i);
            e(objArrM, iJ, it);
            this.i = objArrM;
            this.v = collection.size() + this.v;
            return true;
        }
        int size = ((collection.size() + iJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM2 = m(this.i);
        e(objArrM2, iJ, it);
        objArr[0] = objArrM2;
        for (int i = 1; i < size; i++) {
            Object[] objArrO = o();
            e(objArrO, 0, it);
            objArr[i] = objArrO;
        }
        this.f = v(this.f, G(), objArr);
        Object[] objArrO2 = o();
        e(objArrO2, 0, it);
        this.i = objArrO2;
        this.v = collection.size() + this.v;
        return true;
    }
}
