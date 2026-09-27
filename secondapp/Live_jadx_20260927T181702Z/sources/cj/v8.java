package cj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@n6
@yi.b
@j4
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collector<Object, ?, Optional<Object>> f24610a = Collector.of(new Supplier() { // from class: cj.p8
        @Override // java.util.function.Supplier
        public final Object get() {
            return new v8.a();
        }
    }, new BiConsumer() { // from class: cj.q8
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((v8.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: cj.r8
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((v8.a) obj).b((v8.a) obj2);
        }
    }, new Function() { // from class: cj.s8
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((v8.a) obj).d();
        }
    }, Collector.Characteristics.UNORDERED);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f24611b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Collector<Object, ?, Object> f24612c = Collector.of(new Supplier() { // from class: cj.p8
        @Override // java.util.function.Supplier
        public final Object get() {
            return new v8.a();
        }
    }, new BiConsumer() { // from class: cj.t8
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            v8.a((v8.a) obj, obj2);
        }
    }, new BinaryOperator() { // from class: cj.r8
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((v8.a) obj).b((v8.a) obj2);
        }
    }, new Function() { // from class: cj.u8
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return v8.b((v8.a) obj);
        }
    }, Collector.Characteristics.UNORDERED);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f24613c = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.a
        public Object f24614a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Object> f24615b = Collections.EMPTY_LIST;

        public void a(Object o10) {
            zi.l0.E(o10);
            if (this.f24614a == null) {
                this.f24614a = o10;
                return;
            }
            if (this.f24615b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f24615b = arrayList;
                arrayList.add(o10);
            } else {
                if (this.f24615b.size() >= 4) {
                    throw e(true);
                }
                this.f24615b.add(o10);
            }
        }

        public a b(a other) {
            if (this.f24614a == null) {
                return other;
            }
            if (other.f24614a != null) {
                if (this.f24615b.isEmpty()) {
                    this.f24615b = new ArrayList();
                }
                this.f24615b.add(other.f24614a);
                this.f24615b.addAll(other.f24615b);
                if (this.f24615b.size() > 4) {
                    List<Object> list = this.f24615b;
                    list.subList(4, list.size()).clear();
                    throw e(true);
                }
            }
            return this;
        }

        public Object c() {
            if (this.f24614a == null) {
                throw new NoSuchElementException();
            }
            if (this.f24615b.isEmpty()) {
                return this.f24614a;
            }
            throw e(false);
        }

        @n6
        public Optional<Object> d() {
            if (this.f24615b.isEmpty()) {
                return Optional.ofNullable(this.f24614a);
            }
            throw e(false);
        }

        public IllegalArgumentException e(boolean overflow) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected one element but was: <");
            sb2.append(this.f24614a);
            for (Object obj : this.f24615b) {
                sb2.append(", ");
                sb2.append(obj);
            }
            if (overflow) {
                sb2.append(", ...");
            }
            sb2.append('>');
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static /* synthetic */ void a(a aVar, Object obj) {
        if (obj == null) {
            obj = f24611b;
        }
        aVar.a(obj);
    }

    public static /* synthetic */ Object b(a aVar) {
        Object objC = aVar.c();
        if (objC == f24611b) {
            return null;
        }
        return objC;
    }

    public static <T> Collector<T, ?, T> c() {
        return (Collector<T, ?, T>) f24612c;
    }

    public static <T> Collector<T, ?, Optional<T>> d() {
        return (Collector<T, ?, Optional<T>>) f24610a;
    }
}
