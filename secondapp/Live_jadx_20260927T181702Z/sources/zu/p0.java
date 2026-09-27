package zu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
public final class p0<T> implements m<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final m<T> f162594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162596c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f162597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f162598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p0<T> f162599d;

        public a(p0<T> p0Var) {
            this.f162599d = p0Var;
            this.f162597b = p0Var.f162594a.iterator();
        }

        private final void a() {
            while (this.f162598c < this.f162599d.f162595b && this.f162597b.hasNext()) {
                this.f162597b.next();
                this.f162598c++;
            }
        }

        public final Iterator<T> b() {
            return this.f162597b;
        }

        public final int d() {
            return this.f162598c;
        }

        public final void e(int i10) {
            this.f162598c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f162598c < this.f162599d.f162596c && this.f162597b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f162598c >= this.f162599d.f162596c) {
                throw new NoSuchElementException();
            }
            this.f162598c++;
            return this.f162597b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(@oy.l m<? extends T> sequence, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sequence, "sequence");
        this.f162594a = sequence;
        this.f162595b = i10;
        this.f162596c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    @Override // zu.e
    @oy.l
    public m<T> a(int i10) {
        return i10 >= f() ? x.l() : new p0(this.f162594a, this.f162595b + i10, this.f162596c);
    }

    @Override // zu.e
    @oy.l
    public m<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        m<T> mVar = this.f162594a;
        int i11 = this.f162595b;
        return new p0(mVar, i11, i10 + i11);
    }

    public final int f() {
        return this.f162596c - this.f162595b;
    }

    @Override // zu.m
    @oy.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
