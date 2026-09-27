package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile c[] f95026f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f95028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f95029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f95030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f95031e;

    public c() {
        a();
    }

    public static c[] b() {
        if (f95026f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95026f == null) {
                        f95026f = new c[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95026f;
    }

    public final c a() {
        this.f95027a = 1;
        this.f95028b = "";
        this.f95029c = "";
        this.f95030d = 0L;
        this.f95031e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f95031e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f95030d) + CodedOutputByteBufferNano.computeStringSize(3, this.f95029c) + CodedOutputByteBufferNano.computeStringSize(2, this.f95028b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f95027a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f95027a);
        codedOutputByteBufferNano.writeString(2, this.f95028b);
        codedOutputByteBufferNano.writeString(3, this.f95029c);
        codedOutputByteBufferNano.writeUInt64(4, this.f95030d);
        codedOutputByteBufferNano.writeUInt64(5, this.f95031e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f95027a = int32;
                }
            } else if (tag == 18) {
                this.f95028b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f95029c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f95030d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f95031e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static c a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}
