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
public final class T5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile T5[] f96497d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S5 f96498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96500c;

    public T5() {
        a();
    }

    public static T5[] b() {
        if (f96497d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f96497d == null) {
                        f96497d = new T5[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f96497d;
    }

    public final T5 a() {
        this.f96498a = null;
        this.f96499b = "";
        this.f96500c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        S5 s10 = this.f96498a;
        if (s10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s10);
        }
        if (!this.f96499b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f96499b);
        }
        int i10 = this.f96500c;
        return i10 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        S5 s10 = this.f96498a;
        if (s10 != null) {
            codedOutputByteBufferNano.writeMessage(1, s10);
        }
        if (!this.f96499b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f96499b);
        }
        int i10 = this.f96500c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f96498a == null) {
                    this.f96498a = new S5();
                }
                codedInputByteBufferNano.readMessage(this.f96498a);
            } else if (tag == 18) {
                this.f96499b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f96500c = int32;
                }
            }
        }
        return this;
    }

    public static T5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T5().mergeFrom(codedInputByteBufferNano);
    }

    public static T5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T5) MessageNano.mergeFrom(new T5(), bArr);
    }
}
