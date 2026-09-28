package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pcn<E> extends jcn<E> implements List<E>, RandomAccess {
    public static final b b = new b(c150.e, 0);

    public static final class a<E> extends jcn.a<E> {
        public a() {
            super(4);
        }

        @Override // jcn.b
        public final jcn.b a(Object obj) {
            c(obj);
            return this;
        }

        public final c150 g() {
            this.c = true;
            return pcn.i(this.b, this.a);
        }
    }

    public static class b<E> extends g3<E> {
        public final pcn<E> d;

        public b(pcn<E> pcnVar, int i) {
            super(pcnVar.size(), i);
            this.d = pcnVar;
        }

        @Override // defpackage.g3
        public final E a(int i) {
            return this.d.get(i);
        }
    }

    public static c150 i(int i, Object[] objArr) {
        return i == 0 ? c150.e : new c150(i, objArr);
    }

    public static <E> pcn<E> j(Collection<? extends E> collection) {
        if (!(collection instanceof jcn)) {
            Object[] array = collection.toArray();
            mby.a(array.length, array);
            return i(array.length, array);
        }
        pcn<E> pcnVarA = ((jcn) collection).a();
        if (!pcnVarA.f()) {
            return pcnVarA;
        }
        Object[] array2 = pcnVarA.toArray(jcn.a);
        return i(array2.length, array2);
    }

    public static c150 k(Object[] objArr) {
        if (objArr.length == 0) {
            return c150.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        mby.a(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static c150 m(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        mby.a(5, objArr);
        return i(5, objArr);
    }

    public static c150 n(Object obj) {
        Object[] objArr = {obj};
        mby.a(1, objArr);
        return i(1, objArr);
    }

    public static c150 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        mby.a(2, objArr);
        return i(2, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c150 q(Comparator comparator, List list) {
        comparator.getClass();
        Collection collection = list;
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        mby.a(array.length, array);
        Arrays.sort(array, comparator);
        return i(array.length, array);
    }

    @Override // defpackage.jcn
    @Deprecated
    public final pcn<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jcn
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.jcn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && sgp.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (sgp.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.jcn
    /* JADX INFO: renamed from: h */
    public final lgh0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.jcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i) {
        im20.f(i, size());
        return isEmpty() ? b : new b(this, i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r */
    public pcn<E> subList(int i, int i2) {
        im20.g(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? c150.e : new c(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    public static c150 p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        im20.b(UccrWswQGaIj.XNNTYQVjKN, objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        mby.a(length, objArr2);
        return i(length, objArr2);
    }

    public class c extends pcn<E> {
        public final transient int c;
        public final transient int d;

        public c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.jcn
        public final Object[] c() {
            return pcn.this.c();
        }

        @Override // defpackage.jcn
        public final int d() {
            return pcn.this.e() + this.c + this.d;
        }

        @Override // defpackage.jcn
        public final int e() {
            return pcn.this.e() + this.c;
        }

        @Override // defpackage.jcn
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i) {
            im20.d(i, this.d);
            return pcn.this.get(i + this.c);
        }

        @Override // defpackage.pcn, defpackage.jcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // defpackage.pcn, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // defpackage.pcn, java.util.List
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final pcn<E> subList(int i, int i2) {
            im20.g(i, i2, this.d);
            int i3 = this.c;
            return pcn.this.subList(i + i3, i2 + i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d;
        }

        @Override // defpackage.pcn, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }
}
