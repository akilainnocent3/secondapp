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
public final class X1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile X1[] f96718c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f96719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f96720b;

    public X1() {
        a();
    }

    public static X1[] b() {
        if (f96718c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96718c == null) {
                        f96718c = new X1[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96718c;
    }

    public final X1 a() {
        this.f96719a = "";
        this.f96720b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f96720b) + CodedOutputByteBufferNano.computeStringSize(1, this.f96719a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f96719a);
        codedOutputByteBufferNano.writeBool(2, this.f96720b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f96719a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f96720b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static X1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X1().mergeFrom(codedInputByteBufferNano);
    }

    public static X1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X1) MessageNano.mergeFrom(new X1(), bArr);
    }
}
