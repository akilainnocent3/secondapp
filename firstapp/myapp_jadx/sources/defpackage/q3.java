package defpackage;

import com.google.protobuf.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b'\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0007\b\t\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lq3;", "E", "Lq2;", "", "<init>", "()V", "a", "d", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class q3<E> extends q2<E> implements List<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q3$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                ks40.a(i3, dy5.a("startIndex: ", i, i2, ", endIndex: ", ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                hb5.a(whs.b(i, i2, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                mae0.a(whs.b(i, i2, "index: ", ", size: "));
            }
        }

        public static void c(int i, int i2) {
            if (i < 0 || i > i2) {
                mae0.a(whs.b(i, i2, "index: ", ", size: "));
            }
        }

        public static void d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                ks40.a(i3, dy5.a("fromIndex: ", i, i2, ", toIndex: ", ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                hb5.a(whs.b(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return Reader.READ_DONE;
            }
            return 2147483639;
        }
    }

    public class b implements Iterator<E>, dhp {
        public int a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a < q3.this.b();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                lrh0.a();
                return null;
            }
            int i = this.a;
            this.a = i + 1;
            return q3.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class c extends q3<E>.b implements ListIterator<E> {
        public c(int i) {
            super();
            Companion companion = q3.INSTANCE;
            int iB = q3.this.b();
            companion.getClass();
            Companion.c(i, iB);
            this.a = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                lrh0.a();
                return null;
            }
            int i = this.a - 1;
            this.a = i;
            return q3.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends q3<E> implements RandomAccess {
        public final q3<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(q3<? extends E> q3Var, int i, int i2) {
            this.b = q3Var;
            this.c = i;
            Companion companion = q3.INSTANCE;
            int iB = q3Var.b();
            companion.getClass();
            Companion.d(i, i2, iB);
            this.d = i2 - i;
        }

        @Override // defpackage.q2
        public final int b() {
            return this.d;
        }

        @Override // java.util.List
        public final E get(int i) {
            q3.INSTANCE.getClass();
            Companion.b(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // defpackage.q3, java.util.List
        public final List<E> subList(int i, int i2) {
            q3.INSTANCE.getClass();
            Companion.d(i, i2, this.d);
            int i3 = this.c;
            return new d(this.b, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        INSTANCE.getClass();
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.g(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        INSTANCE.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.g(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.g(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
