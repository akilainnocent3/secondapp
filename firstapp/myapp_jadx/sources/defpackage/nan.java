package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nan {
    public final Context a;
    public final Object b;
    public final e5f0 c;
    public final d d;
    public final Map<String, String> e;
    public final blh f;
    public final a5d.a g;
    public final CoroutineContext h;
    public final CoroutineContext i;
    public final CoroutineContext j;
    public final wr5 k;
    public final wr5 l;
    public final wr5 m;
    public final Function1<nan, u7n> n;
    public final Function1<nan, u7n> o;
    public final Function1<nan, u7n> p;
    public final hx90 q;
    public final vy60 r;
    public final dm20 s;
    public final p4h t;
    public final c u;
    public final b v;

    public static final class b {
        public static final b o;
        public final blh a;
        public final CoroutineContext b;
        public final CoroutineContext c;
        public final CoroutineContext d;
        public final wr5 e;
        public final wr5 f;
        public final wr5 g;
        public final Function1<nan, u7n> h;
        public final Function1<nan, u7n> i;
        public final Function1<nan, u7n> j;
        public final hx90 k;
        public final vy60 l;
        public final dm20 m;
        public final p4h n;

        static {
            blh blhVar = blh.SYSTEM;
            e eVar = e.a;
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            wr5 wr5Var = wr5.c;
            j840 j840Var = hx90.a;
            vy60 vy60Var = vy60.b;
            dm20 dm20Var = dm20.a;
            p4h p4hVar = p4h.b;
            ush0.a aVar = ush0.a.a;
            o = new b(blhVar, eVar, oddVar, oddVar, wr5Var, wr5Var, wr5Var, aVar, aVar, aVar, j840Var, vy60Var, dm20Var, p4hVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(blh blhVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, wr5 wr5Var, wr5 wr5Var2, wr5 wr5Var3, Function1<? super nan, ? extends u7n> function1, Function1<? super nan, ? extends u7n> function2, Function1<? super nan, ? extends u7n> function3, hx90 hx90Var, vy60 vy60Var, dm20 dm20Var, p4h p4hVar) {
            this.a = blhVar;
            this.b = coroutineContext;
            this.c = coroutineContext2;
            this.d = coroutineContext3;
            this.e = wr5Var;
            this.f = wr5Var2;
            this.g = wr5Var3;
            this.h = function1;
            this.i = function2;
            this.j = function3;
            this.k = hx90Var;
            this.l = vy60Var;
            this.m = dm20Var;
            this.n = p4hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && Intrinsics.g(this.h, bVar.h) && Intrinsics.g(this.i, bVar.i) && Intrinsics.g(this.j, bVar.j) && Intrinsics.g(this.k, bVar.k) && this.l == bVar.l && this.m == bVar.m && Intrinsics.g(this.n, bVar.n);
        }

        public final int hashCode() {
            return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + w57.b(w57.b(w57.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ')';
        }
    }

    public static final class c {
        public final CoroutineContext a;
        public final CoroutineContext b;
        public final CoroutineContext c;
        public final wr5 d;
        public final wr5 e;
        public final Function1<nan, u7n> f;
        public final Function1<nan, u7n> g;
        public final Function1<nan, u7n> h;
        public final hx90 i;
        public final vy60 j;
        public final dm20 k;

        public c(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, wr5 wr5Var, wr5 wr5Var2, Function1 function1, Function1 function2, Function1 function3, hx90 hx90Var, vy60 vy60Var, dm20 dm20Var) {
            this.a = coroutineContext;
            this.b = coroutineContext2;
            this.c = coroutineContext3;
            this.d = wr5Var;
            this.e = wr5Var2;
            this.f = function1;
            this.g = function2;
            this.h = function3;
            this.i = hx90Var;
            this.j = vy60Var;
            this.k = dm20Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f.equals(cVar.f) && this.g.equals(cVar.g) && this.h.equals(cVar.h) && Intrinsics.g(this.i, cVar.i) && this.j == cVar.j && this.k == cVar.k;
        }

        public final int hashCode() {
            CoroutineContext coroutineContext = this.a;
            int iHashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
            CoroutineContext coroutineContext2 = this.b;
            int iHashCode2 = (iHashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.c;
            int iHashCode3 = (iHashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            wr5 wr5Var = this.d;
            int iHashCode4 = (iHashCode3 + (wr5Var == null ? 0 : wr5Var.hashCode())) * 31;
            wr5 wr5Var2 = this.e;
            int iB = w57.b(w57.b(w57.b((iHashCode4 + (wr5Var2 == null ? 0 : wr5Var2.hashCode())) * 961, 31, this.f), 31, this.g), 31, this.h);
            hx90 hx90Var = this.i;
            int iHashCode5 = (iB + (hx90Var == null ? 0 : hx90Var.hashCode())) * 31;
            vy60 vy60Var = this.j;
            int iHashCode6 = (iHashCode5 + (vy60Var == null ? 0 : vy60Var.hashCode())) * 31;
            dm20 dm20Var = this.k;
            return iHashCode6 + (dm20Var != null ? dm20Var.hashCode() : 0);
        }

        public final String toString() {
            return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=" + this.d + ", diskCachePolicy=" + this.e + ", networkCachePolicy=null, placeholderFactory=" + this.f + ", errorFactory=" + this.g + ", fallbackFactory=" + this.h + ", sizeResolver=" + this.i + ", scale=" + this.j + ", precision=" + this.k + ')';
        }
    }

    public nan(Context context, Object obj, e5f0 e5f0Var, d dVar, Map map, blh blhVar, a5d.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, wr5 wr5Var, wr5 wr5Var2, wr5 wr5Var3, Function1 function1, Function1 function2, Function1 function3, hx90 hx90Var, vy60 vy60Var, dm20 dm20Var, p4h p4hVar, c cVar, b bVar) {
        this.a = context;
        this.b = obj;
        this.c = e5f0Var;
        this.d = dVar;
        this.e = map;
        this.f = blhVar;
        this.g = aVar;
        this.h = coroutineContext;
        this.i = coroutineContext2;
        this.j = coroutineContext3;
        this.k = wr5Var;
        this.l = wr5Var2;
        this.m = wr5Var3;
        this.n = function1;
        this.o = function2;
        this.p = function3;
        this.q = hx90Var;
        this.r = vy60Var;
        this.s = dm20Var;
        this.t = p4hVar;
        this.u = cVar;
        this.v = bVar;
    }

    public static a a(nan nanVar) {
        Context context = nanVar.a;
        nanVar.getClass();
        return new a(nanVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nan)) {
            return false;
        }
        nan nanVar = (nan) obj;
        return Intrinsics.g(this.a, nanVar.a) && Intrinsics.g(this.b, nanVar.b) && Intrinsics.g(this.c, nanVar.c) && Intrinsics.g(this.d, nanVar.d) && this.e.equals(nanVar.e) && Intrinsics.g(this.f, nanVar.f) && Intrinsics.g(this.g, nanVar.g) && Intrinsics.g(this.h, nanVar.h) && Intrinsics.g(this.i, nanVar.i) && Intrinsics.g(this.j, nanVar.j) && this.k == nanVar.k && this.l == nanVar.l && this.m == nanVar.m && Intrinsics.g(this.n, nanVar.n) && Intrinsics.g(this.o, nanVar.o) && Intrinsics.g(this.p, nanVar.p) && Intrinsics.g(this.q, nanVar.q) && this.r == nanVar.r && this.s == nanVar.s && this.t.equals(nanVar.t) && this.u.equals(nanVar.u) && Intrinsics.g(this.v, nanVar.v);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e5f0 e5f0Var = this.c;
        int iHashCode2 = (iHashCode + (e5f0Var == null ? 0 : e5f0Var.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 961)) * 961)) * 961;
        a5d.a aVar = this.g;
        return this.v.hashCode() + ((this.u.hashCode() + ((this.t.a.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + w57.b(w57.b(w57.b((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31, this.n), 31, this.o), 31, this.p)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=" + this.g + ", interceptorCoroutineContext=" + this.h + ", fetcherCoroutineContext=" + this.i + ", decoderCoroutineContext=" + this.j + ", memoryCachePolicy=" + this.k + ", diskCachePolicy=" + this.l + ", networkCachePolicy=" + this.m + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.n + ", errorFactory=" + this.o + ", fallbackFactory=" + this.p + ", sizeResolver=" + this.q + ", scale=" + this.r + ", precision=" + this.s + ", extras=" + this.t + ", defined=" + this.u + ", defaults=" + this.v + ')';
    }

    public interface d {
        default void a() {
        }

        default void b() {
        }

        default void onSuccess() {
        }
    }

    public static final class a {
        public final Context a;
        public b b;
        public Object c;
        public e5f0 d;
        public d e;
        public boolean f;
        public Map g;
        public a5d.a h;
        public CoroutineContext i;
        public CoroutineContext j;
        public CoroutineContext k;
        public wr5 l;
        public wr5 m;
        public Function1<? super nan, ? extends u7n> n;
        public Function1<? super nan, ? extends u7n> o;
        public Function1<? super nan, ? extends u7n> p;
        public hx90 q;
        public vy60 r;
        public dm20 s;
        public Object t;

        public a(nan nanVar, Context context) {
            this.a = context;
            this.b = nanVar.v;
            this.c = nanVar.b;
            this.d = nanVar.c;
            this.e = nanVar.d;
            this.g = nanVar.e;
            c cVar = nanVar.u;
            this.h = nanVar.g;
            this.i = cVar.a;
            this.j = cVar.b;
            this.k = cVar.c;
            this.l = cVar.d;
            this.m = cVar.e;
            this.n = cVar.f;
            this.o = cVar.g;
            this.p = cVar.h;
            this.q = cVar.i;
            this.r = cVar.j;
            this.s = cVar.k;
            this.t = nanVar.t;
        }

        public final nan a() {
            p4h p4hVar;
            Object obj = this.c;
            if (obj == null) {
                obj = h5y.a;
            }
            Object obj2 = obj;
            e5f0 e5f0Var = this.d;
            d dVar = this.e;
            Map mapB = this.g;
            if (Intrinsics.g(mapB, Boolean.valueOf(this.f))) {
                mapB.getClass();
                mapB = h58.b(y8h0.c(mapB));
            } else if (mapB == null) {
                x01.a();
                return null;
            }
            Map map = mapB;
            map.getClass();
            b bVar = this.b;
            blh blhVar = bVar.a;
            a5d.a aVar = this.h;
            wr5 wr5Var = this.l;
            if (wr5Var == null) {
                wr5Var = bVar.e;
            }
            wr5 wr5Var2 = wr5Var;
            wr5 wr5Var3 = this.m;
            if (wr5Var3 == null) {
                wr5Var3 = bVar.f;
            }
            wr5 wr5Var4 = wr5Var3;
            wr5 wr5Var5 = bVar.g;
            CoroutineContext coroutineContext = this.i;
            if (coroutineContext == null) {
                coroutineContext = bVar.b;
            }
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext coroutineContext3 = this.j;
            if (coroutineContext3 == null) {
                coroutineContext3 = bVar.c;
            }
            CoroutineContext coroutineContext4 = coroutineContext3;
            CoroutineContext coroutineContext5 = this.k;
            if (coroutineContext5 == null) {
                coroutineContext5 = bVar.d;
            }
            CoroutineContext coroutineContext6 = coroutineContext5;
            Function1<? super nan, ? extends u7n> function1 = this.n;
            Function1<? super nan, ? extends u7n> function2 = this.o;
            Function1<? super nan, ? extends u7n> function3 = this.p;
            hx90 hx90Var = this.q;
            if (hx90Var == null) {
                hx90Var = bVar.k;
            }
            hx90 hx90Var2 = hx90Var;
            vy60 vy60Var = this.r;
            if (vy60Var == null) {
                vy60Var = bVar.l;
            }
            vy60 vy60Var2 = vy60Var;
            dm20 dm20Var = this.s;
            if (dm20Var == null) {
                dm20Var = bVar.m;
            }
            dm20 dm20Var2 = dm20Var;
            Object obj3 = this.t;
            if (obj3 instanceof p4h.a) {
                p4hVar = new p4h(h58.b(((p4h.a) obj3).a));
            } else {
                if (!(obj3 instanceof p4h)) {
                    x01.a();
                    return null;
                }
                p4hVar = (p4h) obj3;
            }
            return new nan(this.a, obj2, e5f0Var, dVar, map, blhVar, aVar, coroutineContext2, coroutineContext4, coroutineContext6, wr5Var2, wr5Var4, wr5Var5, function1, function2, function3, hx90Var2, vy60Var2, dm20Var2, p4hVar, new c(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s), this.b);
        }

        public final void b(u7n u7nVar) {
            this.o = new man(u7nVar, 0);
        }

        public final p4h.a c() {
            Object obj = this.t;
            if (obj instanceof p4h.a) {
                return (p4h.a) obj;
            }
            if (!(obj instanceof p4h)) {
                x01.a();
                return null;
            }
            p4h.a aVar = new p4h.a((p4h) obj);
            this.t = aVar;
            return aVar;
        }

        public final void d(u7n u7nVar) {
            this.n = new man(u7nVar, 0);
        }

        public final void e(int i) {
            f(dx90.a(i, i));
        }

        public final void f(ww90 ww90Var) {
            this.q = new j840(ww90Var);
        }

        public a(Context context) {
            this.a = context;
            this.b = b.o;
            this.c = null;
            this.d = null;
            this.e = null;
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            this.g = o2gVar;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            ush0.a aVar = ush0.a.a;
            this.n = aVar;
            this.o = aVar;
            this.p = aVar;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = p4h.b;
        }
    }
}
