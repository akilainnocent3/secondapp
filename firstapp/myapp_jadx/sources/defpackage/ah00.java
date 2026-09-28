package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public final class ah00<E> extends n4<E> {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public ah00(Object[] objArr, Object[] objArr2, int i, int i2) {
        objArr.getClass();
        objArr2.getClass();
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (b() > 32) {
            int length = objArr2.length;
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + b()).toString());
    }

    public static Object[] c(Object[] objArr, int i, Object obj, icy icyVar) {
        int iA = tv.a(0, i);
        if (i == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            xx0.e(iA + 1, iA, 31, objArr, objArrCopyOf);
            icyVar.a = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i2 = i - 5;
        Object obj2 = objArr[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = c((Object[]) obj2, i2, obj, icyVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            obj3.getClass();
            objArrCopyOf2[iA] = c((Object[]) obj3, i2, icyVar.a, icyVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] h(int i, int i2, Object obj, Object[] objArr) {
        int iA = tv.a(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        obj2.getClass();
        objArrCopyOf[iA] = h(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.d;
    }

    @Override // defpackage.uf00
    public final eh00 builder() {
        return new eh00(this, this.b, this.c, this.e);
    }

    public final ah00 d(int i, Object obj, Object[] objArr) {
        int i2 = this.d;
        int i3 = i2 - ((i2 - 1) & (-32));
        Object[] objArr2 = this.c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            xx0.e(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new ah00(objArr, objArrCopyOf, i2 + 1, this.e);
        }
        Object obj2 = objArr2[31];
        xx0.e(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return e(objArr, objArrCopyOf, objArr3);
    }

    public final ah00<E> e(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 <= (1 << i3)) {
            return new ah00<>(f(objArr, objArr2, i3), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ah00<>(f(objArr4, objArr2, i4), objArr3, i + 1, i4);
    }

    public final Object[] f(Object[] objArr, Object[] objArr2, int i) {
        int iA = tv.a(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = f((Object[]) objArrCopyOf[iA], objArr2, i - 5);
        return objArrCopyOf;
    }

    @Override // defpackage.uf00
    public final uf00 g() {
        Integer numValueOf = Integer.valueOf(R.string.component_register__progressbar_account_info);
        int i = this.d;
        pwn.b(0, i);
        if (i == 0) {
            return u(numValueOf);
        }
        int i2 = (i - 1) & (-32);
        Object[] objArr = this.b;
        if (i2 <= 0) {
            return d(0 - i2, numValueOf, objArr);
        }
        icy icyVar = new icy(null);
        return d(0, icyVar.a, c(objArr, this.e, numValueOf, icyVar));
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        int i2 = this.d;
        pwn.a(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            for (int i3 = this.e; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[tv.a(i, i3)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<E> listIterator(int i) {
        pwn.b(i, this.d);
        return new gh00(i, this.d, (this.e / 5) + 1, this.b, this.c);
    }

    @Override // defpackage.q3, java.util.List, defpackage.uf00
    public final uf00<E> set(int i, E e) {
        int i2 = this.d;
        pwn.a(i, i2);
        int i3 = (i2 - 1) & (-32);
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i4 = this.e;
        if (i3 > i) {
            return new ah00(h(i4, i, e, objArr), objArr2, i2, i4);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = e;
        return new ah00(objArr, objArrCopyOf, i2, i4);
    }

    @Override // defpackage.uf00
    public final uf00 u(Integer num) {
        int i = this.d;
        int i2 = i - ((i - 1) & (-32));
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = num;
            return new ah00(objArr, objArrCopyOf, i + 1, this.e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = num;
        return e(objArr, objArr2, objArr3);
    }
}
