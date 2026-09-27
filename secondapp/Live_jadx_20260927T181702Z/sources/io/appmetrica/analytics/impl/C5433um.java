package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5433um extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5433um[] f98420c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f98421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f98422b;

    public C5433um() {
        a();
    }

    public static C5433um[] b() {
        if (f98420c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98420c == null) {
                        f98420c = new C5433um[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98420c;
    }

    public final C5433um a() {
        this.f98421a = 86400L;
        this.f98422b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f98422b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f98421a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f98421a);
        codedOutputByteBufferNano.writeInt64(2, this.f98422b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5433um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f98421a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f98422b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5433um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5433um().mergeFrom(codedInputByteBufferNano);
    }

    public static C5433um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5433um) MessageNano.mergeFrom(new C5433um(), bArr);
    }
}
