package ni;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f116782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f116783c;

    public m(@NonNull h hVar, float f10) {
        this.f116782b = hVar;
        this.f116783c = f10;
    }

    @Override // ni.h
    public boolean a() {
        return this.f116782b.a();
    }

    @Override // ni.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        this.f116782b.b(f10, f11 - this.f116783c, f12, rVar);
    }
}
