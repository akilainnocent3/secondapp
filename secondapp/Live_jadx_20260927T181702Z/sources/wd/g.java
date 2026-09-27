package wd;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements e.b {
    @Override // wd.e.b
    public String a(String mappedLibraryName) {
        return mappedLibraryName.substring(3, mappedLibraryName.length() - 3);
    }

    @Override // wd.e.b
    public String[] b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !h.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // wd.e.b
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void c(final String libraryPath) {
        System.load(libraryPath);
    }

    @Override // wd.e.b
    public void d(final String libraryName) {
        System.loadLibrary(libraryName);
    }

    @Override // wd.e.b
    public String e(final String libraryName) {
        return (libraryName.startsWith(f.f142832g) && libraryName.endsWith(".so")) ? libraryName : System.mapLibraryName(libraryName);
    }
}
