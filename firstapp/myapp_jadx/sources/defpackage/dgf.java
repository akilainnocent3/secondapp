package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dgf implements ohe0, SurfaceTexture.OnFrameAvailableListener {
    public final uff a;
    public final HandlerThread b;
    public final adl c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean i;
    public final LinkedHashMap v;
    public SurfaceTexture w;
    public SurfaceTexture y;

    public dgf(dhf dhfVar, ona onaVar, ona onaVar2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.i = new AtomicBoolean(false);
        this.v = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new adl(handler);
        this.a = new uff(onaVar, onaVar2);
        try {
            e(dhfVar);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    @Override // defpackage.ohe0
    public final void a(final lhe0 lhe0Var) throws IOException {
        if (this.i.get()) {
            lhe0Var.close();
        } else {
            d(new Runnable() { // from class: yff
                @Override // java.lang.Runnable
                public final void run() {
                    final dgf dgfVar = this.a;
                    adl adlVar = dgfVar.c;
                    final lhe0 lhe0Var2 = lhe0Var;
                    Surface surfaceJ0 = lhe0Var2.j0(adlVar, new qya() { // from class: agf
                        @Override // defpackage.qya
                        public final void accept(Object obj) throws IOException {
                            lhe0 lhe0Var3 = lhe0Var2;
                            lhe0Var3.close();
                            dgf dgfVar2 = dgfVar;
                            Surface surface = (Surface) dgfVar2.v.remove(lhe0Var3);
                            if (surface != null) {
                                uff uffVar = dgfVar2.a;
                                hej.d(uffVar.a, true);
                                hej.c(uffVar.c);
                                uffVar.i(surface, true);
                            }
                        }
                    });
                    dgfVar.a.g(surfaceJ0);
                    dgfVar.v.put(lhe0Var2, surfaceJ0);
                }
            }, new ahd(lhe0Var));
        }
    }

    @Override // defpackage.ohe0
    public final void b(final cie0 cie0Var) {
        if (this.i.get()) {
            cie0Var.c();
        } else {
            d(new Runnable() { // from class: xff
                @Override // java.lang.Runnable
                public final void run() {
                    final dgf dgfVar = this.a;
                    dgfVar.e++;
                    uff uffVar = dgfVar.a;
                    cie0 cie0Var2 = cie0Var;
                    boolean z = cie0Var2.e;
                    Size size = cie0Var2.b;
                    hej.d(uffVar.a, true);
                    hej.c(uffVar.c);
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(z ? uffVar.n : uffVar.o);
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    cie0Var2.a(surface, dgfVar.c, new qya() { // from class: cgf
                        @Override // defpackage.qya
                        public final void accept(Object obj) throws IOException {
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface.release();
                            dgf dgfVar2 = dgfVar;
                            dgfVar2.e--;
                            dgfVar2.c();
                        }
                    });
                    if (z) {
                        dgfVar.w = surfaceTexture;
                    } else {
                        dgfVar.y = surfaceTexture;
                        surfaceTexture.setOnFrameAvailableListener(dgfVar, dgfVar.d);
                    }
                }
            }, new chd(cie0Var));
        }
    }

    public final void c() throws IOException {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.v;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((lhe0) it.next()).close();
            }
            linkedHashMap.clear();
            uff uffVar = this.a;
            if (uffVar.a.getAndSet(false)) {
                hej.c(uffVar.c);
                uffVar.h();
            }
            uffVar.n = -1;
            uffVar.o = -1;
            this.b.quit();
        }
    }

    public final void d(final Runnable runnable, final Runnable runnable2) {
        try {
            this.c.execute(new Runnable() { // from class: bgf
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.a.f) {
                        runnable2.run();
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            pgt.j("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void e(final dhf dhfVar) {
        Map map = Collections.EMPTY_MAP;
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            d(new Runnable(this) { // from class: zff
                public final /* synthetic */ dgf a;
                public final /* synthetic */ Map c;

                {
                    Map map2 = Collections.EMPTY_MAP;
                    this.a = this;
                    this.c = map2;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    dgf dgfVar = this.a;
                    dhf dhfVar2 = dhfVar;
                    Map map2 = Collections.EMPTY_MAP;
                    nv5.a aVar2 = aVar;
                    try {
                        dgfVar.a.e(dhfVar2);
                        aVar2.b(null);
                    } catch (RuntimeException e) {
                        aVar2.d(e);
                    }
                }
            }, new iw5());
            aVar.a = "Init GlRenderer";
        } catch (Exception e) {
            dVar.a(e);
        }
        try {
            dVar.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            rzk.b("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.i.get() || (surfaceTexture2 = this.w) == null || this.y == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.y.updateTexImage();
        for (Map.Entry entry : this.v.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            lhe0 lhe0Var = (lhe0) entry.getKey();
            if (lhe0Var.getFormat() == 34) {
                try {
                    this.a.l(surfaceTexture.getTimestamp(), surface, lhe0Var, this.w, this.y);
                } catch (RuntimeException e) {
                    pgt.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // defpackage.ohe0
    public final void release() {
        if (this.i.getAndSet(true)) {
            return;
        }
        d(new Runnable() { // from class: wff
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                dgf dgfVar = this.a;
                dgfVar.f = true;
                dgfVar.c();
            }
        }, new iw5());
    }
}
