package yads;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class tk0 {
    @k.t
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    @k.t
    public static boolean b(@Nullable Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
