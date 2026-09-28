package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.c;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class iy20 {
    public final Object a(Object obj) throws k8n {
        uug uugVar;
        ry20.b bVar = (ry20.b) obj;
        c cVarA = bVar.a();
        sy20 sy20VarB = bVar.b();
        if (qbn.b(cVarA.getFormat())) {
            try {
                uug.a aVar = uug.b;
                ByteBuffer byteBufferE = cVarA.y0()[0].e();
                byteBufferE.rewind();
                byte[] bArr = new byte[byteBufferE.capacity()];
                byteBufferE.get(bArr);
                uugVar = new uug(new bvg(new ByteArrayInputStream(bArr)));
                cVarA.y0()[0].e().rewind();
            } catch (IOException e) {
                throw new k8n("Failed to extract EXIF data.", e);
            }
        } else {
            uugVar = null;
        }
        if (((ImageCaptureRotationOptionQuirk) xhe.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            wg1 wg1Var = ue6.i;
        } else if (qbn.b(cVarA.getFormat())) {
            km20.f(uugVar, "JPEG image must have exif.");
            Size size = new Size(cVarA.c(), cVarA.b());
            int iA = sy20VarB.f - uugVar.a();
            Size size2 = lsg0.d(lsg0.j(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = lsg0.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
            RectF rectF = new RectF(sy20VarB.e);
            matrixA.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int iA2 = uugVar.a();
            Matrix matrix = new Matrix(sy20VarB.h);
            matrix.postConcat(matrixA);
            e06 aVar2 = cVarA.m1() instanceof f06 ? ((f06) cVarA.m1()).a : new e06.a();
            cVarA.getFormat();
            return new wj1(cVarA, uugVar, cVarA.getFormat(), size2, rect, iA2, matrix, aVar2);
        }
        Rect rect2 = sy20VarB.e;
        int i = sy20VarB.f;
        Matrix matrix2 = sy20VarB.h;
        e06 aVar3 = cVarA.m1() instanceof f06 ? ((f06) cVarA.m1()).a : new e06.a();
        Size size3 = new Size(cVarA.c(), cVarA.b());
        if (qbn.b(cVarA.getFormat())) {
            km20.f(uugVar, "JPEG image must have Exif.");
        }
        return new wj1(cVarA, uugVar, cVarA.getFormat(), size3, rect2, i, matrix2, aVar3);
    }
}
