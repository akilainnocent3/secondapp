package defpackage;

import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fsh0 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jG;
        ere.a aVar = new ere.a();
        cxz cxzVarE = blh.SYSTEM_TEMPORARY_DIRECTORY.e("coil3_disk_cache");
        double d = aVar.b;
        if (d > 0.0d) {
            try {
                File file = cxzVarE.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                jG = f.g((long) (d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), aVar.c, aVar.d);
            } catch (Exception unused) {
                jG = aVar.c;
            }
        } else {
            jG = 0;
        }
        return new z740(jG, aVar.a, cxzVarE, aVar.e);
    }
}
