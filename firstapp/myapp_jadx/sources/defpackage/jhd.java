package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class jhd implements ohe0, SurfaceTexture.OnFrameAvailableListener {
    public final g1z a;
    public final HandlerThread b;
    public final adl c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] i;
    public final LinkedHashMap v;
    public int w;
    public boolean y;
    public final ArrayList z;

    public static abstract class a {
        public abstract nv5.a<Void> a();

        public abstract int b();

        public abstract int c();
    }

    public jhd(dhf dhfVar) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.i = new float[16];
        this.v = new LinkedHashMap();
        this.w = 0;
        this.y = false;
        this.z = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new adl(handler);
        this.a = new g1z();
        try {
            g(dhfVar);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    @Override // defpackage.ohe0
    public final void a(final lhe0 lhe0Var) throws IOException {
        if (this.e.get()) {
            lhe0Var.close();
        } else {
            d(new Runnable() { // from class: xgd
                @Override // java.lang.Runnable
                public final void run() {
                    final jhd jhdVar = this.a;
                    adl adlVar = jhdVar.c;
                    final lhe0 lhe0Var2 = lhe0Var;
                    Surface surfaceJ0 = lhe0Var2.j0(adlVar, new qya() { // from class: ehd
                        @Override // defpackage.qya
                        public final void accept(Object obj) throws IOException {
                            lhe0 lhe0Var3 = lhe0Var2;
                            lhe0Var3.close();
                            jhd jhdVar2 = jhdVar;
                            Surface surface = (Surface) jhdVar2.v.remove(lhe0Var3);
                            if (surface != null) {
                                g1z g1zVar = jhdVar2.a;
                                hej.d(g1zVar.a, true);
                                hej.c(g1zVar.c);
                                g1zVar.i(surface, true);
                            }
                        }
                    });
                    jhdVar.a.g(surfaceJ0);
                    jhdVar.v.put(lhe0Var2, surfaceJ0);
                }
            }, new ahd(lhe0Var));
        }
    }

    @Override // defpackage.ohe0
    public final void b(final cie0 cie0Var) {
        if (this.e.get()) {
            cie0Var.c();
        } else {
            d(new Runnable() { // from class: bhd
                @Override // java.lang.Runnable
                public final void run() {
                    final jhd jhdVar = this.a;
                    jhdVar.w++;
                    g1z g1zVar = jhdVar.a;
                    hej.d(g1zVar.a, true);
                    hej.c(g1zVar.c);
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(g1zVar.m);
                    final cie0 cie0Var2 = cie0Var;
                    Size size = cie0Var2.b;
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    adl adlVar = jhdVar.c;
                    cie0Var2.b(adlVar, new cie0.e() { // from class: fhd
                        @Override // cie0.e
                        public final void a(cie0.d dVar) {
                            hej.e eVar = (cie0Var2.c.a() && dVar.e()) ? hej.e.c : hej.e.b;
                            g1z g1zVar2 = jhdVar.a;
                            hej.d(g1zVar2.a, true);
                            hej.c(g1zVar2.c);
                            if (g1zVar2.l != eVar) {
                                g1zVar2.l = eVar;
                                g1zVar2.k(g1zVar2.m);
                            }
                        }
                    });
                    cie0Var2.a(surface, adlVar, new qya() { // from class: ghd
                        @Override // defpackage.qya
                        public final void accept(Object obj) throws IOException {
                            jhd jhdVar2 = jhdVar;
                            cie0 cie0Var3 = cie0Var2;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            Surface surface2 = surface;
                            synchronized (cie0Var3.a) {
                                cie0Var3.m = null;
                                cie0Var3.n = null;
                            }
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface2.release();
                            jhdVar2.w--;
                            jhdVar2.c();
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(jhdVar, jhdVar.d);
                }
            }, new chd(cie0Var));
        }
    }

    public final void c() throws IOException {
        if (this.y && this.w == 0) {
            LinkedHashMap linkedHashMap = this.v;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((lhe0) it.next()).close();
            }
            ArrayList arrayList = this.z;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((a) obj).a().d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            g1z g1zVar = this.a;
            if (g1zVar.a.getAndSet(false)) {
                hej.c(g1zVar.c);
                g1zVar.h();
            }
            this.b.quit();
        }
    }

    public final void d(final Runnable runnable, final Runnable runnable2) {
        try {
            this.c.execute(new Runnable() { // from class: ihd
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.a.y) {
                        runnable2.run();
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            pgt.j("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void e(Exception exc) {
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).a().d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap f(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        uzg.b(i, fArr2);
        uzg.c(fArr2);
        Size sizeH = lsg0.h(size, i);
        g1z g1zVar = this.a;
        g1zVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeH.getHeight() * sizeH.getWidth() * 4);
        km20.a("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeH.getHeight() * sizeH.getWidth()) * 4);
        km20.a("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = hej.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        hej.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        hej.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        hej.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeH.getWidth(), sizeH.getHeight(), 0, 6407, 5121, null);
        hej.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        hej.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        hej.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        hej.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        hej.b("glActiveTexture");
        GLES20.glBindTexture(36197, g1zVar.m);
        hej.b("glBindTexture");
        g1zVar.i = null;
        GLES20.glViewport(0, 0, sizeH.getWidth(), sizeH.getHeight());
        GLES20.glScissor(0, 0, sizeH.getWidth(), sizeH.getHeight());
        hej.f fVar = g1zVar.k;
        fVar.getClass();
        if (fVar instanceof hej.g) {
            GLES20.glUniformMatrix4fv(((hej.g) fVar).f, 1, false, fArr2, 0);
            hej.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        hej.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeH.getWidth(), sizeH.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        hej.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        hej.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        hej.b("glDeleteFramebuffers");
        int i4 = g1zVar.m;
        GLES20.glActiveTexture(33984);
        hej.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        hej.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeH.getWidth(), sizeH.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.d(bitmapCreateBitmap, byteBufferAllocateDirect, sizeH.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void g(final dhf dhfVar) {
        Map map = Collections.EMPTY_MAP;
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            d(new Runnable(this) { // from class: hhd
                public final /* synthetic */ jhd a;
                public final /* synthetic */ Map c;

                {
                    Map map2 = Collections.EMPTY_MAP;
                    this.a = this;
                    this.c = map2;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    jhd jhdVar = this.a;
                    dhf dhfVar2 = dhfVar;
                    Map map2 = Collections.EMPTY_MAP;
                    nv5.a aVar2 = aVar;
                    try {
                        jhdVar.a.e(dhfVar2);
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

    public final void h(bxg0<Surface, Size, float[]> bxg0Var) {
        ArrayList arrayList = this.z;
        if (arrayList.isEmpty()) {
            return;
        }
        if (bxg0Var == null) {
            e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapF = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (iC != aVar.c() || bitmapF == null) {
                        iC = aVar.c();
                        if (bitmapF != null) {
                            bitmapF.recycle();
                        }
                        bitmapF = f(bxg0Var.b, bxg0Var.c, iC);
                        iB = -1;
                    }
                    if (iB != aVar.b()) {
                        byteArrayOutputStream.reset();
                        iB = aVar.b();
                        bitmapF.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = bxg0Var.a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.e(byteArray, surface);
                    aVar.a().b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        bxg0<Surface, Size, float[]> bxg0Var = null;
        for (Map.Entry entry : this.v.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            lhe0 lhe0Var = (lhe0) entry.getKey();
            float[] fArr2 = this.i;
            lhe0Var.E0(fArr2, fArr);
            if (lhe0Var.getFormat() == 34) {
                try {
                    this.a.j(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e) {
                    pgt.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                km20.g("Unsupported format: " + lhe0Var.getFormat(), lhe0Var.getFormat() == 256);
                km20.g("Only one JPEG output is supported.", bxg0Var == null);
                bxg0Var = new bxg0<>(surface, lhe0Var.a(), (float[]) fArr2.clone());
            }
        }
        try {
            h(bxg0Var);
        } catch (RuntimeException e2) {
            e(e2);
        }
    }

    @Override // defpackage.ohe0
    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        d(new Runnable() { // from class: dhd
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                jhd jhdVar = this.a;
                jhdVar.y = true;
                jhdVar.c();
            }
        }, new iw5());
    }
}
