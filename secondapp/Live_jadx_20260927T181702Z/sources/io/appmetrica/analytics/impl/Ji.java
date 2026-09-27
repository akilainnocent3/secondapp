package io.appmetrica.analytics.impl;

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
public final class Ji extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Ji[] f96024e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ki f96026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f96028d;

    public Ji() {
        a();
    }

    public static Ji[] b() {
        if (f96024e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96024e == null) {
                        f96024e = new Ji[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96024e;
    }

    public final Ji a() {
        this.f96025a = 0L;
        this.f96026b = null;
        this.f96027c = 0;
        this.f96028d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f96025a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        Ki ki2 = this.f96026b;
        if (ki2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ki2);
        }
        int i10 = this.f96027c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i10);
        }
        return !Arrays.equals(this.f96028d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f96028d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f96025a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        Ki ki2 = this.f96026b;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ki2);
        }
        int i10 = this.f96027c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i10);
        }
        if (!Arrays.equals(this.f96028d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f96028d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ji mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f96025a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f96026b == null) {
                    this.f96026b = new Ki();
                }
                codedInputByteBufferNano.readMessage(this.f96026b);
            } else if (tag == 24) {
                this.f96027c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96028d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ji b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ji().mergeFrom(codedInputByteBufferNano);
    }

    public static Ji a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ji) MessageNano.mergeFrom(new Ji(), bArr);
    }
}
