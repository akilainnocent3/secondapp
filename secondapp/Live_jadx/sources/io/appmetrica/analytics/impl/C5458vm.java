package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5458vm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5458vm[] f98492b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98493a;

    public C5458vm() {
        a();
    }

    public static C5458vm[] b() {
        if (f98492b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98492b == null) {
                        f98492b = new C5458vm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98492b;
    }

    public final C5458vm a() {
        this.f98493a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f98493a;
        return i10 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f98493a;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5458vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f98493a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5458vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5458vm) MessageNano.mergeFrom(new C5458vm(), bArr);
    }

    public static C5458vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5458vm().mergeFrom(codedInputByteBufferNano);
    }
}
