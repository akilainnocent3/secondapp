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
public final class u extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile u[] f95060c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f95061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f95062b;

    public u() {
        a();
    }

    public static u[] b() {
        if (f95060c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95060c == null) {
                        f95060c = new u[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95060c;
    }

    public final u a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f95061a = bArr;
        this.f95062b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f95061a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95061a);
        }
        return !Arrays.equals(this.f95062b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f95062b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f95061a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95061a);
        }
        if (!Arrays.equals(this.f95062b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f95062b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f95061a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95062b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static u b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new u().mergeFrom(codedInputByteBufferNano);
    }

    public static u a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (u) MessageNano.mergeFrom(new u(), bArr);
    }
}
