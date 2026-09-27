package i1;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class a {
        @t
        public static CursorWindow a(String str, long j10) {
            return new CursorWindow(str, j10);
        }
    }

    @NonNull
    public static CursorWindow a(@Nullable String str, long j10) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(str, j10) : new CursorWindow(str);
    }
}
