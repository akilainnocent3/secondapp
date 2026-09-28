package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.sporty.android.permission.location.KN.qUnCRF;
import defpackage.m3i0;
import defpackage.n3i0;
import defpackage.pzk;
import defpackage.qzk;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements n3i0 {
    public static final /* synthetic */ int b = 0;
    public final a a;

    public static final class a implements GLSurfaceView.Renderer {
        public final VideoDecoderGLSurfaceView a;
        public final int[] b = new int[3];
        public final int[] c = new int[3];
        public final int[] d = new int[3];
        public final int[] e = new int[3];
        public final AtomicReference<m3i0> f = new AtomicReference<>();
        public pzk i;
        public int v;
        public m3i0 w;
        public static final float[] y = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] z = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer A = qzk.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public a(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
            this.a = videoDecoderGLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.d;
                this.e[i] = -1;
                iArr[i] = -1;
            }
        }

        public final void a() {
            int[] iArr = this.b;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i = 0; i < 3; i++) {
                    pzk pzkVar = this.i;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(pzkVar.a, z[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    qzk.a(3553, iArr[i]);
                }
                qzk.b();
            } catch (qzk.a e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            m3i0 andSet = this.f.getAndSet(null);
            if (andSet == null && this.w == null) {
                return;
            }
            if (andSet != null) {
                if (this.w != null) {
                    throw null;
                }
                this.w = andSet;
            }
            this.w.getClass();
            GLES20.glUniformMatrix3fv(this.v, 1, false, y, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.c;
            try {
                pzk pzkVar = new pzk("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.i = pzkVar;
                GLES20.glVertexAttribPointer(pzkVar.b("in_pos"), 2, 5126, false, 0, (Buffer) A);
                iArr[0] = this.i.b("in_tc_y");
                iArr[1] = this.i.b("in_tc_u");
                iArr[2] = this.i.b("in_tc_v");
                this.v = GLES20.glGetUniformLocation(this.i.a, "mColorConversion");
                qzk.b();
                a();
                qzk.b();
            } catch (qzk.a e) {
                Log.e(qUnCRF.vee, "Failed to set up the textures and program", e);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(m3i0 m3i0Var) {
        a aVar = this.a;
        if (aVar.f.getAndSet(m3i0Var) != null) {
            throw null;
        }
        aVar.a.requestRender();
    }

    @Deprecated
    public n3i0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }
}
