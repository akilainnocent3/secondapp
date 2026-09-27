package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5195l8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5195l8[] f97799c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f97801b;

    public C5195l8() {
        a();
    }

    public static C5195l8[] b() {
        if (f97799c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97799c == null) {
                        f97799c = new C5195l8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97799c;
    }

    public final C5195l8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f97800a = bArr;
        this.f97801b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f97800a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f97800a);
        }
        return !Arrays.equals(this.f97801b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f97801b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f97800a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f97800a);
        }
        if (!Arrays.equals(this.f97801b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f97801b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5195l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97800a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97801b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5195l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5195l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5195l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5195l8) MessageNano.mergeFrom(new C5195l8(), bArr);
    }
}
