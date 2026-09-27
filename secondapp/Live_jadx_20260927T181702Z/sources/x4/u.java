package x4;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Build;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f144437g = 35815;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f144438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f144439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f144440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, a> f144441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, b> f144442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f144443f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f144444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f144445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Buffer f144446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f144447d;

        public a(String str, int i10) {
            this.f144444a = str;
            this.f144445b = i10;
        }

        public static a b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, u.j(bArr));
            return new a(str, u.h(i10, str));
        }

        public void a() throws x.a {
            Buffer buffer = (Buffer) zi.l0.F(this.f144446c, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f144445b, this.f144447d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f144445b);
            x.f();
        }

        public void c(float[] fArr, int i10) {
            this.f144446c = x.k(fArr);
            this.f144447d = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f144448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f144449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f144450c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f144453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f144454g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f144451d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f144452e = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f144455h = u4.a0.Q3;

        public b(String str, int i10, int i11) {
            this.f144448a = str;
            this.f144449b = i10;
            this.f144450c = i11;
        }

        public static b b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, u.j(bArr));
            return new b(str, u.k(i10, str), iArr2[0]);
        }

        public void a(boolean z10) throws x.a {
            int i10 = this.f144450c;
            if (i10 == 5124) {
                GLES20.glUniform1iv(this.f144449b, 1, this.f144452e, 0);
                x.f();
                return;
            }
            if (i10 == 5126) {
                GLES20.glUniform1fv(this.f144449b, 1, this.f144451d, 0);
                x.f();
                return;
            }
            if (i10 == 35678 || i10 == 35815 || i10 == 36198) {
                if (this.f144453f == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(this.f144454g + 33984);
                x.f();
                int i11 = this.f144450c;
                x.c(i11 == 35678 ? 3553 : 36197, this.f144453f, (i11 == 35678 || !z10) ? u4.a0.Q3 : 9728);
                if (this.f144450c == 35678) {
                    if (this.f144455h == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        x.f();
                    }
                    GLES20.glTexParameteri(3553, 10241, this.f144455h);
                    x.f();
                }
                GLES20.glUniform1i(this.f144449b, this.f144454g);
                x.f();
                return;
            }
            switch (i10) {
                case 35664:
                    GLES20.glUniform2fv(this.f144449b, 1, this.f144451d, 0);
                    x.f();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f144449b, 1, this.f144451d, 0);
                    x.f();
                    return;
                case 35666:
                    GLES20.glUniform4fv(this.f144449b, 1, this.f144451d, 0);
                    x.f();
                    return;
                case 35667:
                    GLES20.glUniform2iv(this.f144449b, 1, this.f144452e, 0);
                    x.f();
                    return;
                case 35668:
                    GLES20.glUniform3iv(this.f144449b, 1, this.f144452e, 0);
                    x.f();
                    return;
                case 35669:
                    GLES20.glUniform4iv(this.f144449b, 1, this.f144452e, 0);
                    x.f();
                    return;
                default:
                    switch (i10) {
                        case 35675:
                            GLES20.glUniformMatrix3fv(this.f144449b, 1, false, this.f144451d, 0);
                            x.f();
                            return;
                        case 35676:
                            GLES20.glUniformMatrix4fv(this.f144449b, 1, false, this.f144451d, 0);
                            x.f();
                            return;
                        default:
                            throw new IllegalStateException("Unexpected uniform type: " + this.f144450c);
                    }
            }
        }

        public void c(float f10) {
            this.f144451d[0] = f10;
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f144451d, 0, fArr.length);
        }

        public void e(int i10) {
            this.f144452e[0] = i10;
        }

        public void f(int[] iArr) {
            System.arraycopy(iArr, 0, this.f144452e, 0, iArr.length);
        }

        public void g(int i10, int i11) {
            this.f144453f = i10;
            this.f144454g = i11;
        }

        public void h(int i10) {
            this.f144455h = i10;
        }
    }

    public u(Context context, int i10, int i11) throws IOException, x.a {
        this(b2.D1(context, i10), b2.D1(context, i11));
    }

    public static void d(int i10, int i11, String str) throws x.a {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        x.g(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        x.f();
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

    public void e() throws x.a {
        for (a aVar : this.f144439b) {
            aVar.a();
        }
        for (b bVar : this.f144440c) {
            bVar.a(this.f144443f);
        }
    }

    public void f() throws x.a {
        if (Build.VERSION.SDK_INT == 28) {
            return;
        }
        GLES20.glDeleteProgram(this.f144438a);
        x.f();
    }

    public int g(String str) throws x.a {
        int i10 = i(str);
        GLES20.glEnableVertexAttribArray(i10);
        x.f();
        return i10;
    }

    public final int i(String str) {
        return h(this.f144438a, str);
    }

    public int l(String str) {
        return k(this.f144438a, str);
    }

    public void m(String str, float[] fArr, int i10) {
        ((a) zi.l0.E(this.f144441d.get(str))).c(fArr, i10);
    }

    public void n(boolean z10) {
        this.f144443f = z10;
    }

    public void o(String str, float f10) {
        ((b) zi.l0.E(this.f144442e.get(str))).c(f10);
    }

    public void p(String str, float[] fArr) {
        ((b) zi.l0.E(this.f144442e.get(str))).d(fArr);
    }

    public void q(String str, float[] fArr) {
        b bVar = this.f144442e.get(str);
        if (bVar == null) {
            return;
        }
        bVar.d(fArr);
    }

    public void r(String str, int i10) {
        ((b) zi.l0.E(this.f144442e.get(str))).e(i10);
    }

    public void s(String str, int[] iArr) {
        ((b) zi.l0.E(this.f144442e.get(str))).f(iArr);
    }

    public void t(String str, int i10, int i11) {
        ((b) zi.l0.E(this.f144442e.get(str))).g(i10, i11);
    }

    public void u(String str, int i10, int i11, int i12) {
        b bVar = (b) zi.l0.E(this.f144442e.get(str));
        bVar.g(i10, i11);
        bVar.h(i12);
    }

    public void v() throws x.a {
        GLES20.glUseProgram(this.f144438a);
        x.f();
    }

    public u(Context context, String str, String str2) throws IOException, x.a {
        this(b2.C1(context, str), b2.C1(context, str2));
    }

    public u(String str, String str2) throws x.a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f144438a = iGlCreateProgram;
        x.f();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        x.g(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f144441d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f144439b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarB = a.b(this.f144438a, i10);
            this.f144439b[i10] = aVarB;
            this.f144441d.put(aVarB.f144444a, aVarB);
        }
        this.f144442e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f144438a, 35718, iArr3, 0);
        this.f144440c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b bVarB = b.b(this.f144438a, i11);
            this.f144440c[i11] = bVarB;
            this.f144442e.put(bVarB.f144448a, bVarB);
        }
        x.f();
    }
}
