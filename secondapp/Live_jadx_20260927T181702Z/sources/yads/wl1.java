package yads;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f157429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f157430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s51 f157431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f157432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f157433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f157434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p51 f157435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f157436h;

    public wl1(vl1 vl1Var) {
        ni.b((vl1Var.f157009f && vl1Var.f157005b == null) ? false : true);
        this.f157429a = (UUID) ni.a(vl1Var.f157004a);
        this.f157430b = vl1Var.f157005b;
        this.f157431c = vl1Var.f157006c;
        this.f157432d = vl1Var.f157007d;
        this.f157434f = vl1Var.f157009f;
        this.f157433e = vl1Var.f157008e;
        this.f157435g = vl1Var.f157010g;
        byte[] bArr = vl1Var.f157011h;
        this.f157436h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.f157436h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.f157429a.equals(wl1Var.f157429a) && ib3.a(this.f157430b, wl1Var.f157430b) && ib3.a(this.f157431c, wl1Var.f157431c) && this.f157432d == wl1Var.f157432d && this.f157434f == wl1Var.f157434f && this.f157433e == wl1Var.f157433e && this.f157435g.equals(wl1Var.f157435g) && Arrays.equals(this.f157436h, wl1Var.f157436h);
    }

    public final int hashCode() {
        int iHashCode = this.f157429a.hashCode() * 31;
        Uri uri = this.f157430b;
        return Arrays.hashCode(this.f157436h) + ((this.f157435g.hashCode() + ((((((((ly2.a(this.f157431c.entrySet()) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f157432d ? 1 : 0)) * 31) + (this.f157434f ? 1 : 0)) * 31) + (this.f157433e ? 1 : 0)) * 31)) * 31);
    }
}
