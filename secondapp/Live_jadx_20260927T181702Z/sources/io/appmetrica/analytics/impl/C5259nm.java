package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5259nm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5259nm[] f97995c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f97996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5234mm f97997b;

    public C5259nm() {
        a();
    }

    public static C5259nm[] b() {
        if (f97995c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f97995c == null) {
                        f97995c = new C5259nm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97995c;
    }

    public final C5259nm a() {
        this.f97996a = "";
        this.f97997b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f97996a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f97996a);
        }
        C5234mm c5234mm = this.f97997b;
        return c5234mm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c5234mm) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f97996a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f97996a);
        }
        C5234mm c5234mm = this.f97997b;
        if (c5234mm != null) {
            codedOutputByteBufferNano.writeMessage(2, c5234mm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5259nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f97996a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f97997b == null) {
                    this.f97997b = new C5234mm();
                }
                codedInputByteBufferNano.readMessage(this.f97997b);
            }
        }
        return this;
    }

    public static C5259nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5259nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5259nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5259nm) MessageNano.mergeFrom(new C5259nm(), bArr);
    }
}
