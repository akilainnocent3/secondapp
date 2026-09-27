package u1;

import android.os.Environment;
import androidx.annotation.NonNull;
import java.io.File;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f137541a = "unknown";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @k.t
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @NonNull
    public static String a(@NonNull File file) {
        return a.a(file);
    }
}
