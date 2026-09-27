package wb;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements wb.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f142652h = 4194304;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @h1
    public static final int f142653i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f142654j = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<a, Object> f142655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f142656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f142657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, wb.a<?>> f142658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f142659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f142660g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f142661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f142663c;

        public a(b bVar) {
            this.f142661a = bVar;
        }

        @Override // wb.n
        public void a() {
            this.f142661a.c(this);
        }

        public void b(int i10, Class<?> cls) {
            this.f142662b = i10;
            this.f142663c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f142662b == aVar.f142662b && this.f142663c == aVar.f142663c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f142662b * 31;
            Class<?> cls = this.f142663c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f142662b + "array=" + this.f142663c + fw.b.f85383j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d<a> {
        @Override // wb.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i10, cls);
            return aVarB;
        }
    }

    @h1
    public j() {
        this.f142655b = new h<>();
        this.f142656c = new b();
        this.f142657d = new HashMap();
        this.f142658e = new HashMap();
        this.f142659f = 4194304;
    }

    @Override // wb.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f142659f / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // wb.b
    public synchronized void b() {
        h(0);
    }

    @Override // wb.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = n(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m(q(i10, numCeilingKey) ? this.f142656c.e(numCeilingKey.intValue(), cls) : this.f142656c.e(i10, cls), cls);
    }

    @Override // wb.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) m(this.f142656c.e(i10, cls), cls);
    }

    @Override // wb.b
    @Deprecated
    public <T> void e(T t10, Class<T> cls) {
        put(t10);
    }

    public final void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapN = n(cls);
        Integer num = navigableMapN.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapN.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapN.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void g() {
        h(this.f142659f);
    }

    public final void h(int i10) {
        while (this.f142660g > i10) {
            Object objF = this.f142655b.f();
            pc.m.e(objF);
            wb.a aVarI = i(objF);
            this.f142660g -= aVarI.a(objF) * aVarI.b();
            f(aVarI.a(objF), objF.getClass());
            if (Log.isLoggable(aVarI.getTag(), 2)) {
                Log.v(aVarI.getTag(), "evicted: " + aVarI.a(objF));
            }
        }
    }

    public final <T> wb.a<T> i(T t10) {
        return j(t10.getClass());
    }

    public final <T> wb.a<T> j(Class<T> cls) {
        wb.a<T> gVar;
        wb.a<T> aVar = (wb.a) this.f142658e.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            gVar = new i();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            gVar = new g();
        }
        this.f142658e.put(cls, gVar);
        return gVar;
    }

    @Nullable
    public final <T> T k(a aVar) {
        return (T) this.f142655b.a(aVar);
    }

    public int l() {
        int iIntValue = 0;
        for (Class<?> cls : this.f142657d.keySet()) {
            for (Integer num : this.f142657d.get(cls).keySet()) {
                iIntValue += num.intValue() * this.f142657d.get(cls).get(num).intValue() * j(cls).b();
            }
        }
        return iIntValue;
    }

    public final <T> T m(a aVar, Class<T> cls) {
        wb.a<T> aVarJ = j(cls);
        T t10 = (T) k(aVar);
        if (t10 != null) {
            this.f142660g -= aVarJ.a(t10) * aVarJ.b();
            f(aVarJ.a(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarJ.getTag(), 2)) {
            Log.v(aVarJ.getTag(), "Allocated " + aVar.f142662b + " bytes");
        }
        return aVarJ.newArray(aVar.f142662b);
    }

    public final NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f142657d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f142657d.put(cls, treeMap);
        return treeMap;
    }

    public final boolean o() {
        int i10 = this.f142660g;
        return i10 == 0 || this.f142659f / i10 >= 2;
    }

    public final boolean p(int i10) {
        return i10 <= this.f142659f / 2;
    }

    @Override // wb.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        wb.a<T> aVarJ = j(cls);
        int iA = aVarJ.a(t10);
        int iB = aVarJ.b() * iA;
        if (p(iB)) {
            a aVarE = this.f142656c.e(iA, cls);
            this.f142655b.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapN = n(cls);
            Integer num = navigableMapN.get(Integer.valueOf(aVarE.f142662b));
            Integer numValueOf = Integer.valueOf(aVarE.f142662b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapN.put(numValueOf, Integer.valueOf(iIntValue));
            this.f142660g += iB;
            g();
        }
    }

    public final boolean q(int i10, Integer num) {
        if (num != null) {
            return o() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    public j(int i10) {
        this.f142655b = new h<>();
        this.f142656c = new b();
        this.f142657d = new HashMap();
        this.f142658e = new HashMap();
        this.f142659f = i10;
    }
}
