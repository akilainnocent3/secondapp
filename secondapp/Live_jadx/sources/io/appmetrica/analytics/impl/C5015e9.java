package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5015e9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5015e9[] f97265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f97267b;

    public C5015e9() {
        a();
    }

    public static C5015e9[] b() {
        if (f97265c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97265c == null) {
                        f97265c = new C5015e9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97265c;
    }

    public final C5015e9 a() {
        this.f97266a = 2;
        this.f97267b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f97266a;
        if (i10 != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        return !this.f97267b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f97267b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f97266a;
        if (i10 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!this.f97267b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f97267b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5015e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 24) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f97266a = int32;
                            break;
                    }
                } else if (tag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f97267b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C5015e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5015e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5015e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5015e9) MessageNano.mergeFrom(new C5015e9(), bArr);
    }
}
