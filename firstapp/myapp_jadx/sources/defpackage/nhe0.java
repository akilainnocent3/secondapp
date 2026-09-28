package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nhe0 implements lhe0 {
    public final nv5.a<Void> A;
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public final float[] f;
    public qya<lhe0.b> i;
    public Executor v;
    public final nv5.d z;
    public final Object a = new Object();
    public boolean w = false;
    public boolean y = false;

    public nhe0(Surface surface, int i, Size size, cl1 cl1Var, lhe0.a aVar) {
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        this.b = surface;
        this.c = i;
        this.d = size;
        d(fArr, new float[16], cl1Var);
        d(fArr2, new float[16], aVar);
        nv5.a<Void> aVar2 = new nv5.a<>();
        nv5.d<T> dVar = new nv5.d<>(aVar2);
        aVar2.b = dVar;
        try {
            this.A = aVar2;
            aVar2.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            dVar.a(e);
        }
        this.z = dVar;
    }

    public static void d(float[] fArr, float[] fArr2, lhe0.a aVar) {
        Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        uzg.c(fArr);
        uzg.b(aVar.e(), fArr);
        if (aVar.d()) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeH = lsg0.h(aVar.c(), aVar.e());
        android.graphics.Matrix matrixA = lsg0.a(lsg0.i(aVar.c()), lsg0.i(sizeH), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeH.getWidth();
        float height = ((sizeH.getHeight() - rectF.height()) - rectF.top) / sizeH.getHeight();
        float fWidth = rectF.width() / sizeH.getWidth();
        float fHeight = rectF.height() / sizeH.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        n26 n26VarA = aVar.a();
        Matrix.setIdentityM(fArr2, 0);
        uzg.c(fArr2);
        if (n26VarA != null) {
            km20.g("Camera has no transform.", n26VarA.o());
            uzg.b(n26VarA.a().c(), fArr2);
            if (n26VarA.i()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // defpackage.lhe0
    public final void A(float[] fArr, float[] fArr2, boolean z) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, z ? this.e : this.f, 0);
    }

    @Override // defpackage.lhe0
    public final void E0(float[] fArr, float[] fArr2) {
        A(fArr, fArr2, true);
    }

    @Override // defpackage.lhe0
    public final Size a() {
        return this.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.y) {
                    this.y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.A.b(null);
    }

    public final void f() {
        Executor executor;
        qya<lhe0.b> qyaVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.v == null || (qyaVar = this.i) == null) {
                    this.w = true;
                } else if (!this.y) {
                    atomicReference.set(qyaVar);
                    executor = this.v;
                    this.w = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: mhe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((qya) atomicReference.get()).accept(new dl1(this.a));
                    }
                });
            } catch (RejectedExecutionException e) {
                pgt.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    @Override // defpackage.lhe0
    public final int getFormat() {
        return this.c;
    }

    @Override // defpackage.lhe0
    public final Surface j0(adl adlVar, qya qyaVar) {
        boolean z;
        synchronized (this.a) {
            this.v = adlVar;
            this.i = qyaVar;
            z = this.w;
        }
        if (z) {
            f();
        }
        return this.b;
    }
}
