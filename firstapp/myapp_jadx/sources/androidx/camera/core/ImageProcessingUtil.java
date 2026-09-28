package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.b;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import defpackage.hb5;
import defpackage.km20;
import defpackage.pgt;
import defpackage.ut90;
import defpackage.zkh;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ImageProcessingUtil {
    public static int a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("UNKNOWN", 0);
            a aVar2 = new a("SUCCESS", 1);
            a = aVar2;
            a aVar3 = new a("ERROR_CONVERSION", 2);
            b = aVar3;
            c = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static c a(e eVar, byte[] bArr) {
        km20.b(eVar.d() == 256);
        bArr.getClass();
        Surface surface = eVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            pgt.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        c cVarA = eVar.a();
        if (cVarA == null) {
            pgt.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return cVarA;
    }

    public static Bitmap b(c cVar) {
        if (cVar.getFormat() != 35) {
            hb5.a("Input image format must be YUV_420_888");
            return null;
        }
        int iC = cVar.c();
        int iB = cVar.b();
        int iA = cVar.y0()[0].a();
        int iA2 = cVar.y0()[1].a();
        int iA3 = cVar.y0()[2].a();
        int iB2 = cVar.y0()[0].b();
        int iB3 = cVar.y0()[1].b();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cVar.c(), cVar.b(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(cVar.y0()[0].e(), iA, cVar.y0()[1].e(), iA2, cVar.y0()[2].e(), iA3, iB2, iB3, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iC, iB) == 0) {
            return bitmapCreateBitmap;
        }
        zkh.a("YUV to RGB conversion failed");
        return null;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void e(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            pgt.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static ut90 c(final c cVar, e eVar, ByteBuffer byteBuffer, int i) {
        if (cVar.getFormat() != 35 || cVar.y0().length != 3) {
            pgt.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            pgt.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        int iNativeConvertAndroid420ToABGR = nativeConvertAndroid420ToABGR(cVar.y0()[0].e(), cVar.y0()[0].a(), cVar.y0()[1].e(), cVar.y0()[1].a(), cVar.y0()[2].e(), cVar.y0()[2].a(), cVar.y0()[0].b(), cVar.y0()[1].b(), eVar.getSurface(), byteBuffer, cVar.c(), cVar.b(), 0, 0, 0, i);
        a aVar = a.b;
        if ((iNativeConvertAndroid420ToABGR != 0 ? aVar : a.a) == aVar) {
            pgt.c("ImageProcessingUtil", ACKxwYRsuWyGz.TahJ);
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            pgt.a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + siPCzPFw.PlyBJOS + a);
            a = a + 1;
        }
        final c cVarA = eVar.a();
        if (cVarA == null) {
            pgt.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        ut90 ut90Var = new ut90(cVarA);
        ut90Var.d(new b.a() { // from class: han
            @Override // androidx.camera.core.b.a
            public final void g(b bVar) throws Exception {
                int i2 = ImageProcessingUtil.a;
                cVar.close();
            }
        });
        return ut90Var;
    }
}
