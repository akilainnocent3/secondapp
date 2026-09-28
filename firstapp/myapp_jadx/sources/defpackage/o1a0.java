package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class o1a0<E> extends o4<E> implements ocn<E> {
    public static final o1a0 c = new o1a0(new Object[0]);
    public final Object[] b;

    public o1a0(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.o4
    public final o4 c(int i, E e) {
        Object[] objArr = this.b;
        xhs.b(i, objArr.length);
        if (i == objArr.length) {
            return d(e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            xx0.i(0, i, 6, objArr, objArr2);
            xx0.e(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = e;
            return new o1a0(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        xx0.e(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = e;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new bh00(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.o4
    public final o4 d(E e) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e;
            return new o1a0(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new bh00(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.o4
    public final o4 e(Collection<? extends E> collection) {
        Object[] objArr = this.b;
        if (collection.size() + objArr.length > 32) {
            fh00 fh00VarF = f();
            fh00VarF.addAll(collection);
            return fh00VarF.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new o1a0(objArrCopyOf);
    }

    @Override // defpackage.o4
    public final fh00 f() {
        return new fh00(this, null, this.b, 0);
    }

    @Override // java.util.List
    public final E get(int i) {
        xhs.a(i, b());
        return (E) this.b[i];
    }

    @Override // defpackage.o4
    public final o4 h(m4 m4Var) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) m4Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? c : new o1a0(xx0.k(0, length, objArrCopyOf));
    }

    @Override // defpackage.o4
    public final o4 i(int i) {
        Object[] objArr = this.b;
        xhs.a(i, objArr.length);
        if (objArr.length == 1) {
            return c;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        xx0.e(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new o1a0(objArrCopyOf);
    }

    @Override // defpackage.q3, java.util.List
    public final int indexOf(Object obj) {
        return ay0.D(obj, this.b);
    }

    @Override // defpackage.o4
    public final o4 j(int i, E e) {
        xhs.a(i, b());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e;
        return new o1a0(objArrCopyOf);
    }

    @Override // defpackage.q3, java.util.List
    public final int lastIndexOf(Object obj) {
        return ay0.I(obj, this.b);
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<E> listIterator(int i) {
        Object[] objArr = this.b;
        xhs.b(i, objArr.length);
        return new ob5(i, objArr.length, objArr);
    }
}
