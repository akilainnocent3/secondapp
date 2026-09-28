package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class bh00<E> extends o4<E> {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public bh00(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (!(b() > 32)) {
            lm20.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i, int i2, Object obj, jcy jcyVar) {
        int iA = uv.a(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            xx0.e(iA + 1, iA, 31, objArr, objArrCopyOf);
            jcyVar.a = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = k((Object[]) obj2, i3, i2, obj, jcyVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            obj3.getClass();
            objArrCopyOf2[iA] = k((Object[]) obj3, i3, 0, jcyVar.a, jcyVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] m(Object[] objArr, int i, int i2, jcy jcyVar) {
        Object[] objArrM;
        int iA = uv.a(i2, i);
        if (i == 5) {
            jcyVar.a = objArr[iA];
            objArrM = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrM = m((Object[]) obj, i - 5, i2, jcyVar);
        }
        if (objArrM == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iA] = objArrM;
        return objArrCopyOf;
    }

    public static Object[] s(int i, int i2, Object obj, Object[] objArr) {
        int iA = uv.a(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        obj2.getClass();
        objArrCopyOf[iA] = s(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.d;
    }

    @Override // defpackage.o4
    public final o4 c(int i, E e) {
        int i2 = this.d;
        xhs.b(i, i2);
        if (i == i2) {
            return d(e);
        }
        int iR = r();
        Object[] objArr = this.b;
        if (i >= iR) {
            return l(i - iR, e, objArr);
        }
        jcy jcyVar = new jcy(null);
        return l(0, jcyVar.a, k(objArr, this.e, i, e, jcyVar));
    }

    @Override // defpackage.o4
    public final o4 d(E e) {
        int iR = r();
        int i = this.d;
        int i2 = i - iR;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = e;
            return new bh00(objArr, objArrCopyOf, i + 1, this.e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e;
        return n(objArr, objArr2, objArr3);
    }

    @Override // defpackage.o4
    public final fh00 f() {
        return new fh00(this, this.b, this.c, this.e);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        xhs.a(i, b());
        if (r() <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[uv.a(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.o4
    public final o4 h(m4 m4Var) {
        fh00 fh00Var = new fh00(this, this.b, this.c, this.e);
        fh00Var.D(m4Var);
        return fh00Var.d();
    }

    @Override // defpackage.o4
    public final o4 i(int i) {
        xhs.a(i, this.d);
        int iR = r();
        int i2 = this.e;
        Object[] objArr = this.b;
        return i >= iR ? q(objArr, iR, i2, i - iR) : q(p(objArr, i2, i, new jcy(this.c[0])), iR, i2, 0);
    }

    @Override // defpackage.o4
    public final o4 j(int i, E e) {
        int i2 = this.d;
        xhs.a(i, i2);
        int iR = r();
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.e;
        if (iR > i) {
            return new bh00(s(i3, i, e, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = e;
        return new bh00(objArr, objArrCopyOf, i2, i3);
    }

    public final bh00 l(int i, Object obj, Object[] objArr) {
        int iR = r();
        int i2 = this.d;
        int i3 = i2 - iR;
        Object[] objArr2 = this.c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            xx0.e(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new bh00(objArr, objArrCopyOf, i2 + 1, this.e);
        }
        Object obj2 = objArr2[31];
        xx0.e(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return n(objArr, objArrCopyOf, objArr3);
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<E> listIterator(int i) {
        xhs.b(i, this.d);
        return new hh00(i, this.d, (this.e / 5) + 1, this.b, this.c);
    }

    public final bh00<E> n(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 <= (1 << i3)) {
            return new bh00<>(o(objArr, objArr2, i3), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new bh00<>(o(objArr4, objArr2, i4), objArr3, i + 1, i4);
    }

    public final Object[] o(Object[] objArr, Object[] objArr2, int i) {
        int iA = uv.a(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = o((Object[]) objArrCopyOf[iA], objArr2, i - 5);
        return objArrCopyOf;
    }

    public final Object[] p(Object[] objArr, int i, int i2, jcy jcyVar) {
        int iA = uv.a(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            xx0.e(iA, iA + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = jcyVar.a;
            jcyVar.a = objArr[iA];
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? uv.a(r() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                obj.getClass();
                objArrCopyOf2[iA2] = p((Object[]) obj, i3, 0, jcyVar);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = p((Object[]) obj2, i3, i2, jcyVar);
        return objArrCopyOf2;
    }

    public final o4 q(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 != 1) {
            Object[] objArr2 = this.c;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                xx0.e(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new bh00(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new o1a0(objArr);
        }
        jcy jcyVar = new jcy(null);
        Object[] objArrM = m(objArr, i2, i - 1, jcyVar);
        objArrM.getClass();
        Object obj = jcyVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM[1] != null) {
            return new bh00(objArrM, objArr3, i, i2);
        }
        Object obj2 = objArrM[0];
        obj2.getClass();
        return new bh00((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int r() {
        return (this.d - 1) & (-32);
    }
}
