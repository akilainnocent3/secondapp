package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ki extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96063c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f96064d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96065e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f96066f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96067g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Ki[] f96068h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96070b;

    public Ki() {
        a();
    }

    public static Ki[] b() {
        if (f96068h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96068h == null) {
                        f96068h = new Ki[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96068h;
    }

    public final Ki a() {
        this.f96069a = 0;
        this.f96070b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f96069a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        int i11 = this.f96070b;
        return i11 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f96069a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        int i11 = this.f96070b;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f96069a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f96070b = int32;
                }
            }
        }
        return this;
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static Ki a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }
}
