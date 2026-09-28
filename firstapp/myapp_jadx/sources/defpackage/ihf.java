package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ihf {
    public final a a;

    public interface a {
        Set<dhf> a();

        DynamicRangeProfiles b();

        Set<dhf> c(dhf dhfVar);
    }

    public ihf(a aVar) {
        this.a = aVar;
    }

    public static ihf a(e16 e16Var) {
        DynamicRangeProfiles dynamicRangeProfilesA;
        int i = Build.VERSION.SDK_INT;
        ihf ihfVar = null;
        if (i >= 33 && (dynamicRangeProfilesA = bch.a(e16Var.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            km20.g("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            ihfVar = new ihf(new jhf(dynamicRangeProfilesA));
        }
        return ihfVar == null ? khf.a : ihfVar;
    }
}
