package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i9n extends w12 {
    public final klr D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final pot H;
    public vuh0 I;
    public vuh0 J;
    public final vef K;
    public fly L;
    public fly.a M;

    public i9n(iot iotVar, drr drrVar) {
        super(iotVar, drrVar);
        this.D = new klr(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = drrVar.g;
        xmt xmtVar = iotVar.a;
        this.H = xmtVar == null ? null : (pot) ((HashMap) xmtVar.c()).get(str);
        tef tefVar = this.p.x;
        if (tefVar != null) {
            this.K = new vef(this, this, tefVar);
        }
    }

    @Override // defpackage.w12, defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapU;
        super.f(rectF, matrix, z);
        pot potVar = this.H;
        if (potVar != null) {
            int i = potVar.b;
            int i2 = potVar.a;
            float fC = srh0.c();
            if (this.o.C || (bitmapU = u()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapU.getWidth() * fC, bitmapU.getHeight() * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.w12, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        if (obj == vot.I) {
            this.I = new vuh0(cptVar, null);
            return;
        }
        if (obj == vot.L) {
            this.J = new vuh0(cptVar, null);
            return;
        }
        vef vefVar = this.K;
        if (obj == 5 && vefVar != null) {
            vefVar.c.j(cptVar);
            return;
        }
        if (obj == vot.E && vefVar != null) {
            vefVar.c(cptVar);
            return;
        }
        if (obj == vot.F && vefVar != null) {
            vefVar.e.j(cptVar);
            return;
        }
        if (obj == vot.G && vefVar != null) {
            vefVar.f.j(cptVar);
        } else {
            if (obj != vot.H || vefVar == null) {
                return;
            }
            vefVar.g.j(cptVar);
        }
    }

    @Override // defpackage.w12
    public final void m(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        pot potVar;
        Bitmap bitmapU = u();
        if (bitmapU == null || bitmapU.isRecycled() || (potVar = this.H) == null) {
            return;
        }
        float fC = srh0.c();
        klr klrVar = this.D;
        klrVar.setAlpha(i);
        vuh0 vuh0Var = this.I;
        if (vuh0Var != null) {
            klrVar.setColorFilter((ColorFilter) vuh0Var.e());
        }
        vef vefVar = this.K;
        if (vefVar != null) {
            sefVar = vefVar.b(matrix, i);
        }
        int width = bitmapU.getWidth();
        int height = bitmapU.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.C;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (potVar.a * fC), (int) (potVar.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapU.getWidth() * fC), (int) (bitmapU.getHeight() * fC));
        }
        boolean z2 = sefVar != null;
        if (z2) {
            if (this.L == null) {
                this.L = new fly();
            }
            fly.a aVar = this.M;
            if (aVar == null) {
                aVar = new fly.a();
                this.M = aVar;
            }
            fly.a aVar2 = aVar;
            aVar.a = 255;
            aVar.b = null;
            sefVar.getClass();
            sef sefVar2 = new sef(sefVar);
            aVar2.b = sefVar2;
            sefVar2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapU, rect, rect2, klrVar);
        if (z2) {
            this.L.c();
            if (this.L.c == fly.b.d) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    public final Bitmap u() {
        Bitmap bitmapD;
        Bitmap bitmap;
        vuh0 vuh0Var = this.J;
        if (vuh0Var != null && (bitmap = (Bitmap) vuh0Var.e()) != null) {
            return bitmap;
        }
        String str = this.p.g;
        iot iotVar = this.o;
        b8n b8nVar = iotVar.v;
        if (b8nVar != null) {
            Context contextI = iotVar.i();
            Context context = b8nVar.a;
            if (contextI != null) {
                if (context instanceof Application) {
                    contextI = contextI.getApplicationContext();
                }
                if (contextI != context) {
                    iotVar.v = null;
                }
            } else if (context != null) {
                iotVar.v = null;
            }
        }
        b8n b8nVar2 = iotVar.v;
        if (b8nVar2 == null) {
            b8nVar2 = new b8n(iotVar.getCallback(), iotVar.w, iotVar.a.c());
            iotVar.v = b8nVar2;
        }
        String str2 = b8nVar2.b;
        pot potVar = b8nVar2.c.get(str);
        if (potVar == null) {
            bitmapD = null;
        } else {
            int i = potVar.b;
            int i2 = potVar.a;
            bitmapD = potVar.f;
            if (bitmapD == null) {
                Context context2 = b8nVar2.a;
                if (context2 == null) {
                    bitmapD = null;
                } else {
                    String str3 = potVar.d;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }
                            try {
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                if (bitmapDecodeStream == null) {
                                    lgt.b("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = srh0.d(bitmapDecodeStream, i2, i);
                                    synchronized (b8n.d) {
                                        b8nVar2.c.get(str).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                lgt.c("Unable to decode image `" + str + "`.", e);
                            }
                        } catch (IOException e2) {
                            lgt.c("Unable to open asset.", e2);
                        }
                    } else {
                        try {
                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                            try {
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                if (bitmapDecodeByteArray == null) {
                                    lgt.b("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = srh0.d(bitmapDecodeByteArray, i2, i);
                                    synchronized (b8n.d) {
                                        b8nVar2.c.get(str).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                lgt.c("Unable to decode image `" + str + "`.", e3);
                            }
                        } catch (IllegalArgumentException e4) {
                            lgt.c("data URL did not have correct base64 format.", e4);
                        }
                    }
                }
            }
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        pot potVar2 = this.H;
        if (potVar2 != null) {
            return potVar2.f;
        }
        return null;
    }
}
