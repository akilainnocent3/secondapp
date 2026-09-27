package zu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i<T, R, E> implements m<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<T, R> f162505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ds.l<R, Iterator<E>> f162506c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f162507a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f162508b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f162509c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f162510d = 2;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements Iterator<E>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<? extends E> f162512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f162513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i<T, R, E> f162514e;

        public b(i<T, R, E> iVar) {
            this.f162514e = iVar;
            this.f162511b = iVar.f162504a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f162512c;
            if (it != null && it.hasNext()) {
                this.f162513d = 1;
                return true;
            }
            while (this.f162511b.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.f162514e.f162506c.invoke(this.f162514e.f162505b.invoke(this.f162511b.next()));
                if (it2.hasNext()) {
                    this.f162512c = it2;
                    this.f162513d = 1;
                    return true;
                }
            }
            this.f162513d = 2;
            this.f162512c = null;
            return false;
        }

        public final Iterator<E> b() {
            return this.f162512c;
        }

        public final Iterator<T> d() {
            return this.f162511b;
        }

        public final int e() {
            return this.f162513d;
        }

        public final void f(Iterator<? extends E> it) {
            this.f162512c = it;
        }

        public final void g(int i10) {
            this.f162513d = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f162513d;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            int i10 = this.f162513d;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f162513d = 0;
            Iterator<? extends E> it = this.f162512c;
            kotlin.jvm.internal.m0.m(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@oy.l m<? extends T> sequence, @oy.l ds.l<? super T, ? extends R> transformer, @oy.l ds.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        kotlin.jvm.internal.m0.p(transformer, "transformer");
        kotlin.jvm.internal.m0.p(iterator, "iterator");
        this.f162504a = sequence;
        this.f162505b = transformer;
        this.f162506c = iterator;
    }

    @Override // zu.m
    @oy.l
    public Iterator<E> iterator() {
        return new b(this);
    }
}
