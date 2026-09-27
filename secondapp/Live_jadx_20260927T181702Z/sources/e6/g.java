package e6;

import android.opengl.GLES20;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import x4.d0;
import x4.u;
import x4.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f80400j = "ProjectionRenderer";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f80401k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f80402l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f80403m = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f80404n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float[] f80405o = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float[] f80406p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float[] f80407q = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f80409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f80410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f80411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f80415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80416i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f80418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f80419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f80420d;

        public a(e.c cVar) {
            this.f80417a = cVar.a();
            this.f80418b = x.k(cVar.f80389c);
            this.f80419c = x.k(cVar.f80390d);
            int i10 = cVar.f80388b;
            if (i10 == 1) {
                this.f80420d = 5;
            } else if (i10 != 2) {
                this.f80420d = 4;
            } else {
                this.f80420d = 6;
            }
        }
    }

    public static boolean c(e eVar) {
        e.b bVar = eVar.f80381a;
        e.b bVar2 = eVar.f80382b;
        return bVar.b() == 1 && bVar.a(0).f80387a == 0 && bVar2.b() == 1 && bVar2.a(0).f80387a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f80410c : this.f80409b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f80408a;
        if (i11 == 1) {
            fArr2 = z10 ? f80405o : f80404n;
        } else if (i11 == 2) {
            fArr2 = z10 ? f80407q : f80406p;
        } else {
            fArr2 = f80403m;
        }
        GLES20.glUniformMatrix3fv(this.f80413f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f80412e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f80416i, 0);
        try {
            x.f();
        } catch (x.a e10) {
            d0.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f80414g, 3, 5126, false, 12, (Buffer) aVar.f80418b);
        try {
            x.f();
        } catch (x.a e11) {
            d0.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f80415h, 2, 5126, false, 8, (Buffer) aVar.f80419c);
        try {
            x.f();
        } catch (x.a e12) {
            d0.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f80420d, 0, aVar.f80417a);
        try {
            x.f();
        } catch (x.a e13) {
            d0.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            u uVar = new u("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f80411d = uVar;
            this.f80412e = uVar.l("uMvpMatrix");
            this.f80413f = this.f80411d.l("uTexMatrix");
            this.f80414g = this.f80411d.g("aPosition");
            this.f80415h = this.f80411d.g("aTexCoords");
            this.f80416i = this.f80411d.l("uTexture");
        } catch (x.a e10) {
            d0.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f80408a = eVar.f80383c;
            a aVar = new a(eVar.f80381a.a(0));
            this.f80409b = aVar;
            if (!eVar.f80384d) {
                aVar = new a(eVar.f80382b.a(0));
            }
            this.f80410c = aVar;
        }
    }

    public void e() {
        u uVar = this.f80411d;
        if (uVar != null) {
            try {
                uVar.f();
            } catch (x.a e10) {
                d0.e("ProjectionRenderer", "Failed to delete the shader program", e10);
            }
        }
    }
}
