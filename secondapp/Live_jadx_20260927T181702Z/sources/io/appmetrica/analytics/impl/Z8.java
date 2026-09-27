package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Z8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Z8[] f96865c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f96866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96867b;

    public Z8() {
        a();
    }

    public static Z8[] b() {
        if (f96865c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96865c == null) {
                        f96865c = new Z8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96865c;
    }

    public final Z8 a() {
        this.f96866a = "";
        this.f96867b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f96867b) + CodedOutputByteBufferNano.computeStringSize(1, this.f96866a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f96866a);
        codedOutputByteBufferNano.writeString(2, this.f96867b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96866a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96867b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z8().mergeFrom(codedInputByteBufferNano);
    }

    public static Z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z8) MessageNano.mergeFrom(new Z8(), bArr);
    }
}
