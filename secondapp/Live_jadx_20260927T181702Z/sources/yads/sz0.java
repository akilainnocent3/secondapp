package yads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class sz0 {
    public static void a() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            ih1.b("GlUtil", "glError: " + GLU.gluErrorString(iGlGetError));
            i10 = iGlGetError;
        }
        if (i10 != 0) {
            ih1.b("GlUtil", "glError: " + GLU.gluErrorString(i10));
        }
    }

    public static int b() {
        if (ib3.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            ih1.b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a();
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        a();
        GLES20.glTexParameteri(36197, androidx.work.e.f20077d, u4.a0.Q3);
        a();
        GLES20.glTexParameteri(36197, 10241, u4.a0.Q3);
        a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return i10;
    }

    public static boolean c() {
        String strEglQueryString;
        return ib3.f150516a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static boolean a(Context context) {
        String strEglQueryString;
        int i10 = ib3.f150516a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26) {
            byte[] bArrDecode = Base64.decode("c2Ftc3VuZw==", 0);
            Charset charset = cv.g.f77202b;
            if (new String(bArrDecode, charset).equals(ib3.f150518c) || new String(Base64.decode("WFQxNjUw", 0), charset).equals(ib3.f150519d)) {
                return false;
            }
        }
        return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
    }

    public static void a(String str) {
        ih1.b("GlUtil", str);
    }
}
