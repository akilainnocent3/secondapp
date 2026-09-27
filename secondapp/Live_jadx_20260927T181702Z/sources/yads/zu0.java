package yads;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zu0 {
    /* JADX INFO: Access modifiers changed from: private */
    @k.t
    public static boolean a(@Nullable Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
