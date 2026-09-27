package vh;

import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l {
    @Nullable
    public static m a() {
        int i10 = Build.VERSION.SDK_INT;
        if (30 <= i10 && i10 <= 33) {
            return w.c();
        }
        if (i10 >= 34) {
            return w.c();
        }
        return null;
    }
}
