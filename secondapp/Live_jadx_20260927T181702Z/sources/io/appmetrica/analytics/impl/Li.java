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
public final class Li extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Li[] f96113d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f96114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ki f96115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ji f96116c;

    public Li() {
        a();
    }

    public static Li[] b() {
        if (f96113d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96113d == null) {
                        f96113d = new Li[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96113d;
    }

    public final Li a() {
        this.f96114a = false;
        this.f96115b = null;
        this.f96116c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f96114a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Ki ki2 = this.f96115b;
        if (ki2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ki2);
        }
        Ji ji2 = this.f96116c;
        return ji2 != null ? CodedOutputByteBufferNano.computeMessageSize(3, ji2) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f96114a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Ki ki2 = this.f96115b;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ki2);
        }
        Ji ji2 = this.f96116c;
        if (ji2 != null) {
            codedOutputByteBufferNano.writeMessage(3, ji2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f96114a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f96115b == null) {
                    this.f96115b = new Ki();
                }
                codedInputByteBufferNano.readMessage(this.f96115b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f96116c == null) {
                    this.f96116c = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f96116c);
            }
        }
        return this;
    }

    public static Li b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Li().mergeFrom(codedInputByteBufferNano);
    }

    public static Li a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Li) MessageNano.mergeFrom(new Li(), bArr);
    }
}
