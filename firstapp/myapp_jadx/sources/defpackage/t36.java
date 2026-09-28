package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t36 implements aq20.c {
    @Override // aq20.c
    public final void a(cie0 cie0Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(cie0Var.b.getWidth(), cie0Var.b.getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        cie0Var.a(surface, nqe.a(), new qya() { // from class: u36
            @Override // defpackage.qya
            public final void accept(Object obj) {
                surface.release();
                surfaceTexture.release();
            }
        });
    }
}
