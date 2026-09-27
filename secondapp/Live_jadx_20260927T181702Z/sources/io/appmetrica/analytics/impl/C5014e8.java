package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5014e8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5014e8[] f97263b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5040f8 f97264a;

    public C5014e8() {
        a();
    }

    public static C5014e8[] b() {
        if (f97263b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97263b == null) {
                        f97263b = new C5014e8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97263b;
    }

    public final C5014e8 a() {
        this.f97264a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5040f8 c5040f8 = this.f97264a;
        return c5040f8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5040f8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5040f8 c5040f8 = this.f97264a;
        if (c5040f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5040f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5014e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f97264a == null) {
                    this.f97264a = new C5040f8();
                }
                codedInputByteBufferNano.readMessage(this.f97264a);
            }
        }
        return this;
    }

    public static C5014e8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5014e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5014e8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5014e8) MessageNano.mergeFrom(new C5014e8(), bArr);
    }
}
