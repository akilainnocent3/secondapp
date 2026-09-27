package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4990d9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4990d9[] f97182c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f97184b;

    public C4990d9() {
        a();
    }

    public static C4990d9[] b() {
        if (f97182c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97182c == null) {
                        f97182c = new C4990d9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97182c;
    }

    public final C4990d9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f97183a = bArr;
        this.f97184b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f97183a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f97183a);
        }
        return !Arrays.equals(this.f97184b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f97184b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f97183a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f97183a);
        }
        if (!Arrays.equals(this.f97184b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f97184b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4990d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97183a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97184b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C4990d9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4990d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4990d9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4990d9) MessageNano.mergeFrom(new C4990d9(), bArr);
    }
}
