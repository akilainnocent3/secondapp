package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5108ho extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5108ho[] f97541c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f97542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97543b;

    public C5108ho() {
        a();
    }

    public static C5108ho[] b() {
        if (f97541c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97541c == null) {
                        f97541c = new C5108ho[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97541c;
    }

    public final C5108ho a() {
        this.f97542a = false;
        this.f97543b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f97542a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        boolean z11 = this.f97543b;
        return z11 ? CodedOutputByteBufferNano.computeBoolSize(2, z11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f97542a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        boolean z11 = this.f97543b;
        if (z11) {
            codedOutputByteBufferNano.writeBool(2, z11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5108ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f97542a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f97543b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5108ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5108ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C5108ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5108ho) MessageNano.mergeFrom(new C5108ho(), bArr);
    }
}
