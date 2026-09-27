package zu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
public final class q0<T> implements m<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162608b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f162609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T> f162610c;

        public a(q0<T> q0Var) {
            this.f162609b = q0Var.f162608b;
            this.f162610c = q0Var.f162607a.iterator();
        }

        public final Iterator<T> a() {
            return this.f162610c;
        }

        public final int b() {
            return this.f162609b;
        }

        public final void d(int i10) {
            this.f162609b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f162609b > 0 && this.f162610c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f162609b;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f162609b = i10 - 1;
            return this.f162610c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@oy.l m<? extends T> sequence, int i10) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        this.f162607a = sequence;
        this.f162608b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + kj.e.f102543c).toString());
    }

    @Override // zu.e
    @oy.l
    public m<T> a(int i10) {
        int i11 = this.f162608b;
        return i10 >= i11 ? x.l() : new p0(this.f162607a, i10, i11);
    }

    @Override // zu.e
    @oy.l
    public m<T> b(int i10) {
        return i10 >= this.f162608b ? this : new q0(this.f162607a, i10);
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
