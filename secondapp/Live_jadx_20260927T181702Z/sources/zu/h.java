package zu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ds.l<T, Boolean> f162498c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162500c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f162501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h<T> f162502e;

        public a(h<T> hVar) {
            this.f162502e = hVar;
            this.f162499b = hVar.f162496a.iterator();
        }

        public final void a() {
            while (this.f162499b.hasNext()) {
                T next = this.f162499b.next();
                if (((Boolean) this.f162502e.f162498c.invoke(next)).booleanValue() == this.f162502e.f162497b) {
                    this.f162501d = next;
                    this.f162500c = 1;
                    return;
                }
            }
            this.f162500c = 0;
        }

        public final Iterator<T> b() {
            return this.f162499b;
        }

        public final T d() {
            return this.f162501d;
        }

        public final int e() {
            return this.f162500c;
        }

        public final void f(T t10) {
            this.f162501d = t10;
        }

        public final void g(int i10) {
            this.f162500c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f162500c == -1) {
                a();
            }
            return this.f162500c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f162500c == -1) {
                a();
            }
            if (this.f162500c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f162501d;
            this.f162501d = null;
            this.f162500c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@oy.l m<? extends T> sequence, boolean z10, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        this.f162496a = sequence;
        this.f162497b = z10;
        this.f162498c = predicate;
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(m mVar, boolean z10, ds.l lVar, int i10, kotlin.jvm.internal.x xVar) {
        this(mVar, (i10 & 2) != 0 ? true : z10, lVar);
    }
}
