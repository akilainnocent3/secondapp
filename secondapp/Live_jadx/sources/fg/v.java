package fg;

import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v extends IOException {
    public v(@Nullable String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + fe.F);
    }
}
