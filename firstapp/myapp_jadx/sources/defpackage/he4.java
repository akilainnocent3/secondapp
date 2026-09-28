package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ImageReader;
import android.text.Layout;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.c;
import androidx.camera.core.e;
import java.nio.ByteBuffer;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class he4 {
    public static final /* synthetic */ int a = 0;

    public static final int b(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final Bitmap c(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public static final void d(Bitmap bitmap) {
        Bitmap bitmapC = c(bitmap);
        if (bitmapC != null) {
            bitmapC.recycle();
            Unit unit = Unit.a;
        }
    }

    public static String e(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        d580.a();
        return null;
    }

    public Object a(Object obj) throws Throwable {
        Throwable th;
        Bitmap bitmapCreateBitmap;
        wj1 wj1Var = (wj1) obj;
        e eVar = null;
        try {
            try {
                int iE = wj1Var.e();
                if (iE == 35) {
                    c cVar = (c) wj1Var.c();
                    boolean z = wj1Var.f() % 180 != 0;
                    e eVar2 = new e(new z70(ImageReader.newInstance(z ? cVar.b() : cVar.c(), z ? cVar.c() : cVar.b(), 1, 2)));
                    try {
                        ut90 ut90VarC = ImageProcessingUtil.c(cVar, eVar2, ByteBuffer.allocateDirect(cVar.c() * cVar.b() * 4), wj1Var.f());
                        cVar.close();
                        if (ut90VarC == null) {
                            throw new k8n("Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = qbn.a(ut90VarC);
                        ut90VarC.close();
                        eVar = eVar2;
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new k8n("Can't convert " + (wj1Var.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = eVar2;
                        if (eVar == null) {
                            throw th;
                        }
                        eVar.close();
                        throw th;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + wj1Var.e());
                    }
                    c cVar2 = (c) wj1Var.c();
                    Bitmap bitmapA = qbn.a(cVar2);
                    cVar2.close();
                    int iF = wj1Var.f();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(iF);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                }
                if (eVar != null) {
                    eVar.close();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UnsupportedOperationException e2) {
            e = e2;
        }
    }
}
