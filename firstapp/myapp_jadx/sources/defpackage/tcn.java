package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tcn<E> extends jcn<E> implements Set<E> {
    public static final /* synthetic */ int c = 0;
    public transient pcn<E> b;

    public static class a<E> extends jcn.a<E> {
        @Override // jcn.b
        public final jcn.b a(Object obj) {
            obj.getClass();
            c(obj);
            return this;
        }

        public final tcn<E> g() {
            int i = this.b;
            if (i == 0) {
                int i2 = tcn.c;
                return e150.y;
            }
            Object[] objArr = this.a;
            if (i != 1) {
                tcn<E> tcnVarJ = tcn.j(i, objArr);
                this.b = tcnVarJ.size();
                this.c = true;
                return tcnVarJ;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i3 = tcn.c;
            return new tw90(obj);
        }
    }

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            im20.b("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> tcn<E> j(int i, Object... objArr) {
        if (i == 0) {
            return e150.y;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new tw90(obj);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                bmy.a(hce0.a(i6, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iJ = r58.j(iHashCode);
            while (true) {
                int i7 = iJ & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iJ++;
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new tw90(obj4);
        }
        if (i(i5) < i2 / 2) {
            return j(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new e150(i4, i3, i5, objArr, objArr2);
    }

    public static <E> tcn<E> k(Collection<? extends E> collection) {
        if ((collection instanceof tcn) && !(collection instanceof SortedSet)) {
            tcn<E> tcnVar = (tcn) collection;
            if (!tcnVar.f()) {
                return tcnVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    @SafeVarargs
    public static <E> tcn<E> m(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        im20.b("the total number of elements must fit in an int", eArr.length <= 2147483641);
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return j(length, objArr);
    }

    @Override // defpackage.jcn
    public pcn<E> a() {
        pcn<E> pcnVar = this.b;
        if (pcnVar != null) {
            return pcnVar;
        }
        pcn<E> pcnVarL = l();
        this.b = pcnVarL;
        return pcnVarL;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof tcn) && (this instanceof e150) && (((tcn) obj) instanceof e150) && hashCode() != obj.hashCode()) {
            return false;
        }
        return vi80.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return vi80.c(this);
    }

    public pcn<E> l() {
        Object[] array = toArray(jcn.a);
        pcn.b bVar = pcn.b;
        return pcn.i(array.length, array);
    }
}
