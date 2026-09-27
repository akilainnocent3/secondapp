package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface StateSerializer<T> {
    @NonNull
    T defaultValue();

    @NonNull
    byte[] toByteArray(@NonNull T t10);

    @NonNull
    T toState(@NonNull byte[] bArr) throws IOException;
}
