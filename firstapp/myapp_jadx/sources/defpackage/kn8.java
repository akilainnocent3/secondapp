package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class kn8<T> {
    public final String a;
    public final Set<bb30<? super T>> b;
    public final Set<rmd> c;
    public final int d;
    public final int e;
    public final do8<T> f;
    public final Set<Class<?>> g;

    public kn8(String str, Set<bb30<? super T>> set, Set<rmd> set2, int i, int i2, do8<T> do8Var, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = do8Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(bb30<T> bb30Var) {
        return new a<>(bb30Var, new bb30[0]);
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> kn8<T> c(final T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(bb30.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            tmy.a(cls2, "Null interface");
            hashSet.add(bb30.a(cls2));
        }
        return new kn8<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new do8() { // from class: jn8
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) {
                return t;
            }
        }, hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public static class a<T> {
        public String a = null;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public do8<T> f;
        public final HashSet g;

        @SafeVarargs
        public a(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(bb30.a(cls));
            for (Class<? super T> cls2 : clsArr) {
                tmy.a(cls2, "Null interface");
                this.b.add(bb30.a(cls2));
            }
        }

        public final void a(rmd rmdVar) {
            if (this.b.contains(rmdVar.a)) {
                hb5.a("Components are not allowed to depend on interfaces they themselves provide.");
            } else {
                this.c.add(rmdVar);
            }
        }

        public final kn8<T> b() {
            if (this.f != null) {
                return new kn8<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
            }
            ib5.a("Missing required property: factory.");
            return null;
        }

        public final void c(int i) {
            if (this.d == 0) {
                this.d = i;
            } else {
                ib5.a("Instantiation type has already been set.");
            }
        }

        @SafeVarargs
        public a(bb30<T> bb30Var, bb30<? super T>... bb30VarArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(bb30Var);
            for (bb30<? super T> bb30Var2 : bb30VarArr) {
                tmy.a(bb30Var2, "Null interface");
            }
            Collections.addAll(this.b, bb30VarArr);
        }
    }
}
