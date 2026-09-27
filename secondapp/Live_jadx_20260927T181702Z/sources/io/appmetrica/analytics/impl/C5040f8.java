package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5040f8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5040f8[] f97330e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5270o8 f97331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5320q8 f97332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5092h8 f97333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5245n8 f97334d;

    public C5040f8() {
        a();
    }

    public static C5040f8[] b() {
        if (f97330e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97330e == null) {
                        f97330e = new C5040f8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97330e;
    }

    public final C5040f8 a() {
        this.f97331a = null;
        this.f97332b = null;
        this.f97333c = null;
        this.f97334d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5270o8 c5270o8 = this.f97331a;
        if (c5270o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5270o8);
        }
        C5320q8 c5320q8 = this.f97332b;
        if (c5320q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5320q8);
        }
        C5092h8 c5092h8 = this.f97333c;
        if (c5092h8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5092h8);
        }
        C5245n8 c5245n8 = this.f97334d;
        return c5245n8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5245n8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5270o8 c5270o8 = this.f97331a;
        if (c5270o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5270o8);
        }
        C5320q8 c5320q8 = this.f97332b;
        if (c5320q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5320q8);
        }
        C5092h8 c5092h8 = this.f97333c;
        if (c5092h8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5092h8);
        }
        C5245n8 c5245n8 = this.f97334d;
        if (c5245n8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5245n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5040f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f97331a == null) {
                    this.f97331a = new C5270o8();
                }
                codedInputByteBufferNano.readMessage(this.f97331a);
            } else if (tag == 18) {
                if (this.f97332b == null) {
                    this.f97332b = new C5320q8();
                }
                codedInputByteBufferNano.readMessage(this.f97332b);
            } else if (tag == 26) {
                if (this.f97333c == null) {
                    this.f97333c = new C5092h8();
                }
                codedInputByteBufferNano.readMessage(this.f97333c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f97334d == null) {
                    this.f97334d = new C5245n8();
                }
                codedInputByteBufferNano.readMessage(this.f97334d);
            }
        }
        return this;
    }

    public static C5040f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5040f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5040f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5040f8) MessageNano.mergeFrom(new C5040f8(), bArr);
    }
}
