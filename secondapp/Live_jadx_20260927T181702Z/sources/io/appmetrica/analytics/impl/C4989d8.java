package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4989d8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4989d8[] f97179c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5092h8 f97181b;

    public C4989d8() {
        a();
    }

    public static C4989d8[] b() {
        if (f97179c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97179c == null) {
                        f97179c = new C4989d8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97179c;
    }

    public final C4989d8 a() {
        this.f97180a = WireFormatNano.EMPTY_BYTES;
        this.f97181b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f97180a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f97180a);
        }
        C5092h8 c5092h8 = this.f97181b;
        return c5092h8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5092h8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f97180a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f97180a);
        }
        C5092h8 c5092h8 = this.f97181b;
        if (c5092h8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5092h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4989d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97180a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f97181b == null) {
                    this.f97181b = new C5092h8();
                }
                codedInputByteBufferNano.readMessage(this.f97181b);
            }
        }
        return this;
    }

    public static C4989d8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4989d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4989d8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4989d8) MessageNano.mergeFrom(new C4989d8(), bArr);
    }
}
