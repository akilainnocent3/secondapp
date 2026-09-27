package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5483wm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5483wm[] f98544b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f98545a;

    public C5483wm() {
        a();
    }

    public static C5483wm[] b() {
        if (f98544b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98544b == null) {
                        f98544b = new C5483wm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98544b;
    }

    public final C5483wm a() {
        this.f98545a = androidx.work.h0.f20106e;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f98545a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f98545a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5483wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f98545a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C5483wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5483wm) MessageNano.mergeFrom(new C5483wm(), bArr);
    }

    public static C5483wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5483wm().mergeFrom(codedInputByteBufferNano);
    }
}
