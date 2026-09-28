package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class saz extends raz {
    @Override // defpackage.taz, oaz.a
    public final void a(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) h()).setStreamUseCase(j);
    }

    @Override // defpackage.raz, defpackage.qaz, defpackage.paz, oaz.a
    public final void c(long j) {
        ((OutputConfiguration) h()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.taz, oaz.a
    public final void g(int i) {
        ((OutputConfiguration) h()).setMirrorMode(i);
    }

    @Override // defpackage.raz, defpackage.qaz, defpackage.paz, oaz.a
    public final Object h() {
        Object obj = this.a;
        km20.b(obj instanceof OutputConfiguration);
        return obj;
    }
}
