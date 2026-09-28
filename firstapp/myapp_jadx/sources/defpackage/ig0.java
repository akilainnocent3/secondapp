package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.PostProcessor;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 implements a5d {
    public final nbn a;
    public final u2z b;
    public final boolean c;

    public static final class a implements a5d.a {
        public final boolean a;

        public a() {
            this.a = Build.VERSION.SDK_INT < 34;
        }

        @Override // a5d.a
        public final a5d a(aqa0 aqa0Var, u2z u2zVar, a840 a840Var) {
            cc5 cc5VarSource = aqa0Var.a.source();
            if (!cc5VarSource.y(0L, z4d.b) && !cc5VarSource.y(0L, z4d.a) && (!cc5VarSource.y(0L, z4d.c) || !cc5VarSource.y(8L, z4d.d) || !cc5VarSource.y(12L, z4d.e) || !cc5VarSource.request(21L) || ((byte) (cc5VarSource.e().m(20L) & 2)) <= 0)) {
                if (Build.VERSION.SDK_INT < 30 || !cc5VarSource.y(4L, z4d.f)) {
                    return null;
                }
                if (!cc5VarSource.y(8L, z4d.g) && !cc5VarSource.y(8L, z4d.h) && !cc5VarSource.y(8L, z4d.i)) {
                    return null;
                }
            }
            return new ig0(aqa0Var.a, u2zVar, this.a);
        }
    }

    @c0d(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {59, 100}, m = "decode")
    public static final class b extends x1b {
        public yp40 a;
        public /* synthetic */ Object b;
        public int d;

        public b(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ig0.this.a(this);
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
            ig0 ig0Var = ig0.this;
            u2z u2zVar = ig0Var.b;
            long jA = x4d.a(width, height, u2zVar.b, u2zVar.c, (ww90) q4h.b(u2zVar, uan.b));
            int i = (int) (jA >> 32);
            int i2 = (int) (jA & 4294967295L);
            if (width > 0 && height > 0 && (width != i || height != i2)) {
                double dB = x4d.b(width, height, i, i2, ig0Var.b.c);
                boolean z = dB < 1.0d;
                this.b.a = z;
                if (z || ig0Var.b.d == dm20.a) {
                    imageDecoder.setTargetSize(ycv.a(((double) width) * dB), ycv.a(dB * ((double) height)));
                }
            }
            u2z u2zVar2 = ig0Var.b;
            imageDecoder.setAllocator(ze4.b(abn.c(u2zVar2)) ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!((Boolean) q4h.b(u2zVar2, abn.g)).booleanValue() ? 1 : 0);
            p4h.b<ColorSpace> bVar = abn.c;
            if (a7.c(q4h.b(u2zVar2, bVar)) != null) {
                imageDecoder.setTargetColorSpace(a7.c(q4h.b(u2zVar2, bVar)));
            }
            final qg0 qg0Var = (qg0) q4h.b(u2zVar2, van.b);
            imageDecoder.setPostProcessor(qg0Var != null ? new PostProcessor() { // from class: gsh0
                @Override // android.graphics.PostProcessor
                public final int onPostProcess(Canvas canvas) {
                    int iOrdinal = qg0Var.a().ordinal();
                    if (iOrdinal == 0) {
                        return 0;
                    }
                    if (iOrdinal == 1) {
                        return -3;
                    }
                    if (iOrdinal == 2) {
                        return -1;
                    }
                    uhc.a();
                    return 0;
                }
            } : null);
        }
    }

    public ig0(nbn nbnVar, u2z u2zVar, boolean z) {
        this.a = nbnVar;
        this.b = u2zVar;
        this.c = z;
    }

    public static final Drawable b(ig0 ig0Var, yp40 yp40Var) {
        nbn nbnVarA = gzi.a(ig0Var.a, ig0Var.c);
        try {
            ImageDecoder.Source sourceA = gyd0.a(nbnVarA, ig0Var.b, true);
            if (sourceA == null) {
                cc5 cc5VarSource = nbnVarA.source();
                try {
                    cc5VarSource.request(Long.MAX_VALUE);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) cc5VarSource.e().b);
                    while (!cc5VarSource.e().N0()) {
                        cc5VarSource.e().read(byteBufferAllocateDirect);
                    }
                    byteBufferAllocateDirect.flip();
                    cc5VarSource.close();
                    sourceA = ImageDecoder.createSource(byteBufferAllocateDirect);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(cc5VarSource, th);
                        throw th2;
                    }
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceA, ig0Var.new c(yp40Var));
            vc1.a(nbnVarA, null);
            return drawableDecodeDrawable;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                vc1.a(nbnVarA, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.a5d
    public final Object a(v1b<? super w4d> v1bVar) {
        b bVar;
        final yp40 yp40Var;
        Object objF;
        yp40 yp40Var2;
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
        Object obj2 = y5b.a;
        int i2 = bVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            yp40Var = new yp40();
            Function0 function0 = new Function0() { // from class: hg0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ig0.b(this.a, yp40Var);
                }
            };
            bVar.a = yp40Var;
            bVar.d = 1;
            objF = cft.f(function0, bVar);
            if (objF != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            yp40 yp40Var3 = bVar.a;
            uj50.b(obj);
            objF = obj;
            yp40Var = yp40Var3;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40Var2 = bVar.a;
            uj50.b(obj);
        }
        return new w4d(zbn.b((Drawable) obj), yp40Var2.a);
        bVar.a = yp40Var;
        bVar.d = 2;
        Object objC = c((Drawable) objF, bVar);
        if (objC != obj2) {
            yp40 yp40Var4 = yp40Var;
            obj = objC;
            yp40Var2 = yp40Var4;
            return new w4d(zbn.b((Drawable) obj), yp40Var2.a);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Drawable drawable, x1b x1bVar) {
        jg0 jg0Var;
        if (x1bVar instanceof jg0) {
            jg0Var = (jg0) x1bVar;
            int i = jg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg0Var.d = i - Integer.MIN_VALUE;
            } else {
                jg0Var = new jg0(this, x1bVar);
            }
        } else {
            jg0Var = new jg0(this, x1bVar);
        }
        Object obj = jg0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = jg0Var.d;
        u2z u2zVar = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            p4h.b<Integer> bVar = van.a;
            if (((Number) q4h.b(u2zVar, bVar)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) q4h.b(u2zVar, bVar)).intValue());
            }
            Function0 function0 = (Function0) q4h.b(u2zVar, van.c);
            Function0 function1 = (Function0) q4h.b(u2zVar, van.d);
            if (function0 != null || function1 != null) {
                pfd pfdVar = fse.a;
                vcl vclVarH0 = gku.a.h0();
                lg0 lg0Var = new lg0(drawable, function0, function1, null);
                jg0Var.a = drawable;
                jg0Var.d = 1;
                if (ej5.d(vclVarH0, lg0Var, jg0Var) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) jg0Var.a;
            uj50.b(obj);
        }
        return new xy60(drawable, u2zVar.c);
    }
}
