package fh;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j extends GLSurfaceView implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f84433c = "VideoDecoderGLSV";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f84434b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f84438o = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f84440q = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GLSurfaceView f84442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f84443c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f84444d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f84445e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f84446f = new int[3];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicReference<ye.o> f84447g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final FloatBuffer[] f84448h = new FloatBuffer[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public eh.z f84449i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f84450j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ye.o f84451k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final float[] f84435l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final float[] f84436m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final float[] f84437n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String[] f84439p = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final FloatBuffer f84441r = eh.b0.j(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public a(GLSurfaceView gLSurfaceView) {
            this.f84442b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f84445e;
                this.f84446f[i10] = -1;
                iArr[i10] = -1;
            }
        }

        public void a(ye.o oVar) {
            ye.o andSet = this.f84447g.getAndSet(oVar);
            if (andSet != null) {
                andSet.l();
            }
            this.f84442b.requestRender();
        }

        @ux.m({"program"})
        public final void b() {
            try {
                GLES20.glGenTextures(3, this.f84443c, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f84449i.l(f84439p[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    eh.b0.c(3553, this.f84443c[i10]);
                }
                eh.b0.e();
            } catch (eh.b0.b e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            ye.o andSet = this.f84447g.getAndSet(null);
            if (andSet == null && this.f84451k == null) {
                return;
            }
            if (andSet != null) {
                ye.o oVar = this.f84451k;
                if (oVar != null) {
                    oVar.l();
                }
                this.f84451k = andSet;
            }
            ye.o oVar2 = (ye.o) eh.a.g(this.f84451k);
            float[] fArr = f84436m;
            int i10 = oVar2.f159261m;
            if (i10 == 1) {
                fArr = f84435l;
            } else if (i10 == 3) {
                fArr = f84437n;
            }
            GLES20.glUniformMatrix3fv(this.f84450j, 1, false, fArr, 0);
            int[] iArr = (int[]) eh.a.g(oVar2.f159260l);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) eh.a.g(oVar2.f159259k);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? oVar2.f159257i : (oVar2.f159257i + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f84443c[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = oVar2.f159256h;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f84445e[i15] != iArr2[i15] || this.f84446f[i15] != iArr[i15]) {
                    eh.a.i(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f84448h[i15] = eh.b0.j(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f84444d[i15], 2, 5126, false, 0, (Buffer) this.f84448h[i15]);
                    this.f84445e[i15] = iArr2[i15];
                    this.f84446f[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                eh.b0.e();
            } catch (eh.b0.b e10) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                eh.z zVar = new eh.z("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f84449i = zVar;
                GLES20.glVertexAttribPointer(zVar.g("in_pos"), 2, 5126, false, 0, (Buffer) f84441r);
                this.f84444d[0] = this.f84449i.g("in_tc_y");
                this.f84444d[1] = this.f84449i.g("in_tc_u");
                this.f84444d[2] = this.f84449i.g("in_tc_v");
                this.f84450j = this.f84449i.l("mColorConversion");
                eh.b0.e();
                b();
                eh.b0.e();
            } catch (eh.b0.b e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    @Override // fh.k
    public void setOutputBuffer(ye.o oVar) {
        this.f84434b.a(oVar);
    }

    public j(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f84434b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
