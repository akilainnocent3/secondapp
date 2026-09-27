package mc;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class n<Z> extends b<Z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f107224d;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // mc.p
    public final void d(@NonNull o oVar) {
        if (pc.o.x(this.f107223c, this.f107224d)) {
            oVar.d(this.f107223c, this.f107224d);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f107223c + " and height: " + this.f107224d + ", either provide dimensions in the constructor or call override()");
    }

    public n(int i10, int i11) {
        this.f107223c = i10;
        this.f107224d = i11;
    }

    @Override // mc.p
    public void h(@NonNull o oVar) {
    }
}
