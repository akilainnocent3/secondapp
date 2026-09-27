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
public final class X5 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile X5[] f96724b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f96725a;

    public X5() {
        a();
    }

    public static X5[] b() {
        if (f96724b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96724b == null) {
                        f96724b = new X5[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96724b;
    }

    public final X5 a() {
        this.f96725a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f96725a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f96725a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f96725a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static X5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X5) MessageNano.mergeFrom(new X5(), bArr);
    }

    public static X5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X5().mergeFrom(codedInputByteBufferNano);
    }
}
