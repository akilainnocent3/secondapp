package qq;

import dr.f1;
import dr.w2;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nOptional.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Optional.kt\ncom/yandex/yatagan/Optional\n*L\n1#1,188:1\n122#1,3:189\n131#1,10:192\n148#1,2:202\n*S KotlinDebug\n*F\n+ 1 Optional.kt\ncom/yandex/yatagan/Optional\n*L\n88#1:189,3\n96#1:192,10\n103#1:202,2\n*E\n"})
public final class a0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f122553b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a0 f122554c = new a0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final T f122555a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nOptional.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Optional.kt\ncom/yandex/yatagan/Optional$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public final <T> a0<T> a() {
            return a0.f122554c;
        }

        @oy.l
        @cs.o
        public final <T> a0<T> c(@oy.l T value) {
            m0.p(value, "value");
            return new a0<>(value, null);
        }

        @oy.l
        @cs.o
        public final <T> a0<T> d(@oy.m T t10) {
            return t10 != null ? new a0<>(t10, null) : a0.f122554c;
        }

        public a() {
        }

        @cs.o
        public static /* synthetic */ void b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void accept(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c<T, R> {
        R apply(T t10);
    }

    public /* synthetic */ a0(Object obj, kotlin.jvm.internal.x xVar) {
        this(obj);
    }

    @oy.l
    @cs.o
    public static final <T> a0<T> b() {
        return f122553b.a();
    }

    @oy.l
    @cs.o
    public static final <T> a0<T> m(@oy.l T t10) {
        return f122553b.c(t10);
    }

    @oy.l
    @cs.o
    public static final <T> a0<T> n(@oy.m T t10) {
        return f122553b.d(t10);
    }

    @oy.l
    public final T c() {
        T t10 = this.f122555a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    @oy.m
    public final T d() {
        return this.f122555a;
    }

    public final /* synthetic */ void f(ds.l<? super T, w2> consumer) {
        m0.p(consumer, "consumer");
        T tD = d();
        if (tD != null) {
            consumer.invoke(tD);
        }
    }

    @cs.j(name = "ifPresent")
    public final void g(@oy.l b<? super T> consumer) {
        m0.p(consumer, "consumer");
        T tD = d();
        if (tD != null) {
            consumer.accept(tD);
        }
    }

    public final /* synthetic */ void h(ds.l<? super T, w2> consumer, ds.a<w2> onEmpty) {
        m0.p(consumer, "consumer");
        m0.p(onEmpty, "onEmpty");
        if (d() != null) {
            consumer.invoke(d());
        } else {
            onEmpty.invoke();
        }
    }

    @cs.j(name = "ifPresentOrElse")
    public final void i(@oy.l b<? super T> consumer, @oy.l Runnable onEmpty) {
        m0.p(consumer, "consumer");
        m0.p(onEmpty, "onEmpty");
        if (d() != null) {
            consumer.accept(d());
        } else {
            onEmpty.run();
        }
    }

    public final boolean j() {
        return this.f122555a != null;
    }

    public final /* synthetic */ <U> a0<U> k(ds.l<? super T, ? extends U> mapper) {
        m0.p(mapper, "mapper");
        return d() != null ? f122553b.d(mapper.invoke(d())) : f122553b.a();
    }

    @cs.j(name = "map")
    @oy.l
    public final <U> a0<U> l(@oy.l c<? super T, ? extends U> mapper) {
        m0.p(mapper, "mapper");
        return d() != null ? f122553b.d(mapper.apply(d())) : f122553b.a();
    }

    @cs.j(name = "orElse")
    @oy.l
    public final T o(@oy.l cr.c<T> alternative) {
        m0.p(alternative, "alternative");
        T t10 = this.f122555a;
        if (t10 != null) {
            return t10;
        }
        T t11 = alternative.get();
        m0.o(t11, "alternative.get()");
        return t11;
    }

    public final /* synthetic */ T p(ds.a<? extends T> alternative) {
        m0.p(alternative, "alternative");
        T tD = d();
        return tD == null ? alternative.invoke() : tD;
    }

    @oy.l
    public final T q(@oy.l T alternative) {
        m0.p(alternative, "alternative");
        T t10 = this.f122555a;
        return t10 == null ? alternative : t10;
    }

    @oy.m
    public final T r() {
        return this.f122555a;
    }

    public a0(T t10) {
        this.f122555a = t10;
    }

    @f1
    public static /* synthetic */ void e() {
    }
}
