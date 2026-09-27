package v0;

import n0.p;
import n0.r;
import n0.s;
import w0.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f139819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f139820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f139821c;

    public b() {
        s sVar = new s();
        this.f139819a = sVar;
        this.f139821c = sVar;
    }

    @Override // w0.q
    public float a() {
        return this.f139821c.a();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        s sVar = this.f139819a;
        this.f139821c = sVar;
        sVar.f(f10, f11, f12, f13, f14, f15);
    }

    public String c(String str, float f10) {
        return this.f139821c.c(str, f10);
    }

    public float d(float f10) {
        return this.f139821c.b(f10);
    }

    public boolean e() {
        return this.f139821c.d();
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f139820b == null) {
            this.f139820b = new p();
        }
        p pVar = this.f139820b;
        this.f139821c = pVar;
        pVar.h(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    @Override // w0.q, android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f139821c.getInterpolation(f10);
    }
}
