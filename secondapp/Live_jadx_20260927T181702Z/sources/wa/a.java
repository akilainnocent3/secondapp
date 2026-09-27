package wa;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<K> f142555c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public hb.j<A> f142557e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f142553a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f142554b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f142556d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public A f142558f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f142559g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f142560h = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void e();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // wa.a.d
        public hb.a<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // wa.a.d
        public float b() {
            return 0.0f;
        }

        @Override // wa.a.d
        public boolean c(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // wa.a.d
        public boolean d(float f10) {
            return false;
        }

        @Override // wa.a.d
        public float e() {
            return 1.0f;
        }

        @Override // wa.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d<T> {
        hb.a<T> a();

        @w(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f10);

        boolean d(float f10);

        @w(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends hb.a<T>> f142561a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public hb.a<T> f142563c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f142564d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public hb.a<T> f142562b = f(0.0f);

        public e(List<? extends hb.a<T>> list) {
            this.f142561a = list;
        }

        @Override // wa.a.d
        @NonNull
        public hb.a<T> a() {
            return this.f142562b;
        }

        @Override // wa.a.d
        public float b() {
            return this.f142561a.get(0).f();
        }

        @Override // wa.a.d
        public boolean c(float f10) {
            hb.a<T> aVar = this.f142563c;
            hb.a<T> aVar2 = this.f142562b;
            if (aVar == aVar2 && this.f142564d == f10) {
                return true;
            }
            this.f142563c = aVar2;
            this.f142564d = f10;
            return false;
        }

        @Override // wa.a.d
        public boolean d(float f10) {
            if (this.f142562b.a(f10)) {
                return !this.f142562b.i();
            }
            this.f142562b = f(f10);
            return true;
        }

        @Override // wa.a.d
        public float e() {
            List<? extends hb.a<T>> list = this.f142561a;
            return list.get(list.size() - 1).c();
        }

        public final hb.a<T> f(float f10) {
            List<? extends hb.a<T>> list = this.f142561a;
            hb.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f142561a.size() - 2; size >= 1; size--) {
                hb.a<T> aVar2 = this.f142561a.get(size);
                if (this.f142562b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f142561a.get(0);
        }

        @Override // wa.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final hb.a<T> f142565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f142566b = -1.0f;

        public f(List<? extends hb.a<T>> list) {
            this.f142565a = list.get(0);
        }

        @Override // wa.a.d
        public hb.a<T> a() {
            return this.f142565a;
        }

        @Override // wa.a.d
        public float b() {
            return this.f142565a.f();
        }

        @Override // wa.a.d
        public boolean c(float f10) {
            if (this.f142566b == f10) {
                return true;
            }
            this.f142566b = f10;
            return false;
        }

        @Override // wa.a.d
        public boolean d(float f10) {
            return !this.f142565a.i();
        }

        @Override // wa.a.d
        public float e() {
            return this.f142565a.c();
        }

        @Override // wa.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends hb.a<K>> list) {
        this.f142555c = q(list);
    }

    public static <T> d<T> q(List<? extends hb.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f142553a.add(bVar);
    }

    public hb.a<K> b() {
        if (com.airbnb.lottie.f.h()) {
            com.airbnb.lottie.f.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        hb.a<K> aVarA = this.f142555c.a();
        if (com.airbnb.lottie.f.h()) {
            com.airbnb.lottie.f.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarA;
    }

    @w(from = 0.0d, to = 1.0d)
    @SuppressLint({"Range"})
    public float c() {
        if (this.f142560h == -1.0f) {
            this.f142560h = this.f142555c.e();
        }
        return this.f142560h;
    }

    public float d() {
        Interpolator interpolator;
        hb.a<K> aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f88082d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public float e() {
        if (this.f142554b) {
            return 0.0f;
        }
        hb.a<K> aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f142556d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f142556d;
    }

    @w(from = 0.0d, to = 1.0d)
    @SuppressLint({"Range"})
    public final float g() {
        if (this.f142559g == -1.0f) {
            this.f142559g = this.f142555c.b();
        }
        return this.f142559g;
    }

    public A h() {
        float fE = e();
        if (this.f142557e == null && this.f142555c.c(fE) && !p()) {
            return this.f142558f;
        }
        hb.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f88083e;
        A aI = (interpolator == null || aVarB.f88084f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f88084f.getInterpolation(fE));
        this.f142558f = aI;
        return aI;
    }

    public abstract A i(hb.a<K> aVar, float f10);

    public A j(hb.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f142557e != null;
    }

    public void l() {
        if (com.airbnb.lottie.f.h()) {
            com.airbnb.lottie.f.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f142553a.size(); i10++) {
            this.f142553a.get(i10).e();
        }
        if (com.airbnb.lottie.f.h()) {
            com.airbnb.lottie.f.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f142554b = true;
    }

    public void n(@w(from = 0.0d, to = 1.0d) float f10) {
        if (com.airbnb.lottie.f.h()) {
            com.airbnb.lottie.f.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f142555c.isEmpty()) {
            if (com.airbnb.lottie.f.h()) {
                com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f142556d) {
            if (com.airbnb.lottie.f.h()) {
                com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f142556d = f10;
            if (this.f142555c.d(f10)) {
                l();
            }
            if (com.airbnb.lottie.f.h()) {
                com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(@Nullable hb.j<A> jVar) {
        hb.j<A> jVar2 = this.f142557e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f142557e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public boolean p() {
        return false;
    }
}
