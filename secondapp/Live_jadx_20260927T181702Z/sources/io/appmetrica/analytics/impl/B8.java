package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class B8 extends C8 implements ProtobufStateSerializer {
    public B8(@NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull AESEncrypter aESEncrypter) {
        super(protobufStateSerializer, aESEncrypter);
    }
}
