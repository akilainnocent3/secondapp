package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.google.protobuf.Reader;
import kotlin.jvm.internal.Intrinsics;
import y740.a;

/* JADX INFO: loaded from: classes.dex */
public final class ke4 implements a5d {
    public final nbn a;
    public final u2z b;
    public final bc80 c;
    public final gvg d;

    public static final class a extends jui {
        public Exception b;

        @Override // defpackage.jui, defpackage.zpa0
        public final long read(lb5 lb5Var, long j) throws Exception {
            try {
                return super.read(lb5Var, j);
            } catch (Exception e) {
                this.b = e;
                throw e;
            }
        }
    }

    public static final class b implements a5d.a {
        public final bc80 a;
        public final gvg b;

        public b(bc80 bc80Var, gvg gvgVar) {
            this.a = bc80Var;
            this.b = gvgVar;
        }

        @Override // a5d.a
        public final a5d a(aqa0 aqa0Var, u2z u2zVar, a840 a840Var) {
            return new ke4(aqa0Var.a, u2zVar, this.a, this.b);
        }
    }

    @c0d(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
    public static final class c extends x1b {
        public bc80 a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public c(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ke4.this.a(this);
        }
    }

    public ke4(nbn nbnVar, u2z u2zVar, bc80 bc80Var, gvg gvgVar) {
        this.a = nbnVar;
        this.b = u2zVar;
        this.c = bc80Var;
        this.d = gvgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w4d b(ke4 ke4Var) throws Exception {
        yug yugVar;
        w4d w4dVar;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        u2z u2zVar = ke4Var.b;
        a aVar = new a(ke4Var.a.source());
        y740 y740Var = new y740(aVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(y740Var.peek().new a(), null, options);
        Exception exc = aVar.b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = kvg.a;
        if (ke4Var.d.a(options.outMimeType)) {
            bvg bvgVar = new bvg(new dvg(y740Var.peek().new a()));
            int iD = bvgVar.d(1, "Orientation");
            boolean z2 = iD == 2 || iD == 7 || iD == 4 || iD == 5;
            switch (bvgVar.d(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            yugVar = new yug(i2, z2);
        } else {
            yugVar = yug.c;
        }
        int i3 = yugVar.b;
        boolean z3 = yugVar.a;
        Exception exc2 = aVar.b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && abn.d(u2zVar) != null) {
            options.inPreferredColorSpace = a7.c(q4h.b(u2zVar, abn.c));
        }
        boolean zBooleanValue = ((Boolean) q4h.b(u2zVar, abn.d)).booleanValue();
        Context context = u2zVar.a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) q4h.b(u2zVar, abn.b);
        if ((z3 || i3 > 0) && (config == null || ze4.b(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) q4h.b(u2zVar, abn.g)).booleanValue() && config == Bitmap.Config.ARGB_8888) {
            w4dVar = null;
            if (Intrinsics.g(options.outMimeType, "image/jpeg")) {
                config = Bitmap.Config.RGB_565;
            }
        } else {
            w4dVar = null;
        }
        if (i4 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i5 = options.outWidth;
        if (i5 <= 0 || (i = options.outHeight) <= 0) {
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i6 = (i3 == 90 || i3 == 270) ? i : i5;
            if (i3 != 90 && i3 != 270) {
                i5 = i;
            }
            ww90 ww90Var = u2zVar.b;
            vy60 vy60Var = u2zVar.c;
            long jA = x4d.a(i6, i5, ww90Var, vy60Var, (ww90) q4h.b(u2zVar, uan.b));
            int i7 = (int) (jA >> 32);
            int i8 = (int) (jA & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i6 / i7);
            int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
            int iOrdinal = vy60Var.ordinal();
            if (iOrdinal == 0) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return w4dVar;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            double d = i6;
            z3 = z3;
            double d2 = iMin;
            double d3 = i8;
            double d4 = ((double) i7) / (d / d2);
            double d5 = d3 / (((double) i5) / d2);
            int iOrdinal2 = vy60Var.ordinal();
            if (iOrdinal2 == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return w4dVar;
                }
                dMax = Math.min(d4, d5);
            }
            if (u2zVar.d == dm20.b && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = ycv.a(2.147483647E9d / dMax);
                    options.inTargetDensity = Reader.READ_DONE;
                } else {
                    options.inDensity = Reader.READ_DONE;
                    options.inTargetDensity = ycv.a(2.147483647E9d * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(y740Var.new a(), w4dVar, options);
            y740Var.close();
            Exception exc3 = aVar.b;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                ib5.a("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i3 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    matrix.postRotate(i3, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i3 == 90 || i3 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, kvg.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new w4d(zbn.b(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ft7.a(y740Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.a5d
    public final Object a(v1b<? super w4d> v1bVar) throws Throwable {
        c cVar;
        bc80 bc80Var;
        int i;
        Throwable th;
        bc80 bc80Var2;
        if (v1bVar instanceof c) {
            cVar = (c) v1bVar;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c((x1b) v1bVar);
            }
        } else {
            cVar = new c((x1b) v1bVar);
        }
        Object obj = cVar.c;
        y5b y5bVar = y5b.a;
        int i3 = cVar.e;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                bc80Var = this.c;
                cVar.a = bc80Var;
                cVar.b = 0;
                cVar.e = 1;
                if (bc80Var.a(cVar) != y5bVar) {
                    i = 0;
                }
                return y5bVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bc80Var2 = cVar.a;
                try {
                    uj50.b(obj);
                    w4d w4dVar = (w4d) obj;
                    bc80Var2.c();
                    return w4dVar;
                } catch (Throwable th2) {
                    th = th2;
                    bc80Var2.c();
                    throw th;
                }
            }
            i = cVar.b;
            bc80 bc80Var3 = cVar.a;
            uj50.b(obj);
            bc80Var = bc80Var3;
            je4 je4Var = new je4(this, 0);
            cVar.a = bc80Var;
            cVar.b = i;
            cVar.e = 2;
            Object objF = cft.f(je4Var, cVar);
            if (objF != y5bVar) {
                bc80 bc80Var4 = bc80Var;
                obj = objF;
                bc80Var2 = bc80Var4;
                w4d w4dVar2 = (w4d) obj;
                bc80Var2.c();
                return w4dVar2;
            }
            return y5bVar;
        } catch (Throwable th3) {
            bc80 bc80Var5 = bc80Var;
            th = th3;
            bc80Var2 = bc80Var5;
            bc80Var2.c();
            throw th;
        }
    }
}
