package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile t[] f95057c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f95058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f95059b;

    public t() {
        a();
    }

    public static t[] b() {
        if (f95057c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95057c == null) {
                        f95057c = new t[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95057c;
    }

    public final t a() {
        this.f95058a = true;
        this.f95059b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f95058a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        s sVar = this.f95059b;
        return sVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, sVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f95058a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        s sVar = this.f95059b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f95058a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f95059b == null) {
                    this.f95059b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f95059b);
            }
        }
        return this;
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
