package yads;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class vx0 {
    @k.t
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    @k.t
    public static void a(MediaDrm mediaDrm, byte[] bArr, ye2 ye2Var) {
        xe2 xe2Var = ye2Var.f158281a;
        xe2Var.getClass();
        LogSessionId logSessionId = xe2Var.f157827a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionId);
    }
}
