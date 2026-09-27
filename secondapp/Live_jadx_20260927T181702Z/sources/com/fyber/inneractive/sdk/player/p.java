package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.player.controller.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.f f47319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47320b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47321c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47322d = false;

    public p(com.fyber.inneractive.sdk.measurement.f fVar) {
        this.f47319a = fVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f47320b), String.valueOf(this.f47322d));
        if (this.f47319a != null) {
            int i10 = o.f47318a[bVar.ordinal()];
            if (i10 == 1) {
                this.f47322d = true;
                return;
            }
            if (i10 == 2) {
                if (this.f47322d) {
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f47319a;
                    if (fVar.f45102c != null) {
                        IAlog.a("%s bufferStart", "OMVideo");
                        try {
                            fVar.f45102c.bufferStart();
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                    this.f47320b = true;
                    return;
                }
                return;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f47319a;
                    if (fVar2.f45102c != null) {
                        IAlog.a("%s pause", "OMVideo");
                        try {
                            fVar2.f45102c.pause();
                        } catch (Throwable th3) {
                            fVar2.a(th3);
                        }
                    }
                    this.f47321c = true;
                    return;
                }
                if (i10 != 5) {
                    return;
                }
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f47319a;
                if (fVar3.f45102c != null) {
                    IAlog.a("%s complete", "OMVideo");
                    try {
                        fVar3.f45102c.complete();
                        return;
                    } catch (Throwable th4) {
                        fVar3.a(th4);
                        return;
                    }
                }
                return;
            }
            if (this.f47320b) {
                this.f47320b = false;
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f47319a;
                if (fVar4.f45102c != null) {
                    IAlog.a("%s bufferEnd", "OMVideo");
                    try {
                        fVar4.f45102c.bufferFinish();
                        return;
                    } catch (Throwable th5) {
                        fVar4.a(th5);
                        return;
                    }
                }
                return;
            }
            if (this.f47321c) {
                com.fyber.inneractive.sdk.measurement.f fVar5 = this.f47319a;
                if (fVar5.f45102c != null) {
                    IAlog.a("%s resume", "OMVideo");
                    try {
                        fVar5.f45102c.resume();
                    } catch (Throwable th6) {
                        fVar5.a(th6);
                    }
                }
                this.f47321c = false;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }
}
