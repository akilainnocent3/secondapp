package com.google.android.gms.cast.framework;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface OptionsProvider {
    @Nullable
    List<SessionProvider> getAdditionalSessionProviders(@NonNull Context context);

    @NonNull
    CastOptions getCastOptions(@NonNull Context context);
}
