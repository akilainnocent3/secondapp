package zu;

import fr.c1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k<T> implements m<c1<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162521a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<c1<? extends T>>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162523c;

        public a(k<T> kVar) {
            this.f162522b = kVar.f162521a.iterator();
        }

        public final int a() {
            return this.f162523c;
        }

        public final Iterator<T> b() {
            return this.f162522b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c1<T> next() {
            int i10 = this.f162523c;
            this.f162523c = i10 + 1;
            if (i10 < 0) {
                fr.h0.b0();
            }
            return new c1<>(i10, this.f162522b.next());
        }

        public final void e(int i10) {
            this.f162523c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f162522b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@oy.l m<? extends T> sequence) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        this.f162521a = sequence;
    }

    @Override // zu.m
    @oy.l
    public Iterator<c1<T>> iterator() {
        return new a(this);
    }
}
