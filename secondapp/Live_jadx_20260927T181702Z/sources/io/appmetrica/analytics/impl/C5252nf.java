package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5252nf extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5252nf[] f97974d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97977c;

    public C5252nf() {
        a();
    }

    public static C5252nf[] b() {
        if (f97974d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97974d == null) {
                        f97974d = new C5252nf[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97974d;
    }

    public final C5252nf a() {
        this.f97975a = "";
        this.f97976b = "";
        this.f97977c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f97975a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f97975a);
        }
        if (!this.f97976b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f97976b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f97977c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f97975a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f97975a);
        }
        if (!this.f97976b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f97976b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f97977c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5252nf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97975a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f97976b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f97977c = int32;
                }
            }
        }
        return this;
    }

    public static C5252nf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5252nf().mergeFrom(codedInputByteBufferNano);
    }

    public static C5252nf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5252nf) MessageNano.mergeFrom(new C5252nf(), bArr);
    }
}
