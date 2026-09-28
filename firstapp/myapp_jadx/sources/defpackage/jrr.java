package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class jrr implements hrr {
    public static final jrr a = new jrr();

    @c0d(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", l = {225}, m = "toBitmap")
    public static final class a extends x1b {
        public ImageReader a;
        public /* synthetic */ Object b;
        public int d;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return jrr.this.a(null, this);
        }
    }

    public static final class b implements ImageReader.OnImageAvailableListener {
        public final /* synthetic */ bc6 a;

        public b(bc6 bc6Var) {
            this.a = bc6Var;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            zi50.a aVar = zi50.b;
            this.a.resumeWith(imageReader.acquireLatestImage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hrr
    public final Object a(v6l v6lVar, v1b<? super Bitmap> v1bVar) {
        a aVar;
        ImageReader imageReader;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object objO = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        if (i2 == 0) {
            uj50.b(objO);
            long j = v6lVar.u;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (j >> 32), (int) (j & 4294967295L), 1, 1);
            try {
                aVar.a = imageReaderNewInstance;
                aVar.d = 1;
                bc6 bc6Var = new bc6(1, yzo.b(aVar));
                bc6Var.q();
                imageReaderNewInstance.setOnImageAvailableListener(new b(bc6Var), rcl.a(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(r58.l(j58.b), PorterDuff.Mode.CLEAR);
                    v6lVar.c(i40.b(canvasLockHardwareCanvas), null);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    objO = bc6Var.o();
                    if (objO == y5bVar) {
                        return y5bVar;
                    }
                    imageReader = imageReaderNewInstance;
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                imageReader = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageReader = aVar.a;
            try {
                uj50.b(objO);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    vc1.a(imageReader, th);
                    throw th4;
                }
            }
        }
        Bitmap bitmapA = lrr.a((Image) objO);
        vc1.a(imageReader, null);
        return bitmapA;
    }
}
