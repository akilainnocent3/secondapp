package gh;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import eh.b0;
import eh.z;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f86658j = "ProjectionRenderer";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f86659k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f86660l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f86661m = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f86662n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float[] f86663o = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float[] f86664p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float[] f86665q = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f86667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f86668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f86669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86674i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f86676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f86677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f86678d;

        public a(e.c cVar) {
            this.f86675a = cVar.a();
            this.f86676b = b0.j(cVar.f86647c);
            this.f86677c = b0.j(cVar.f86648d);
            int i10 = cVar.f86646b;
            if (i10 == 1) {
                this.f86678d = 5;
            } else if (i10 != 2) {
                this.f86678d = 4;
            } else {
                this.f86678d = 6;
            }
        }
    }

    public static boolean c(e eVar) {
        e.b bVar = eVar.f86639a;
        e.b bVar2 = eVar.f86640b;
        return bVar.b() == 1 && bVar.a(0).f86645a == 0 && bVar2.b() == 1 && bVar2.a(0).f86645a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f86668c : this.f86667b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f86666a;
        if (i11 == 1) {
            fArr2 = z10 ? f86663o : f86662n;
        } else if (i11 == 2) {
            fArr2 = z10 ? f86665q : f86664p;
        } else {
            fArr2 = f86661m;
        }
        GLES20.glUniformMatrix3fv(this.f86671f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f86670e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f86674i, 0);
        try {
            b0.e();
        } catch (b0.b e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f86672g, 3, 5126, false, 12, (Buffer) aVar.f86676b);
        try {
            b0.e();
        } catch (b0.b e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f86673h, 2, 5126, false, 8, (Buffer) aVar.f86677c);
        try {
            b0.e();
        } catch (b0.b e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f86678d, 0, aVar.f86675a);
        try {
            b0.e();
        } catch (b0.b e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            z zVar = new z("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f86669d = zVar;
            this.f86670e = zVar.l("uMvpMatrix");
            this.f86671f = this.f86669d.l("uTexMatrix");
            this.f86672g = this.f86669d.g("aPosition");
            this.f86673h = this.f86669d.g("aTexCoords");
            this.f86674i = this.f86669d.l("uTexture");
        } catch (b0.b e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f86666a = eVar.f86641c;
            a aVar = new a(eVar.f86639a.a(0));
            this.f86667b = aVar;
            if (!eVar.f86642d) {
                aVar = new a(eVar.f86640b.a(0));
            }
            this.f86668c = aVar;
        }
    }

    public void e() {
        z zVar = this.f86669d;
        if (zVar != null) {
            try {
                zVar.f();
            } catch (b0.b e10) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", e10);
            }
        }
    }
}
