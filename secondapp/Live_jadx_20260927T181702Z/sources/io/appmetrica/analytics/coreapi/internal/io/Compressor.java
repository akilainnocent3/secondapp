package io.appmetrica.analytics.coreapi.internal.io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface Compressor {
    @Nullable
    byte[] compress(@NonNull byte[] bArr) throws IOException;

    @Nullable
    byte[] uncompress(@NonNull byte[] bArr) throws IOException;
}
