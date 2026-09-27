package q9;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f122046a = "StartupLogger";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f122047b = false;

    public static void a(@NonNull String str, @Nullable Throwable th2) {
        Log.e(f122046a, str, th2);
    }

    public static void b(@NonNull String str) {
        Log.i(f122046a, str);
    }

    public static void c(@NonNull String str) {
        Log.w(f122046a, str);
    }
}
