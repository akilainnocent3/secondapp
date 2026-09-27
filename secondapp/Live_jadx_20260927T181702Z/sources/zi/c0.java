package zi;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161649a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f161650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f161651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final c0 this$0, c0 prototype, final String val$nullText) {
            super(prototype, null);
            this.f161650b = val$nullText;
            this.f161651c = this$0;
        }

        @Override // zi.c0
        public c0 q() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // zi.c0
        public CharSequence r(@zq.a Object part) {
            return part == null ? this.f161650b : this.f161651c.r(part);
        }

        @Override // zi.c0
        public c0 s(String nullText) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends c0 {
        public b(c0 prototype) {
            super(prototype, null);
        }

        @Override // zi.c0
        public <A extends Appendable> A d(A appendable, Iterator<? extends Object> parts) throws IOException {
            l0.F(appendable, "appendable");
            l0.F(parts, "parts");
            while (parts.hasNext()) {
                Object next = parts.next();
                if (next != null) {
                    appendable.append(c0.this.r(next));
                    break;
                }
            }
            while (parts.hasNext()) {
                Object next2 = parts.next();
                if (next2 != null) {
                    appendable.append(c0.this.f161649a);
                    appendable.append(c0.this.r(next2));
                }
            }
            return appendable;
        }

        @Override // zi.c0
        public c0 s(String nullText) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // zi.c0
        public d u(String kvs) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AbstractList<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object[] f161653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f161654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f161655d;

        public c(final Object[] val$rest, final Object val$first, final Object val$second) {
            this.f161653b = val$rest;
            this.f161654c = val$first;
            this.f161655d = val$second;
        }

        @Override // java.util.AbstractList, java.util.List
        @zq.a
        public Object get(int index) {
            if (index != 0) {
                return index != 1 ? this.f161653b[index - 2] : this.f161655d;
            }
            return this.f161654c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f161653b.length + 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f161656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f161657b;

        public /* synthetic */ d(c0 c0Var, String str, a aVar) {
            this(c0Var, str);
        }

        @qj.a
        public <A extends Appendable> A a(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a10, iterable.iterator());
        }

        @qj.a
        public <A extends Appendable> A b(A appendable, Iterator<? extends Map.Entry<?, ?>> parts) throws IOException {
            l0.E(appendable);
            if (parts.hasNext()) {
                Map.Entry<?, ?> next = parts.next();
                appendable.append(this.f161656a.r(next.getKey()));
                appendable.append(this.f161657b);
                appendable.append(this.f161656a.r(next.getValue()));
                while (parts.hasNext()) {
                    appendable.append(this.f161656a.f161649a);
                    Map.Entry<?, ?> next2 = parts.next();
                    appendable.append(this.f161656a.r(next2.getKey()));
                    appendable.append(this.f161657b);
                    appendable.append(this.f161656a.r(next2.getValue()));
                }
            }
            return appendable;
        }

        @qj.a
        public <A extends Appendable> A c(A a10, Map<?, ?> map) throws IOException {
            return (A) a(a10, map.entrySet());
        }

        @qj.a
        public StringBuilder d(StringBuilder builder, Iterable<? extends Map.Entry<?, ?>> entries) {
            return e(builder, entries.iterator());
        }

        @qj.a
        public StringBuilder e(StringBuilder builder, Iterator<? extends Map.Entry<?, ?>> entries) {
            try {
                b(builder, entries);
                return builder;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @qj.a
        public StringBuilder f(StringBuilder builder, Map<?, ?> map) {
            return d(builder, map.entrySet());
        }

        public String g(Iterable<? extends Map.Entry<?, ?>> entries) {
            return h(entries.iterator());
        }

        public String h(Iterator<? extends Map.Entry<?, ?>> entries) {
            return e(new StringBuilder(), entries).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String nullText) {
            return new d(this.f161656a.s(nullText), this.f161657b);
        }

        public d(c0 joiner, String keyValueSeparator) {
            this.f161656a = joiner;
            this.f161657b = (String) l0.E(keyValueSeparator);
        }
    }

    public /* synthetic */ c0(c0 c0Var, a aVar) {
        this(c0Var);
    }

    public static Iterable<Object> j(@zq.a Object first, @zq.a Object second, Object[] rest) {
        l0.E(rest);
        return new c(rest, first, second);
    }

    public static c0 o(char separator) {
        return new c0(String.valueOf(separator));
    }

    public static c0 p(String separator) {
        return new c0(separator);
    }

    @qj.a
    public <A extends Appendable> A b(A a10, Iterable<? extends Object> iterable) throws IOException {
        return (A) d(a10, iterable.iterator());
    }

    @qj.a
    public final <A extends Appendable> A c(A a10, @zq.a Object obj, @zq.a Object obj2, Object... objArr) throws IOException {
        return (A) b(a10, j(obj, obj2, objArr));
    }

    @qj.a
    public <A extends Appendable> A d(A appendable, Iterator<? extends Object> parts) throws IOException {
        l0.E(appendable);
        if (parts.hasNext()) {
            appendable.append(r(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.f161649a);
                appendable.append(r(parts.next()));
            }
        }
        return appendable;
    }

    @qj.a
    public final <A extends Appendable> A e(A a10, Object[] objArr) throws IOException {
        return (A) b(a10, Arrays.asList(objArr));
    }

    @qj.a
    public final StringBuilder f(StringBuilder builder, Iterable<? extends Object> parts) {
        return h(builder, parts.iterator());
    }

    @qj.a
    public final StringBuilder g(StringBuilder builder, @zq.a Object first, @zq.a Object second, Object... rest) {
        return f(builder, j(first, second, rest));
    }

    @qj.a
    public final StringBuilder h(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            d(builder, parts);
            return builder;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @qj.a
    public final StringBuilder i(StringBuilder builder, Object[] parts) {
        return f(builder, Arrays.asList(parts));
    }

    public final String k(Iterable<? extends Object> parts) {
        return m(parts.iterator());
    }

    public final String l(@zq.a Object first, @zq.a Object second, Object... rest) {
        return k(j(first, second, rest));
    }

    public final String m(Iterator<? extends Object> parts) {
        return h(new StringBuilder(), parts).toString();
    }

    public final String n(Object[] parts) {
        return k(Arrays.asList(parts));
    }

    public c0 q() {
        return new b(this);
    }

    public CharSequence r(@zq.a Object part) {
        Objects.requireNonNull(part);
        return part instanceof CharSequence ? (CharSequence) part : part.toString();
    }

    public c0 s(String nullText) {
        l0.E(nullText);
        return new a(this, this, nullText);
    }

    public d t(char keyValueSeparator) {
        return u(String.valueOf(keyValueSeparator));
    }

    public d u(String keyValueSeparator) {
        return new d(this, keyValueSeparator, null);
    }

    public c0(String separator) {
        this.f161649a = (String) l0.E(separator);
    }

    public c0(c0 prototype) {
        this.f161649a = prototype.f161649a;
    }
}
