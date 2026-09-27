package com.bykv.vk.openvk.hww.hww.tq.sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hww implements sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private sd.vgm f31617hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private sd.hu f31618hv;
    protected boolean hww = false;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private sd.vy f31619ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private sd.tq f31620sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private sd.hv f31621tq;
    private sd.InterfaceC0292sd vgm;
    private sd.hww vy;

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.hv hvVar) {
        this.f31621tq = hvVar;
    }

    public final void sd() {
        try {
            sd.tq tqVar = this.f31620sd;
            if (tqVar != null) {
                tqVar.hww(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void tq() {
        try {
            sd.hv hvVar = this.f31621tq;
            if (hvVar != null) {
                hvVar.tq(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void vy() {
        try {
            sd.hu huVar = this.f31618hv;
            if (huVar != null) {
                huVar.sd(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.tq tqVar) {
        this.f31620sd = tqVar;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.hww hwwVar) {
        this.vy = hwwVar;
    }

    public final boolean tq(int i10, int i11) {
        try {
            sd.vy vyVar = this.f31619ok;
            return vyVar != null && vyVar.tq(this, i10, i11);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.hu huVar) {
        this.f31618hv = huVar;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.InterfaceC0292sd interfaceC0292sd) {
        this.vgm = interfaceC0292sd;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.vy vyVar) {
        this.f31619ok = vyVar;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public final void hww(sd.vgm vgmVar) {
        this.f31617hu = vgmVar;
    }

    public void hww() {
        this.f31621tq = null;
        this.vy = null;
        this.f31620sd = null;
        this.f31618hv = null;
        this.f31617hu = null;
        this.vgm = null;
        this.f31619ok = null;
    }

    public final void hww(int i10) {
        try {
            sd.hww hwwVar = this.vy;
            if (hwwVar != null) {
                hwwVar.hww(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void hww(int i10, int i11, int i12, int i13) {
        try {
            sd.vgm vgmVar = this.f31617hu;
            if (vgmVar != null) {
                vgmVar.hww(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean hww(int i10, int i11) {
        try {
            sd.InterfaceC0292sd interfaceC0292sd = this.vgm;
            return interfaceC0292sd != null && interfaceC0292sd.hww(this, i10, i11);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.sd.sd
    public void hww(boolean z10) {
        this.hww = z10;
    }
}
