package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class eyd0 implements a5d {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final u2z c;
    public final bc80 d;

    public static final class a implements a5d.a {
        public final bc80 a;

        public a(bc80 bc80Var) {
            this.a = bc80Var;
        }

        @Override // a5d.a
        public final a5d a(aqa0 aqa0Var, u2z u2zVar, a840 a840Var) {
            ImageDecoder.Source sourceA;
            Bitmap.Config configC = abn.c(u2zVar);
            if ((configC == Bitmap.Config.ARGB_8888 || configC == Bitmap.Config.HARDWARE) && (sourceA = gyd0.a(aqa0Var.a, u2zVar, false)) != null) {
                return new eyd0(sourceA, aqa0Var.a, u2zVar, this.a);
            }
            return null;
        }
    }

    @c0d(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
    public static final class b extends x1b {
        public bc80 a;
        public /* synthetic */ Object b;
        public int d;

        public b(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return eyd0.this.a(this);
        }
    }

    public static final class c implements ImageDecoder$OnHeaderDecodedListener {
        public final /* synthetic */ yp40 b;

        public c(yp40 yp40Var) {
            this.b = yp40Var;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            eyd0 eyd0Var = eyd0.this;
            u2z u2zVar = eyd0Var.c;
            long jA = x4d.a(width, height, u2zVar.b, u2zVar.c, (ww90) q4h.b(u2zVar, uan.b));
            int i = (int) (jA >> 32);
            int i2 = (int) (jA & 4294967295L);
            if (width > 0 && height > 0 && (width != i || height != i2)) {
                double dB = x4d.b(width, height, i, i2, eyd0Var.c.c);
                boolean z = dB < 1.0d;
                this.b.a = z;
                if (z || eyd0Var.c.d == dm20.a) {
                    imageDecoder.setTargetSize(ycv.a(((double) width) * dB), ycv.a(dB * ((double) height)));
                }
            }
            imageDecoder.setOnPartialImageListener(new dyd0());
            u2z u2zVar2 = eyd0Var.c;
            imageDecoder.setAllocator(ze4.b(abn.c(u2zVar2)) ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!((Boolean) q4h.b(u2zVar2, abn.g)).booleanValue() ? 1 : 0);
            p4h.b<ColorSpace> bVar = abn.c;
            if (a7.c(q4h.b(u2zVar2, bVar)) != null) {
                imageDecoder.setTargetColorSpace(a7.c(q4h.b(u2zVar2, bVar)));
            }
            imageDecoder.setUnpremultipliedRequired(!((Boolean) q4h.b(u2zVar2, abn.d)).booleanValue());
        }
    }

    public eyd0(ImageDecoder.Source source, AutoCloseable autoCloseable, u2z u2zVar, bc80 bc80Var) {
        this.a = source;
        this.b = autoCloseable;
        this.c = u2zVar;
        this.d = bc80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.a5d
    public final Object a(v1b<? super w4d> v1bVar) {
        b bVar;
        bc80 bc80Var;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b((x1b) v1bVar);
            }
        } else {
            bVar = new b((x1b) v1bVar);
        }
        Object obj = bVar.b;
        y5b y5bVar = y5b.a;
        int i2 = bVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            bc80 bc80Var2 = this.d;
            bVar.a = bc80Var2;
            bVar.d = 1;
            if (bc80Var2.a(bVar) == y5bVar) {
                return y5bVar;
            }
            bc80Var = bc80Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bc80Var = bVar.a;
            uj50.b(obj);
        }
        try {
            AutoCloseable autoCloseable = this.b;
            try {
                yp40 yp40Var = new yp40();
                w4d w4dVar = new w4d(new oe4(ImageDecoder.decodeBitmap(this.a, new c(yp40Var))), yp40Var.a);
                vc1.a(autoCloseable, null);
                bc80Var.c();
                return w4dVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vc1.a(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            bc80Var.c();
            throw th3;
        }
    }
}
