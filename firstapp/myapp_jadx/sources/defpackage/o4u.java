package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class o4u implements px0 {
    public final m8l<a, Object> a = new m8l<>();
    public final b b = new b(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public static final class a implements s120 {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.s120
        public final void a() {
            this.a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    public static final class b extends t12 {
        public final s120 h() {
            return new a(this);
        }
    }

    public o4u(int i) {
        this.e = i;
    }

    @Override // defpackage.px0
    public final synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.px0
    public final synchronized void b() {
        f(0);
    }

    @Override // defpackage.px0
    public final synchronized Object c(Class cls, int i) {
        a aVar;
        int i2;
        try {
            Integer numCeilingKey = i(cls).ceilingKey(Integer.valueOf(i));
            boolean z = numCeilingKey != null && ((i2 = this.f) == 0 || this.e / i2 >= 2 || numCeilingKey.intValue() <= i * 8);
            b bVar = this.b;
            if (z) {
                int iIntValue = numCeilingKey.intValue();
                s120 s120VarH = (s120) ((ArrayDeque) bVar.b).poll();
                if (s120VarH == null) {
                    s120VarH = bVar.h();
                }
                aVar = (a) s120VarH;
                aVar.b = iIntValue;
                aVar.c = cls;
            } else {
                s120 s120VarH2 = (s120) ((ArrayDeque) bVar.b).poll();
                if (s120VarH2 == null) {
                    s120VarH2 = bVar.h();
                }
                aVar = (a) s120VarH2;
                aVar.b = i;
                aVar.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return h(aVar, cls);
    }

    @Override // defpackage.px0
    public final synchronized Object d() {
        a aVar;
        b bVar = this.b;
        s120 s120VarH = (s120) ((ArrayDeque) bVar.b).poll();
        if (s120VarH == null) {
            s120VarH = bVar.h();
        }
        aVar = (a) s120VarH;
        aVar.b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(Class cls, int i) {
        NavigableMap<Integer, Integer> navigableMapI = i(cls);
        Integer num = navigableMapI.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapI.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapI.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object objC = this.a.c();
            gm20.b(objC);
            nw0 nw0VarG = g(objC.getClass());
            this.f -= nw0VarG.a() * nw0VarG.b(objC);
            e(objC.getClass(), nw0VarG.b(objC));
            if (Log.isLoggable(nw0VarG.getTag(), 2)) {
                Log.v(nw0VarG.getTag(), "evicted: " + nw0VarG.b(objC));
            }
        }
    }

    public final <T> nw0<T> g(Class<T> cls) {
        nw0<T> rk5Var;
        HashMap map = this.d;
        nw0<T> nw0Var = (nw0) map.get(cls);
        if (nw0Var != null) {
            return nw0Var;
        }
        if (cls.equals(int[].class)) {
            rk5Var = new nxo();
        } else {
            if (!cls.equals(byte[].class)) {
                hb5.a("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            rk5Var = new rk5();
        }
        map.put(cls, rk5Var);
        return rk5Var;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        nw0<T> nw0VarG = g(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= nw0VarG.a() * nw0VarG.b(t);
            e(cls, nw0VarG.b(t));
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(nw0VarG.getTag(), 2)) {
            Log.v(nw0VarG.getTag(), "Allocated " + aVar.b + " bytes");
        }
        return nw0VarG.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap map = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // defpackage.px0
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        nw0<T> nw0VarG = g(cls);
        int iB = nw0VarG.b(t);
        int iA = nw0VarG.a() * iB;
        if (iA <= this.e / 2) {
            b bVar = this.b;
            s120 s120VarH = (s120) ((ArrayDeque) bVar.b).poll();
            if (s120VarH == null) {
                s120VarH = bVar.h();
            }
            a aVar = (a) s120VarH;
            aVar.b = iB;
            aVar.c = cls;
            this.a.b(aVar, t);
            NavigableMap<Integer, Integer> navigableMapI = i(cls);
            Integer num = navigableMapI.get(Integer.valueOf(aVar.b));
            Integer numValueOf = Integer.valueOf(aVar.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iA;
            f(this.e);
        }
    }
}
