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
public final class Mk extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Mk[] f96183c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f96184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f96185b;

    public Mk() {
        a();
    }

    public static Mk[] b() {
        if (f96183c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96183c == null) {
                        f96183c = new Mk[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96183c;
    }

    public final Mk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f96184a = bArr;
        this.f96185b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f96184a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f96184a);
        }
        return !Arrays.equals(this.f96185b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f96185b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f96184a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f96184a);
        }
        if (!Arrays.equals(this.f96185b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f96185b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96184a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96185b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Mk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mk().mergeFrom(codedInputByteBufferNano);
    }

    public static Mk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mk) MessageNano.mergeFrom(new Mk(), bArr);
    }
}
