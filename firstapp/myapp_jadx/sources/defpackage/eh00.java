package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public final class eh00<E> extends g4<E> implements uf00.a<E> {
    public int a;
    public n4 b;
    public el9 c;
    public Object[] d;
    public Object[] e;
    public int f;

    public eh00(n4 n4Var, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.a = i;
        this.b = n4Var;
        this.c = new el9();
        this.d = objArr;
        this.e = objArr2;
        this.f = n4Var.size();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(ch00 ch00Var, int i, icy icyVar) {
        int iZ = z(ch00Var, this.e, i, icyVar);
        Object obj = icyVar.a;
        if (iZ == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iZ, i, (Object) null);
        H(objArr);
        this.f -= i - iZ;
        return iZ;
    }

    public final Object[] B(Object[] objArr, int i, int i2, icy icyVar) {
        int iA = tv.a(i2, i);
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrL = l(objArr);
            xx0.e(iA, iA + 1, 32, objArr, objArrL);
            objArrL[31] = icyVar.a;
            icyVar.a = obj;
            return objArrL;
        }
        int iA2 = objArr[31] == null ? tv.a(E() - 1, i) : 31;
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj2 = objArrL2[iA2];
                obj2.getClass();
                objArrL2[iA2] = B((Object[]) obj2, i3, 0, icyVar);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrL2[iA];
        obj3.getClass();
        objArrL2[iA] = B((Object[]) obj3, i3, i2, icyVar);
        return objArrL2;
    }

    public final Object D(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        Object[] objArr2 = this.e;
        if (i4 == 1) {
            Object obj = objArr2[0];
            r(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrL = l(objArr2);
        xx0.e(i3, i3 + 1, i4, objArr2, objArrL);
        objArrL[i4 - 1] = null;
        G(objArr);
        H(objArrL);
        this.f = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    public final int E() {
        int i = this.f;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i, int i2, E e, icy icyVar) {
        int iA = tv.a(i2, i);
        Object[] objArrL = l(objArr);
        if (i != 0) {
            Object obj = objArrL[iA];
            obj.getClass();
            objArrL[iA] = F((Object[]) obj, i - 5, i2, e, icyVar);
            return objArrL;
        }
        if (objArrL != objArr) {
            ((AbstractList) this).modCount++;
        }
        icyVar.a = objArrL[iA];
        objArrL[iA] = e;
        return objArrL;
    }

    public final void G(Object[] objArr) {
        if (objArr != this.d) {
            this.b = null;
            this.d = objArr;
        }
    }

    public final void H(Object[] objArr) {
        if (objArr != this.e) {
            this.b = null;
            this.e = objArr;
        }
    }

    public final void I(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrN;
        if (i3 < 1) {
            ib5.a("Check failed.");
            return;
        }
        Object[] objArrL = l(objArr);
        objArr2[0] = objArrL;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            xx0.e(size + 1, i4, i2, objArrL, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrN = objArrL;
            } else {
                objArrN = n();
                i3--;
                objArr2[i3] = objArrN;
            }
            int i7 = i2 - i6;
            xx0.e(0, i7, i2, objArrL, objArr3);
            xx0.e(size + 1, i4, i7, objArrL, objArrN);
            objArr3 = objArrN;
        }
        Iterator<? extends E> it = collection.iterator();
        d(objArrL, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrN2 = n();
            d(objArrN2, 0, it);
            objArr2[i8] = objArrN2;
        }
        d(objArr3, 0, it);
    }

    public final int J() {
        int i = this.f;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        pwn.b(i, getB());
        if (i == getB()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            i(i - iE, e, this.d);
            return;
        }
        icy icyVar = new icy(null);
        Object[] objArr = this.d;
        objArr.getClass();
        i(0, icyVar.a, h(objArr, this.a, i, e, icyVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        Object[] objArrN;
        collection.getClass();
        pwn.b(i, this.f);
        if (i == this.f) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.e;
            Object[] objArrL = l(objArr);
            xx0.e(size2 + 1, i3, J(), objArr, objArrL);
            d(objArrL, i3, collection.iterator());
            H(objArrL);
            this.f = collection.size() + this.f;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iJ = J();
        int size3 = collection.size() + this.f;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= E()) {
            objArrN = n();
            collection2 = collection;
            I(collection2, i, this.e, iJ, objArr2, size, objArrN);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.e;
            if (size3 > iJ) {
                int i4 = size3 - iJ;
                Object[] objArrM = m(i4, objArr3);
                f(collection2, i, i4, objArr2, size, objArrM);
                objArr2 = objArr2;
                objArrN = objArrM;
            } else {
                objArrN = n();
                int i5 = iJ - size3;
                xx0.e(0, i5, iJ, objArr3, objArrN);
                int i6 = 32 - i5;
                Object[] objArrM2 = m(i6, this.e);
                int i7 = size - 1;
                objArr2[i7] = objArrM2;
                f(collection2, i, i6, objArr2, i7, objArrM2);
                collection2 = collection2;
            }
        }
        G(t(this.d, i2, objArr2));
        H(objArrN);
        this.f = collection2.size() + this.f;
        return true;
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: b */
    public final int getB() {
        return this.f;
    }

    @Override // uf00.a
    public final uf00<E> build() {
        n4 ah00Var = this.b;
        if (ah00Var == null) {
            Object[] objArr = this.d;
            Object[] objArr2 = this.e;
            this.c = new el9();
            if (objArr == null) {
                ah00Var = objArr2.length == 0 ? n1a0.c : new n1a0(Arrays.copyOf(objArr2, this.f));
            } else {
                ah00Var = new ah00(objArr, objArr2, this.f, this.a);
            }
            this.b = ah00Var;
        }
        return ah00Var;
    }

    @Override // defpackage.g4
    public final E c(int i) {
        pwn.a(i, getB());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            return (E) D(this.d, iE, this.a, i - iE);
        }
        icy icyVar = new icy(this.e[0]);
        Object[] objArr = this.d;
        objArr.getClass();
        D(B(objArr, this.a, i, icyVar), iE, this.a, 0);
        return (E) icyVar.a;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.d == null) {
            ib5.a("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        r3 r3VarK = k(E() >> 5);
        int i5 = i3;
        Object[] objArrM = objArr2;
        while (r3VarK.a - 1 != i4) {
            Object[] objArr3 = (Object[]) r3VarK.previous();
            xx0.e(0, 32 - i2, 32, objArr3, objArrM);
            objArrM = m(i2, objArr3);
            i5--;
            objArr[i5] = objArrM;
        }
        Object[] objArr4 = (Object[]) r3VarK.previous();
        int iE = i3 - (((E() >> 5) - 1) - i4);
        if (iE < i3) {
            objArr2 = objArr[iE];
            objArr2.getClass();
        }
        I(collection, i, objArr4, 32, objArr, iE, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        pwn.a(i, getB());
        if (E() <= i) {
            objArr = this.e;
        } else {
            Object[] objArr2 = this.d;
            objArr2.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[tv.a(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, icy icyVar) {
        Object obj2;
        int iA = tv.a(i2, i);
        if (i == 0) {
            icyVar.a = objArr[31];
            Object[] objArrL = l(objArr);
            xx0.e(iA + 1, iA, 31, objArr, objArrL);
            objArrL[iA] = obj;
            return objArrL;
        }
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        Object obj3 = objArrL2[iA];
        obj3.getClass();
        objArrL2[iA] = h((Object[]) obj3, i3, i2, obj, icyVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrL2[iA]) == null) {
                break;
            }
            objArrL2[iA] = h((Object[]) obj2, i3, 0, icyVar.a, icyVar);
        }
        return objArrL2;
    }

    public final void i(int i, Object obj, Object[] objArr) {
        int iJ = J();
        Object[] objArrL = l(this.e);
        Object[] objArr2 = this.e;
        if (iJ >= 32) {
            Object obj2 = objArr2[31];
            xx0.e(i + 1, i, 31, objArr2, objArrL);
            objArrL[i] = obj;
            v(objArr, objArrL, o(obj2));
            return;
        }
        xx0.e(i + 1, i, iJ, objArr2, objArrL);
        objArrL[i] = obj;
        G(objArr);
        H(objArrL);
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.c;
    }

    public final r3 k(int i) {
        if (this.d == null) {
            ib5.a("Required value was null.");
            return null;
        }
        int iE = E() >> 5;
        pwn.b(i, iE);
        int i2 = this.a;
        Object[] objArr = this.d;
        if (i2 == 0) {
            objArr.getClass();
            return new fu90(objArr, i);
        }
        objArr.getClass();
        return new zvg0(objArr, i, iE, i2 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] objArrN = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        xx0.i(0, length, 6, objArr, objArrN);
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        pwn.b(i, this.f);
        return new ih00(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            xx0.e(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrN = n();
        xx0.e(i, 0, 32 - i, objArr, objArrN);
        return objArrN;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.c;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.c;
        return objArr;
    }

    public final Object[] p(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            ib5.a("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = tv.a(i, i2);
        Object obj = objArr[iA];
        obj.getClass();
        Object objP = p(i, i2 - 5, (Object[]) obj);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrN = n();
                xx0.e(0, 0, i3, objArr, objArrN);
                objArr = objArrN;
            }
        }
        if (objP == objArr[iA]) {
            return objArr;
        }
        Object[] objArrL = l(objArr);
        objArrL[iA] = objP;
        return objArrL;
    }

    public final Object[] q(Object[] objArr, int i, int i2, icy icyVar) {
        Object[] objArrQ;
        int iA = tv.a(i2 - 1, i);
        if (i == 5) {
            icyVar.a = objArr[iA];
            objArrQ = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, icyVar);
        }
        if (objArrQ == null && iA == 0) {
            return null;
        }
        Object[] objArrL = l(objArr);
        objArrL[iA] = objArrQ;
        return objArrL;
    }

    public final void r(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            G(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            H(objArr);
            this.f = i;
            this.a = i2;
            return;
        }
        icy icyVar = new icy(null);
        objArr.getClass();
        Object[] objArrQ = q(objArr, i2, i, icyVar);
        objArrQ.getClass();
        Object obj = icyVar.a;
        obj.getClass();
        H((Object[]) obj);
        this.f = i;
        if (objArrQ[1] == null) {
            G((Object[]) objArrQ[0]);
            this.a = i2 - 5;
        } else {
            G(objArrQ);
            this.a = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        eh00<E> eh00Var;
        int i;
        collection.getClass();
        boolean z = false;
        Object[] objArr = 0;
        if (collection.isEmpty()) {
            return false;
        }
        ch00 ch00Var = new ch00(collection, objArr == true ? 1 : 0);
        int iJ = J();
        Object[] objArrP = null;
        icy icyVar = new icy(null);
        if (this.d != null) {
            r3 r3VarK = k(0);
            int iZ = 32;
            while (iZ == 32 && r3VarK.hasNext()) {
                iZ = z(ch00Var, (Object[]) r3VarK.next(), 32, icyVar);
            }
            if (iZ == 32) {
                int iA = A(ch00Var, iJ, icyVar);
                if (iA == 0) {
                    r(this.f, this.a, this.d);
                }
                if (iA != iJ) {
                    eh00Var = this;
                } else {
                    eh00Var = this;
                }
            } else {
                int i2 = (r3VarK.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iY = iZ;
                while (r3VarK.hasNext()) {
                    iY = y(ch00Var, (Object[]) r3VarK.next(), 32, iY, icyVar, arrayList2, arrayList);
                }
                eh00Var = this;
                int iY2 = eh00Var.y(ch00Var, eh00Var.e, iJ, iY, icyVar, arrayList2, arrayList);
                Object obj = icyVar.a;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, iY2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrS = eh00Var.d;
                if (zIsEmpty) {
                    objArrS.getClass();
                } else {
                    objArrS = eh00Var.s(objArrS, i2, eh00Var.a, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    ib5.a("Check failed.");
                    return false;
                }
                if (size == 0) {
                    eh00Var.a = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = eh00Var.a;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        eh00Var.a = i - 5;
                        Object[] objArr3 = objArrS[0];
                        objArr3.getClass();
                        objArrS = objArr3;
                    }
                    objArrP = eh00Var.p(i3, i, objArrS);
                }
                eh00Var.G(objArrP);
                eh00Var.H(objArr2);
                eh00Var.f = size + iY2;
            }
            z = true;
        } else if (A(ch00Var, iJ, icyVar) != iJ) {
            eh00Var = this;
            z = true;
        } else {
            eh00Var = this;
        }
        if (z) {
            ((AbstractList) eh00Var).modCount++;
        }
        return z;
    }

    public final Object[] s(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            ib5.a("Check failed.");
            return null;
        }
        if (i2 < 0) {
            ib5.a("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrL = l(objArr);
        int iA = tv.a(i, i2);
        int i3 = i2 - 5;
        objArrL[iA] = s((Object[]) objArrL[iA], i, i3, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrL[iA] = s((Object[]) objArrL[iA], 0, i3, it);
        }
        return objArrL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        pwn.a(i, getB());
        if (E() > i) {
            icy icyVar = new icy(null);
            Object[] objArr = this.d;
            objArr.getClass();
            G(F(objArr, this.a, i, e, icyVar));
            return (E) icyVar.a;
        }
        Object[] objArrL = l(this.e);
        if (objArrL != this.e) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrL[i2];
        objArrL[i2] = e;
        H(objArrL);
        return e2;
    }

    public final Object[] t(Object[] objArr, int i, Object[][] objArr2) {
        hx0 hx0Var = new hx0(objArr2);
        int i2 = i >> 5;
        int i3 = this.a;
        Object[] objArrS = i2 < (1 << i3) ? s(objArr, i, i3, hx0Var) : l(objArr);
        while (hx0Var.hasNext()) {
            this.a += 5;
            objArrS = o(objArrS);
            int i4 = this.a;
            s(objArrS, 1 << i4, i4, hx0Var);
        }
        return objArrS;
    }

    public final void v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f >> 5;
        int i2 = this.a;
        if (i > (1 << i2)) {
            G(x(o(objArr), objArr2, this.a + 5));
            H(objArr3);
            this.a += 5;
            this.f++;
            return;
        }
        if (objArr == null) {
            G(objArr2);
            H(objArr3);
            this.f++;
        } else {
            G(x(objArr, objArr2, i2));
            H(objArr3);
            this.f++;
        }
    }

    public final Object[] x(Object[] objArr, Object[] objArr2, int i) {
        int iA = tv.a(getB() - 1, i);
        Object[] objArrL = l(objArr);
        if (i == 5) {
            objArrL[iA] = objArr2;
            return objArrL;
        }
        objArrL[iA] = x((Object[]) objArrL[iA], objArr2, i - 5);
        return objArrL;
    }

    public final int y(ch00 ch00Var, Object[] objArr, int i, int i2, icy icyVar, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = icyVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrN = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) ch00Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrN = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i2 = 0;
                }
                objArrN[i2] = obj2;
                i2++;
            }
        }
        icyVar.a = objArrN;
        if (objArr2 != objArrN) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int z(ch00 ch00Var, Object[] objArr, int i, icy icyVar) {
        Object[] objArrL = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ch00Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrL = l(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrL[i2] = obj;
                i2++;
            }
        }
        icyVar.a = objArrL;
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
            Object[] objArrL = l(this.e);
            objArrL[iJ] = e;
            H(objArrL);
            this.f = getB() + 1;
        } else {
            v(this.d, this.e, o(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrL = l(this.e);
            d(objArrL, iJ, it);
            H(objArrL);
            this.f = collection.size() + this.f;
            return true;
        }
        int size = ((collection.size() + iJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrL2 = l(this.e);
        d(objArrL2, iJ, it);
        objArr[0] = objArrL2;
        for (int i = 1; i < size; i++) {
            Object[] objArrN = n();
            d(objArrN, 0, it);
            objArr[i] = objArrN;
        }
        G(t(this.d, E(), objArr));
        Object[] objArrN2 = n();
        d(objArrN2, 0, it);
        H(objArrN2);
        this.f = collection.size() + this.f;
        return true;
    }
}
