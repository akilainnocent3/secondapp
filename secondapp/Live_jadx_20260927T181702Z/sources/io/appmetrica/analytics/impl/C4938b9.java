package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4938b9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C4938b9[] f97013c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f97015b;

    public C4938b9() {
        a();
    }

    public static C4938b9[] b() {
        if (f97013c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97013c == null) {
                        f97013c = new C4938b9[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97013c;
    }

    public final C4938b9 a() {
        this.f97014a = "";
        this.f97015b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f97015b) + CodedOutputByteBufferNano.computeStringSize(1, this.f97014a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f97014a);
        codedOutputByteBufferNano.writeUInt64(2, this.f97015b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4938b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97014a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97015b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C4938b9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4938b9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4938b9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4938b9) MessageNano.mergeFrom(new C4938b9(), bArr);
    }
}
