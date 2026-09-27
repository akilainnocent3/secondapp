package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5143j8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5143j8[] f97618c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5040f8 f97620b;

    public C5143j8() {
        a();
    }

    public static C5143j8[] b() {
        if (f97618c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97618c == null) {
                        f97618c = new C5143j8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97618c;
    }

    public final C5143j8 a() {
        this.f97619a = 0;
        this.f97620b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f97619a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i10);
        }
        C5040f8 c5040f8 = this.f97620b;
        return c5040f8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5040f8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i10 = this.f97619a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i10);
        }
        C5040f8 c5040f8 = this.f97620b;
        if (c5040f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5040f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5143j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f97619a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f97620b == null) {
                    this.f97620b = new C5040f8();
                }
                codedInputByteBufferNano.readMessage(this.f97620b);
            }
        }
        return this;
    }

    public static C5143j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5143j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5143j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5143j8) MessageNano.mergeFrom(new C5143j8(), bArr);
    }
}
