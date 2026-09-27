package ni;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f116723a;

    public g() {
        this.f116723a = -1.0f;
    }

    @Override // ni.f
    public void b(@NonNull r rVar, float f10, float f11, float f12) {
        rVar.r(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        rVar.n((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }

    @Deprecated
    public g(float f10) {
        this.f116723a = f10;
    }
}
