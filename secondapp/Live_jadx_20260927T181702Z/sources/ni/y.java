package ni;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class y extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f116882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116883c;

    public y(float f10, boolean z10) {
        this.f116882b = f10;
        this.f116883c = z10;
    }

    @Override // ni.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        if (!this.f116883c) {
            float f13 = this.f116882b;
            rVar.o(f11 - (f13 * f12), 0.0f, f11, (-f13) * f12);
            rVar.o(f11 + (this.f116882b * f12), 0.0f, f10, 0.0f);
        } else {
            rVar.n(f11 - (this.f116882b * f12), 0.0f);
            float f14 = this.f116882b;
            rVar.o(f11, f14 * f12, (f14 * f12) + f11, 0.0f);
            rVar.n(f10, 0.0f);
        }
    }
}
