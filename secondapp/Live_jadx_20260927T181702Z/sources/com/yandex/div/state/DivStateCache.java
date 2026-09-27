package com.yandex.div.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivStateCache {
    @k.d
    void clear();

    @Nullable
    @k.d
    String getRootState(@NonNull String str);

    @Nullable
    @k.d
    String getState(@NonNull String str, @NonNull String str2);

    @k.d
    void putRootState(@NonNull String str, @NonNull String str2);

    @k.d
    void putState(@NonNull String str, @NonNull String str2, @NonNull String str3);

    @k.d
    void resetCard(@NonNull String str);
}
