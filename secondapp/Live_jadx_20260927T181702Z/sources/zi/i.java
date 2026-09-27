package zi;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public abstract class i<A, B> implements t<A, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @km.j
    @zq.a
    @rj.b
    public transient i<B, A> f161731c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Iterable<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f161732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f161733c;

        /* JADX INFO: renamed from: zi.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1584a implements Iterator<B> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<? extends A> f161734b;

            public C1584a() {
                this.f161734b = a.this.f161732b.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f161734b.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) a.this.f161733c.b(this.f161734b.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f161734b.remove();
            }
        }

        public a(final i this$0, final Iterable val$fromIterable) {
            this.f161732b = val$fromIterable;
            this.f161733c = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C1584a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<A, B, C> extends i<A, C> implements Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f161736f = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i<A, B> f161737d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final i<B, C> f161738e;

        public b(i<A, B> first, i<B, C> second) {
            this.f161737d = first;
            this.f161738e = second;
        }

        @Override // zi.i
        @zq.a
        public A e(@zq.a C c10) {
            return (A) this.f161737d.e(this.f161738e.e(c10));
        }

        @Override // zi.i, zi.t
        public boolean equals(@zq.a Object object) {
            if (object instanceof b) {
                b bVar = (b) object;
                if (this.f161737d.equals(bVar.f161737d) && this.f161738e.equals(bVar.f161738e)) {
                    return true;
                }
            }
            return false;
        }

        @Override // zi.i
        @zq.a
        public C f(@zq.a A a10) {
            return (C) this.f161738e.f(this.f161737d.f(a10));
        }

        @Override // zi.i
        public A h(C c10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return (this.f161737d.hashCode() * 31) + this.f161738e.hashCode();
        }

        @Override // zi.i
        public C i(A a10) {
            throw new AssertionError();
        }

        public String toString() {
            return this.f161737d + ".andThen(" + this.f161738e + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<A, B> extends i<A, B> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t<? super A, ? extends B> f161739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final t<? super B, ? extends A> f161740e;

        public /* synthetic */ c(t tVar, t tVar2, a aVar) {
            this(tVar, tVar2);
        }

        @Override // zi.i, zi.t
        public boolean equals(@zq.a Object object) {
            if (object instanceof c) {
                c cVar = (c) object;
                if (this.f161739d.equals(cVar.f161739d) && this.f161740e.equals(cVar.f161740e)) {
                    return true;
                }
            }
            return false;
        }

        @Override // zi.i
        public A h(B b10) {
            return this.f161740e.apply(b10);
        }

        public int hashCode() {
            return (this.f161739d.hashCode() * 31) + this.f161740e.hashCode();
        }

        @Override // zi.i
        public B i(A a10) {
            return this.f161739d.apply(a10);
        }

        public String toString() {
            return "Converter.from(" + this.f161739d + ", " + this.f161740e + gi.j.f86771d;
        }

        public c(t<? super A, ? extends B> forwardFunction, t<? super B, ? extends A> backwardFunction) {
            this.f161739d = (t) l0.E(forwardFunction);
            this.f161740e = (t) l0.E(backwardFunction);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<A, B> extends i<B, A> implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f161743e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i<A, B> f161744d;

        public e(i<A, B> original) {
            this.f161744d = original;
        }

        @Override // zi.i
        @zq.a
        public B e(@zq.a A a10) {
            return this.f161744d.f(a10);
        }

        @Override // zi.i, zi.t
        public boolean equals(@zq.a Object object) {
            if (object instanceof e) {
                return this.f161744d.equals(((e) object).f161744d);
            }
            return false;
        }

        @Override // zi.i
        @zq.a
        public A f(@zq.a B b10) {
            return this.f161744d.e(b10);
        }

        @Override // zi.i
        public B h(A a10) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f161744d.hashCode();
        }

        @Override // zi.i
        public A i(B b10) {
            throw new AssertionError();
        }

        @Override // zi.i
        public i<A, B> l() {
            return this.f161744d;
        }

        public String toString() {
            return this.f161744d + ".reverse()";
        }
    }

    public i() {
        this(true);
    }

    public static <A, B> i<A, B> j(t<? super A, ? extends B> forwardFunction, t<? super B, ? extends A> backwardFunction) {
        return new c(forwardFunction, backwardFunction, null);
    }

    public static <T> i<T, T> k() {
        return (d) d.f161741d;
    }

    public final <C> i<A, C> a(i<B, C> secondConverter) {
        return g(secondConverter);
    }

    @Override // zi.t
    @qj.m(replacement = "this.convert(a)")
    @Deprecated
    public final B apply(A a10) {
        return b(a10);
    }

    @zq.a
    public final B b(@zq.a A a10) {
        return f(a10);
    }

    public Iterable<B> c(Iterable<? extends A> fromIterable) {
        l0.F(fromIterable, "fromIterable");
        return new a(this, fromIterable);
    }

    @zq.a
    public A e(@zq.a B b10) {
        if (!this.f161730b) {
            return m(b10);
        }
        if (b10 == null) {
            return null;
        }
        return (A) l0.E(h(b10));
    }

    @Override // zi.t
    public boolean equals(@zq.a Object object) {
        return super.equals(object);
    }

    @zq.a
    public B f(@zq.a A a10) {
        if (!this.f161730b) {
            return n(a10);
        }
        if (a10 == null) {
            return null;
        }
        return (B) l0.E(i(a10));
    }

    public <C> i<A, C> g(i<B, C> secondConverter) {
        return new b(this, (i) l0.E(secondConverter));
    }

    @qj.g
    public abstract A h(B b10);

    @qj.g
    public abstract B i(A a10);

    @qj.b
    public i<B, A> l() {
        i<B, A> iVar = this.f161731c;
        if (iVar != null) {
            return iVar;
        }
        e eVar = new e(this);
        this.f161731c = eVar;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zq.a
    public final A m(@zq.a B b10) {
        return (A) h(e0.a(b10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zq.a
    public final B n(@zq.a A a10) {
        return (B) i(e0.a(a10));
    }

    public i(boolean handleNullAutomatically) {
        this.f161730b = handleNullAutomatically;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d<T> extends i<T, T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i<?, ?> f161741d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f161742e = 0;

        private Object o() {
            return f161741d;
        }

        @Override // zi.i
        public <S> i<T, S> g(i<T, S> otherConverter) {
            return (i) l0.F(otherConverter, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // zi.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public d<T> l() {
            return this;
        }

        @Override // zi.i
        public T h(T t10) {
            return t10;
        }

        @Override // zi.i
        public T i(T t10) {
            return t10;
        }
    }
}
