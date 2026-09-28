package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class hej {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final a e;
    public static final b f;
    public static final c g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final tj1 j;

    public class a implements gx80 {
        @Override // defpackage.gx80
        public final String a() {
            Locale locale = Locale.US;
            return QWvyvNzGsBpRT.LcECHwnfrKmoaGE;
        }
    }

    public class b implements gx80 {
        @Override // defpackage.gx80
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
        }
    }

    public class c implements gx80 {
        @Override // defpackage.gx80
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
        }
    }

    public static class d extends f {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final e a;
        public static final e b;
        public static final e c;
        public static final /* synthetic */ e[] d;

        static {
            e eVar = new e("UNKNOWN", 0);
            a = eVar;
            e eVar2 = new e("DEFAULT", 1);
            b = eVar2;
            e eVar3 = new e("YUV", 2);
            c = eVar3;
            d = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) d.clone();
        }
    }

    public static abstract class f {
        public final int a;
        public int b = -1;
        public int c = -1;
        public int d = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0075  */
        /* JADX WARN: Code duplicated, block: B:34:0x007a  */
        /* JADX WARN: Code duplicated, block: B:36:0x007f  */
        public f(String str, String str2) throws Throwable {
            int iK;
            int iK2;
            int iGlCreateProgram;
            try {
                iK = hej.k(35633, str);
                try {
                    iK2 = hej.k(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            hej.b("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iK);
                            hej.b("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iK2);
                            hej.b("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.a = iGlCreateProgram;
                                a();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            if (iK != -1) {
                                GLES20.glDeleteShader(iK);
                            }
                            if (iK2 != -1) {
                                GLES20.glDeleteShader(iK2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e2) {
                            e = e2;
                            if (iK != -1) {
                                GLES20.glDeleteShader(iK);
                            }
                            if (iK2 != -1) {
                                GLES20.glDeleteShader(iK2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e3) {
                        e = e3;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    e = e4;
                    iK2 = -1;
                    iGlCreateProgram = iK2;
                    if (iK != -1) {
                        GLES20.glDeleteShader(iK);
                    }
                    if (iK2 != -1) {
                        GLES20.glDeleteShader(iK2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e5) {
                e = e5;
                iK = -1;
                iK2 = -1;
            }
        }

        public final void a() {
            int i = this.a;
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
            this.d = iGlGetAttribLocation;
            hej.e(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
            this.b = iGlGetUniformLocation;
            hej.e(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
            this.c = iGlGetUniformLocation2;
            hej.e(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glUseProgram(this.a);
            hej.b("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.d);
            hej.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) hej.h);
            hej.b(LGxrN.HxeuTXrhzfIwQYx);
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
            hej.b("glUniformMatrix4fv");
            GLES20.glUniform1f(this.c, 1.0f);
            hej.b("glUniform1f");
        }
    }

    public static class g extends f {
        public final int e;
        public final int f;
        public final int g;

        @Override // hej.f
        public final void b() {
            super.b();
            GLES20.glUniform1i(this.e, 0);
            GLES20.glEnableVertexAttribArray(this.g);
            hej.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) hej.i);
            hej.b("glVertexAttribPointer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(dhf dhfVar, gx80 gx80Var) {
            String str = dhfVar.a() ? hej.d : hej.c;
            try {
                String strA = gx80Var.a();
                if (strA == null || !strA.contains("vTextureCoord") || !strA.contains("sTexture")) {
                    throw new IllegalArgumentException(LxHElgWAiSeM.ZTTfMZXAw);
                }
                super(str, strA);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                a();
                int i = this.a;
                int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
                this.e = iGlGetUniformLocation;
                hej.e(iGlGetUniformLocation, "sTexture");
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
                this.g = iGlGetAttribLocation;
                hej.e(iGlGetAttribLocation, "aTextureCoord");
                int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
                this.f = iGlGetUniformLocation2;
                hej.e(iGlGetUniformLocation2, "uTexMatrix");
            } catch (Throwable th) {
                if (!(th instanceof IllegalArgumentException)) {
                    throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
                }
                throw th;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(dhf dhfVar, e eVar) {
            gx80 gx80Var;
            if (dhfVar.a()) {
                km20.a("No default sampler shader available for" + eVar, eVar != e.a);
                if (eVar == e.c) {
                    gx80Var = hej.g;
                } else {
                    gx80Var = hej.f;
                }
            } else {
                gx80Var = hej.e;
            }
            this(dhfVar, gx80Var);
        }
    }

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new a();
        f = new b();
        g = new c();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        j = new tj1(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        lpd0.a(mq0.b(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        lpd0.a(mq0.b(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
    }

    public static void c(Thread thread) {
        km20.g("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        km20.g(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        ib5.a(tug.a("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, dhf dhfVar) {
        int i2 = dhfVar.a;
        int[] iArr = a;
        if (i2 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return b;
            }
            pgt.i("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(dhf dhfVar) {
        Object gVar;
        e eVar;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            e eVar2 = eVarArrValues[i2];
            gx80 gx80Var = (gx80) map.get(eVar2);
            if (gx80Var != null) {
                gVar = new g(dhfVar, gx80Var);
            } else if (eVar2 == e.c || eVar2 == (eVar = e.b)) {
                gVar = new g(dhfVar, eVar2);
            } else {
                km20.g("Unhandled input format: " + eVar2, eVar2 == e.a);
                if (dhfVar.a()) {
                    gVar = new d("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    gx80 gx80Var2 = (gx80) map.get(eVar);
                    gVar = gx80Var2 != null ? new g(dhfVar, gx80Var2) : new g(dhfVar, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        ib5.a("surface was null");
        return null;
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return tug.a(strGroup, ".", strGroup2);
    }

    public static int k(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        pgt.i("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + strGlGetShaderInfoLog);
    }
}
