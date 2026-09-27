package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5309pm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5309pm[] f98154b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f98155a;

    public C5309pm() {
        a();
    }

    public static C5309pm[] b() {
        if (f98154b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98154b == null) {
                        f98154b = new C5309pm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98154b;
    }

    public final C5309pm a() {
        this.f98155a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f98155a;
        return j10 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j10 = this.f98155a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5309pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f98155a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5309pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5309pm) MessageNano.mergeFrom(new C5309pm(), bArr);
    }

    public static C5309pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5309pm().mergeFrom(codedInputByteBufferNano);
    }
}
