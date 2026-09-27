package u4;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public interface x0 {
    EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws x4.x.a;

    y0 b(int i10, int i11, int i12) throws x4.x.a;

    EGLContext c(EGLDisplay eGLDisplay, @k.e0(from = 2, to = 3) int i10, int[] iArr) throws x4.x.a;

    EGLSurface d(EGLContext eGLContext, EGLDisplay eGLDisplay) throws x4.x.a;

    void e(EGLDisplay eGLDisplay) throws x4.x.a;
}
