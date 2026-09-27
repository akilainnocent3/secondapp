package ni;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f116731b;

    public j(float f10) {
        this.f116731b = f10 - 0.001f;
    }

    @Override // ni.h
    public boolean a() {
        return true;
    }

    @Override // ni.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        float fSqrt = (float) ((((double) this.f116731b) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f116731b, 2.0d) - Math.pow(fSqrt, 2.0d));
        rVar.q(f11 - fSqrt, ((float) (-((((double) this.f116731b) * Math.sqrt(2.0d)) - ((double) this.f116731b)))) + fSqrt2);
        rVar.n(f11, (float) (-((((double) this.f116731b) * Math.sqrt(2.0d)) - ((double) this.f116731b))));
        rVar.n(f11 + fSqrt, ((float) (-((((double) this.f116731b) * Math.sqrt(2.0d)) - ((double) this.f116731b)))) + fSqrt2);
    }
}
