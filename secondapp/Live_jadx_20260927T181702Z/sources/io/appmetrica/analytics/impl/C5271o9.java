package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5271o9 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5271o9[] f98030b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f98031a;

    public C5271o9() {
        a();
    }

    public static C5271o9[] b() {
        if (f98030b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98030b == null) {
                        f98030b = new C5271o9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98030b;
    }

    public final C5271o9 a() {
        this.f98031a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f98031a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f98031a) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f98031a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f98031a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5271o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f98031a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C5271o9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5271o9) MessageNano.mergeFrom(new C5271o9(), bArr);
    }

    public static C5271o9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5271o9().mergeFrom(codedInputByteBufferNano);
    }
}
