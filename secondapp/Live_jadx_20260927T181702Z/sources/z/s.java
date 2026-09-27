package z;

import android.os.Bundle;
import androidx.annotation.NonNull;
import k.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface s {
    void onGreatestScrollPercentageIncreased(@e0(from = 1, to = 100) int i10, @NonNull Bundle bundle);

    void onSessionEnded(boolean z10, @NonNull Bundle bundle);

    void onVerticalScrollEvent(boolean z10, @NonNull Bundle bundle);
}
