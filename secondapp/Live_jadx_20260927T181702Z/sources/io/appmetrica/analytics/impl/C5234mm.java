package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5234mm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C5234mm[] f97917b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97918a;

    public C5234mm() {
        a();
    }

    public static C5234mm[] b() {
        if (f97917b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97917b == null) {
                        f97917b = new C5234mm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97917b;
    }

    public final C5234mm a() {
        this.f97918a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f97918a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f97918a) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f97918a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f97918a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5234mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f97918a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C5234mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5234mm) MessageNano.mergeFrom(new C5234mm(), bArr);
    }

    public static C5234mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5234mm().mergeFrom(codedInputByteBufferNano);
    }
}
