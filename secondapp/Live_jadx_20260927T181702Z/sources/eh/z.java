package eh;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f81263f = 35815;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f81265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f81266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, a> f81267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, b> f81268e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Buffer f81272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f81273e;

        public a(String str, int i10, int i11) {
            this.f81269a = str;
            this.f81270b = i10;
            this.f81271c = i11;
        }

        public static a b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, z.j(bArr));
            return new a(str, i11, z.h(i10, str));
        }

        public void a() throws b0.b {
            Buffer buffer = (Buffer) eh.a.h(this.f81272d, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f81271c, this.f81273e, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f81270b);
            b0.e();
        }

        public void c(float[] fArr, int i10) {
            this.f81272d = b0.j(fArr);
            this.f81273e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f81277d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f81278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f81279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f81280g;

        public b(String str, int i10, int i11) {
            this.f81274a = str;
            this.f81275b = i10;
            this.f81276c = i11;
        }

        public static b b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, z.j(bArr));
            return new b(str, z.k(i10, str), iArr2[0]);
        }

        public void a() throws b0.b {
            switch (this.f81276c) {
                case 5124:
                    GLES20.glUniform1i(this.f81275b, this.f81278e);
                    return;
                case 5126:
                    GLES20.glUniform1fv(this.f81275b, 1, this.f81277d, 0);
                    b0.e();
                    return;
                case 35664:
                    GLES20.glUniform2fv(this.f81275b, 1, this.f81277d, 0);
                    b0.e();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f81275b, 1, this.f81277d, 0);
                    b0.e();
                    return;
                case 35675:
                    GLES20.glUniformMatrix3fv(this.f81275b, 1, false, this.f81277d, 0);
                    b0.e();
                    return;
                case 35676:
                    GLES20.glUniformMatrix4fv(this.f81275b, 1, false, this.f81277d, 0);
                    b0.e();
                    return;
                case 35678:
                case 35815:
                case 36198:
                    if (this.f81279f == 0) {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    GLES20.glActiveTexture(this.f81280g + 33984);
                    b0.e();
                    b0.c(this.f81276c == 35678 ? 3553 : 36197, this.f81279f);
                    GLES20.glUniform1i(this.f81275b, this.f81280g);
                    b0.e();
                    return;
                default:
                    throw new IllegalStateException("Unexpected uniform type: " + this.f81276c);
            }
        }

        public void c(float f10) {
            this.f81277d[0] = f10;
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f81277d, 0, fArr.length);
        }

        public void e(int i10) {
            this.f81278e = i10;
        }

        public void f(int i10, int i11) {
            this.f81279f = i10;
            this.f81280g = i11;
        }
    }

    public z(Context context, String str, String str2) throws b0.b, IOException {
        this(m(context, str), m(context, str2));
    }

    public static void d(int i10, int i11, String str) throws b0.b {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        b0.f(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b0.e();
    }

    public static int h(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    public static int j(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public static int k(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public static String m(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return o1.N(o1.S1(inputStreamOpen));
        } finally {
            o1.t(inputStreamOpen);
        }
    }

    public void e() throws b0.b {
        for (a aVar : this.f81265b) {
            aVar.a();
        }
        for (b bVar : this.f81266c) {
            bVar.a();
        }
    }

    public void f() throws b0.b {
        GLES20.glDeleteProgram(this.f81264a);
        b0.e();
    }

    public int g(String str) throws b0.b {
        int i10 = i(str);
        GLES20.glEnableVertexAttribArray(i10);
        b0.e();
        return i10;
    }

    public final int i(String str) {
        return h(this.f81264a, str);
    }

    public int l(String str) {
        return k(this.f81264a, str);
    }

    public void n(String str, float[] fArr, int i10) {
        ((a) eh.a.g(this.f81267d.get(str))).c(fArr, i10);
    }

    public void o(String str, float f10) {
        ((b) eh.a.g(this.f81268e.get(str))).c(f10);
    }

    public void p(String str, float[] fArr) {
        ((b) eh.a.g(this.f81268e.get(str))).d(fArr);
    }

    public void q(String str, int i10) {
        ((b) eh.a.g(this.f81268e.get(str))).e(i10);
    }

    public void r(String str, int i10, int i11) {
        ((b) eh.a.g(this.f81268e.get(str))).f(i10, i11);
    }

    public void s() throws b0.b {
        GLES20.glUseProgram(this.f81264a);
        b0.e();
    }

    public z(String str, String str2) throws b0.b {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f81264a = iGlCreateProgram;
        b0.e();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        b0.f(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f81267d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f81265b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarB = a.b(this.f81264a, i10);
            this.f81265b[i10] = aVarB;
            this.f81267d.put(aVarB.f81269a, aVarB);
        }
        this.f81268e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f81264a, 35718, iArr3, 0);
        this.f81266c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b bVarB = b.b(this.f81264a, i11);
            this.f81266c[i11] = bVarB;
            this.f81268e.put(bVarB.f81274a, bVarB);
        }
        b0.e();
    }
}
