package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u12<K, A> {
    public final c<K> c;
    public cpt<A> e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public interface a {
        void a();
    }

    public static final class b<T> implements c<T> {
        @Override // u12.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // u12.c
        public final cpp<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // u12.c
        public final boolean c(float f) {
            return false;
        }

        @Override // u12.c
        public final float d() {
            return 0.0f;
        }

        @Override // u12.c
        public final float e() {
            return 1.0f;
        }

        @Override // u12.c
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface c<T> {
        boolean a(float f);

        cpp<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class d<T> implements c<T> {
        public final List<? extends cpp<T>> a;
        public cpp<T> c = null;
        public float d = -1.0f;
        public cpp<T> b = f(0.0f);

        public d(List<? extends cpp<T>> list) {
            this.a = list;
        }

        @Override // u12.c
        public final boolean a(float f) {
            cpp<T> cppVar = this.c;
            cpp<T> cppVar2 = this.b;
            if (cppVar == cppVar2 && this.d == f) {
                return true;
            }
            this.c = cppVar2;
            this.d = f;
            return false;
        }

        @Override // u12.c
        public final cpp<T> b() {
            return this.b;
        }

        @Override // u12.c
        public final boolean c(float f) {
            cpp<T> cppVar = this.b;
            if (f >= cppVar.b() && f < cppVar.a()) {
                return !this.b.c();
            }
            this.b = f(f);
            return true;
        }

        @Override // u12.c
        public final float d() {
            return this.a.get(0).b();
        }

        @Override // u12.c
        public final float e() {
            return ((cpp) uts.a(1, this.a)).a();
        }

        public final cpp<T> f(float f) {
            List<? extends cpp<T>> list = this.a;
            cpp<T> cppVar = (cpp) uts.a(1, list);
            if (f >= cppVar.b()) {
                return cppVar;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                cpp<T> cppVar2 = list.get(size);
                if (this.b != cppVar2 && f >= cppVar2.b() && f < cppVar2.a()) {
                    return cppVar2;
                }
            }
            return list.get(0);
        }

        @Override // u12.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class e<T> implements c<T> {
        public final cpp<T> a;
        public float b = -1.0f;

        public e(List<? extends cpp<T>> list) {
            this.a = list.get(0);
        }

        @Override // u12.c
        public final boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // u12.c
        public final cpp<T> b() {
            return this.a;
        }

        @Override // u12.c
        public final boolean c(float f) {
            return !this.a.c();
        }

        @Override // u12.c
        public final float d() {
            return this.a.b();
        }

        @Override // u12.c
        public final float e() {
            return this.a.a();
        }

        @Override // u12.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public u12(List<? extends cpp<K>> list) {
        c<K> eVar;
        if (list.isEmpty()) {
            eVar = new b<>();
        } else {
            eVar = list.size() == 1 ? new e<>(list) : new d<>(list);
        }
        this.c = eVar;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public float b() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fE = this.c.e();
        this.h = fE;
        return fE;
    }

    public final float c() {
        Interpolator interpolator;
        cpp<K> cppVarB = this.c.b();
        if (cppVarB == null || cppVarB.c() || (interpolator = cppVarB.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        cpp<K> cppVarB = this.c.b();
        if (cppVarB.c()) {
            return 0.0f;
        }
        return (this.d - cppVarB.b()) / (cppVarB.a() - cppVarB.b());
    }

    public A e() {
        float fD = d();
        cpt<A> cptVar = this.e;
        c<K> cVar = this.c;
        if (cptVar == null && cVar.a(fD) && !k()) {
            return this.f;
        }
        cpp<K> cppVarB = cVar.b();
        Interpolator interpolator = cppVarB.e;
        Interpolator interpolator2 = cppVarB.f;
        A aF = (interpolator == null || interpolator2 == null) ? f(cppVarB, c()) : g(cppVarB, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = aF;
        return aF;
    }

    public abstract A f(cpp<K> cppVar, float f);

    public A g(cpp<K> cppVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        c<K> cVar = this.c;
        if (cVar.isEmpty()) {
            return;
        }
        float fD = this.g;
        if (fD == -1.0f) {
            fD = cVar.d();
            this.g = fD;
        }
        float f2 = fD;
        if (f < fD) {
            if (f2 == -1.0f) {
                f = cVar.d();
                this.g = f;
            } else {
                f = f2;
            }
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (cVar.c(f)) {
            h();
        }
    }

    public final void j(cpt<A> cptVar) {
        cpt<A> cptVar2 = this.e;
        if (cptVar2 != null) {
            cptVar2.getClass();
        }
        this.e = cptVar;
    }

    public boolean k() {
        return false;
    }
}
