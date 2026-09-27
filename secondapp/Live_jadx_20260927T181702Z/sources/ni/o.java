package ni;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class o extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f116785a;

    public o() {
        this.f116785a = -1.0f;
    }

    @Override // ni.f
    public void b(@NonNull r rVar, float f10, float f11, float f12) {
        rVar.r(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        float f13 = f12 * 2.0f * f11;
        rVar.a(0.0f, 0.0f, f13, f13, 180.0f, f10);
    }

    @Deprecated
    public o(float f10) {
        this.f116785a = f10;
    }
}
