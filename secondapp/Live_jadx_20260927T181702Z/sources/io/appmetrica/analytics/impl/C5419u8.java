package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5419u8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5419u8[] f98403b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5344r8 f98404a;

    public C5419u8() {
        a();
    }

    public static C5419u8[] b() {
        if (f98403b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98403b == null) {
                        f98403b = new C5419u8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98403b;
    }

    public final C5419u8 a() {
        this.f98404a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5344r8 c5344r8 = this.f98404a;
        return c5344r8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5344r8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5344r8 c5344r8 = this.f98404a;
        if (c5344r8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5344r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5419u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f98404a == null) {
                    this.f98404a = new C5344r8();
                }
                codedInputByteBufferNano.readMessage(this.f98404a);
            }
        }
        return this;
    }

    public static C5419u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5419u8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5419u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5419u8) MessageNano.mergeFrom(new C5419u8(), bArr);
    }
}
