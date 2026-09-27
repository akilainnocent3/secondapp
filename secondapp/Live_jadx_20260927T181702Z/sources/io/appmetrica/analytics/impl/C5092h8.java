package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5092h8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5092h8[] f97491c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97493b;

    public C5092h8() {
        a();
    }

    public static C5092h8[] b() {
        if (f97491c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97491c == null) {
                        f97491c = new C5092h8[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97491c;
    }

    public final C5092h8 a() {
        this.f97492a = 0L;
        this.f97493b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f97492a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        int i10 = this.f97493b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f97492a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        int i10 = this.f97493b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5092h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f97492a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97493b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C5092h8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5092h8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5092h8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5092h8) MessageNano.mergeFrom(new C5092h8(), bArr);
    }
}
