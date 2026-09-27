package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class P extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile P[] f99042c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f99043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f99044b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f99042c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f99042c == null) {
                        f99042c = new P[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f99042c;
    }

    public final P a() {
        this.f99043a = true;
        this.f99044b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f99043a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        long j10 = this.f99044b;
        return j10 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f99043a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        long j10 = this.f99044b;
        if (j10 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f99043a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f99044b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
