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
public final class V5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile V5[] f96598c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f96599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z5 f96600b;

    public V5() {
        a();
    }

    public static V5[] b() {
        if (f96598c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96598c == null) {
                        f96598c = new V5[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96598c;
    }

    public final V5 a() {
        this.f96599a = WireFormatNano.EMPTY_BYTES;
        this.f96600b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f96599a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f96599a);
        }
        Z5 z10 = this.f96600b;
        return z10 != null ? CodedOutputByteBufferNano.computeMessageSize(2, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f96599a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f96599a);
        }
        Z5 z10 = this.f96600b;
        if (z10 != null) {
            codedOutputByteBufferNano.writeMessage(2, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96599a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f96600b == null) {
                    this.f96600b = new Z5();
                }
                codedInputByteBufferNano.readMessage(this.f96600b);
            }
        }
        return this;
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    public static V5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }
}
