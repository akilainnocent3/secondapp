package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class y extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95080f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95081g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f95082h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile y[] f95083i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f95084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f95085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f95087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f95088e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f95083i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95083i == null) {
                        f95083i = new y[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95083i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f95084a = bArr;
        this.f95085b = 0L;
        this.f95086c = 0;
        this.f95087d = bArr;
        this.f95088e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f95084a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95084a);
        }
        long j10 = this.f95085b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f95086c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f95087d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f95087d);
        }
        long j11 = this.f95088e;
        return j11 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f95084a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95084a);
        }
        long j10 = this.f95085b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f95086c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f95087d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f95087d);
        }
        long j11 = this.f95088e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f95084a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f95085b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f95086c = int32;
                }
            } else if (tag == 34) {
                this.f95087d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95088e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
