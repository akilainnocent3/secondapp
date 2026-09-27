package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class w extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95068c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95069d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95070e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95071f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95072g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile w[] f95073h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95075b;

    public w() {
        a();
    }

    public static w[] b() {
        if (f95073h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95073h == null) {
                        f95073h = new w[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95073h;
    }

    public final w a() {
        this.f95074a = 0;
        this.f95075b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f95074a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f95075b;
        return i11 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f95074a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f95075b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f95074a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f95075b = int32;
                }
            }
        }
        return this;
    }

    public static w b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new w().mergeFrom(codedInputByteBufferNano);
    }

    public static w a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (w) MessageNano.mergeFrom(new w(), bArr);
    }
}
