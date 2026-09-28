package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public final class n1a0<E> extends n4<E> implements qcn<E> {
    public static final n1a0 c = new n1a0(new Object[0]);
    public final Object[] b;

    public n1a0(Object[] objArr) {
        this.b = objArr;
    }

    @Override // defpackage.n4, java.util.Collection, java.util.List, defpackage.uf00
    public final uf00<E> addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.b;
        if (collection.size() + objArr.length > 32) {
            eh00 eh00VarBuilder = builder();
            eh00VarBuilder.addAll(collection);
            return eh00VarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new n1a0(objArrCopyOf);
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.uf00
    public final eh00 builder() {
        return new eh00(this, null, this.b, 0);
    }

    @Override // defpackage.uf00
    public final uf00 g() {
        Integer numValueOf = Integer.valueOf(R.string.component_register__progressbar_account_info);
        Object[] objArr = this.b;
        pwn.b(0, objArr.length);
        if (objArr.length == 0) {
            return u(numValueOf);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            xx0.i(0, 0, 6, objArr, objArr2);
            xx0.e(1, 0, objArr.length, objArr, objArr2);
            objArr2[0] = numValueOf;
            return new n1a0(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        xx0.e(1, 0, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[0] = numValueOf;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ah00(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr = this.b;
        pwn.a(i, objArr.length);
        return (E) objArr[i];
    }

    @Override // defpackage.q3, java.util.List
    public final int indexOf(Object obj) {
        return ay0.D(obj, this.b);
    }

    @Override // defpackage.q3, java.util.List
    public final int lastIndexOf(Object obj) {
        return ay0.I(obj, this.b);
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<E> listIterator(int i) {
        Object[] objArr = this.b;
        pwn.b(i, objArr.length);
        return new nb5(i, objArr.length, objArr);
    }

    @Override // defpackage.q3, java.util.List, defpackage.uf00
    public final uf00<E> set(int i, E e) {
        Object[] objArr = this.b;
        pwn.a(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = e;
        return new n1a0(objArrCopyOf);
    }

    @Override // defpackage.uf00
    public final uf00 u(Integer num) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = num;
            return new n1a0(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = num;
        return new ah00(objArr, objArr2, objArr.length + 1, 0);
    }
}
