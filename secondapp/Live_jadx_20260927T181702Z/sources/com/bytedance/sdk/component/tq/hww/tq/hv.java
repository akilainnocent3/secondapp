package com.bytedance.sdk.component.tq.hww.tq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
final class hv {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    hv f35054hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    boolean f35055hv;
    final byte[] hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    int f35056sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    int f35057tq;
    hv vgm;
    boolean vy;

    public hv() {
        this.hww = new byte[8192];
        this.f35055hv = true;
        this.vy = false;
    }

    public final hv hww() {
        this.vy = true;
        return new hv(this.hww, this.f35057tq, this.f35056sd, true, false);
    }

    public final hv tq() {
        hv hvVar = this.f35054hu;
        hv hvVar2 = hvVar != this ? hvVar : null;
        hv hvVar3 = this.vgm;
        if (hvVar3 != null) {
            hvVar3.f35054hu = hvVar;
        }
        hv hvVar4 = this.f35054hu;
        if (hvVar4 != null) {
            hvVar4.vgm = hvVar3;
        }
        this.f35054hu = null;
        this.vgm = null;
        return hvVar2;
    }

    public final hv hww(hv hvVar) {
        hvVar.vgm = this;
        hvVar.f35054hu = this.f35054hu;
        this.f35054hu.vgm = hvVar;
        this.f35054hu = hvVar;
        return hvVar;
    }

    public hv(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.hww = bArr;
        this.f35057tq = i10;
        this.f35056sd = i11;
        this.vy = z10;
        this.f35055hv = z11;
    }
}
