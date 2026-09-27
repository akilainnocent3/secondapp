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
public final class Ii extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Ii[] f95946c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f95947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f95948b;

    public Ii() {
        a();
    }

    public static Ii[] b() {
        if (f95946c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95946c == null) {
                        f95946c = new Ii[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95946c;
    }

    public final Ii a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f95947a = bArr;
        this.f95948b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f95947a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95947a);
        }
        return !Arrays.equals(this.f95948b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f95948b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f95947a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95947a);
        }
        if (!Arrays.equals(this.f95948b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f95948b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f95947a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95948b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ii b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static Ii a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ii) MessageNano.mergeFrom(new Ii(), bArr);
    }
}
