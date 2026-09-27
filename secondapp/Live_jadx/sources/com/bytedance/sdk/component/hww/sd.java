package com.bytedance.sdk.component.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd<P, R> extends com.bytedance.sdk.component.hww.tq<P, R> {
    private boolean hww = true;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private hv f34904sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f34905tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(Object obj);

        void hww(Throwable th2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
        sd hww();
    }

    private boolean hu() {
        if (this.hww) {
            return true;
        }
        ok.hww(new IllegalStateException("Jsb async call already finished: " + hww() + ", hashcode: " + hashCode()));
        return false;
    }

    public void hv() {
        vy();
    }

    @Override // com.bytedance.sdk.component.hww.tq
    public /* bridge */ /* synthetic */ String hww() {
        return super.hww();
    }

    public abstract void hww(P p10, hv hvVar) throws Exception;

    public final void sd() {
        hww((Throwable) null);
    }

    public void vy() {
        this.hww = false;
        this.f34904sd = null;
    }

    public final void hww(R r10) {
        if (hu()) {
            this.f34905tq.hww(r10);
            vy();
        }
    }

    public final void hww(Throwable th2) {
        if (hu()) {
            this.f34905tq.hww(th2);
            vy();
        }
    }

    public void hww(P p10, hv hvVar, hww hwwVar) throws Exception {
        this.f34904sd = hvVar;
        this.f34905tq = hwwVar;
        hww(p10, hvVar);
    }
}
