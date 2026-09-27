package jr;

import ds.p;
import java.util.Comparator;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, Comparable<?>> f100664b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ds.l<? super T, ? extends Comparable<?>> lVar) {
            this.f100664b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            ds.l<T, Comparable<?>> lVar = this.f100664b;
            return g.l(lVar.invoke(t10), lVar.invoke(t11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f100665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, K> f100666c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, ds.l<? super T, ? extends K> lVar) {
            this.f100665b = comparator;
            this.f100666c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f100665b;
            ds.l<T, K> lVar = this.f100666c;
            return comparator.compare((Object) lVar.invoke(t10), (Object) lVar.invoke(t11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, Comparable<?>> f100667b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(ds.l<? super T, ? extends Comparable<?>> lVar) {
            this.f100667b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            ds.l<T, Comparable<?>> lVar = this.f100667b;
            return g.l(lVar.invoke(t11), lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f100668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, K> f100669c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, ds.l<? super T, ? extends K> lVar) {
            this.f100668b = comparator;
            this.f100669c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f100668b;
            ds.l<T, K> lVar = this.f100669c;
            return comparator.compare((Object) lVar.invoke(t11), (Object) lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f100670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, Comparable<?>> f100671c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, ds.l<? super T, ? extends Comparable<?>> lVar) {
            this.f100670b = comparator;
            this.f100671c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f100670b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            ds.l<T, Comparable<?>> lVar = this.f100671c;
            return g.l(lVar.invoke(t10), lVar.invoke(t11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f100672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f100673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, K> f100674d;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, ds.l<? super T, ? extends K> lVar) {
            this.f100672b = comparator;
            this.f100673c = comparator2;
            this.f100674d = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f100672b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f100673c;
            ds.l<T, K> lVar = this.f100674d;
            return comparator.compare((Object) lVar.invoke(t10), (Object) lVar.invoke(t11));
        }
    }

    /* JADX INFO: renamed from: jr.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C0948g<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f100675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, Comparable<?>> f100676c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0948g(Comparator<T> comparator, ds.l<? super T, ? extends Comparable<?>> lVar) {
            this.f100675b = comparator;
            this.f100676c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f100675b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            ds.l<T, Comparable<?>> lVar = this.f100676c;
            return g.l(lVar.invoke(t11), lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f100677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f100678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, K> f100679d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, ds.l<? super T, ? extends K> lVar) {
            this.f100677b = comparator;
            this.f100678c = comparator2;
            this.f100679d = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f100677b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f100678c;
            ds.l<T, K> lVar = this.f100679d;
            return comparator.compare((Object) lVar.invoke(t11), (Object) lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class i<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f100680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<T, T, Integer> f100681c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f100680b = comparator;
            this.f100681c = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f100680b.compare(t10, t11);
            return iCompare != 0 ? iCompare : this.f100681c.invoke(t10, t11).intValue();
        }
    }

    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    @ur.f
    public static final <T> Comparator<T> B(Comparator<T> comparator, ds.l<? super T, ? extends Comparable<?>> selector) {
        m0.p(comparator, "<this>");
        m0.p(selector, "selector");
        return new e(comparator, selector);
    }

    @ur.f
    public static final <T, K> Comparator<T> C(Comparator<T> comparator, Comparator<? super K> comparator2, ds.l<? super T, ? extends K> selector) {
        m0.p(comparator, "<this>");
        m0.p(comparator2, "comparator");
        m0.p(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @ur.f
    public static final <T> Comparator<T> D(Comparator<T> comparator, ds.l<? super T, ? extends Comparable<?>> selector) {
        m0.p(comparator, "<this>");
        m0.p(selector, "selector");
        return new C0948g(comparator, selector);
    }

    @ur.f
    public static final <T, K> Comparator<T> E(Comparator<T> comparator, Comparator<? super K> comparator2, ds.l<? super T, ? extends K> selector) {
        m0.p(comparator, "<this>");
        m0.p(comparator2, "comparator");
        m0.p(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @ur.f
    public static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> comparison) {
        m0.p(comparator, "<this>");
        m0.p(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @oy.l
    public static final <T> Comparator<T> G(@oy.l final Comparator<T> comparator, @oy.l final Comparator<? super T> comparator2) {
        m0.p(comparator, "<this>");
        m0.p(comparator2, "comparator");
        return new Comparator() { // from class: jr.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.H(comparator, comparator2, obj, obj2);
            }
        };
    }

    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj);
    }

    @ur.f
    public static final <T> Comparator<T> f(ds.l<? super T, ? extends Comparable<?>> selector) {
        m0.p(selector, "selector");
        return new a(selector);
    }

    @ur.f
    public static final <T, K> Comparator<T> g(Comparator<? super K> comparator, ds.l<? super T, ? extends K> selector) {
        m0.p(comparator, "comparator");
        m0.p(selector, "selector");
        return new b(comparator, selector);
    }

    @oy.l
    public static <T> Comparator<T> h(@oy.l final ds.l<? super T, ? extends Comparable<?>>... selectors) {
        m0.p(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: jr.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.i(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int i(ds.l[] lVarArr, Object obj, Object obj2) {
        return p(obj, obj2, lVarArr);
    }

    @ur.f
    public static final <T> Comparator<T> j(ds.l<? super T, ? extends Comparable<?>> selector) {
        m0.p(selector, "selector");
        return new c(selector);
    }

    @ur.f
    public static final <T, K> Comparator<T> k(Comparator<? super K> comparator, ds.l<? super T, ? extends K> selector) {
        m0.p(comparator, "comparator");
        m0.p(selector, "selector");
        return new d(comparator, selector);
    }

    public static <T extends Comparable<?>> int l(@oy.m T t10, @oy.m T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    @ur.f
    public static final <T> int m(T t10, T t11, ds.l<? super T, ? extends Comparable<?>> selector) {
        m0.p(selector, "selector");
        return l(selector.invoke(t10), selector.invoke(t11));
    }

    @ur.f
    public static final <T, K> int n(T t10, T t11, Comparator<? super K> comparator, ds.l<? super T, ? extends K> selector) {
        m0.p(comparator, "comparator");
        m0.p(selector, "selector");
        return comparator.compare(selector.invoke(t10), selector.invoke(t11));
    }

    public static <T> int o(T t10, T t11, @oy.l ds.l<? super T, ? extends Comparable<?>>... selectors) {
        m0.p(selectors, "selectors");
        if (selectors.length > 0) {
            return p(t10, t11, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final <T> int p(T t10, T t11, ds.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (ds.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iL = l(lVar.invoke(t10), lVar.invoke(t11));
            if (iL != 0) {
                return iL;
            }
        }
        return 0;
    }

    @oy.l
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f100682b;
        m0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return jVar;
    }

    @ur.f
    public static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @oy.l
    public static final <T> Comparator<T> s(@oy.l final Comparator<? super T> comparator) {
        m0.p(comparator, "comparator");
        return new Comparator() { // from class: jr.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.t(comparator, obj, obj2);
            }
        };
    }

    public static final int t(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @ur.f
    public static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @oy.l
    public static final <T> Comparator<T> v(@oy.l final Comparator<? super T> comparator) {
        m0.p(comparator, "comparator");
        return new Comparator() { // from class: jr.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.w(comparator, obj, obj2);
            }
        };
    }

    public static final int w(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @oy.l
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f100683b;
        m0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return kVar;
    }

    @oy.l
    public static final <T> Comparator<T> y(@oy.l Comparator<T> comparator) {
        m0.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).b();
        }
        j jVar = j.f100682b;
        if (m0.g(comparator, jVar)) {
            k kVar = k.f100683b;
            m0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return kVar;
        }
        if (!m0.g(comparator, k.f100683b)) {
            return new l(comparator);
        }
        m0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return jVar;
    }

    @oy.l
    public static final <T> Comparator<T> z(@oy.l final Comparator<T> comparator, @oy.l final Comparator<? super T> comparator2) {
        m0.p(comparator, "<this>");
        m0.p(comparator2, "comparator");
        return new Comparator() { // from class: jr.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.A(comparator, comparator2, obj, obj2);
            }
        };
    }
}
