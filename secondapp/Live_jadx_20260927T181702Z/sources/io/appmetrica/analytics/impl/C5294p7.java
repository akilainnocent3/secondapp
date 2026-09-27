package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5294p7 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5294p7[] f98122d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f98123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f98124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98125c;

    public C5294p7() {
        a();
    }

    public static C5294p7[] b() {
        if (f98122d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98122d == null) {
                        f98122d = new C5294p7[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98122d;
    }

    public final C5294p7 a() {
        this.f98123a = -1L;
        this.f98124b = -1L;
        this.f98125c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f98123a;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        long j11 = this.f98124b;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j11);
        }
        int i10 = this.f98125c;
        return i10 != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f98123a;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        long j11 = this.f98124b;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j11);
        }
        int i10 = this.f98125c;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5294p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f98123a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f98124b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f98125c = int32;
                }
            }
        }
        return this;
    }

    public static C5294p7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5294p7().mergeFrom(codedInputByteBufferNano);
    }

    public static C5294p7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5294p7) MessageNano.mergeFrom(new C5294p7(), bArr);
    }
}
