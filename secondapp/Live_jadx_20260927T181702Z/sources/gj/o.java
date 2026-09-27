package gj;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
@yi.a
public final class o {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a implements n<byte[]> {
        INSTANCE;

        @Override // gj.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(byte[] from, j0 into) {
            into.h(from);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b implements n<Integer> {
        INSTANCE;

        @Override // gj.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(Integer from, j0 into) {
            into.b(from.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c implements n<Long> {
        INSTANCE;

        @Override // gj.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(Long from, j0 into) {
            into.c(from.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d<E> implements n<Iterable<? extends E>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n<E> f86914b;

        public d(n<E> elementFunnel) {
            this.f86914b = (n) zi.l0.E(elementFunnel);
        }

        @Override // gj.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void F(Iterable<? extends E> from, j0 into) {
            Iterator<? extends E> it = from.iterator();
            while (it.hasNext()) {
                this.f86914b.F(it.next(), into);
            }
        }

        public boolean equals(@zq.a Object o10) {
            if (o10 instanceof d) {
                return this.f86914b.equals(((d) o10).f86914b);
            }
            return false;
        }

        public int hashCode() {
            return d.class.hashCode() ^ this.f86914b.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.f86914b + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j0 f86915b;

        public e(j0 sink) {
            this.f86915b = (j0) zi.l0.E(sink);
        }

        public String toString() {
            return "Funnels.asOutputStream(" + this.f86915b + gi.j.f86771d;
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
            this.f86915b.g((byte) b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes) {
            this.f86915b.h(bytes);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) {
            this.f86915b.k(bytes, off, len);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f implements n<CharSequence>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Charset f86916b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements Serializable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final long f86917c = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f86918b;

            public a(Charset charset) {
                this.f86918b = charset.name();
            }

            public final Object d() {
                return o.f(Charset.forName(this.f86918b));
            }
        }

        public f(Charset charset) {
            this.f86916b = (Charset) zi.l0.E(charset);
        }

        @Override // gj.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void F(CharSequence from, j0 into) {
            into.m(from, this.f86916b);
        }

        public final void b(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        public Object d() {
            return new a(this.f86916b);
        }

        public boolean equals(@zq.a Object o10) {
            if (o10 instanceof f) {
                return this.f86916b.equals(((f) o10).f86916b);
            }
            return false;
        }

        public int hashCode() {
            return f.class.hashCode() ^ this.f86916b.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.f86916b.name() + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum g implements n<CharSequence> {
        INSTANCE;

        @Override // gj.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(CharSequence from, j0 into) {
            into.j(from);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    public static OutputStream a(j0 sink) {
        return new e(sink);
    }

    public static n<byte[]> b() {
        return a.INSTANCE;
    }

    public static n<Integer> c() {
        return b.INSTANCE;
    }

    public static n<Long> d() {
        return c.INSTANCE;
    }

    public static <E> n<Iterable<? extends E>> e(n<E> elementFunnel) {
        return new d(elementFunnel);
    }

    public static n<CharSequence> f(Charset charset) {
        return new f(charset);
    }

    public static n<CharSequence> g() {
        return g.INSTANCE;
    }
}
