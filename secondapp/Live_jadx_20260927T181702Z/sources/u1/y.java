package u1;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class y extends RuntimeException {
    public y() {
        this(null);
    }

    public y(@Nullable String str) {
        super(e2.s.f(str, "The operation has been canceled."));
    }
}
