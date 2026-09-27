package j5;

import java.util.UUID;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class x0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.b f99712a;

    public x0(byte[] bArr) {
        this.f99712a = new y0.b((byte[]) zi.l0.E(bArr));
    }

    @Override // j5.y0
    public y0.b a(UUID uuid, f0.h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j5.y0
    public y0.b b(UUID uuid, f0.b bVar) {
        return this.f99712a;
    }
}
