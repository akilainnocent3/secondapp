package u1;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f137567a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f137568b = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(22)
    public static class a {
        @k.t
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @k.t
        public static void b(Message message, boolean z10) {
            message.setAsynchronous(z10);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@NonNull Message message) {
        return a.a(message);
    }

    @SuppressLint({"NewApi"})
    public static void b(@NonNull Message message, boolean z10) {
        a.b(message, z10);
    }
}
