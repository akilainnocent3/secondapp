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
public final class U5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile U5[] f96555c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f96556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f96557b;

    public U5() {
        a();
    }

    public static U5[] b() {
        if (f96555c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96555c == null) {
                        f96555c = new U5[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96555c;
    }

    public final U5 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f96556a = bArr;
        this.f96557b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f96556a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f96556a);
        }
        return !Arrays.equals(this.f96557b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f96557b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f96556a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f96556a);
        }
        if (!Arrays.equals(this.f96557b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f96557b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96556a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96557b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static U5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new U5().mergeFrom(codedInputByteBufferNano);
    }

    public static U5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (U5) MessageNano.mergeFrom(new U5(), bArr);
    }
}
