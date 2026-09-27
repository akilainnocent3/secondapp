package eh;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final y f81258a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements y {
        @Override // eh.y
        @k.t0(17)
        public EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws b0.b {
            return b0.n(eGLDisplay, obj, i10, z10);
        }

        @Override // eh.y
        public a0 b(int i10, int i11, int i12) throws b0.b {
            return new a0(i10, b0.p(i10), -1, i11, i12);
        }

        @Override // eh.y
        @k.t0(17)
        public EGLContext c(EGLDisplay eGLDisplay, int i10, int[] iArr) throws b0.b {
            return b0.k(EGL14.EGL_NO_CONTEXT, eGLDisplay, i10, iArr);
        }

        @Override // eh.y
        @k.t0(17)
        public EGLSurface d(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws b0.b {
            return b0.q(eGLContext, eGLDisplay, iArr);
        }
    }

    @k.t0(17)
    EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws b0.b;

    a0 b(int i10, int i11, int i12) throws b0.b;

    @k.t0(17)
    EGLContext c(EGLDisplay eGLDisplay, @k.e0(from = 2, to = 3) int i10, int[] iArr) throws b0.b;

    @k.t0(17)
    EGLSurface d(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws b0.b;
}
