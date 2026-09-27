package zu;

import java.util.Iterator;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
public final class d<T> implements m<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162485b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162487c;

        public a(d<T> dVar) {
            this.f162486b = dVar.f162484a.iterator();
            this.f162487c = dVar.f162485b;
        }

        public final void a() {
            while (this.f162487c > 0 && this.f162486b.hasNext()) {
                this.f162486b.next();
                this.f162487c--;
            }
        }

        public final Iterator<T> b() {
            return this.f162486b;
        }

        public final int d() {
            return this.f162487c;
        }

        public final void e(int i10) {
            this.f162487c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f162486b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f162486b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@oy.l m<? extends T> sequence, int i10) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        this.f162484a = sequence;
        this.f162485b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + kj.e.f102543c).toString());
    }

    @Override // zu.e
    @oy.l
    public m<T> a(int i10) {
        int i11 = this.f162485b + i10;
        return i11 < 0 ? new d(this, i10) : new d(this.f162484a, i11);
    }

    @Override // zu.e
    @oy.l
    public m<T> b(int i10) {
        int i11 = this.f162485b;
        int i12 = i11 + i10;
        return i12 < 0 ? new q0(this, i10) : new p0(this.f162484a, i11, i12);
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
