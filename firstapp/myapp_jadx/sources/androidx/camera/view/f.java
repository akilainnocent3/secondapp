package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.f;
import defpackage.cie0;
import defpackage.ew5;
import defpackage.nv5;
import defpackage.o0b;
import defpackage.qis;
import defpackage.vq20;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    public TextureView e;
    public SurfaceTexture f;
    public nv5.d g;
    public cie0 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference<nv5.a<Void>> k;
    public vq20 l;
    public Executor m;

    @Override // androidx.camera.view.c
    public final View a() {
        return this.e;
    }

    @Override // androidx.camera.view.c
    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // androidx.camera.view.c
    public final void c() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // androidx.camera.view.c
    public final void d() {
        this.i = true;
    }

    @Override // androidx.camera.view.c
    public final void e(final cie0 cie0Var, vq20 vq20Var) {
        vq20 vq20Var2;
        Size size = cie0Var.b;
        this.a = size;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.e.setSurfaceTextureListener(new e(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        cie0 cie0Var2 = this.h;
        if (cie0Var2 != null && cie0Var2.c() && (vq20Var2 = this.l) != null) {
            vq20Var2.a();
            this.l = null;
        }
        this.h = cie0Var;
        this.l = vq20Var;
        cie0Var.j.a(new Runnable() { // from class: tnf0
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.a;
                cie0 cie0Var3 = fVar.h;
                if (cie0Var3 != null && cie0Var3 == cie0Var) {
                    fVar.h = null;
                    fVar.g = null;
                }
                vq20 vq20Var3 = fVar.l;
                if (vq20Var3 != null) {
                    vq20Var3.a();
                    fVar.l = null;
                }
            }
        }, o0b.c(this.e.getContext()));
        i();
    }

    @Override // androidx.camera.view.c
    public final void g(Executor executor) {
        this.m = executor;
    }

    @Override // androidx.camera.view.c
    public final qis<Void> h() {
        nv5.a<Void> aVar = new nv5.a<>();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            this.k.set(aVar);
            aVar.a = "textureViewImpl_waitForNextFrame";
            return dVar;
        } catch (Exception e) {
            dVar.a(e);
            return dVar;
        }
    }

    public final void i() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        final Surface surface = new Surface(this.f);
        final cie0 cie0Var = this.h;
        final nv5.d dVarA = nv5.a(new nv5.c() { // from class: unf0
            @Override // nv5.c
            public final Object a(final nv5.a aVar) {
                pgt.a("TextureViewImpl", "Surface set on Preview.");
                f fVar = this.a;
                cie0 cie0Var2 = fVar.h;
                nqe nqeVarA = nqe.a();
                qya<cie0.c> qyaVar = new qya() { // from class: wnf0
                    @Override // defpackage.qya
                    public final void accept(Object obj) {
                        aVar.b((cie0.c) obj);
                    }
                };
                Surface surface2 = surface;
                cie0Var2.a(surface2, nqeVarA, qyaVar);
                return "provideSurface[request=" + fVar.h + " surface=" + surface2 + "]";
            }
        });
        this.g = dVarA;
        dVarA.b.k(new Runnable() { // from class: vnf0
            @Override // java.lang.Runnable
            public final void run() {
                pgt.a("TextureViewImpl", "Safe to release surface.");
                f fVar = this.a;
                vq20 vq20Var = fVar.l;
                if (vq20Var != null) {
                    vq20Var.a();
                    fVar.l = null;
                }
                surface.release();
                if (fVar.g == dVarA) {
                    fVar.g = null;
                }
                if (fVar.h == cie0Var) {
                    fVar.h = null;
                }
            }
        }, o0b.c(this.e.getContext()));
        this.d = true;
        f();
    }
}
