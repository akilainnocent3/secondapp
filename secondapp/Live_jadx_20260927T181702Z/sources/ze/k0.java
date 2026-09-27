package ze;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f161010a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f161011b = "PlaybackDurationRemaining";

    public static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    @Nullable
    public static Pair<Long, Long> b(com.google.android.exoplayer2.drm.d dVar) {
        Map<String, String> mapQueryKeyStatus = dVar.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapQueryKeyStatus, "LicenseDurationRemaining")), Long.valueOf(a(mapQueryKeyStatus, "PlaybackDurationRemaining")));
    }
}
