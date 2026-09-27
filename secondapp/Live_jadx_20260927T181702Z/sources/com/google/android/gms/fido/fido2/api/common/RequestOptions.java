package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    @Nullable
    public abstract AuthenticationExtensions getAuthenticationExtensions();

    @NonNull
    public abstract byte[] getChallenge();

    @Nullable
    public abstract Integer getRequestId();

    @Nullable
    public abstract Double getTimeoutSeconds();

    @Nullable
    public abstract TokenBinding getTokenBinding();

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }
}
