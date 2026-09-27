package s9;

import android.os.Trace;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(29)
public final class e {
    public static void a(@NonNull String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@NonNull String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static void c(@NonNull String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
