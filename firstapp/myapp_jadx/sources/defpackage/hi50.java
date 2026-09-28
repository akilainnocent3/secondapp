package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hi50 implements ao8 {
    public final Set<bb30<?>> a;
    public final Set<bb30<?>> b;
    public final Set<bb30<?>> c;
    public final Set<bb30<?>> d;
    public final Set<bb30<?>> e;
    public final Set<Class<?>> f;
    public final ao8 g;

    public static class a implements n830 {
        public final Set<Class<?>> a;
        public final n830 b;

        public a(Set<Class<?>> set, n830 n830Var) {
            this.a = set;
            this.b = n830Var;
        }
    }

    public hi50(kn8<?> kn8Var, ao8 ao8Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<rmd> set = kn8Var.c;
        Set<Class<?>> set2 = kn8Var.g;
        for (rmd rmdVar : set) {
            int i = rmdVar.c;
            int i2 = rmdVar.b;
            boolean z = i == 0;
            bb30<?> bb30Var = rmdVar.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(bb30Var);
                } else {
                    hashSet.add(bb30Var);
                }
            } else if (i == 2) {
                hashSet3.add(bb30Var);
            } else if (i2 == 2) {
                hashSet5.add(bb30Var);
            } else {
                hashSet2.add(bb30Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(bb30.a(n830.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = set2;
        this.g = ao8Var;
    }

    @Override // defpackage.ao8
    public final <T> T a(Class<T> cls) {
        if (this.a.contains(bb30.a(cls))) {
            T t = (T) this.g.a(cls);
            return !cls.equals(n830.class) ? t : (T) new a(this.f, (n830) t);
        }
        gi50.a(cls, "Attempting to request an undeclared dependency ", ".");
        return null;
    }

    @Override // defpackage.ao8
    public final <T> n730<Set<T>> b(bb30<T> bb30Var) {
        if (this.e.contains(bb30Var)) {
            return this.g.b(bb30Var);
        }
        gi50.a(bb30Var, "Attempting to request an undeclared dependency Provider<Set<", ">>.");
        return null;
    }

    @Override // defpackage.ao8
    public final <T> n730<T> c(bb30<T> bb30Var) {
        if (this.b.contains(bb30Var)) {
            return this.g.c(bb30Var);
        }
        gi50.a(bb30Var, "Attempting to request an undeclared dependency Provider<", ">.");
        return null;
    }

    @Override // defpackage.ao8
    public final <T> T d(bb30<T> bb30Var) {
        if (this.a.contains(bb30Var)) {
            return (T) this.g.d(bb30Var);
        }
        gi50.a(bb30Var, "Attempting to request an undeclared dependency ", ".");
        return null;
    }

    @Override // defpackage.ao8
    public final <T> Set<T> e(bb30<T> bb30Var) {
        if (this.d.contains(bb30Var)) {
            return this.g.e(bb30Var);
        }
        gi50.a(bb30Var, "Attempting to request an undeclared dependency Set<", ">.");
        return null;
    }

    @Override // defpackage.ao8
    public final <T> n730<T> f(Class<T> cls) {
        return c(bb30.a(cls));
    }

    @Override // defpackage.ao8
    public final <T> njd<T> g(bb30<T> bb30Var) {
        if (this.c.contains(bb30Var)) {
            return this.g.g(bb30Var);
        }
        gi50.a(bb30Var, "Attempting to request an undeclared dependency Deferred<", ">.");
        return null;
    }

    public final <T> njd<T> h(Class<T> cls) {
        return g(bb30.a(cls));
    }
}
