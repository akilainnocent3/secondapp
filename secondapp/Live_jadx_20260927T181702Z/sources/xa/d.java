package xa;

import android.content.Context;
import androidx.annotation.Nullable;
import gb.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d implements c {
    @Override // xa.c
    public b a(@Nullable Context context) {
        return (context == null || z.f(context) != 0.0f) ? b.STANDARD_MOTION : b.REDUCED_MOTION;
    }
}
