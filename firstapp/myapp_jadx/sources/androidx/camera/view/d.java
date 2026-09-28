package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.c;
import androidx.camera.view.d;
import defpackage.cie0;
import defpackage.fcn;
import defpackage.o0b;
import defpackage.pgt;
import defpackage.qis;
import defpackage.qya;
import defpackage.vq20;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public SurfaceView e;
    public final a f;

    public class a implements SurfaceHolder.Callback {
        public Size a;
        public cie0 b;
        public cie0 c;
        public vq20 d;
        public Size e;
        public boolean f = false;
        public boolean i = false;

        public a() {
        }

        public final void a() {
            vq20 vq20Var;
            if (this.b != null) {
                pgt.a("SurfaceViewImpl", "Request canceled: " + this.b);
                if (!this.b.c() || (vq20Var = this.d) == null) {
                    return;
                }
                vq20Var.a();
            }
        }

        public final boolean b() {
            d dVar = d.this;
            Surface surface = dVar.e.getHolder().getSurface();
            if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
                return false;
            }
            pgt.a("SurfaceViewImpl", "Surface set on Preview.");
            final vq20 vq20Var = this.d;
            cie0 cie0Var = this.b;
            Objects.requireNonNull(cie0Var);
            cie0Var.a(surface, o0b.c(dVar.e.getContext()), new qya() { // from class: kie0
                @Override // defpackage.qya
                public final void accept(Object obj) {
                    pgt.a("SurfaceViewImpl", "Safe to release surface.");
                    c.a aVar = vq20Var;
                    if (aVar != null) {
                        ((vq20) aVar).a();
                    }
                }
            });
            this.f = true;
            dVar.d = true;
            dVar.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            pgt.a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.e = new Size(i2, i3);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            cie0 cie0Var;
            pgt.a("SurfaceViewImpl", "Surface created.");
            if (!this.i || (cie0Var = this.c) == null) {
                return;
            }
            cie0Var.c();
            cie0Var.i.b(null);
            this.c = null;
            this.i = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            pgt.a("SurfaceViewImpl", "Surface destroyed.");
            if (!this.f) {
                a();
            } else if (this.b != null) {
                pgt.a("SurfaceViewImpl", "Surface closed " + this.b);
                this.b.k.a();
            }
            this.i = true;
            cie0 cie0Var = this.b;
            if (cie0Var != null) {
                this.c = cie0Var;
            }
            this.f = false;
            this.b = null;
            this.d = null;
            this.e = null;
            this.a = null;
        }
    }

    public d(FrameLayout frameLayout, b bVar) {
        super(frameLayout, bVar);
        this.f = new a();
    }

    @Override // androidx.camera.view.c
    public final View a() {
        return this.e;
    }

    @Override // androidx.camera.view.c
    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: jie0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    pgt.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    pgt.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                pgt.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            pgt.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.c
    public final void c() {
    }

    @Override // androidx.camera.view.c
    public final void d() {
    }

    @Override // androidx.camera.view.c
    public final void e(final cie0 cie0Var, final vq20 vq20Var) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals(this.a, cie0Var.b);
        if (surfaceView == null || !zEquals) {
            Size size = cie0Var.b;
            this.a = size;
            size.getClass();
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorC = o0b.c(this.e.getContext());
        cie0Var.j.a(new Runnable() { // from class: hie0
            @Override // java.lang.Runnable
            public final void run() {
                vq20Var.a();
            }
        }, executorC);
        this.e.post(new Runnable() { // from class: iie0
            @Override // java.lang.Runnable
            public final void run() {
                d.a aVar = this.a.f;
                aVar.a();
                boolean z = aVar.i;
                cie0 cie0Var2 = cie0Var;
                if (z) {
                    aVar.i = false;
                    cie0Var2.c();
                    cie0Var2.i.b(null);
                    return;
                }
                aVar.b = cie0Var2;
                aVar.d = vq20Var;
                Size size2 = cie0Var2.b;
                aVar.a = size2;
                aVar.f = false;
                if (aVar.b()) {
                    return;
                }
                pgt.a("SurfaceViewImpl", "Wait for new Surface creation.");
                d.this.e.getHolder().setFixedSize(size2.getWidth(), size2.getHeight());
            }
        });
    }

    @Override // androidx.camera.view.c
    public final void g(Executor executor) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.c
    public final qis<Void> h() {
        return fcn.c.b;
    }
}
