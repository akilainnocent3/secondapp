package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.c;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qbn {

    public static final class a extends Exception {
    }

    public static Bitmap a(c cVar) {
        int format = cVar.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cVar.c(), cVar.b(), Bitmap.Config.ARGB_8888);
            cVar.y0()[0].e().rewind();
            ImageProcessingUtil.d(bitmapCreateBitmap, cVar.y0()[0].e(), cVar.y0()[0].a());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.b(cVar);
        }
        if (format != 256 && format != 4101) {
            bk7.a(", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported", "Incorrect image format of the input image proxy: ", cVar.getFormat());
            return null;
        }
        if (!b(cVar.getFormat())) {
            dwi.a(cVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferE = cVar.y0()[0].e();
        int iCapacity = byteBufferE.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        zkh.a("Decode jpeg byte array failed");
        return null;
    }

    public static boolean b(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] c(c cVar, Rect rect, int i, int i2) throws a {
        if (cVar.getFormat() != 35) {
            dwi.a(cVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        c.a aVar = cVar.y0()[0];
        c.a aVar2 = cVar.y0()[1];
        int i3 = 2;
        c.a aVar3 = cVar.y0()[2];
        ByteBuffer byteBufferE = aVar.e();
        ByteBuffer byteBufferE2 = aVar2.e();
        ByteBuffer byteBufferE3 = aVar3.e();
        byteBufferE.rewind();
        byteBufferE2.rewind();
        byteBufferE3.rewind();
        int iRemaining = byteBufferE.remaining();
        byte[] bArr = new byte[((cVar.b() * cVar.c()) / 2) + iRemaining];
        int iC = 0;
        for (int i4 = 0; i4 < cVar.b(); i4++) {
            byteBufferE.get(bArr, iC, cVar.c());
            iC += cVar.c();
            byteBufferE.position(Math.min(iRemaining, aVar.a() + (byteBufferE.position() - cVar.c())));
        }
        int iB = cVar.b() / 2;
        int iC2 = cVar.c() / 2;
        int iA = aVar3.a();
        int iA2 = aVar2.a();
        int iB2 = aVar3.b();
        int iB3 = aVar2.b();
        byte[] bArr2 = new byte[iA];
        byte[] bArr3 = new byte[iA2];
        int i5 = 0;
        while (i5 < iB) {
            int i6 = i3;
            byteBufferE3.get(bArr2, 0, Math.min(iA, byteBufferE3.remaining()));
            byteBufferE2.get(bArr3, 0, Math.min(iA2, byteBufferE2.remaining()));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < iC2; i9++) {
                int i10 = iC + 1;
                bArr[iC] = bArr2[i7];
                iC += 2;
                bArr[i10] = bArr3[i8];
                i7 += iB2;
                i8 += iB3;
            }
            i5++;
            i3 = i6;
        }
        int i11 = i3;
        YuvImage yuvImage = new YuvImage(bArr, 17, cVar.c(), cVar.b(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        jvg[] jvgVarArr = wug.b;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        wug.a aVar4 = new wug.a();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = aVar4.a;
        aVar4.c("Orientation", strValueOf, arrayList);
        aVar4.c("XResolution", "72/1", arrayList);
        aVar4.c("YResolution", "72/1", arrayList);
        aVar4.c("ResolutionUnit", String.valueOf(i11), arrayList);
        aVar4.c("YCbCrPositioning", String.valueOf(1), arrayList);
        aVar4.c("Make", Build.MANUFACTURER, arrayList);
        aVar4.c("Model", Build.MODEL, arrayList);
        if (cVar.m1() != null) {
            cVar.m1().a(aVar4);
        }
        aVar4.d(i2);
        aVar4.c("ImageWidth", String.valueOf(cVar.c()), arrayList);
        aVar4.c("ImageLength", String.valueOf(cVar.b()), arrayList);
        ArrayList list = Collections.list(new xug(aVar4));
        if (!((Map) list.get(1)).isEmpty()) {
            aVar4.b("ExposureProgram", String.valueOf(0), list);
            aVar4.b("ExifVersion", "0230", list);
            aVar4.b("ComponentsConfiguration", wug.e, list);
            aVar4.b("MeteringMode", String.valueOf(0), list);
            aVar4.b("LightSource", String.valueOf(0), list);
            aVar4.b("FlashpixVersion", "0100", list);
            aVar4.b("FocalPlaneResolutionUnit", String.valueOf(i11), list);
            aVar4.b("FileSource", String.valueOf(3), list);
            aVar4.b("SceneType", String.valueOf(1), list);
            aVar4.b("CustomRendered", String.valueOf(0), list);
            aVar4.b("SceneCaptureType", String.valueOf(0), list);
            aVar4.b("Contrast", String.valueOf(0), list);
            aVar4.b("Saturation", String.valueOf(0), list);
            aVar4.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i11)).isEmpty()) {
            aVar4.b("GPSVersionID", "2300", list);
            aVar4.b("GPSSpeedRef", "K", list);
            aVar4.b("GPSTrackRef", "T", list);
            aVar4.b("GPSImgDirectionRef", "T", list);
            aVar4.b("GPSDestBearingRef", "T", list);
            aVar4.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, cVar.c(), cVar.b()) : rect, i, new ivg(byteArrayOutputStream, new wug(list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.");
    }
}
