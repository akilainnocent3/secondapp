package yads;

import android.media.MediaDrm;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class uk0 {
    @k.t
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    @k.t
    public static int b(Throwable th2) {
        int iA = ib3.a(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        if (iA == 2 || iA == 4) {
            return 6005;
        }
        if (iA == 10) {
            return 6004;
        }
        if (iA == 7) {
            return 6005;
        }
        if (iA == 8) {
            return 6003;
        }
        switch (iA) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (iA) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }
}
