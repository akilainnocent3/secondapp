package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qw3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw3 f154647b;

    public qw3(vw3 vw3Var) {
        this.f154647b = vw3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        vw3 vw3Var = this.f154647b;
        int streamVolume = vw3Var.f157114c.getStreamVolume(3);
        int streamMaxVolume = vw3Var.f157114c.getStreamMaxVolume(3);
        vw3Var.f157115d.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = 0.0f;
        } else {
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
        }
        this.f154647b.f157118g.set(false);
        if (((Float) this.f154647b.f157117f.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
            this.f154647b.f157112a.post(new ow3(this, f10));
        }
    }
}
