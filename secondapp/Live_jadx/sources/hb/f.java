package hb;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f<T> extends j<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f88103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f88104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f88105f;

    public f(T t10, T t11) {
        this(t10, t11, new LinearInterpolator());
    }

    @Override // hb.j
    public T a(b<T> bVar) {
        return e(this.f88103d, this.f88104e, this.f88105f.getInterpolation(bVar.e()));
    }

    public abstract T e(T t10, T t11, float f10);

    public f(T t10, T t11, Interpolator interpolator) {
        this.f88103d = t10;
        this.f88104e = t11;
        this.f88105f = interpolator;
    }
}
