package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import defpackage.cbj;
import defpackage.cie0;
import defpackage.km20;
import defpackage.nv5;
import defpackage.o0b;
import defpackage.obj;
import defpackage.pgt;

/* JADX INFO: loaded from: classes.dex */
public final class e implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ f a;

    public class a implements cbj<cie0.c> {
        public final /* synthetic */ SurfaceTexture a;

        public a(SurfaceTexture surfaceTexture) {
            this.a = surfaceTexture;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        @Override // defpackage.cbj
        public final void onSuccess(cie0.c cVar) {
            km20.g("Unexpected result from SurfaceRequest. Surface was provided twice.", cVar.a() != 3);
            pgt.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.a.release();
            f fVar = e.this.a;
            if (fVar.j != null) {
                fVar.j = null;
            }
        }
    }

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        pgt.a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
        f fVar = this.a;
        fVar.f = surfaceTexture;
        if (fVar.g == null) {
            fVar.i();
            return;
        }
        fVar.h.getClass();
        pgt.a("TextureViewImpl", "Surface invalidated " + fVar.h);
        fVar.h.k.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f fVar = this.a;
        fVar.f = null;
        nv5.d dVar = fVar.g;
        if (dVar == null) {
            pgt.a("TextureViewImpl", DZsoPoBl.yBcDgqZEMpdku);
            return true;
        }
        a aVar = new a(surfaceTexture);
        dVar.k(new obj.b(dVar, aVar), o0b.c(fVar.e.getContext()));
        fVar.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        pgt.a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        nv5.a<Void> andSet = this.a.k.getAndSet(null);
        if (andSet != null) {
            andSet.b(null);
        }
    }
}
