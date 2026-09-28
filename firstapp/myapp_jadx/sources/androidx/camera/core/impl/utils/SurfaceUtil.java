package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceUtil {

    public static class a {
        public int a;
        public int b;
        public int c;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.a = 0;
        aVar.b = 0;
        aVar.c = 0;
        aVar.a = iArrNativeGetSurfaceInfo[0];
        aVar.b = iArrNativeGetSurfaceInfo[1];
        aVar.c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
