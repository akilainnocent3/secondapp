package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5343r7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5319q7 f98223a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5343r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @oy.l
    public final byte[] a(@oy.l C5368s7 c5368s7) {
        return MessageNano.toByteArray(this.f98223a.fromModel(c5368s7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f98223a.fromModel((C5368s7) obj));
    }

    public C5343r7(@oy.l C5319q7 c5319q7) {
        this.f98223a = c5319q7;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5368s7 toModel(@oy.m byte[] bArr) {
        C5294p7 c5294p7;
        if (bArr != null) {
            try {
                c5294p7 = (C5294p7) MessageNano.mergeFrom(new C5294p7(), bArr);
                if (c5294p7 == null) {
                    c5294p7 = new C5294p7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                c5294p7 = new C5294p7();
            }
        } else {
            c5294p7 = new C5294p7();
        }
        return this.f98223a.toModel(c5294p7);
    }

    public /* synthetic */ C5343r7(C5319q7 c5319q7, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new C5319q7(null, 1, null) : c5319q7);
    }
}
