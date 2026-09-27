package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5464w3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5464w3[] f98505c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98507b;

    public C5464w3() {
        a();
    }

    public static C5464w3[] b() {
        if (f98505c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98505c == null) {
                        f98505c = new C5464w3[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98505c;
    }

    public final C5464w3 a() {
        this.f98506a = "";
        this.f98507b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f98506a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f98506a);
        }
        return !this.f98507b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f98507b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f98506a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f98506a);
        }
        if (!this.f98507b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f98507b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5464w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f98506a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f98507b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5464w3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5464w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C5464w3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5464w3) MessageNano.mergeFrom(new C5464w3(), bArr);
    }
}
