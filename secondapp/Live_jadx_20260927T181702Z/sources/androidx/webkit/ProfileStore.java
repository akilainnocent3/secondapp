package androidx.webkit;

import aa.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@g1
public interface ProfileStore {
    boolean deleteProfile(@NonNull String str);

    @NonNull
    List<String> getAllProfileNames();

    @NonNull
    d getOrCreateProfile(@NonNull String str);

    @Nullable
    d getProfile(@NonNull String str);
}
