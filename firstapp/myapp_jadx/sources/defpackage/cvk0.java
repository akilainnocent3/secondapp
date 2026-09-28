package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;
import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes4.dex */
public final class cvk0 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith(OdQr.OIobVnrxfBA)) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
