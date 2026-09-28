package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class v7h {
    public static final a a = new a();

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements b220<T> {
        public final b<T> a;
        public final e<T> b;
        public final e220 c;

        public c(e220 e220Var, b bVar, e eVar) {
            this.c = e220Var;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // defpackage.b220
        public final boolean a(T t) {
            if (t instanceof d) {
                ((d) t).b().a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // defpackage.b220
        public final T b() {
            T tA = (T) this.c.b();
            if (tA == null) {
                tA = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tA.getClass());
                }
            }
            if (tA instanceof d) {
                tA.b().a = false;
            }
            return (T) tA;
        }
    }

    public interface d {
        vxd0.a b();
    }

    public interface e<T> {
        void a(T t);
    }

    public static c a(int i, b bVar) {
        return new c(new e220(i), bVar, a);
    }

    public class a implements e<Object> {
        @Override // v7h.e
        public final void a(Object obj) {
        }
    }
}
