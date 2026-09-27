package yu;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class f<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f160033c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f160034b = new b();

        public static <T> b<T> a() {
            return f160034b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends d<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f160035c;

        public c() {
            super();
            this.f160035c = ((AbstractList) f.this).modCount;
        }

        @Override // yu.f.d
        public void a() {
            if (((AbstractList) f.this).modCount == this.f160035c) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) f.this).modCount + "; expected: " + this.f160035c);
        }

        @Override // yu.f.d
        public E b() {
            return (E) f.this.f160033c;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            f.this.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f160037b;

        public d() {
        }

        public abstract void a();

        public abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f160037b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f160037b) {
                throw new NoSuchElementException();
            }
            this.f160037b = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void d(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.f160032b;
        if (i10 == 0) {
            this.f160033c = e10;
        } else if (i10 == 1) {
            this.f160033c = new Object[]{this.f160033c, e10};
        } else {
            Object[] objArr = (Object[]) this.f160033c;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f160033c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f160032b] = e10;
        }
        this.f160032b++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f160033c = null;
        this.f160032b = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f160032b)) {
            return i11 == 1 ? (E) this.f160033c : (E) ((Object[]) this.f160033c)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f160032b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        int i10 = this.f160032b;
        if (i10 == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                d(2);
            }
            return bVarA;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            d(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f160032b)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f160032b);
        }
        if (i11 == 1) {
            e10 = (E) this.f160033c;
            this.f160033c = null;
        } else {
            Object[] objArr = (Object[]) this.f160033c;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f160033c = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f160032b - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f160032b--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f160032b)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f160032b);
        }
        if (i11 == 1) {
            E e11 = (E) this.f160033c;
            this.f160033c = e10;
            return e11;
        }
        Object[] objArr = (Object[]) this.f160033c;
        E e12 = (E) objArr[i10];
        objArr[i10] = e10;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f160032b;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f160032b;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f160033c, 0, i10, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l
    public <T> T[] toArray(@l T[] tArr) {
        if (tArr == 0) {
            d(4);
        }
        int length = tArr.length;
        int i10 = this.f160032b;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f160033c;
                return tArr2;
            }
            tArr[0] = this.f160033c;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f160033c, i10, tArr.getClass());
                if (tArr3 == null) {
                    d(6);
                }
                return tArr3;
            }
            if (i10 != 0) {
                System.arraycopy(this.f160033c, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f160032b;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f160032b)) {
            if (i11 == 0) {
                this.f160033c = e10;
            } else if (i11 == 1 && i10 == 0) {
                this.f160033c = new Object[]{e10, this.f160033c};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f160033c;
                } else {
                    Object[] objArr2 = (Object[]) this.f160033c;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f160032b - i10);
                }
                objArr[i10] = e10;
                this.f160033c = objArr;
            }
            this.f160032b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f160032b);
    }
}
