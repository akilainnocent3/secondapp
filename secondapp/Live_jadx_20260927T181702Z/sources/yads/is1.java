package yads;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class is1 {
    public static long a(Context context, long j10, long j11) {
        long availableBlocks;
        long jC = ms.u.C(j10, j11);
        try {
            StatFs statFs = new StatFs(ug0.a(context, "").getAbsolutePath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException unused) {
            boolean z10 = ad1.f146762a;
            availableBlocks = jC;
        }
        long j12 = 100;
        return ms.u.v(ms.u.C((((long) 2) * availableBlocks) / j12, j11), ms.u.C(jC, (availableBlocks * ((long) 50)) / j12));
    }
}
