package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gyd0 {
    public static final ImageDecoder.Source a(nbn nbnVar, u2z u2zVar, boolean z) {
        cxz cxzVarU1;
        if (nbnVar.getFileSystem() == blh.SYSTEM && (cxzVarU1 = nbnVar.u1()) != null) {
            return ImageDecoder.createSource(cxzVarU1.toFile());
        }
        nbn.a aVarP = nbnVar.p();
        if (aVarP instanceof py0) {
            return ImageDecoder.createSource(u2zVar.a.getAssets(), ((py0) aVarP).a);
        }
        if ((aVarP instanceof wza) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((wza) aVarP).a;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: fyd0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return assetFileDescriptor;
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (aVarP instanceof lh50) {
            lh50 lh50Var = (lh50) aVarP;
            if (Intrinsics.g(lh50Var.a, u2zVar.a.getPackageName())) {
                return ImageDecoder.createSource(u2zVar.a.getResources(), lh50Var.b);
            }
        }
        if (!(aVarP instanceof dl5)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((dl5) aVarP).a.isDirect()) {
            return ImageDecoder.createSource(((dl5) aVarP).a);
        }
        return null;
    }
}
