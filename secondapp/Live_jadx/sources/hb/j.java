package hb;

import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f88107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public wa.a<?, ?> f88108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f88109c;

    public j() {
        this.f88107a = new b<>();
        this.f88109c = null;
    }

    @Nullable
    public T a(b<T> bVar) {
        return this.f88109c;
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f88107a.h(f10, f11, t10, t11, f12, f13, f14));
    }

    @y0({y0.a.LIBRARY})
    public final void c(@Nullable wa.a<?, ?> aVar) {
        this.f88108b = aVar;
    }

    public final void d(@Nullable T t10) {
        this.f88109c = t10;
        wa.a<?, ?> aVar = this.f88108b;
        if (aVar != null) {
            aVar.l();
        }
    }

    public j(@Nullable T t10) {
        this.f88107a = new b<>();
        this.f88109c = t10;
    }
}
