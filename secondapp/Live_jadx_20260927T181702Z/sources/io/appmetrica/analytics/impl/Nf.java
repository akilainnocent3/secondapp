package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Nf implements ProtobufStateStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f96226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f96227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f96228d;

    public Nf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f96225a = str;
        this.f96226b = iBinaryDataHelper;
        this.f96227c = protobufStateSerializer;
        this.f96228d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f96226b.remove(this.f96225a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f96226b.get(this.f96225a);
            if (bArr != null && bArr.length != 0) {
                return this.f96228d.toModel((MessageNano) this.f96227c.toState(bArr));
            }
            return this.f96228d.toModel((MessageNano) this.f96227c.defaultValue());
        } catch (Throwable unused) {
            return this.f96228d.toModel((MessageNano) this.f96227c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f96226b.insert(this.f96225a, this.f96227c.toByteArray((MessageNano) this.f96228d.fromModel(obj)));
    }
}
